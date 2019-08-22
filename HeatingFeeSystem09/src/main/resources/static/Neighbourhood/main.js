/**
 * 年度供热价格的前端控制JS 作者：陈武杰
 * 
 */
$(function(){
	var rows=10;
	var page=1;
	var pageCount=0;
	var hoodNo=""; // 选择的小区
	
	// 设置系统页面标题
	$("span#mainpagetille").html("小区信息维护");
	// 取得小区信息的列表，分页模式
	function getListInfo(){
		// 调用后台取得小区信息列表REST API
		$.getJSON("http://localhost:8080/neighbourhood/list/all/page",{page:page,rows:rows},function(data){
				// 显示个数和页数
				$("span#count").html(data.count);
				$("span#pagecount").html(data.page+"/"+data.pageCount);
				pageCount=data.pageCount;
				// 显示列表
				$("table#DepartmentTable tbody").html("");
				for(var i=0;i<data.list.length;i++){
					var tr="<tr id='"+data.list[i].hoodNo+"'><td>"+data.list[i].hoodNo+"</td><td>"+data.list[i].hoodName+"</td><td>"
					+data.list[i].address+"</td></tr>";
					$("table#neighbourhoodTable tbody").append(tr);
				}
				// 定义表格行的点击时间，取得选择的小区
				$("table#neighbourhoodTable tbody tr").on("click",function(){
					hoodNo=$(this).attr("id");
					$("table#neighbourhoodTable tbody tr").css("background-color","#FFFFFF");
					$(this).css("background-color","#CDCD9A");
				});
		 });
	}	
	// 定义分页导航链接处理事件
	$("div#page_nav a").on("click",function(event){
			  var action=$(this).attr("href");
			  event.preventDefault();
			  switch(action){
			  	case "top":
			  		page=1;
			  		getListInfo();
			  		break;
			  	case "pre":
			  		if(page>1){
			  			page=page-1;
			  			getListInfo();
			  		}
			  		break;
			  	case "next":
			  		if(page<pageCount){
			  			page=page+1;
			  			getListInfo();
			  		}
			  		break;
			  	case "last":
			  		page=pageCount;
			  		getListInfo();
			  		break;
			  }
		
	});
	
	// 初始调用取得分页列表数据
	getListInfo();
	// 点击增加链接处理，嵌入add.html
	$("a#neighbourhoodAddLink").off().on("click",function(event){
				
		$("div#neighbourhoodDialogArea").load("Neighbourhood/add.html",function(){
			$("div#neighbourhoodDialogArea" ).dialog({
				title:"增加小区信息",
				width:600
			});
			// 验证数据
			$("form#NeighbourhoodAddForm" ).validate({
				  rules: {
					  hoodNo: {
				      required: true,
				      number: true
				    },
				    hoodName: {
					      required: true,
					      maxlength:5
					},
					address:{
				    	required: true,
				    	maxlength:5
				    }
				   
				    
				  },
				  messages:{
					  hoodNo: {
						
					    required: "序号为空或非法"
					},
					hoodName:{		
					    required: "名称为空或非法"
					},
					address:{		
					    required: "地址为空或非法"
					}
					
					
				 }
			});
			// 拦截增加表单提交
			$("form#NeighbourhoodAddForm").ajaxForm(function(result){
				if(result.status=="OK"){
					getListInfo(); 
				}
				// alert(result.message);
				// BootstrapDialog.alert(result.message);
				BootstrapDialog.show({
		            title: '小区信息操作信息',
		            message:result.message
		        });
				$("div#neighbourhoodDialogArea" ).dialog( "close" );
				$("div#neighbourhoodDialogArea" ).dialog( "destroy" );
				$("div#neighbourhoodDialogArea").html("");
				
			});
			// 点击取消按钮处理
			$("input[value='取消']").on("click",function(){
				$( "div#neighbourhoodDialogArea" ).dialog( "close" );
				$( "div#neighbourhoodDialogArea" ).dialog( "destroy" );
				$("div#neighbourhoodDialogArea").html("");
			});
		});
		
	});
	
	// 点击修改按钮事件处理
	$("a#neighbourhoodModifyLink").off().on("click",function(event){
		if(heatingYear==null){
			BootstrapDialog.show({
	            title: '小区操作信息',
	            message:"请选择要修改的编号"
	        });
		}
		else {
			$("div#neighbourhoodDialogArea").load("neighbourhood/modify.html",function(){
				// 取得选择的年份
				$.getJSON("neighbourhood/get",{hoodNo:hoodNo},function(data){
					if(data.status=="OK"){	
						$("input[name='hoodNo']").val(hoodNo);
						$("input[name='hoodName']").val(data.model.hoodName);
						$("input[name='address']").val(data.model.address);
					}
				});
				
				$("div#neighbourhoodDialogArea" ).dialog({
					title:"年度供热价格修改",
					width:600
				});
				// 拦截表单提交
				$("form#neighbourhoodModifyForm").ajaxForm(function(result){
					if(result.status=="OK"){
						getListInfo(); 
					}
					// alert(result.message);
					// BootstrapDialog.alert(result.message);
					BootstrapDialog.show({
			            title: '小区操作信息',
			            message:result.message
			        });
					$("div#neighbourhoodDialogArea" ).dialog( "close" );
					$("div#neighbourhoodDialogArea" ).dialog( "destroy" );
					$("div#neighbourhoodDialogArea").html("");
					
				});
				
				
				// 点击取消按钮处理
				$("input[value='取消']").on("click",function(){
					$( "div#neighbourhoodDialogArea" ).dialog( "close" );
					$( "div#neighbourhoodDialogArea" ).dialog( "destroy" );
					$("div#neighbourhoodDialogArea").html("");
				});
			});
			
		}
		
		
	});
	
	// 点击删除按钮事件处理
	$("a#neighbourhoodDelteLink").off().on("click",function(event){
		
		if(hoodNo==null){
			BootstrapDialog.show({
	            title: '小区操作信息',
	            message:"请选择要删除的小区信息"
	        });
		}
		else {
			
			BootstrapDialog.confirm('确认删除此小区么?', function(result){
			     if(result) {
			              $.post("neighbourhood/delete",{hoodNo:hoodNo},function(result){
			                	if(result.status=="OK"){
									getListInfo(); 
								}
								BootstrapDialog.show({
						            title: '小区操作信息',
						            message:result.message
						        });
			                });
			            }
			        });
				}
			
			
	
		
	});
	
	  //点击查看详细按钮事件处理
	  $("a#neighbourhoodViewLink").off().on("click",function(event){
	  
		  if(heatingYear==null){ 
			  BootstrapDialog.show(
					  { 
						  title: '年度供热价格操作信息',
						  message:"请选择要查看的年度" }); 
		  } else{
			  $("div#neighbourhoodDialogArea").load("Neighbourhood/view.html",function(){
				  //取得选择的年份
				  $.getJSON("neighbourhood/get",{hoodNo:hoodNo},function(data){
					  if(data.status=="OK"){ 
						  $("span#hoodNo").html(data.model.hoodNo);
						  $("span#hoodName").html(data.model.hoodName); 
						  $("span#address").html(data.model.address); 
						 
						  } 
					  }); 
				  //弹出Dialog
				  $("div#neighbourhoodDialogArea" ).dialog(
				  		{ 
				  			title:"小区详细", 
				  			width:600 
				  	});
				  	//点击取消按钮处理 
				  	$("input[value='返回']").on("click",function(){ 
				  		$("div#neighbourhoodDialogArea" ).dialog( "close" ); 
				  		$("div#neighbourhoodDialogArea" ).dialog( "destroy" );
				  		$("div#neighbourhoodDialogArea").html(""); 
				  		}); 
				  	}); 
			  } 
		  });
	 
});