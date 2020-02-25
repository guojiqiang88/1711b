<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<!--  <script type="text/javascript">
function(pageNum){
	$("input[name=pageNum]").val(pageNum);
	$("form[name=listForm]").submit();
	
}

</script>
-->
<body>
<form action="list.do" method="post" name="listForm">
<tr>
<td>
商品编号:
<input type="text" name="gid">
商品名称：
<input type="text" name="name">
<input type="submit" value="查询">
<a href="add.jsp"><input type="button" value="添加"></a>
</td>
</tr>
</form>
<table>
<tr>
<td>商品编号</td>
<td>商品名称</td>
<td>英文名称</td>
<td>商品品牌</td>
<td>商品种类</td>
<td>尺寸</td>
<td>单价（元）</td>
<td>数量</td>
<td>标签</td>
<td>商品图片上传</td>

</tr>
<c:forEach items="${page.list}" var="g">
<tr>
<td>${g.gid}</td>
<td>${g.name}</td>
<td>${g.ename}</td>
<td>${g.brand}</td>
<td>${g.type}</td>
<td>${g.rize}</td>
<td>${g.price}</td>
<td>${g.num}</td>
<td><img alt="未上传" src="loojimg?path=${g.imgurl}"> </td>

</tr>

</c:forEach>
<tr>
<td colspan="15">
${page.total}条/${page.pages}页
<!--  <input type="button" value="上一页" onclick="fenye(${page.isFirstPage?1:page.prePage})">
<input type="button" value="下一页" onclick="fenye(${page.isLastPage?page.pages:page.nextPage})">-->
</td>
</tr>
</table>
</body>
</html>