<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
</head>
<body>
	<a href="addtrain.jsp">添加</a>
	<table id="tab" border="1" width="800" height="300" cellpadding="0" cellspacing="0">
		<tr>
			<th>序号</th><th>车次</th><th>起始车站</th><th>终点车站</th>
			<th>硬座数量</th><th>硬座单价</th><th>硬卧数量</th><th>硬卧单价</th>
		</tr>
	</table>
	<script type="text/javascript">
	function loadd(){
		$.post("trainAction_findAllTrain","",function(date){
			$.each(date.trainList,function(i,obj){
				var tr="<tr>";
				tr+="<td>"+(i+1)+"</td>";
				tr+="<td>"+obj.trainNo+"</td>";
				tr+="<td>"+obj.fromStation+"</td>";
				tr+="<td>"+obj.toStation+"</td>";
				tr+="<td>"+obj.seatNum+"</td>";
				tr+="<td>￥"+obj.seatPrice+"</td>";
				tr+="<td>"+obj.bedNum+"</td>";
				tr+="<td>￥"+obj.bedPrice+"</td>";
				tr+="</tr>";
				$("#tab").append(tr);
			})
		},"json") ;
	}
	window.onload=loadd() ;
	</script>
</body>
</html>