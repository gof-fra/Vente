


$(document).ready(function(){
	
	switch (menu) {
	
		case 'About Us' :
			$('#about').addClass('active');
			break;
			
		case 'Contact Us' :
			$('#contact').addClass('active');
			break;
			
		case 'All Products' :
			$('#listProducts').addClass('active');
			break;
			
		case 'Manage Products' :
			$('#manageProducts').addClass('active');
			break;
			
		default :
			if(menu == "Home")break;
			$('#listProducts').addClass('active');
			$('a_'+menu).addClass('active');
			break;
	
	}
	
	// code for jquery Datatable
	
	
	var $table = $('#productListTable');
	// execute the below code only where we have  this  table
	
	if($table.length) {	
		
		var jsonUrl = '';
		if(window.categoryId == '') {
			jsonUrl = window.contextRoot + '/json/data/all/products';
		}
		else {
			jsonUrl = window.contextRoot + '/json/data/category/' +window.categoryId+ '/products';
		}
		
		$table.DataTable( {
			lengthMenu: [[3, 5, 10, -1],['3 Records','5 Records','10 Records','ALL']], //le nombre d'entrée
			pageLength: 5,  //nombre de ligne
			ajax: {
				url: jsonUrl,
				dataSrc: ''
			},
			
			columns : [
						{
							data: 'code',
							mRender: function(data, type, row) {
								return '<img src=" '+window.contextRoot+' /resources/images/ '+data+' .jpg" class="dataTableImg"/>';
							}
						},
						{
							data: 'name'
						},
						{
							data: 'brand'
						},
						{
							data: 'unitPrice',
							mRender: function(data, type, row) {
									return '' + data +' dt'
								}
						},
						{
							data: 'quantity',
							mRender: function(data, type, row) {
								
								if(data < 1) {
									
									return '<span style="color:red">Out of stock! </span>';
									
								}
								
								return data;
								
							}
						},
						
						{ // parti vu et ajout de product   quantity == 0
							data: 'id',
							bSortable: false,
							mRender: function(data, type, row) {
								
								var str = '';
								str += '<a href=" '+window.contextRoot+ '/show/' +data+' /product" class="btn btn-primary"> <span class="glyphicon glyphicon-eye-open"> </span> </a> &#160;';
								
								if(row.quantity < 1){
									
									str += '<a href="javascript:void(0)" class="btn btn-success disable"> <span class="glyphicon glyphicon-shopping-cart"> </span> </a>';				
									
								}
								else {
									str += '<a href=" '+window.contextRoot+ '/cart/add/' +data+' /product" class="btn btn-success"> <span class="glyphicon glyphicon-shopping-cart"> </span> </a>';	
								}
								
								return str;
							}
						}
	
					 ]
			

		});
	}
	
	// dismiising the alert after 3 secondes
	
	var $alert = $('.alert');
	
	if($alert.length) {
		
		setTimeout(function(){
			$alert.fadeOut('slow');
		} , 3000)
	}
	
	
	// Bouton active for bootbox.js
	
	$('switch input [type="checkbox"]').on('change', function(){
		
		var checkbox = $(this)
		var checked =  checkbox.prop('checked');
		var dMsg = (checked)? 'Would you want to active the product':
							  'Would you want to desactive the product';
		var value = checkbox.prop('value');
		bootbox.confirm({
			size: 'medium',
			title: 'Product Active & desactive',
			message: dMsg,
			callback: function(confirmed) {
				if(confirmed) {
					console.log(value);
					bootbox.alert({
						size:'medium',
						title: 'Information',
						message: 'You are going to perform operation on product' + value
					});
				}else {
					checkbox.prop('checked', !checked);
				}
			}
		});
		
	});
	
	
	
	
}); 