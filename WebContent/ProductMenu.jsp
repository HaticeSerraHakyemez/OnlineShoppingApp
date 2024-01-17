<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  	<title>Product Menu</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="canonical" href="https://getbootstrap.com/docs/4.0/components/dropdowns/">
    
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
            <h2>Categories and Products:</h2>
    	       </div>
    	       </div>     
    	       
    	       <div class="container">
    	       <div class="row">
    	       <div class="col text-center" >
    	       
               <form action="productMenu" method="post">
               <input type="hidden" name="category" value="CLOTHING">
					  <button class="btn btn-primary">CLOTHING</button>
				</form>         
               <form action="productMenu" method="post">
               <input type="hidden" name="category" value="ELECTRONICS">
					  <button  class="btn btn-primary" style="margin-top: 10px">ELECTRONICS</button>
				</form>         
               <form action="productMenu" method="post">
               <input type="hidden" name="category" value="FURNITURE">
					  <button  class="btn btn-primary" style="margin-top: 10px">FURNITURE</button>
				</form>         
               <form action="productMenu" method="post">
               <input type="hidden" name="category" value="STATIONERY">
					  <button  class="btn btn-primary" style="margin-top: 10px">STATIONERY</button>
				</form>         
               <form action="productMenu" method="post">
               <input type="hidden" name="category" value="FOOD">
					  <button  class="btn btn-primary" style="margin-top: 10px">FOOD</button>
				</form>         
               <form action="productMenu" method="post">
               <input type="hidden" name="category" value="DRINK">
					  <button  class="btn btn-primary" style="margin-top: 10px">DRINK</button>
				</form>         
               <form action="productMenu" method="post">
               <input type="hidden" name="category" value="CLEANING">
					  <button  class="btn btn-primary" style="margin-top: 10px">CLEANING</button>
				</form>         
               <form action="productMenu" method="post">
               <input type="hidden" name="category" value="PEROSONAL_CARE">
					  <button class="btn btn-primary" style="margin-top: 10px">PEROSONAL_CARE</button>
				</form>     
				
				</div>
				</div>
				</div>
				
		<div class="container" style="margin-top: 10px">		
    <a href="allProducts"> <p style="text-align:center" >All Products</p></a>
    <a href="homePage"> <p style="text-align:center">Back</p></a>
    </div>
</body>
</html>


