package StaticTest;

import java.util.Scanner;

public class MyMathTest {
   public static void main(String[] args) {
	   
	   method2();
   }
   
   static void method1() {
	   MyMath m = new MyMath();
	   m.printNum();
	   m.setNum(7);
       m.printNum();
       
       int sum = m.add(10, 5);
       int maxNum = m.max(10, 5);
       System.out.println("10과 5의합: " + sum +", 더 큰값:" + maxNum);
   }
   
   
   
   static void method2() {
	   Scanner sc = new Scanner(System.in);
	   
	   int n1 = sc.nextInt();
	   int n2 = sc.nextInt();
	   
//	   MyMath m = new MyMath();
//	   int sum = m.add(n1, n2);
//	   int max = m.max(n2, n1);
	   
//	   int sum = MyMath.add(n1, n2);
//	   int max = MyMath.max(n2, n1); //이렇게 바로 작성하려면 클래스 부분에 static을 붙어줘야 한다.
	   
//	   System.out.println(sum + ", " + max);
	   
   }
}

class MyMath{
	int num = 0;
	
	
	
	/*static*/ int add(int a, int b){ //method2() 처럼 바로 작성하기 위해 앞에 static 붙여줘야한다.
		return a + b;
	}
	
	/*static*/ int max(int x, int y) { //method2() 처럼 바로 작성하기 위해 앞에 static 붙여줘야한다.
		
		int result;
		
		if(x>y) {
			result = x;
		}
		else {
			result = y;
		}
		
		return result;
	}
	
    void printNum(){
		System.out.println(num);
	}
	
	void setNum(int n) {
		num = n;
	}
}