<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>query data</title>
<style type="text/css"<!--
.normal {  font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 12px; font-weight: normal; color: #000000}
.medium {  font-family: Verdana, Arial, Helvetica, sans-serif; font-size: 15px; font-weight: bold; color: #000000; text-decoration: none}
--></style>
</head>
<body >
<table border=1  align='center'>
	<c:forEach var="data" items="${data}">
	<tr>	
		<td class='normal' valign='top'><a target="_blank" href="${data.url}">${data.id}</a></td>
		
		<td class='normal' valign='top'><a target="_blank" href="${ctx}/downloaded/${data.id}">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;标记已经下载</a></td>	
		
		<td class='normal' valign='top'><a target="_blank" href="${ctx}/baiduNo/${data.id}">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;链接不存在</a></td>	
	</tr>
	</c:forEach>
</table>
</html>