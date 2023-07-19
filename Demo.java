package day16Exception;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		int a=10,b=5,c=0;
		System.out.println(a+b+c);
		try {
		System.out.println(a/c);
		}
		catch(Exception e) {
			System.out.println("not divide");
			
		}
		System.out.println(a*b);
		System.out.println("thankyou");
		System.out.println();
	}

}
