package entities;

public class Student {

	public String name;
	public double n1, n2, n3;

	public double media() {
		return n1 + n2 + n3;

	}

	public double rest() {
		return 60 - media();
	}
}
