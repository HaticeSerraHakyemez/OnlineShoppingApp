<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  	<title>My Account</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <style>
        table, th, td {
            border: 3px solid;
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
			<h2>My Account</h2>
			</div>
			</div>
			<div class="container">
                        <table class="table table-bordered">
                        <colgroup>
			                <col span="1" style="width: 50%;">
			                <col span="1" style="width: 35%;">
			                <col span="1" style="width: 15%;">
			            </colgroup>
                            <tbody>
                                <tr>                                  
                                    <td><p style="text-align:center">Full Name: </p></td>
                                    <td><p style="text-align:center">${fullName}</p></td>
                                    </tr>
                               		<tr>
                                    <td><p style="text-align:center">Username: </p></td> 
                                    <td><p style="text-align:center">${username}</p></td> 
                                    </tr>
                                	<tr>
                                    <td><p style="text-align:center">Password: </p></td>
                                    <form action="myAccount" method="post" novalidate action="myAccount">
                                    <td><input class="form-control" type="password" name="password" id="password" ></td>
                                    <td><button type="logIn" class="btn btn-primary">Change Password</button></td></form>
                                </tr>
                            </tbody>             
                        </table>  
                        </div>
			    	             
    <a href="homePage"> <p style="text-align:center">Back</p></a>
</body>
</html>


