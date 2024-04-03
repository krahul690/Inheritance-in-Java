package Inheritance;

class Parent
{
	int a,b,c;
	
	Parent()
	{
		a=10;
		b=20;
		c=30;
		System.out.println("Parent Constructor");
		
	}
	Parent(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Parent para Const");
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}
class Child extends Parent
{
	int x,y;
	Child(){
		x=100;
		y=200;
	}
	Child(int x,int y){
		super(x,y);
		this.x=x;
		this.y=y;
		
	}
	void disp() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	
}



public class ConstructInInheritence {

	public static void main(String[] args) {
		
		Child ch =new Child();
		ch.disp(); 
		Child ch1 = new Child(2000,1500);
		ch1.disp();
	}

}
