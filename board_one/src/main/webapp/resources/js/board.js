$(document).ready(function(){	
	$('ul.tabs li').click(function(){
		var tab_id = $(this).attr('data-tab');

		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');

		$(this).addClass('current');
		$("#"+tab_id).addClass('current');
	})
	
	$("searchBtn").click(function(){
		$.ajax({
			type : "POST",
			url : "search",
			data : {
				"keyword" : $('#searchTxt').val(),
			},
			success : function(data) {
				if ($.trim(data) == "all" || $.trim(data).equl) {
					alert("all");
				} else if ($.trim(data) == "keywordSearch") {
					alert("keywordSearch");
				}
			}
		})
	})
})


