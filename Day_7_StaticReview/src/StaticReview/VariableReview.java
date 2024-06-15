package StaticReview;

public class VariableReview {
	public static void main(String[] args) {
			
	//		Simple s = new Simple();
	//		s.v1 = 10;
	//		s.v2 = 20;
			Simple.v2 = 20;
	//		s.v3 = 30;
			
			
	//		Simple s2 = new Simple();
	//		s2.method1();
	//		s2.method2();
			Simple.method2();
	
		}
	
	}
	
class Simple{
	int v1;			// 인스턴스 변수
	static int v2;	// 클래스 변수, static 변수, 공유변수

	void method1() {	// 인스턴스 메서드 method1()
		int v3 ;	// 지역 변수
	}
	
	static void method2() {	// 클래스 메서드 method2()
		
	}
}