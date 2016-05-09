import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import javax.swing.JOptionPane;

public class Driver {
	int List_Positioner = 0;
	public static List<AbstractPerson> PERSON_LIST= new ArrayList<AbstractPerson>();
	public static List<Course> CLASS_LIST= new ArrayList<Course>();

	public static AbstractPerson isIn(List<AbstractPerson> l, String ln){
		AbstractPerson f = null;
		for(AbstractPerson q : l){
			if(q.lastname.equals(ln)){
				f = q;
				
			}
			else{
				JOptionPane.showMessageDialog(null, "Person not found");
			}
			
		}
		return f;
	}
	
	public static Course isInc(List<Course> l, String cn){
		Course g = null;
		for(Course q : l){
			if(q.coursename.equals(cn)){
				g = q;
			}
			else{
				JOptionPane.showMessageDialog(null, "Class not found");
			}
		}
		return g;
	}
	
	public static Student CreateStudent(){
		Scanner input = new Scanner(System.in);
		System.out.println("First Name:");
		String f = input.next();
		System.out.println("Last Name: ");
		String l = input.next();
		
		Student s = new Student();
		s.firstname = f;
		s.lastname = l;
		s.StudentID = UUID.randomUUID();
		return s;
	}
	
	public static void DeleteStudent(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Student's Last Name: ");
		String ln = input.next();
		PERSON_LIST.remove(isIn(PERSON_LIST, ln));
	}
	
	
	public static Course AddCourse(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Course Name: ");
		String cn = input.next();
		Course c = new Course();
		c.coursename = cn;
		c.courseID = UUID.randomUUID();
		
		CLASS_LIST.add(c);
		return c;
	}
	
	public static void DeleteCourse(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Course Name: ");
		String cn = input.next();
		CLASS_LIST.remove(isInc(CLASS_LIST, cn));
	}
	
	public static Teacher CreateTeacher(){
		Scanner input = new Scanner(System.in);
		System.out.println("First Name:");
		String f = input.next();
		System.out.println("Last Name: ");
		String l = input.next();
		
		Teacher t = new Teacher();
		t.firstname = f;
		t.lastname = l;
		t.TeacherID = UUID.randomUUID();
		
		
		PERSON_LIST.add(t);
		
		return t;
	}
	
	public static void DeleteTeacher(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Teacher's Last Name: ");
		String ln = input.next();
		PERSON_LIST.remove(isIn(PERSON_LIST, ln));
	}
	
	public static void MenuStudent(){
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Students:\n" +
				"1: Create Student\n" +
				"2: Delete Student\n" +
				"3: Back\n");
		int chooser = input.nextInt();
		switch(chooser){
		case 1: CreateStudent(); break;
		case 2: DeleteStudent(); break;
		case 3: main(null); break;
		}
	}
	
	public static void MenuTeacher(){
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Teachers:\n" + 
				"1: Create Teacher\n" + 
				"2: Delete Teacher\n" + 
				"3: Back\n");
		int chooser = input.nextInt();
		switch(chooser){
		case 1: CreateTeacher(); break;
		case 2: DeleteTeacher(); break;
		case 3:main(null); break;
		}
		
	}
	public static void MenuCourse(){
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Courses:\n" + 
				"1: Create Course\n" + 
				"2: Delete Course\n" + 
				"3: Back\n");
		int chooser = input.nextInt();
		switch(chooser){
		case 1: AddCourse(); break;
		case 2: DeleteCourse(); break;
		case 3: main(null); break;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newline = System.getProperty("line.separator");
		System.out.println("Welcome." + newline + 
				"Main Menu: " + newline +
				"1: Students" + newline +
				"2: Teachers" + newline +
				"3: Courses" + newline +
				"0: Exit");
		int chooser = input.nextInt();
		
		switch(chooser){
		case 0: System.exit(0); break;
		case 1: MenuStudent(); break;
		case 2: MenuTeacher(); break;
		case 3: MenuCourse(); break;

		}
	}

}
