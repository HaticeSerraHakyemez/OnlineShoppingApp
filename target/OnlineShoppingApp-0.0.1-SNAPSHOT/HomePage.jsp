<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  	<title>User Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <style>
        table, th, td {
            border: 1px solid;
        }
        .center {
            margin-left: auto;
            margin-right: auto;
            justify-content: center;
        }
        form { 
            margin: 0 auto; 
            width:250px;
        }
    </style>
</head>
<body>
    <div class="wrapper">
        <div style="background-color:lavender; !important" class="jumbotron text-center bg-primary">
            <h2> Welcome Back ${name}!</h2>
    </div>
    <a href="productMenu"> <p style="text-align:center">View Products</p></a>
    <a href="myCart"> <p style="text-align:center">View My Cart</p></a>
    <a href="myAccount"> <p style="text-align:center">View My Account</p></a>
    <a href="login"> <p style="text-align:center">Log Out</p></a>
</body>
</html>