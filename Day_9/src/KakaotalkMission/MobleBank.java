//2024.03.28(목) 아침테스트 

package KakaotalkMission;

//다음 중 원하는 메뉴를 선택하세요
//1) 계좌 생성
//2) 입금
//3) 출금
//4) 모든 계좌 잔액의 합
//5) 이름으로 계좌번호와 잔액 확인
public class MobleBank {
	
	public static void main(String[] args) {
		
		BankAccountEx ba1 = new BankAccountEx("이지연", 0);
		BankAccountEx ba2 = new BankAccountEx("강동원", 0);
		BankAccountEx ba3 = new BankAccountEx("아이유", 0);
		
		System.out.println(ba1.getAccout() +", " + ba2.getBalance());
		System.out.println(ba2.getAccout() +", " + ba2.getBalance());
		System.out.println(ba3.getAccout() +", " + ba2.getBalance());
	}

}
