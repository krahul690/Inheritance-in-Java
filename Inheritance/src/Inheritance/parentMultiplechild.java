package Inheritance;
/*we can extends parent with multiple base class		 
 * 
 * 
 * 
 */
class AA{
	/*AA not extends so
	 * object is there
	 * Object properties and methods is available
	 */
	static {
		System.out.println("hey");
	}
}
class BB extends AA{
	
}
class CC extends AA{
	
}
 


public class parentMultiplechild {
	
	public static void main(String[] args) {
		 AA ab = new AA();
	}

}
