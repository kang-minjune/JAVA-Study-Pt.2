//2024.03.26(화) 수업내용

package Day_8;

import java.util.Scanner;

public class Day_8 {
	
	public static void main(String[] args) {
		
		/**** 5번 ****/
		AddrBook arr[] = new AddrBook[3];
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		
		for(int i = 0 ;i < arr.length ; i++) {
			str1 = sc.next();
			str2 = sc.next();
			
			arr[i] = new AddrBook();
			arr[i].num = i+1;
			arr[i].name = str1;
			arr[i].addr = str2;
		}
		
		/**** 4번 테스트 코드****/
		System.out.println("1부터 " + arr.length +"까지 번호를 입력");
		int n = sc.nextInt();
		
		for(int i = 0 ; i <arr.length ; i++) {
			if(arr[i].getAddrBook(n)!=null) {
				System.out.println(arr[i].getAddrBook(n));
			}
		}
		
	}
	

}
//1. 다음 클래스에 shape와 num 값을 설정하는 메서드와 그 값을 읽어오는 메서드를 추가
class Card{
	String shape;
	int num;
	
	void setShape(String str) {
		shape = str;
	}
	
	void setNum(int n) {
		num = n;
	}
	
	String getShape() {
		return shape;
	}
	
	int getNum() {
		return num;
	}
	
}
//2. 다음 코드의 완성을 위해 MyMath에 메서드를 추가하세요
//( 힌트, static 메서드)
//public class MathTest{
//	public static void main(String[] args) {
//		int r = MyMath.add(3, 5);
//	}
//}
class MyMath{  
	static int add(int a, int b) {
		return a+b;
	}
}

//3. 다음 클래스를 구현하세요
//클래스명 :  AddrBook
//멤버변수 : int num, String name, String addr
//메서드 : 
//주소록에 번호를 저장하는 setNum, 번호를 반환하는 getNum
//이름을 저장하는 setName, 이름을 반환하는 getName
//주소를 저장하는 setAddr, 주소를 반환하는 getAddr
//
//

class AddrBook{
	int num;
	String name;
	String addr;
	
	void setNum(int n) {
		num = n;
	}
	
	void setName(String str) {
		name = str;
	}
	
	void setAddr(String str) {
		addr = str;
	}
	
	int getNum() {
		return num;
	}
	
	String getName() {
		return name;
	}
	
	String getAddr() {
		return addr;
	}
	
	//4. 번호를 매개변수로 전달 받아 이름과 연락처를 문자열로 반환하는 메서드를 AddrBook 클래스에
	// 추가하세요
	String getAddrBook(int n) {
		if(num == n) {
			return name + ", " + addr;
		}else {
			return null;
		}
	}
	
}
