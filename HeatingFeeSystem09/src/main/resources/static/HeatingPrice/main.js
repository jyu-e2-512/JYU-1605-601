/**
 * 年度供热价格的前端控制JS
 * 作者：陈武杰
 * 
 */
$(function(){
	var rows=10;
	var page=1;
	var pageCount=0;
	var heatingYear=""; //选择的年份
	
	//设置系统页面标题
	$("span#mainpagetille").html("年度价格管理");
	//取得年度价格的列表，分页模式
	function getListInfo(){
		//调用后台取得年度价格列表REST API
		$.getJSON("http://localhost:8080/heatingprice/list/all/page",{page:page,rows:rows},function(data){
				//显示个数和页数
				$("span#count").html(data.count);
				$("span#pagecount").html(data.page+"/"+data.pageCount);
				pageCount=data.pageCount;
				//显示列表
				$("table#DepartmentTable tbody").html("");
				for(var i=0;i<data.list.length;i++){
					var tr="<tr id='"+data.list[i].heatingYear+"'><td>"+data.list[i].heatingYear+"</td><td>"+data.list[i].homePrice+"</td><td>"
					+data.list[i].publicHousePrice+"</td><td>"+data.list[i].heatingdays+"</td><td>"+data.list[i].heatingMemo+"</td></tr>";
					$("table#heatingPriceTable tbody").append(tr);
				}
				//定义表格行的点击时间，取得选择的年份
				$("table#heatingPriceTable tbody tr").on("click",function(){
					heatingYear=$(this).attr("id");
					$("table#heatingPriceTable tbody tr").css("background-color","#FFFFFF");
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
	$("a#heatingPriceAddLink").off().on("click",function(event){
				
		$("div#heatingPriceDialogArea").load("HeatingPrice/add.html",function(){
			$("div#heatingPriceDialogArea" ).dialog({
				title:"增加年度供热价格",
				width:600
			});
			//验证数据
			$("form#heatingPriceAddForm" ).validate({
				  rules: {
				    heatingYear: {
				      required: true,
				      year: true
				    },
				    heatingdays: {
					      required: true,
					      digits: true
					},
				    homePrice:{
				    	required: true,
				    	number:true 
				    },
				    publicHousePrice:{
				    	required: true,
				    	number:true 
				    },
				    heatingMemo:{
				    	required: true
				    }
				  },
				  messages:{
					heatingYear: {
						
					    required: "年份为空或非法"
					},
					heatingdays:{		
					    required: "供热天数为空或非法"
					},
					homePrice:{		
					    required: "居民供热价格为空或非法"
					},
					publicHousePrice:{		
					    required: "公建供热价格为空或非法"
					},
					heatingMemo:{
						required: "备注为空或非法"
					}
				 }
			});
			//拦截增加表单提交
			$("form#heatingPriceAddForm").ajaxForm(function(result){
				if(result.status=="OK"){
					getListInfo(); 
				}
				//alert(result.message);
				//BootstrapDialog.alert(result.message);
				BootstrapDialog.show({
		            title: '年度供热价格操作信息',
		            message:result.message
		        });
				$("div#heatingPriceDialogArea" ).dialog( "close" );
				$("div#heatingPriceDialogArea" ).dialog( "destroy" );
				$("div#heatingPriceDialogArea").html("");
				
			});
			//点击取消按钮处理
			$("input[value='取消']").on("click",function(){
				$( "div#heatingPriceDialogArea" ).dialog( "close" );
				$( "div#heatingPriceDialogArea" ).dialog( "destroy" );
				$("div#heatingPriceDialogArea").html("");
			});
		});
		
	});
	
	//点击修改按钮事件处理
	$("a#heatingPriceModifyLink").off().on("click",function(event){
		if(heatingYear==null){
			BootstrapDialog.show({
	            title: '年度供热价格操作信息',
	            message:"请选择要修改的年份"
	        });
		}
		else {
			$("div#heatingPriceDialogArea").load("HeatingPrice/modify.html",function(){
				//取得选择的年份
				$.getJSON("heatingprice/get",{heatingYear:heatingYear},function(data){
					if(data.status=="OK"){	
						$("input[name='heatingYear']").val(heatingYear);
						$("input[name='homePrice']").val(data.model.homePrice);
						$("input[name='publicHousePrice']").val(data.model.publicHousePrice);
						$("input[name='heatingdays']").val(data.model.heatingdays);
						$("input[name='heatingMemo']").val(data.model.heatingMemo);
					}
				});
				
				$("div#heatingPriceDialogArea" ).dialog({
					title:"年度供热价格修改",
					width:600
				});
				//拦截表单提交
				$("form#heatingPriceModifyForm").ajaxForm(function(result){
					if(result.status=="OK"){
						getListInfo(); 
					}
					//alert(result.message);
					//BootstrapDialog.alert(result.message);
					BootstrapDialog.show({
			            title: '年度供热操作信息',
			            message:result.message
			        });
					$("div#heatingPriceDialogArea" ).dialog( "close" );
					$("div#heatingPriceDialogArea" ).dialog( "destroy" );
					$("div#heatingPriceDialogArea").html("");
					
				});
				
				
				//点击取消按钮处理
				$("input[value='取消']").on("click",function(){
					$( "div#heatingPriceDialogArea" ).dialog( "close" );
					$( "div#heatingPriceDialogArea" ).dialog( "destroy" );
					$("div#heatingPriceDialogArea").html("");
				});
			});
			
		}
		
		
	});
	/*
	//点击删除按钮事件处理
	$("a#heatingPriceDelteLink").off().on("click",function(event){
		
		if(departmentNo==0){
			BootstrapDialog.show({
	            title: '部门操作信息',
	            message:"请选择要删除的部门"
	        });
		}
		else {
			//先检查此部门能否被删除
			$.getJSON("heatingprice/checkDelete",{no:departmentNo},function(data){
				if(data.status!="OK"){
					BootstrapDialog.show({
			            title: '部门操作信息',
			            message:data.message
			        });
				}
				else{
					BootstrapDialog.confirm('确认删除此部门么?', function(result){
			            if(result) {
			                $.post("department/delete",{no:departmentNo},function(result){
			                	if(result.status=="OK"){
									getListInfo(); 
								}
								BootstrapDialog.show({
						            title: '部门操作信息',
						            message:result.message
						        });
			                });
			            }
			        });
				}
			});
			
		}
		
	});
	//点击查看详细按钮事件处理
	$("a#heatingPriceViewLink").off().on("click",function(event){
		
		if(departmentNo==0){
			BootstrapDialog.show({
	            title: '部门操作信息',
	            message:"请选择要查看的部门"
	        });
		}
		else{
			$("div#heatingPriceDialogArea").load("HeatingPrice/view.html",function(){
				//取得选择的部门
				$.getJSON("heatingprice/get",{no:departmentNo},function(data){
					if(data.status=="OK"){
						$("span#departmentCode").html(data.model.code);
						$("span#departmentName").html(data.model.name);
						
					}
				});
				//弹出Dialog
				$("div#heatingPriceDialogArea" ).dialog({
					title:"部门详细",
					width:600
				});
				//点击取消按钮处理
				$("input[value='返回']").on("click",function(){
					$( "div#heatingPriceDialogArea" ).dialog( "close" );
					$( "div#heatingPriceDialogArea" ).dialog( "destroy" );
					$("div#heatingPriceDialogArea").html("");
				});
			});
			
		}
	});
	*/
});