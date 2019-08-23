/**
 * 年度供热价格的前端控制JS
 * 作者：陈武杰
 * 
 */
$(function(){
	var rows=10;
	var page=1;
	var pageCount=0;
	var typeNo=0; //选择的编号
	
	//设置系统页面标题
	$("span#mainpagetille").html("房屋类型管理");
	//取得年度价格的列表，分页模式
	function getListInfo(){
		//调用后台取得年度价格列表REST API
		$.getJSON("http://localhost:8080/housetype/list/all/page",{page:page,rows:rows},function(data){
				//显示个数和页数
				$("span#count").html(data.count);
				$("span#pagecount").html(data.page+"/"+data.pageCount);
				pageCount=data.pageCount;
				//显示列表
				$("table#houseTypeTable tbody").html("");
				for(var i=0;i<data.list.length;i++){
					var tr="<tr id='"+data.list[i].typeNo+"'><td>"+data.list[i].typeNo+"</td><td>"+data.list[i].typeName+"</td></tr>";
					$("table#houseTypeTable tbody").append(tr);
				}
				//定义表格行的点击时间，取得选择的年份
				$("table#houseTypeTable tbody tr").on("click",function(){
					typeNo=$(this).attr("id");
					$("table#houseTypeTable tbody tr").css("background-color","#FFFFFF");
					$(this).css("background-color","#CDCD9A");
				});
		 });
	}	
	//定义分页导航链接处理事件
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
	
	//初始调用取得分页列表数据
	getListInfo();
	//点击增加链接处理，嵌入add.html
	$("a#houseTypeAddLink").off().on("click",function(event){
				
		$("div#houseTypeDialogArea").load("HouseType/add.html",function(){
			$("div#houseTypeDialogArea" ).dialog({
				title:"增加房屋类型",
				width:600
			});
			//验证数据
			$("form#houseTypeAddForm" ).validate({
				  rules: {
				    typeNo: {
				      required: true,
				      //year: true
				    },
				    typeName: {
					      required: true,
					      //digits: true
					}
				  },
				  messages:{
					typeNo: {
					    required: "编号为空或非法"
					},
					typeName:{		
					    required: "名字为空或非法"
					}
				 }
			});
			//拦截增加表单提交
			$("form#houseTypeAddForm").ajaxForm(function(result){
				if(result.status=="OK"){
					getListInfo(); 
				}
				//alert(result.message);
				//BootstrapDialog.alert(result.message);
				BootstrapDialog.show({
		            title: '房屋类型信息',
		            message:result.message
		        });
				$("div#houseTypeDialogArea" ).dialog( "close" );
				$("div#houseTypeDialogArea" ).dialog( "destroy" );
				$("div#houseTypeDialogArea").html("");
				
			});
			//点击取消按钮处理
			$("input[value='取消']").on("click",function(){
				$( "div#houseTypeDialogArea" ).dialog( "close" );
				$( "div#houseTypeDialogArea" ).dialog( "destroy" );
				$( "div#houseTypeDialogArea").html("");
			});
		});
		
	});
	
	//点击修改按钮事件处理
	$("a#houseTypeModifyLink").off().on("click",function(event){
		if(typeNo==null){
			BootstrapDialog.show({
	            title: '房屋类型操作信息',
	            message:"请选择要修改的编号"
	        });
		}
		else {
			$("div#houseTypeDialogArea").load("HouseType/modify.html",function(){
				//取得选择的年份
				$.getJSON("housetype/get",{typeNo:typeNo},function(data){
					if(data.status=="OK"){	
						$("input[name='typeNo']").val(typeNo);
						$("input[name='typeName']").val(data.model.typeName);
			
					}
				});
				
				$("div#houseTypeDialogArea" ).dialog({
					title:"房屋类型修改",
					width:600
				});
				//拦截表单提交
				$("form#houseTypeModifyForm").ajaxForm(function(result){
					if(result.status=="OK"){
						getListInfo(); 
					}
					//alert(result.message);
					//BootstrapDialog.alert(result.message);
					BootstrapDialog.show({
			            title: '房屋类型操作信息',
			            message:result.message
			        });
					$("div#houseTypeDialogArea" ).dialog( "close" );
					$("div#houseTypeDialogArea" ).dialog( "destroy" );
					$("div#houseTypeDialogArea").html("");
					
				});
				
				
				//点击取消按钮处理
				$("input[value='取消']").on("click",function(){
					$( "div#houseTypeDialogArea" ).dialog( "close" );
					$( "div#houseTypeDialogArea" ).dialog( "destroy" );
					$( "div#houseTypeDialogArea").html("");
				});
			});
			
		}
		
		
	});
	
	//点击删除按钮事件处理
	$("a#houseTypeDelteLink").off().on("click",function(event){
		
		if(typeNo==0){
			BootstrapDialog.show({
	            title: '房屋类型操作信息',
	            message:"请选择要删除的房屋类型"
	        });
		}
		else {
			
					BootstrapDialog.confirm('确认删除此房屋类型么?', function(result){
			            if(result) {
			                $.post("houseType/delete",{no:typeNo},function(result){
			                	if(result.status=="OK"){
									getListInfo(); 
								}
								BootstrapDialog.show({
						            title: '房屋类型操作信息',
						            message:result.message
						        });
			                });
			            }
			        });
				
			
			
		}
		
	});
	
	
	
	//点击查看详细按钮事件处理
	$("a#houseTypeViewLink").off().on("click",function(event){
		
		if(typeNo==0){
			BootstrapDialog.show({
	            title: '房屋类型操作信息',
	            message:"请选择要查看的房屋类型"
	        });
		}
		else{
			$("div#houseTypeDialogArea").load("HouseType/view.html",function(){
				//取得选择的编号
				$.getJSON("housetype/get",{typeNo:typeNo},function(data){
					if(data.status=="OK"){
						$("span#typeNo").html(data.model.typeNo);
						$("span#typeName").html(data.model.typeName);
						
					}
				});
				//弹出Dialog
				$("div#houseTypeDialogArea" ).dialog({
					title:"房屋类型详细",
					width:600
				});
				//点击取消按钮处理
				$("input[value='返回']").on("click",function(){
					$( "div#houseTypeDialogArea" ).dialog( "close" );
					$( "div#houseTypeDialogArea" ).dialog( "destroy" );
					$(" div#houseTypeDialogArea").html("");
				});
			});
			
		}
	});
	
});