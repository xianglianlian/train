<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<style>
	td{
		padding:5px;
	}
</style>
</head>
<body>
	<form id="form" action="" method="post">
		<table border="1" width="300" height="300" cellpadding="0" cellspacing="0">
			<tr>
				<th colspan="2"><h2>添加新车次</h2></th>
			</tr>
			<tr>
				<td>车次：</td>
				<td><input id="trainNo" name="trainInfo.trainNo"></td>
			</tr>
			<tr>
				<td>起始车站：</td>
				<td><input id="fromStation" name="trainInfo.fromStation"></td>
			</tr>
			<tr>
				<td>终点车站：</td>
				<td><input id="toStation" name="trainInfo.toStation"></td>
			</tr>
			<tr>
				<td>硬座数量：</td>
				<td><input id="seatNum" name="trainInfo.seatNum"></td>
			</tr>
			<tr>
				<td>硬座单价：</td>
				<td><input id="seatPrice" name="trainInfo.seatPrice"></td>
			</tr>
			<tr>
				<td>硬卧数量：</td>
				<td><input id="bedNum" name="trainInfo.bedNum"></td>
			</tr>
			<tr>
				<td>硬卧单价：</td>
				<td><input id="bedPrice" name="trainInfo.bedPrice"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input id="sub" type="button" value="新增">
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		$("#sub").click(function(){
			var g = /^\d/;
			if($("#trainNo").val()==null||$("#trainNo").val()==""){
				alert("车次不能为空");
			}else if($("#fromStation").val()==null||$("#fromStation").val()==""){
				alert("起始车站不能为空");
			}else if($("#toStation").val()==null||$("#toStation").val()==""){
				alert("终点车站不能为空");
			}else if($("#seatNum").val()==null||$("#seatNum").val()==""){
				alert("硬座数量不能为空");
			}else if(!g.test($("#seatNum").val())){
				alert("请填写数字");
			}else if($("#seatPrice").val()==null||$("#seatNum").val()==""){
				alert("硬座单价不能为空");
			}else if(!g.test($("#seatPrice").val())){
				alert("请填写数字");
			}else{
				var data = $("#form").serialize();
				location.href='trainAction_addTrain?'+data;
			}
			
				
			
			
			
			
		})
	
	
	
	</script>
</body>
</html>