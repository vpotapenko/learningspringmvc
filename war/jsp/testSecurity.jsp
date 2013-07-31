<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
    <head>
        <title>Test Security</title>
    </head>

    <body>
    <h1>Secure page</h1>

    <security:authorize access="isAnonymous()">
        Hi, guest.
    </security:authorize>

    <security:authorize access="isAuthenticated()">
        Hi, <security:authentication property="principal.username" />.
    </security:authorize>

    </body>
</html>