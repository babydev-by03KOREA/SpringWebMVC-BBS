function writeDo(){
	window.open('/BBS/writeView.do')	
}

function regiAjax(){
	var data = $("#regiForm").serialize();
	
	$.ajax({
		type : "POST",
		url : "/BBS/writeView.do",
		data : data,
		success: function(data){
			if(data == "Y"){
				alert("글 등록이 완료되었습니다.");
				location.href = "/BBS/list.do";		
			}
		},
		error: function(data){
			alert("실패");
			console.log(data);
		}
	});
};