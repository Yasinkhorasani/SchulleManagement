package de.schulle.einrichten;

import java.util.List;

public class School {
	
	private List<Teacher> teachers;
	
	private  List<Student> students;
	
	private static int totalverdint;
	
	private static int totalbezahlt;

	/**
	 * neue School Object wird erstellt
	 * @param teachers
	 * @param students
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		
		totalverdint = 0;
		totalbezahlt = 0;
	}

	/**
	 * @return the list of teachers in der School
	 */
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * @param addteachers the teachers to the School
	 */
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}

	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to the School
	 */
	public void addStudents(Student student) {
		students.add(student);
	}

	/**
	 * @return the totalverdint by the School
	 */
	public int getTotalverdint() {
		return totalverdint;
	}

	/**
	 * @param totalverdint the totalverdint to set
	 */
	public void updateTotalverdint(int verdint) {
		totalverdint += verdint ;
	}

	/**
	 * @return the totalbezahlt
	 */
	public int getTotalbezahlt() {
		return totalbezahlt;
	}

	/**
	 * @param totalbezahlt the totalbezahlt to set
	 */
	public static void updateTotalbezahlt(int bezahlt) {
	
		totalverdint -= bezahlt;
	}
	
	
	

}
