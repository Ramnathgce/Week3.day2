package week3.day2;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation auto1 =new Automation();
		auto1.java();
		auto1.selenium();
		auto1.phython();
		auto1.ruby();

	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("METHOD SELENIUM");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("METHOD JAVA");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("METHOD RUBY");
	}
	
}
