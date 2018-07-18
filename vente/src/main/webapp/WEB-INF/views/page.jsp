<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>

<s:url var="css" value="/resources/css" />
<s:url var="js" value="/resources/js" />
<s:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Vente - ${title}  </title>
    
    <script >
    	window.menu = '${title}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    
    
   <%--  <!-- Bootstrap readable -->
    <link href="${css}/bootstrap.min.readable.theme.css" rel="stylesheet"> --%>

    <!-- Add custom CSS here -->
    <link href="${css}/myApp.css" rel="stylesheet">

</head>

<body>
	
		<div class="wrapper">
	
			<!-- Navigation bar -->
			<%@include file = "./shared/navbar.jsp" %>
		   
		   
		   
			<!-- page contener -->
			
			<div class="content">
			
					<!-- Loading page contener -->
					<c:if test="${userClickHome == true}">
				   	<%@ include file="home.jsp" %>
				  	</c:if>
				  	
				  	<!-- click about -->
				  	<c:if test="${userClickAbout == true}">
				   	<%@ include file="about.jsp" %>
				  	</c:if>
				  	
				  	<!-- click contact -->
				  	<c:if test="${userClickContact == true}">
				   	<%@ include file="contact.jsp" %>
				  	</c:if>
				  	
				  	
				  	<c:if test="${userClickAllProducts == true or userClickCategoryProducts ==  true}">
				   	<%@ include file="listProducts.jsp" %>
				  	</c:if>
		  	
		  </div>
		  
		
		   <!-- Footer comes here -->
		   <%@ include file="./shared/footer.jsp" %>
		    <!-- /.container -->
		
		   <!-- jquery -->
		    <script src="${js}/jquery-1.10.2.js"></script>
		    
		     <!-- JavaScript -->
		    <script src="${js}/bootstrap.min.js"></script>
		    
		     <!-- self code javaScript -->
		    <script src="${js}/myApp.js"></script>
		    
		    
		 </div>
		    
   

</body>

</html>

