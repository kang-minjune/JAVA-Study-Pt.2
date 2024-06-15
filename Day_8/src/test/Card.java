//클래스명 : Card
//멤버변수 : 데이터타입-변수명-용도
//         String-shape-카드의무늬 
//		   int-num-카드의 숫자
//		   int-height-카드의 세로길이 
//		   int-width-카드의 가로길이 
//생성자
//매개변수가 4개인 생성자 : 카드의 무늬와 숫자, 가로 세로 길이를 전달받아 
//                     멤버변수를 초기화
//매개변수가 2개인 생성자 : 카드의 무늬와 숫자를 전달받아 멤버변수를 초기화하고
//                     가로와 세로 길이를 각각 100과 200으로 초기화
//메서드 
//toString을 오버라이딩하여 무늬와 숫자, 가로 세로 길이를 출력
//테스트 코드 : 길이가 5인 Card 타입의 배열에 난수로 초기화한 카드의 인스턴스를 저장하고 정보를 출력
//            무늬는 diamond, heart, spade, clover 중 하나
//            숫자는 1부터 13 사이의 값 중 하나
package test;

public class Card {
	
	String shape;
	int num;
	int height;
	int width;
	
	Card(String str, int n, int h, int w){
		shape = str;
		num = n;
		height = h;
		width = w;
	}
	
	Card(String str, int n){
		shape =str;
		num = n;
		width = 100;
		height = 200;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return shape +", " + num + ", " + width +", " + height;
	}

}

























