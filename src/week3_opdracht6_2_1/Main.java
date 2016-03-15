<<<<<<< HEAD
package week3_opdracht6_2_1;

public class Main {
	public static void main(String[] args) {
		FacebookAccount account = new FacebookAccount("Mike");
		
		Vriend v1 = new Vriend("Jan", "deMan", "jan@ziggo.nl");
		Vriend v2 = new Vriend ("Kees", "hoogtevrees", "keesh@gmail.com");
		Vriend v3 = new Vriend("Piet", "Kierewiet", "pietjuh@outlook.com");
		
		account.VoegVriendToe(v1);
		account.VoegVriendToe(v2);
		account.VoegVriendToe(v3);
		
		int aantal = account.aantalVrienden();
		System.out.println("Account werkt" + (aantal==3 ? "" : "niet") + "!");
	}
}
=======
package week3_opdracht6_2_1;

public class Main {
	public static void main(String[] args) {
		FacebookAccount account = new FacebookAccount("Mike");
		
		Vriend v1 = new Vriend("Jan", "deMan", "jan@ziggo.nl");
		Vriend v2 = new Vriend ("Kees", "hoogtevrees", "keesh@gmail.com");
		Vriend v3 = new Vriend("Piet", "Kierewiet", "pietjuh@outlook.com");
		
		account.VoegVriendToe(v1);
		account.VoegVriendToe(v2);
		account.VoegVriendToe(v3);
		
		int aantal = account.aantalVrienden();
		System.out.println("Account werkt" + (aantal == 3 ? "" : "niet") + "!");
	}
}
>>>>>>> origin/master
