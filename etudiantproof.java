package oop1;
import java.util.ArrayList;
import java.util.Scanner;

public class etudiantproof {

    public static void main(String[] args) {

        int id;
        String name;
        String familyName;
        int level;
        int idBank;
        float salary;
        String gradeProf;
        int choice;
        int numberofentries;

        // Create lists to store students and professors
        ArrayList<information> students = new ArrayList<>();
        ArrayList<proof> professors = new ArrayList<>();

        Scanner read = new Scanner(System.in);

        // Input the number of people (students and professors)
        System.out.println("Enter the number of people (students and professors) you want to enter:");
        numberofentries = read.nextInt();

        // Loop to collect information for each entry
        for (int i = 0; i < numberofentries; i++) {
            System.out.println("Enter your choice: if you are a professor press 1, if you are a student press 2");
            choice = read.nextInt();
            read.nextLine(); // Consume newline after nextInt()

            if (choice == 1) {
                // Input professor information
                System.out.println("Enter professor information (id, name, family name, level, id bank, grade, salary):");

                System.out.println("Enter professor id:");
                id = read.nextInt();
                read.nextLine(); // Consume newline

                System.out.println("Enter professor name:");
                name = read.nextLine();

                System.out.println("Enter professor family name:");
                familyName = read.nextLine();

                System.out.println("Enter professor level:");
                level = read.nextInt();

                System.out.println("Enter professor bank id:");
                idBank = read.nextInt();
                read.nextLine(); // Consume newline

                System.out.println("Enter professor grade:");
                gradeProf = read.nextLine();

                System.out.println("Enter professor salary:");
                salary = read.nextFloat();

                // Validate grade before proceeding
                if (gradeProf.equals("doctorant") || gradeProf.equals("majestére") || gradeProf.equals("professeur")) {
                    proof professor = new proof(salary, gradeProf);
                    professor.informationetu1(id, name, familyName, level, idBank);

                    // Add professor to the list
                    professors.add(professor);
                } else {
                    System.err.println("The grade is invalid.");
                }

            } else if (choice == 2) {
                // Input student information
                System.out.println("Enter student information (id, name, family name, level, id bank):");

                System.out.println("Enter student id:");
                id = read.nextInt();
                read.nextLine(); // Consume newline

                System.out.println("Enter student name:");
                name = read.nextLine();

                System.out.println("Enter student family name:");
                familyName = read.nextLine();

                System.out.println("Enter student level:");
                level = read.nextInt();

                System.out.println("Enter student bank id:");
                idBank = read.nextInt();
                read.nextLine(); // Consume newline

                // Create a new student object and store it in the students list
                information student = new information();
                student.informationetu1(id, name, familyName, level, idBank);
                students.add(student);

            } else {
                System.out.println("Invalid choice, please select 1 for professor or 2 for student.");
            }
        }

        // Display information for all professors
        System.out.println("\nDisplaying information of all professors:");
        for (proof professor : professors) {
            professor.displayinformationproof();
        }

        // Display information for all students
        System.out.println("\nDisplaying information of all students:");
        for (information student : students) {
            student.displayinformationstudent();
        }

        read.close();
    }
}



