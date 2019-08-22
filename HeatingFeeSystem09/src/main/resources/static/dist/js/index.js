 
$(document).ready(function()
{
	
	$("#sidebar ul li a").on("click",function(){
		
		var url=$(this).attr("href");
		$("#main").load(url);
		event.preventDefault();
	});

});
