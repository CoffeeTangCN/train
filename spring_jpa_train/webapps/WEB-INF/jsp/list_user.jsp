<%@page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${users.content }" var="user">
<div>
	${user.loginName }
</div>
</c:forEach>

${users.totalPages}