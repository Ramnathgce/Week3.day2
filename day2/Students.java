package week3.day2;

public class Students {

	public void studentinfo(int id)
	{
		System.out.println(id);
	}
	public void studentinfo(int id,String name)
	{
		System.out.println(id+""+name);
	}
	public void studentinfo(String email,long phno)
	{
			System.out.println(email+""+phno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students stud =new Students();
		stud.studentinfo(80040901);
		stud.studentinfo("ramnathgcecse@gmail.com", 9486795282l);
		stud.studentinfo(80040901,"RAMNATH");
	}

}
