//for creating objects using this class

package emailapp;

public class EmailApp {

	public static void main(String[] args) {
// set the constructor
// ClassName objName = new ClassName(values);
		Email em1 = new Email("John", "Smith");
		
		//em1.setAlternateEmail("js@gmail.com");
		//System.out.println(em1.getAlternateEmail());
		// if returning string (return) then use sysout
		System.out.println(em1.showInfo());
		
	}

}
