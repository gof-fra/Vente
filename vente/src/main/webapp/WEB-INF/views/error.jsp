<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>

<s:url var="css" value="/resources/css" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	    

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    
    <!-- Bootstrap readable -->
    <link href="${css}/bootstrap.min.rendable.css" rel="stylesheet"> 
    
    <!-- Add custom CSS here -->
    <link href="${css}/myApp.css" rel="stylesheet">
    
    <title>Vente - ${title}  </title>

</head>

<body>
	
  <div class="wrapper">
	
			
		  	
		     <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		  			
		  			<div class="container">
		  			
		  				<div class="navbar-header">
		  				
		  					<a class="navbar-brand" href="${contextRoot}/home">Home</a>
		  				
		  				</div>
		  			
		  			</div>

		    </nav>
		    
		    
		
		 
		 
		 <div class="content">
			
				<div class="container"> 
				
						<div class="row">
							
									<div class="col-xs-12">
										
												<div class="jumbotron">
													
													<h1>${errorTitle}</h1>
													<hr/>
													
															<blockquote style="word-wrap:break-work">
																
																${errorDescription}
																
															</blockquote>
													
												</div>
											
									</div>
							
						</div>
			
				</div>	
			
		</div>
			
			<!-- footer bar -->
			<%@include file = "./shared/footer.jsp" %>
		   	 
		 
	 </div>
		    
   

</body>

</html>

