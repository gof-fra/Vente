

$(document).ready('.slideThree1 input [type="checkbox"]').on('change', function(){
		
		var checkbox = $(this);
		var checked =  checkbox.prop('checked');
		var dMsg = (checked)? 'Would you want to active the product?' : 'Would you want to desactive the product?';
		var value = checkbox.prop('value');
		bootbox.confirm({
			size: 'medium',
			title: 'Product Active & Desactive',
			message: dMsg,
			callback: function(confirmed) {
				if(confirmed) {
					console.log(value);
					bootbox.alert({
						size:'medium',
						title: 'Information',
						message: 'You are going to perform operation on product' + value
					});
				}
				else {
					checkbox.prop('checked', !checked);
				}
			}
	

		});
		
});

