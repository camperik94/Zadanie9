import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj liczbe ograniczajaca");
		
		int liczb = in.nextInt();
		
		Potegi pot = new Potegi(liczb);
		
		pot.funkcja();
	}
}
