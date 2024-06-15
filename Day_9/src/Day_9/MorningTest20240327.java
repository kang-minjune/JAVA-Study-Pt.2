//2024.03.27(수) 아침퀴즈 (3/26 예비군 떄문에 못들었던 내용 기반)
package Day_9;

public class MorningTest20240327 {
    public static void main(String[] args) {
    	test();
    }
    
    //아침퀴즈 1번 test() 실행 시 화면에 red, 3이 출력되도록 Car 클래스를 완성
    static void test() {
    	Car c1 = new Car();
    	System.out.println(c1);
    }
    
    //아침퀴즈 2번
    //다음 카드 클래스에 기본 생성자와 매개변수를 2개 갖는 생성자를 추가
    //기본 생성자에서는 shape와 number를 "heart"와 7로 초기화 
    //매개변수 2개인 생성자는 매개변수로 멤버변수를 초기화 
    static void test2() {
    	
    }
    
    //아침퀴즈 3번
    //다음 Tv 클래스의 두 개 생성자를 완성하세요.
    //이때 생성자에서 생성자를 호출하도록 합니다.
    //기본 생성자는 channel과 volumn을 각각 11과 15로 설정 
    static void test3() {
    	Tv t1 = new Tv();
    	Tv t2 = new Tv(11, 15);
    	
    	System.out.println(t1.channel + ", " + t1.volumn);
    	System.out.println(t2.channel + ", " + t2.volumn);
    }
}


//아침퀴즈 1번 test() 실행 시 화면에 red, 3이 출력되도록 Car 클래스를 완성
class Car{
	int door;
	String color;
	
	public String toString() {		
		color = "red";
		door = 3;
		
		System.out.println(color + ", " + door);
		return super.toString();
	}
}



//아침퀴즈 2번
//다음 카드 클래스에 기본 생성자와 매개변수를 2개 갖는 생성자를 추가
//기본 생성자에서는 shape와 number를 "heart"와 7로 초기화 
//매개변수 2개인 생성자는 매개변수로 멤버변수를 초기화 




//아침퀴즈 3번
//다음 Tv 클래스의 두 개 생성자를 완성하세요.
//이때 생성자에서 생성자를 호출하도록 합니다.
//기본 생성자는 channel과 volumn을 각각 11과 15로 설정 
class Tv{
	int channel;
	int volumn;
	Tv(){
		this(11,15);
	};
	Tv(int channel, int volumn){
		
	    this.channel = channel;
	    this.volumn = volumn;
	}
	
}
