package day16Exception;

public class IndexError {
	public static void main(String[]args) {
		String a="abc,ee,sfs";
		String[] b=a.split(",");
		try {
		System.out.println(b[3]);
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
