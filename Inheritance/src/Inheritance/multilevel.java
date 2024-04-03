package Inheritance;


//extends Object class multilevel1 
class multilevel1 {
	String name = "rahul";
	int age = 10;

	void multilevel1() {
		System.out.println("Demo" + name + age);
	}
}

class Demo30 extends multilevel1 {

}

class Demo31 extends Demo30 {

}

public class multilevel {
	public static void main(String[] arsg) {
		Demo31 d = new Demo31();
		d.multilevel1();
		
	}
}
