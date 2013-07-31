<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="/learningspringmvc/j_spring_security_check" method="post">
            Username: <input type="text" name="j_username" /><br />
            Password: <input type="password" name="j_password" /><br />
            <input type="checkbox" name="_spring_security_remember_me" />
            Remember me<br />
            <input type="submit" value="Log in" />
        </form>
    </body>
</html>