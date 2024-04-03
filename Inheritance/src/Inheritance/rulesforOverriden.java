package Inheritance;

class rule {
	public void disp() {
		System.out.println("public");
	}
}

class res extends rule {
	// cannot reduce the visibility of the inherited method from rule
	void disp() {
		System.out.println("public");
	}
}

public class rulesforOverriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
