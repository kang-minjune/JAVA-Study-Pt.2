//2024.03.28(목) 아침테스트 

package KakaotalkMission;

//BankAccount 클래스: 은행 계좌를 나타내는 Account 클래스를 정의
//멤버변수 계좌 소유자의 이름, 계좌 번호, 잔액 
//생성자 소유자 이름, 계좌번호, 잔액 
//생성자 소유자 이름, 계좌번호,
//메서드 
//void Deposit(long money) // 입금
//void withdrawal(long money) // 출금
//
//출금, 입금 등의 메서드를 포함하여 계좌를 관리할 수 있습니다.
public class BankAccount {
	
	private String owner;	     //소유자 이름
	private String account;      //계좌번호
	private long balance;		 //잔액
	
	BankAccount(String owner, String accout, long balance){
		this.owner = owner;
		this.account = accout;
		this.balance = balance;
	}
	
	BankAccount(String owner, String account){
		this(owner,account,0);
	}
	
	long Deposit(long money) {
		balance += money;
		return balance;
	}
	
	void withDrawal(long money) {
		if(balance < money) {
			System.out.println("잔액이 부족합니다");
		}else {
			balance -= money;
		}
	}
	
	long getBalance() {
		return balance;
	}
	
	String getOwner() {
		return owner;
	}
	
	String getAccount() {
		return account;
	}

}
