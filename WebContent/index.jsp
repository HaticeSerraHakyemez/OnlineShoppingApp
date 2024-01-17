<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
  	<title>Login</title>
  	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
	<div class="wrapper">
        <div style="background-color:lavender; !important" class="jumbotron text-center bg-primary">
            <h1> Welcome to Star Online Shopping!</h1>
            <p>
                Please login to proceed.
            </p>
        </div>
	</div>
	
	<c:if test="${valid>0}">
				<div class="alert alert-danger" role="alert">
					<h4 class="alert-heading">Login Failed</h4>
					<p>Your username or password is not correct. Please try again.</p>
				</div>
    </c:if> 
    <c:if test="${valid<0}">
				<div class="alert alert-danger" role="alert">
					<h4 class="alert-heading">Login Failed</h4>
					<p>That username is already taken.</p>
				</div>
    </c:if> 
	
	<div class="container">
		<div class="row">
			<div class="d-flex justify-content-around" style="margin-top: 20px">  
					<form action="login" method="post" novalidate action="index.jsp">
					<input type="hidden" name="pageName" value="login">
					  <div class="form-group">
					    <label for="inputUsername">Username</label>
					    <input type="username" class="form-control" name="username" aria-describedby="emailHelp" placeholder="Enter Username">
					  </div>
					  <div class="form-group">
					    <label for="inputPassword">Password</label>
					    <input type="password" class="form-control" name="password" placeholder="Enter Password">
					  </div>
					  <button type="logIn" class="btn btn-primary">Log In</button>
					</form>
					
					<form action="login" method="post" novalidate action="index.jsp">
					<input type="hidden" name="pageName" value="signUp">
					<div class="form-group">
					    <label for="inpuName">Name</label>
					    <input type="username" class="form-control" name="name" aria-describedby="emailHelp" placeholder="Enter Name">
					  </div>
					  <div class="form-group">
					    <label for="inputSurname">Surname</label>
					    <input type="username" class="form-control" name="surname" aria-describedby="emailHelp" placeholder="Enter Surname">
					  </div>
					  <div class="form-group">
					    <label for="inputUsername">Username</label>
					    <input type="username" class="form-control" name="username" aria-describedby="emailHelp" placeholder="Enter Username">
					  </div>
					  <div class="form-group">
					    <label for="inputPassword">Password</label>
					    <input type="password" class="form-control" name="password" placeholder="Enter Password">
					  </div>
					  <button type="logIn" class="btn btn-primary">Sign Up</button>
					</form>
					
			</div>
		</div>
	</div>
</body>
</html>

				