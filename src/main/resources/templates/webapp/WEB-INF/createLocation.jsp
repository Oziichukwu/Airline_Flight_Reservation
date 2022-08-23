<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create Location</title>
</head>
<body>

<form action="saveLoc" method="post"><br><br>
    <pre>
    Id: <input type="text" name="id"/><br><br>
    Code: <input type="text" name="code"/><br><br>
    Name: <input type="text" name="name"/><br><br>
    Type: Urban <input type="radio" name="type" value = "URBAN"/><br><br>
    Rural <input type="radio" name="type" value = "RURAL"/><br><br>

    <input type="submit" value="save"/>
    </pre>
</form>
${msg}
</body>
</html>