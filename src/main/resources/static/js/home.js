/**
 * 
 */

$(document).ready(function(){
	var apiKey = "RGAPI-278dcaf5-7248-45d2-b657-a5a197894331";
	
	
	$("#summonerNameBtn").click(function(e){
//		e.preventDefault();
		var summonerName = $("#summonerName").val();
		var summonerUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + summonerName + '?api_key=' + apiKey;
		console.log(summonerUrl);
		
	
//		if(summonerName != ""){
//			$.ajax({
//				type: "POST",
//				url: summonerUrl,
//				dataType : "jsonp",
//			    jsonp : "callback",
//		        headers : {
//		            "Origin": "https://developer.riotgames.com",
//		            "Accept-Charset": "application/x-www-form-urlencoded; charset=UTF-8",
//		            "X-Riot-Token": apiKey,
//		            "Accept-Language": "ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7",
//		            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.132 Safari/537.36"
//		        }
//			}).done(function(data){
//				console.log("결과값:"  + data);
//			});
//		} else {
//			alert("소환사명을 입력해주세요!");
//		}

	});
	
	
});