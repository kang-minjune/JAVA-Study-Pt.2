//2024.03.27(수)
//전날 2024.03.26에 하지 못했던 생성자에 대해 공부 2 -> JAVA의 정석(PDF 파일 p.275 ~ 292 참고)

package Day_9;

public class ConstructorCoding {
   public static void main(String[] args) {

	   func4_1();
   }
   
   //생성자 this(),this 예제 
   static void func1()
   {
	   CarC c1 = new CarC();  //매개변수가 없는 기본 생성자 1 출력 
       System.out.println("c1 \ncolor: " + c1.color + "\ngearType : " + c1.gearType + "\ndoor : " + c1.door);
       System.out.println();
       
       CarC c2 = new CarC("blue"); //매개변수가 존재하는 생성자 1 출력 
       System.out.println("c2 \ncolor: " + c2.color + "\ngearType : " + c2.gearType + "\ndoor : " + c2.door);
       System.out.println();
       
       CarC c3 = new CarC("black", "manual", 3); //매개변수가 존재하는 생성자 2 출력 
       System.out.println("c2 \ncolor: " + c3.color + "\ngearType : " + c3.gearType + "\ndoor : " + c3.door);
       System.out.println();
	   
   }
   
   //생성자를 이용한 인스턴스의 복사
   static void func2() {
	   CarD cd1 = new CarD();	  
	   
	   System.out.println("cd1 \ncolor: " + cd1.color + "\ngearType : " + cd1.gearType + "\ndoor : " + cd1.door);
       System.out.println();
	   
	   CarD cd2 = new CarD(cd1); //cd1의 복사본 cd2를 생성
	   
	   System.out.println("cd2 \ncolor: " + cd2.color + "\ngearType : " + cd2.gearType + "\ndoor : " + cd2.door);
       System.out.println();
       
       
       cd1.door = 100; //cd1의 door의 값을 변경한다.
       
       
       System.out.println("cd1.door = 100; 수행 후");
       System.out.println();
       
       
       System.out.println("cd1 \ncolor: " + cd1.color + "\ngearType : " + cd1.gearType + "\ndoor : " + cd1.door);
       System.out.println();
       
       System.out.println("cd2 \ncolor: " + cd2.color + "\ngearType : " + cd2.gearType + "\ndoor : " + cd2.door);
       System.out.println();
       
       // 위와 같이 cd1을 복사한 cd2지만 서로 독립적이다.
       // 따라서 복사 이후에 cd1에 해당하는 변수값이 변한다고 해서 cd2의 값에 영향을 주지 않는다.
       
       //인스턴스를 생성할 때는 다음의 2가지 사항을 결정해야한다.
       // 1. 클래스 - 어떤 클래스의 인스턴스를 생성할 것인가.
       // 2. 생성자 - 선택한 클래스의 어떤 생성자로 인스턴스를 생성할 것인가? 
     }
   
   
   
   
   // 클래스,인스턴스 초기화 블럭 형식 사용
   
   ////////////////////////////////////
   ////////////////////////////////////
   static {
	   System.out.println("static { }"); //클래스 초기화 블럭 
	   
   }
   {
	   System.out.println("{ }"); //인스턴스 초기화 블럭
   }
   
   ////////////////////////////////////
   
   static int[] arr = new int[10]; 
   
   static {
	   for(int i = 0; i < arr.length; i++) {
		   //1과 10사이의 임의의 값을 배열 arr에 저장한다. 
		   arr[i] = (int)(Math.random()*10) +1; //난수 사용 
	   }
	   
   }
   public static void ClassInstanceBlock() {
	   for(int i = 0; i < arr.length; i++) {
		   System.out.println("arr[" + i + "] : " + arr[i]);
	   }
   } //클래스, 인스턴스 초기화 블럭 응용(배열 이용)
   
   ////////////////////////////////////
   ////////////////////////////////////
   
   
   
   
   // 클래스, 인스턴스 초기화 블럭형식을 이해하기 위한 this() 복습 
   static void func3() {
	   
	   
	   System.out.println("BlockTest bt = new BlockTest(); ");
	   BlockTest bt1 = new BlockTest();
	   System.out.println("bt1 \n이름 : " + bt1.name + "\n성별 : " + bt1.sx + "\n나이 : " + bt1.age);
	   
	   System.out.println();
	   
	   System.out.println("BlockTest bt2 = new BlockTest(); ");
	   BlockTest bt2 = new BlockTest(bt1);	   
	   System.out.println("bt1 \n이름 : " + bt2.name + "\n성별 : " + bt2.sx + "\n나이 : " + bt2.age);
	   
	   
	   bt1.name = "김태희";
	   bt1.sx = "여";
	   bt1.age = 40;
	   
	   System.out.println("bt1의 정보를 수정한 후"); //복사 후에 bt1의 정보를 바꿔도 bt2에 영향이 가지 않는다는 것 복습
	   
	   System.out.println();
	   System.out.println("bt1 \n이름 : " + bt1.name + "\n성별 : " + bt1.sx + "\n나이 : " + bt1.age);
	   System.out.println();
	   System.out.println("bt1 \n이름 : " + bt2.name + "\n성별 : " + bt2.sx + "\n나이 : " + bt2.age);
	   	   
   }
   
   //멤버변수의 초기화 시기와 순서
   static void func4() {
	   Product p1 = new Product();
	   Product p2 = new Product();
	   Product p3 = new Product();
	   
	   System.out.println("p1의 제품번호 (serial no)는 " + p1.serialNo);
	   System.out.println("p2의 제품번호 (serial no)는 " + p2.serialNo);
	   System.out.println("p3의 제품번호 (serial no)는 " + p3.serialNo);
	   System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
   }
   
   static void func4_1() {
	   Document d1 = new Document();
	   Document d2 = new Document("자바.txt");
	   Document d3 = new Document();
	   Document d4 = new Document();
	   
   }
	   
}







// 생성자 this(), this
class CarC{
	String color;
	String gearType;
	int door;
	
	CarC(){ //매개변수가 없는 기본 생성자 this()
		this("white", "auto", 4); //CarC(String color, String gearType, int door)을 호출. (이때 생성자 이름 대신 this를 사용한 것이다.)
	}
	
	//매개변수가 존재하는 생성자 this() 1. 매개 변수 color만 선언
	CarC(String color){ 
		this(color,"auto",4);
	}
	
	//매개변수가 존재하는 생성자 this() 1. 매개 변수 color, geaarType, door 모두 선언
	CarC(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}


//생성자를 이용한 인스턴스의 복사
class CarD{
	String color;
	String gearType;
	int door;
	
	CarD(){
		this("white", "auto", 4);
	}
	
	CarD(CarD c){ //인스턴스의 복사를 위한 생성자.
	    color = c.color;
	    gearType = c.gearType;
	    door = c.door;
	}
	
	CarD(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}


//클래스, 인스턴스 초기화 블럭형식을 이해하기 위한 this() 생성자, 인스턴스 복사 생성자 복습 
class BlockTest{
	String name;
	String sx;
	int age;
	
	BlockTest(){
		this("강민준","남", 25);
	} //매개변수가 없는 생성자
	
    BlockTest(String name, String sx, int age){
    	this.name = name;
    	this.sx = sx;
    	this.age = age;
    } //매개변수가 있는 생성자
     
    
    
    BlockTest(BlockTest bt){ //인스턴스 복사를 위한 생성자 
        name = bt.name;
        sx = bt.sx;
        age = bt.age;
    }
}    
    
//멤버변수의 초기화 시기와 순서 
class Product{
	static int count = 0;
	int serialNo;
	
	{
		++count;
		serialNo = count; //Product 인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serialNo에 저장한다.
	}
	
    public Product() {} // 기본 생성자, 생략 가능
}

class Document{
	static int count = 0;
	
	String name; //문서명 (Document name)
	
	Document() { //문서 생성 시 문서명을 지정하지 않았을 때 
		this("제목없음" + ++count);
	}
	
	Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었습니다. ");
	}
}