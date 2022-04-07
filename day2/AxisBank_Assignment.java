package week3.day2;

public class AxisBank_Assignment extends BankInfo {

	public void deposit()
	{
		System.out.println("CONCRETE ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank_Assignment axis= new AxisBank_Assignment();
BankInfo bank =new BankInfo();
axis.deposit();
axis.savings();
axis.fixed();
bank.deposit();
	}

}
