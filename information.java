package oop1;

public class information {
	
	
	int id;
	final int  year=2024;
	String name;
	String familyname;
	int level;
	protected int idbank;
	
	
	protected void  informationetu1(int id, String name,String familyname,int level,int idbank) {
		this.id=id;
		this.name=name;
		this.familyname=familyname;
		this.level=level;
		this.idbank=idbank;
		}
	protected void displayinformationstudent() {
		System.out.println("the id of the student is = "+this.id);
		System.out.println("the name of the student = "+this.name);
		System.out.println("the family name of the student= "+this.familyname);
		System.out.println("the level of student is = "+this.level);
	}
	protected void displayinformationproof() {
		System.out.println("the id of the proof is = "+this.id);
		System.out.println("the name of the proof = "+this.name);
		System.out.println("the family name of the proof= "+this.familyname);
		System.out.println("the level of proof is = "+this.level);
		
	}

	
	
	

}
