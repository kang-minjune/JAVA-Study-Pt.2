//클래스명 : 
//멤버변수 : 데이터타입-변수명-용도
// int - x - x좌표
// int - y - y좌표
//생성자
// 매개변수가 2개인 생성자 - x, y 좌표를 전달받아 멤버변수에 저장
//메서드 : 메서드명-반환타입-기능-전달인자
// getLocation - String - xy 좌표값을 문자열로 반환 - 없음
//테스트 코드 : x,y좌표가 10, 20인 Point 인스턴스를 생성하고 화면에 좌표값을 출력
package test;

public class Point {
	int x;
	int y ;
	
	Point(int a, int b){
		x = a;
		y = b;
	}
	
	String getLocation() {
		return "x좌표:" + x + ", y좌표:" + y;
	}
}








