//클래스명 : Car
//멤버변수 : 데이터타입-변수명-용도
// int-door-문의개수, String-color-차의색상
//생성자
// 매개변수를 2개 갖는 생성자 - 문의개수,색상을 전달받아 멤버변수 초기화
// 기본생성자 - 문의갯수는 4, 색상은 white  멤버변수 초기화
//메서드 
//toStirng()을 오버라이드 - 모든 멤버 변수를 문자열로 반환
//테스트 코드 : 문의 갯수와 색상이 다음과 같은
//            2개의 Car 인스턴스를 생성하고 정보를 출력
//            1번 인스턴스 - 4, white
//            2번 인스턴스 - 3, red
package test;

public class Car {
	int door;
	String color;
	
	Car(){
		door = 4;
		color = "white";
	}
	
	Car(int n, String str){
		door = n;
		color = str;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "문개수:" + door +",  색상:" +color;
	}

}
