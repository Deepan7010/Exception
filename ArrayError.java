package day16Exception;

public class ArrayError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="deepan";
		try {
			char b=a.charAt(7);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println(a);
		}
		

	}

}
