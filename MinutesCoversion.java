import java.util.Scanner;

public class MinutesCoversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter minutes : ");
		double min = sc.nextDouble();
		long day = (long) (min / 60 / 24) %365;
		long years = (long) (min / ( 60 * 24 * 365));
		System.out.println(min + "is approx"+years+ " years &"+day+ "days");
	}

}
