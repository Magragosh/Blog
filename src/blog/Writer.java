package blog;

public class Writer {

	public String firstname;
	public String lastname;
	public String age;
	public String email;

	public void Print(){
		System.out.println(firstname + " " + lastname);
	}
	public String Fullname(){
		return firstname + " " + lastname;
	}
	


}
