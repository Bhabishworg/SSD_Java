package classwork.collections;

public class Driver {
	public static void main(String[] args) {
		EmailManager emailManager = new EmailManager();
		emailManager.addEmail("devytabaiio@gmail.com");
		emailManager.addEmail("hattrick_zha@yahoo.com");
		emailManager.addEmail("minimew21415@tbc.edu.np");
		emailManager.addEmail("shaolin.ah@hotmail.com");
		emailManager.addEmail("sdhbgvjbgdvjkdsfsehfsd@gmail.com");
		
		emailManager.displayEmails();
		
		emailManager.addEmail(2, "natusdragneel23@outlook.com");
		
		emailManager.displayEmails();
		
		DatabaseManager dbManager = new DatabaseManager();
		int count = 1;
		
		for (String email : emailManager.getEmails()) {
			dbManager.addData(count, email);
			count++;
		}
		
		dbManager.displayData();
		
		dbManager.displaySize();
		
		dbManager.removeAll();
		
		dbManager.displaySize();
	}
}
