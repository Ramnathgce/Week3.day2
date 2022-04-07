package week3.day2;

public class Smartphone extends Android {

	public void connectWatsapp()
	{
		System.out.println("Method Connetwatsapp");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone smart= new Smartphone();
		smart.connectWatsapp();
		smart.makeCall();
		smart.sendMsg();
		smart.saveContact();
	}

}
