/*price range*/

 $('#sl2').slider();

	var RGBChange = function() {
	  $('#RGB').css('background', 'rgb('+r.getValue()+','+g.getValue()+','+b.getValue()+')')
	};	
		
/*scroll to top*/

$(document).ready(function(){
	
	$.CookiesMessage({
		messageBg:"#FE980F",
		messageColor:"#000",
		messageLinkColor:"#fff",
		infoEnable:false,
		closeEnable:false, 
	});

	$(function () {
		$.scrollUp({
	        scrollName: 'scrollUp', // Element ID
	        scrollDistance: 300, // Distance from top/bottom before showing element (px)
	        scrollFrom: 'top', // 'top' or 'bottom'
	        scrollSpeed: 300, // Speed back to top (ms)
	        easingType: 'linear', // Scroll to top easing (see http://easings.net/)
	        animation: 'fade', // Fade, slide, none
	        animationSpeed: 200, // Animation in speed (ms)
	        scrollTrigger: false, // Set a custom triggering element. Can be an HTML string or jQuery object
					//scrollTarget: false, // Set a custom target element for scrolling to the top
	        scrollText: '<i class="fa fa-angle-up"></i>', // Text for element, can contain HTML
	        scrollTitle: false, // Set a custom <a> title if required.
	        scrollImg: false, // Set true to use image
	        activeOverlay: false, // Set CSS color to display scrollUp active point, e.g '#00FFFF'
	        zIndex: 2147483647 // Z-Index for the overlay
		});	
	});
	

	
	$(".cart_quantity_up").click(function(){
		$(this).parent().find($(".cart_quantity_input")).val( function(i, oldval) {
		    return parseInt( oldval, 10) + 1;
		});
		$(this).parent().find($(".cart_quantity_input")).attr("value", (parseInt($(this).parent().find($(".cart_quantity_input")).attr("value")) + 1));
		var price = parseInt($(this).parent().parent().parent().find($(".cart_price")).find($(".product_price")).attr("size"));
		var summ = price * $(this).parent().find($(".cart_quantity_input")).val();
		$(this).parent().parent().parent().find($(".cart_total")).find($(".product_total_price")).html(summ + '.0 $').attr("value", summ);
	})
	
	$(".cart_quantity_down").click(function(){
//		if ($(".cart_quantity_input").val() > 0) {
//			$(".cart_quantity_input").val( function(i, oldval) {
//			    return parseInt( oldval, 10) - 1;
//			});
//			$(".cart_quantity_input").attr("value", (parseInt($(".cart_quantity_input").attr("value")) - 1));
//			var price = parseInt($(".product_price").attr("size"));
//			var summ = price * $(".cart_quantity_input").val();
//			$(".product_total_price").html(summ + '.0 $').attr("value", summ);
//		}
		if ($(this).parent().find($(".cart_quantity_input")).val() > 0) {
			$(this).parent().find($(".cart_quantity_input")).val( function(i, oldval) {
			    return parseInt( oldval, 10) - 1;
			});
			$(this).parent().find($(".cart_quantity_input")).attr("value", (parseInt($(this).parent().find($(".cart_quantity_input")).attr("value")) - 1));
			var price = parseInt($(this).parent().parent().parent().find($(".cart_price")).find($(".product_price")).attr("size"));
			var summ = price * $(this).parent().find($(".cart_quantity_input")).val();
			$(this).parent().parent().parent().find($(".cart_total")).find($(".product_total_price")).html(summ + '.0 $').attr("value", summ);
		}
	})
});
