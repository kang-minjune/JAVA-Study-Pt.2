package StaticReview;

public class NameCardReview {
     public static void main(String[] args) {
    	NameCard nc1 = new NameCard();
    	nc1.department = "전략기획실";
        nc1.position = "실장";
        nc1.name = "제니퍼";
        System.out.println(nc1.info());
        
        System.out.println();
        
        NameCard nc2 = new NameCard();
    	nc2.department = "영업부";
        nc2.position = "과장";
        nc2.name = "차은우";
        System.out.println(nc2.info());
     }
}

class NameCard {
     String department;
     String position;
     String name;
     
     
     static String company = "모블교육센터";
     static String website = "www.mobile.com";
     
     String info() {
    	return "소속: " + department + "\n직책: " + position + "\n이름: " + name;
     }
	
}
