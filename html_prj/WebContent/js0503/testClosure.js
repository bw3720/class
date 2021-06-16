/**
 * 외부파일 방식으로 만드는 클로져 : 공통의 업무
 */

/*
var info=function(){
	function zodiac(year){
		var zodiacTitle=["원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"];
		return zodiacTitle[year%12];
	}//zodiac
	
	return{zodiac : zodiac};
}();
*/


var info=({
		zodiac:function(year){
		var zodiacTitle=["원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"];
		return zodiacTitle[year%12];
	}//zodiac
	
});