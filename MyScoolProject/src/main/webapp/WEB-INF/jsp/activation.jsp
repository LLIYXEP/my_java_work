<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h2>Click to activate account</h2>
 
    <form method="post" action="${flowExecutionUrl}">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <input type="submit" name="_eventId_activate" value="activate" />
        <input type="submit" name="_eventId_cancel" value="cancel" />
    </form>
</body>
</html>