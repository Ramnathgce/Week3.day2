package week3.day2;

public class Desktop implements Software {

	public void hardwareresource() {
		// TODO Auto-generated method stub
		System.out.println("METHOD HARDWARE RESOURCE");
	
	}
	public void softwareresource() {
		// TODO Auto-generated method stub
		System.out.println("METHOD SOFTWARE RESOURCE");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desk =new Desktop();
		desk.softwareresource();
		desk.hardwareresource();
	}

	
}
