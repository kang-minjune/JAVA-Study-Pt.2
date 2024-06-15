//2024.03.20(수) static 변수, 지역 변수 

package StaticTest;

public class VariableTest {
   public static void main(String[] arg) {
	   
	 Simple s = new Simple();
     s.v1 = 10;
     s.v2 = 20;
     Simple.v2 = 20;//선언하지 않고 바로 사용이 가능한 것도 static 변수의 장점이다.(유용함)
     // s.v3 = 30; //지역 변수는 main에서 불러올 수 없다.
   
	 Simple s2 = new Simple();
	 s2.method1();
	 s2.method2();
	 Simple.method2(); //method도 선언하지 않고 사용 가능하다.
	 
   
   }
}

class Simple{
	int v1; //인스턴스 변수 
	static int v2; //클래스 변수 , static 변수, 공유 변
	
	void method1() { //인스턴스 메서드 method1()
		int v3; //지역 변수
	}
	
	static void method2() { //클래스 메서드 method2()
		
	}
}
