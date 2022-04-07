package week3.day2;

public class College extends University {

	public static void main(String[] args) {
		College c = new College();
		c.pg();
		c.ug();
	}

	@Override
	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("IMPLEMENTED UG");
	}
	}