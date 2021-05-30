import java.io.IOException;

public class Main {
	public static void main(String[] args) throws InterruptedException, IOException {

		VaccineService vaccineService = new VaccineService();

		while (true) {
			boolean isAvailable = vaccineService.isAvailable(args[0], Integer.parseInt(args[1]) < 45 ? 18 : 45,
					args[2]);

			if (isAvailable) {
				String subject = "Vaccine available on "+args[2];
				String body = "Covid Vaccine available on "+args[2]+" at "+vaccineService.centerName;
				Mailer.sendEmail(args[3], args[4], args[5], subject, body);
				System.out.println("Available");
			}

			Thread.sleep(10*60*1000);
		}

	}
}
