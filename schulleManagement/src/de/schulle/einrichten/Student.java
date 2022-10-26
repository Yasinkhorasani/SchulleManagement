package de.schulle.einrichten;

/**
 * die beschreibt ein Schuller in einer Schule
 * der Shculer hat ID, NAME, GRADE, GEBUHR, TOTALGEBÜHR
 * @author Yasin
 *
 */
public class Student {

	private int id;
	
	private String name;
	
	private int grade;
	
	private int gebühr;
	
	private int gebührTotal;

	/**
	 * erstellen ein neuer Schüller
	 * Jeder schüller müss 30,000 Euro Gebühr zahlen
	 * @param id für der Schuller
	 * @param name der Schuller
	 * @param grade der Schuller
	 * @param gbühr
	 * @param gebührTotal
	 */
	public Student(int id, String name, int grade) {
		this.gebühr = 0;
		this.gebührTotal = 30_000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}
	
	
		public void setGrade(int grade) {
		this.grade = grade;
		}
		
		
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}


		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}


		/**
		 * @return the grade
		 */
		public int getGrade() {
			return grade;
		}


		/**
		 * @return the gebühr
		 */
		public int getGebühr() {
			return gebühr;
		}


		/**
		 * @return the gebührTotal
		 */
		public int getGebührTotal() {
			return gebührTotal;
		}



		public void payFees(int fees) {
			gebühr+= fees;
			School.updateTotalbezahlt(gebühr);
			
		}
	
		public int getremainingfeeas() {
			return gebührTotal - gebühr;
		}
	
}
