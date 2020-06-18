package myfirstpackage;

public class Lab10_CCAccount {
	String firstName;
	String lastName;
	int accountNumber;
	String bankName;
	int cvcNumber;
	int expMonth;
	int expYear;
	String type;
	public Lab10_CCAccount() {
		
	}
	public Lab10_CCAccount(String first, String last, int accNum, String bank, int cvc, int month, String cardtype, int year ) {
		firstName = first;
		lastName = last;
		accountNumber = accNum;
		bankName = bank;
		cvcNumber = cvc;
		expMonth = month;
		expYear = year;
		type = cardtype;
		
	}
	
}
