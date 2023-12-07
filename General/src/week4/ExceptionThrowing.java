package week4;

import java.util.Scanner;

public class ExceptionThrowing {
	/**
	 * Generates the hash value of the password.
	 * Throws {@link week4.InvalidPWException} if the password's length isn't in between 5 and 32.
	 * 
	 * @param pwd The password
	 * @return hashPwd The hash code of the password
	 * @throws InvalidPWException
	 */
	static int gen_hash(String pwd) throws InvalidPWException {
		if (pwd.length() < 5 || pwd.length() > 32)
			throw new InvalidPWException();		// cause an exception to occur
		int hashPwd = pwd.hashCode();
		
		return hashPwd;
	}
	
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		try {
			String password = scanner.nextLine();
			int hashVal = gen_hash(password);
			System.out.println("Hash of password is " + Integer.toHexString(hashVal));
		} catch (InvalidPWException e) {
			System.out.println("Password does not conform to requirements");
		}
		
		scanner.close();
	}
}
