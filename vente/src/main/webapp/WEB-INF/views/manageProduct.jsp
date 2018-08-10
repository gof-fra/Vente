<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<div class="container">

	<div class="row">
	
	<c:if test="${not empty message}">
	
		<div class="col-xs-12">
		
			<div class="alert alert-success alert-dismissible">
				
				<button type="button" class="close" data-dismiss="alert">&times;</button>
				
				${message} 
				
			
			</div>
		
		</div>
	
	</c:if>
	
		
		<div class="col-md-offset-2 col-md-8">
			
			<div class="panel panel-primary">
			
				<div class="panel-heading">
				
					<h4>Product Management</h4>
				
				</div>
				
				<div class="panel-body">
				
					<!-- Form element -->
					
					<sf:form action="${contextRoot}/manage/products" class="form-horizontal" modelAttribute="product" 
					
					method="POST"
					enctype="multipart/form-data"
					
					>
						
						<div class="form-group">
						
							<label class="control-label col-md-4" for="name"> Enter Product Name: </label>
							
							<div class="col-md-8">
								
								<sf:input type="text" path="name" id="name" placeholder="Product name" class="form-control" />
								<sf:errors path="name" cssClass="help-block" element="em" />
							</div>
						</div>
						
						
						
						<div class="form-group">
						
							<label class="control-label col-md-4" for="brand"> Enter Brand Name: </label>
							
							<div class="col-md-8">
								
								<sf:input type="text" path="brand" id="brand" placeholder="Brand name" class="form-control" />
								<sf:errors path="brand" cssClass="help-block" element="em" />
							
							</div>
						</div>
						
						
						
						<div class="form-group">
						
							<label class="control-label col-md-4" for="description"> Product Description: </label>
							
							<div class="col-md-8">
								
								<sf:textarea path="description" id="description" rows="4" placeholder="Write some description" class="form-control" />
								<sf:errors path="description" cssClass="help-block" element="em" />
							</div>
						</div>
						
						
						
						<div class="form-group">
						
							<label class="control-label col-md-4" for="unitPrice"> Enter Unit Price: </label>
							
							<div class="col-md-8">
								
								<sf:input type="number" path="unitPrice" id="unitPrice" placeholder="Write price" class="form-control" />
								<sf:errors path="unitPrice" cssClass="help-block" element="em" /> 
							</div>
						</div>
						
						
						
						<div class="form-group">
						
							<label class="control-label col-md-4" for="quantity"> Quantity: </label>
							
							<div class="col-md-8">
								
								<sf:input type="number" path="quantity" id="quantity" placeholder="Write quantity" class="form-control" />
								
							</div>
						</div>
						
						
						<!-- File image -->
						<div class="form-group">
						
							<label class="control-label col-md-4" for="file"> Select an Image: </label>
							
							<div class="col-md-8">
								
								<sf:input type="file" path="file" id="file" class="form-control" />
								<sf:errors path="file" cssClass="help-block" element="em" /> 
								
							</div>
						</div> 
						
						
						
						<div class="form-group">
						
							<label class="control-label col-md-4" for="categoryId"> Select Category: </label>
							
							<div class="col-md-8">
								
								<sf:select class="form-control" id="categoryId" path="categoryId" 
									items="${categories}"
									itemLabel = "name"
									itemValue = "id"
								/>
								
							</div>
						</div>
						
						
						
						<div class="form-group">
						 
							
							<div class="col-md-offset-4 col-md-8">
								
								<input type="submit" name="submit" id="submit" value="Submit" class="btn btn-primary" />
								
								<!-- Hidden fields for products -->
								<sf:hidden path="id" />
								<sf:hidden path="code" />
								<sf:hidden path="supplierId" />
								<sf:hidden path="active" />
								<sf:hidden path="purchases" />
								<sf:hidden path="views" />
								
							</div>
						</div>

					</sf:form>
				
				
				</div>
			</div>
		</div>
	</div>

	<div class="row">
	
		<div class="col-md-offset-2 col-md-8">
		
			<h3>Available Products</h3>
			<hr/>

		</div>
		
		<div class="col-md-offset-2 col-md-8">
		
			<div style="overflow:auto">
			
				<table id="adminProductsTable" class="table table-striped table-bordered">
				
					<thead>
						<tr>
							<th>Id</th>
							<th>Code</th>
							<th>Name</th>
							<th>Quantity</th>
							<th>Unit Price</th>
							<th>Active</th>
							<th>Edit</th>
						</tr>
					</thead>
					
<%-- 					 <tbody>
						<tr>
							<td>4</td>
							<td>
								<img alt="Mac OS" class="adminDataTableImg" src="${contextRoot}/resources/images/PRDDEF121OPMC.jpg" > 
							</td>
							<td>Mac OS</td>
							<td>115</td>
							<td> 7950.00 dt</td>
							
							<td> 
								<div class="slideThree1">	
									<input type="checkbox" checked="checked" value="4" />
									<label for="slideThree1" class="switch"></label>
								</div>
							</td>
							
							<td>
								<a href="${contextRoot}/manage/4/product" class="btn btn-warning">
								<span class="glyphicon glyphicon-pencil"></span>
								</a>
							</td>
						</tr>
					
						<tr>
							<td>4</td>
							<td>
								<img alt="Mac OS" class="adminDataTableImg" src="${contextRoot}/resources/images/PRDDEF121OPMC.jpg" >
							 </td>
							<td>Mac OS</td>
							<td>115</td>
							<td> 7950.00 dt</td>
							<td> 
									<div class="slideThree1">	
										<input type="checkbox" checked="checked" value="4" />
										<label for="slideThree2" class="switch"></label>
									</div>
							</td>
							<td>
								<a href="${contextRoot}/manage/4/product" class="btn btn-warning">
								<span class="glyphicon glyphicon-pencil"></span>
								</a>
							</td>
						</tr>
					</tbody> --%>
					
					<tfoot>
						<tr>
							<th>Id</th>
							<th>Code</th>
							<th>Name</th>
							<th>Quantity</th>
							<th>Unit Price</th>
							<th>Active</th>
							<th>Edit</th>
						</tr>
					</tfoot>
				
				
				</table>
			</div>
		</div>
	</div>	
	
	
	
		
</div>