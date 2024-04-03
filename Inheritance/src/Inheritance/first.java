package Inheritance;

//Inheritance use link a to classes ,extends is used for this
//code Re-usability is happen

//Parent/Base/existing class
class Demo1
{
	String name = "rahul";
	int age= 22;
	
	  void disp()
	{
		System.out.println("demo:"+"\n" +age+"\n" +name);
	}
}

//child /subclass/derived class
class Demo2 extends Demo1{
	
}
public class first {

	public static void main(String[] args) {
		 Demo2 ab = new Demo2();
		 ab.disp();
		
	}

}
