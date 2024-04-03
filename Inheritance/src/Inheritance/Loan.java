package Inheritance;

class Loana {
	void disp() {
		System.out.println("Welcom to SBI");
	}
}

class PersonalLoan extends Loana {
	void disp() {
		System.out.println("personal loadn appli..");
	}
}

public class Loan {
	public static void main(String args[]) {
		PersonalLoan pl = new PersonalLoan();
		pl.disp();
		
	}
}
