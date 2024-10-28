package oop1;

public class proof extends information {
	
	float salary;
	String gradeprof;
	
	

	
	 public   proof(float salary,String gradeprof) {
		super();
		this.salary=salary;
		this.gradeprof=gradeprof;
		}

	@Override
	protected void displayinformationproof() {
		super.displayinformationproof();
		System.err.println("the grade of the proof is = "+this.gradeprof);
	    System.err.println("the salary of the proof is = "+this.salary);
	}





	
	

}



