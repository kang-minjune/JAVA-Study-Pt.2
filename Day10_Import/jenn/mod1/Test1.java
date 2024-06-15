//2024.04.02(화) 접근 제어자 개념 1

package jenn.mod1;

//-----------------final ----------------------//
class Test extends TestFinalClass{
}

final class TestFinalClass{
	
}

 class TestFinalMethod {
	final void myMethod(){}
}

class TestFinalMember{
	
	final int NUMBER = 10;
	
}

//----------------- abstract ----------------------//
class TestAbs {

}

abstract class TestAbstract{
	abstract void method() ;
}

//----------------- access ----------------------//

public class Test1{
	int member;
}

class Test3 extends Test1{
	void method() {
		member = 10;
	}
}

class Test2{
	void method() {
		Test1 t = new Test1();
		t.member = 10;
	}
}






















