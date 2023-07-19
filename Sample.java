package day16Exception;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name=null;
System.out.println("welcome");
//String x="hello";
//System.out.println(x.indexOf("z"));
try {
	System.out.println(name.toUpperCase());
	
}
catch(ArithmeticException e) {
	System.out.println("it arithmetricException");
}
catch(NumberFormatException e) {
	System.out.println("numberFormat Exception ");
}
catch(NullPointerException e) {
//	System.out.println("not modified");
	//System.out.println(e);
	e.printStackTrace();
	
 }
catch(Exception e) {
	System.out.println("exception");
}
System.out.println("thankyou");
	}

}
