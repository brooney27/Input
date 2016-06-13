import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String firstInitial, lastName, streetName, streetType, city;
		int houseNumber;
		
		firstInitial = keyboard.next();
		lastName = keyboard.next();
		houseNumber = keyboard.nextInt();
		streetName = keyboard.next();
		streetType = keyboard.next();
		city = keyboard.next();
		
		System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		System.out.println(streetName + " " + streetType + " " + city);
	}

}
