package StaticTest;

public class NameCardTest {
      public static void main(String[] args) {
    	  
    	  NameCard n1 = new NameCard();
    	  n1.department = "전략기획실";
    	  n1.position = "실장";
    	  n1.name = "제니퍼";
    	  System.out.println(n1.info());
    	  
    	  System.out.println();
    	  
    	  NameCard n2 = new NameCard();
    	  n2.department = "영업부";
    	  n2.position = "과장";
    	  n2.name = "차은우";
    	  
    	  System.out.println(n2.info());
    	  
      }
}

class NameCard{
	String department;
	String position;
	String name;
	
	static String company = "모블교육센터";
    static String website = "www.mobile.com";
    
    String info() {
    	 String str = "이름: " + name + "\n부서: " + department + "\n직책: "+ position;
         return str;	
    }
}
