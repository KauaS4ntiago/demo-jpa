package application;

import domain.Person;

public class Program {
	public static void main(String[] args) {

		Person p1 = new Person(1, "Carlos", "carlos@mail.com");
		Person p2 = new Person(2, "Ana", "ana@mail.com");
		Person p3 = new Person(3, "Matheus", "matheus@mail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
