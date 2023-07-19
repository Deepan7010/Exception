package day16Exception;
import java.util.Scanner;
public class Login {

	public static void main(String[] args)throws LoginException,PasswordException {
		// TODO Auto-generated method stub
	String name="deepan";
	long password=123456789;
	Scanner sc=new Scanner(System.in);
	String name2=sc.nextLine();
	long pass=sc.nextLong();
	if(name.equals(name2)&&password==pass) {
		System.out.println("login");
		
	}else if(password!=pass){
		throw new PasswordException("invalid password");
	}else {
		throw new LoginException("invalid Name");
	}

	}

}
