package day16Exception;

public class Number {
	public static void main(String[]args) {
		String a="TNCA 9591";
		System.out.println("welcome");
		try {
			int b=Integer.parseInt(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e){
			e.printStackTrace();
			
		}
		catch(NumberFormatException e) {
		//	System.out.println(e);
			e.printStackTrace();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("sf");
	}

}
