<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  	<title>Category Products</title>
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
            <h2>${category}</h2>
    	             </div>
    	             </div>
    	             
                       <div class="container">
                        <table class="center">
                        <colgroup>
			                <col span="1" style="width: 30%;">
			                <col span="1" style="width: 40%;">
			                <col span="1" style="width: 30%;">
			            </colgroup>
                            <thead>
                                <tr>
                                    <td>Name</td>
                                    <td>Price</td>
                                    <td>Add</td>
                                </tr>
                            </thead>
                            <tbody>
                            <c:forEach var="product" items="${productList}" >
                                <tr>                                  
                                    <td>${product.name}</td>
                                    <td>${product.price}</td> 
                                    <td><a href="categorizedProductList?param=<c:out value='${product.name}' />"> <p style="text-align:center">Add To My Cart</p></a></td></form>
                                </tr>
                            </c:forEach>  
                            </tbody>             
                        </table>  
                        </div>
    
    <a href="productMenu"> <p style="text-align:center">Back</p></a>
</body>
</html>


