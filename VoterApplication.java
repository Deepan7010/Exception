package day16Exception;

public class VoterApplication {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		String name=args[0];
		System.out.println(name);
		int age=Integer.parseInt(args[1]);
		if(age>=18) {
			System.out.println("Valide Age");
		}else {
			throw new AgeException("invalid age");
		}
		String gender=args[2];
		System.out.println(gender);
	}

}
