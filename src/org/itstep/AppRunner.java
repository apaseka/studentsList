package org.itstep;

import java.util.Date;

import org.itstep.model.Student;


public class AppRunner {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.firstName = "Alex";
		student1.secondName = "Paseka";
		
		Student student2 = new Student("Taras", "Shevchenko", 394857348769L, "myLogin",
										"myPassword", new Date(83,11,7));
		Student student3 = new Student();
		student3.setDateOfBirth(new Date(86,4,2));
		
		Student.printStudent();
		System.out.println(student1 + "\n" + student2);
		System.out.println(student1.secondName);
		System.out.println(student3);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student2.toString());
	}
}
