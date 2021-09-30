package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stud = new Student();

		stud.name = sc.nextLine();
		stud.n1 = sc.nextDouble();
		stud.n2 = sc.nextDouble();
		stud.n3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", stud.media());
		if (stud.media() >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING POINTS = %.2f%n", stud.rest());
		}

		sc.close();

	}
}
