package de.schulle.einrichten;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Mellisa", 700);
		Teacher human = new Teacher(3, "Human", 800);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(human);
		
		
		Student hasti = new Student(1, "Hasti", 4);
		Student yasin = new Student(2, "Yasin", 12);
		Student tamasha = new Student(3, "Tamasha", 8);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(yasin);
		studentList.add(hasti);
		
		
		School ghs = new School(teacherList, studentList);
		 
		 tamasha.payFees(5000);
		 System.out.println("GHS hat das dieses jahr verdient" + ghs.getTotalverdint());
		 
		 yasin.payFees(7000);
		 System.out.println("GHS hat das dieses jahr verdient" + ghs.getTotalverdint());
		 
		 System.out.println("-----Making School PAY Salary----------");
		 lizzy.reciveSalary(lizzy.getHonorare());
		 System.out.println("GHS has spend for salaryto "+ lizzy.getName()
		 + " and now has " + ghs.getTotalbezahlt());
		 
	}

}
