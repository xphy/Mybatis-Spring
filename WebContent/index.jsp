<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息表</title>
<meta name="viewport" content="width=device-width ,initial-scale=1,user-scalable=no" >
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
<script type="text/javascript"> 
	function sels(){
		  $.getJSON("students.do",function(students){
			  $body = $(".table>tbody");
			  $body.empty();
			  $.each(students,function(i,k){
				  $tr = $("<tr></tr>");
				  $("<td>"+(i+1)+"</td>").appendTo($tr);
				  $("<td>"+k.name+"</td>").appendTo($tr);
				  $("<td>"+k.sex+"</td>").appendTo($tr);
				  $("<td>"+k.age+"</td>").appendTo($tr);
				  $("<td>"+k.dept+"</td>").appendTo($tr);
				  $($tr).appendTo($body);
			  })
		  })
	}
	$(function(){
		sels();  
		
	  })
</script>
</head>
<body>
    <div class="container">
     <div class="row" style="margin-top:15px">
	   <div class="col-md-12">
			<div class="table-responsive">
				<table class="table table-bordered table-hover">
				  <thead>
				     <tr>
				       <th>序号</th>
				       <th>姓名</th>
				       <th>性别</th>
				       <th>年龄</th>
				       <th>院系</th>
				     </tr>
				  </thead>
				  <tbody>
				  </tbody>
				</table>
			</div>
		</div>
	 </div>
   </div>
</body>
</html>