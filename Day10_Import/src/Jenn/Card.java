/*
//final 접근 제어자 활용해보기 2

//클래스명 : Card
//멤버변수 중 static과 final 제어자가 적합한 변수에 제어자를 사용
public class Card {
	final String SHAPE;
	final int NUMBER;
	
	static final int WIDTH = 100;
	static final int HEIGHT = 200;
	
	Card(String shape, int number) {
		this.SHAPE = shape;
		this.NUMBER = number;
	}
	
	@Override
	public String toString() {
		
		return "카드 모양 : " + SHAPE 
				+ ", 카드 숫자 : " + NUMBER 
				+ "가로세로 길이 : " + WIDTH +"," + HEIGHT;
	}
}
*/