import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Student> students = new ArrayList<>();

	        String choice;

	        do {
	            Student s = new Student();

	            System.out.print("Enter student name: ");
	            s.setName(sc.nextLine());

	            System.out.print("Enter student email: ");
	            s.setEmail(sc.nextLine());

	            students.add(s);

	            System.out.print("Do you want to continue? (yes/no): ");
	            choice = sc.nextLine().toLowerCase();

	        } while (choice.equals("yes"));

	        System.out.println("\n----- Student List -----");
	        for (Student st : students) {
	            System.out.println("Name : " + st.getName());
	            System.out.println("Email: " + st.getEmail());
	            System.out.println("------------------------");
	        }

	        sc.close();
	    }
	}
