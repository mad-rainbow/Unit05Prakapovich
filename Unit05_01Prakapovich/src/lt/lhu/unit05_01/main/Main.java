package lt.lhu.unit05_01.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b, c;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 'a side' length ");
		a = sc.nextDouble();

		System.out.print("Enter 'base' length ");
		b = sc.nextDouble();

		System.out.print("Enter 'c side' length ");
		c = sc.nextDouble();
		System.out.println();

		Triangle t = new Triangle(a, b, c);

		System.out.println("A side = " + t.getaSide());
		System.out.println("Base = " + t.getBase());
		System.out.println("C side = " + t.getcSide());

		double A = t.area();
		System.out.println("Area = " + A);

		double P = t.perimeter();
		System.out.println("Perimeter = " + P);
	}

}
