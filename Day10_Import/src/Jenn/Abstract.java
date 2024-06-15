//2024.04.02 (화) abstract 접근 제어자 활용 - 추상 메서드

package Jenn;

public class Abstract {
	
	public static void main(String[] args) {
		
	}
}

class TestAbs extends TestAbstract{
	
	void method() {
		
	} //abstract 접근 제어자는 추상 메서드의 개념을 갖고있기 때문에 조상에서 구현하지 못한 것을 할 의무가 있기에 메서드를 적어줘야 오류가 사라진다.
}

abstract class TestAbstract{
	abstract void method();
}
	
