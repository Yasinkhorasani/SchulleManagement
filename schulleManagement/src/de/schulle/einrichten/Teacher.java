package de.schulle.einrichten;

public class Teacher {
	
	private int id;
	
	private String name;
	
	private int honorare;
	
	private int salaryEarnd;
	
	/**
	 * @param id
	 * @param name
	 * @param honorare
	 */
	public Teacher(int id, String name, int honorare) {
		this.id = id;
		this.name = name;
		this.honorare = honorare;
		this.salaryEarnd= 0;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public int getHonorare() {
		return honorare;
	}
	
	public void setHonorare(int honorare) {
		this.honorare = honorare;
	}
	
	/**
	 * Adds to the Salary
	 * removes from the totalmony earnd by the School
	 * @param honorare 
	 */
   public void  reciveSalary(int honorare) {
	   salaryEarnd += honorare ;
	   School.updateTotalbezahlt(honorare);
   }

	
}
