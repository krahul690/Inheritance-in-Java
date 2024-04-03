package Inheritance;

class Parent123{
	private String name;
	void disp() {
		System.out.println("Parent: ");
	}
}
class childA extends Parent123{
	void disp2() {
		name="Rahul";
	}
} 

public class privateMemberIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childA abc = new childA();
		abc.disp();
	}

}
