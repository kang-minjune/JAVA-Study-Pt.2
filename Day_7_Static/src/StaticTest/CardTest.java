//2024.03.20(수) 카드테스트 - static 변수(클래스 변수)

package StaticTest;

public class CardTest {
	public static void main(String[] args) {
		Card c1 = new Card();
	    c1.kind = "heart";
	    c1.number = 1;
	    
	    Card c2 = new Card();
	    c2.kind = "diamond";
	    c2.number = 7;
	    
	    System.out.println(c1.kind + ", " + c1.number+", (" + c1.width +", " + c1.height+")");
	    System.out.println(c2.kind + ", " + c2.number+", (" + c2.width +", " + c2.height+")");
	    
		c1.width = 50;
		c1.height = 80; //c1만 바꿨는데 c2까지 영향이 가는 이유는 동일폴더 CardTest 흐름이해.ppt 설명 참고
	    
	    System.out.println(c1.kind + ", " + c1.number+", (" + c1.width +", " + c1.height+")");
	    System.out.println(c2.kind + ", " + c2.number+", (" + c2.width +", " + c2.height+")");
	}
   

}

class Card{
	String kind;
	int number;
	
	static int width = 100;
	static int height = 200; //공유해도 되는 일정한 것들을 변수로 선언할 때 쓰인다.

	void method1() {
		
	}
}
