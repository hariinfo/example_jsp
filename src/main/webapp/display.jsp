<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Servlet Forward Example</title>
</head>
<body>
    <h2>Servlet Response Message:</h2>

    <!-- JSTL-style EL output -->
    <p>${responseMessage}</p>

    <hr>

    <!-- Scriptlet code (old school Java in JSP) -->
    <%
        String responseMsg = (String) request.getAttribute("responseMessage");
        out.println("<p><strong>From scriptlet:</strong> " + responseMsg + "</p>");
    %>

</body>
</html>
