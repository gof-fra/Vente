
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<p class="lead">Shop Name</p>


          <div class="list-group">
                
	            <c:forEach items="${categories}" var="category"> 
	                	
	               <a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="a_${category.name}">${category.name} </a>
	                
	            </c:forEach>
                
               
          </div>
                
                
               <!--  <p class="lead">Shop Name</p>
                <div class="list-group">
                    <a href="#" class="list-group-item">Printable</a>
                    <a href="#" class="list-group-item">Cupcake Wrappers</a>
                    <a href="#" class="list-group-item">Authentic Dragon Bones</a>
                </div> -->