import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Driver {
	int List_Positioner = 0;
	public List<AbstractPerson> PERSON_LIST;
	public List<Course> CLASS_LIST;

	
	
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
	
	public void DeleteStudent(Student s){
		PERSON_LIST.remove(s);
	}
	
	
	public Course AddCourse(String CourseName){
		Course c = new Course();
		c.coursename = CourseName;
		c.courseID = UUID.randomUUID();
		
		CLASS_LIST.add(c);
		return c;
	}
	
	public void DeleteCourse(Course c){
		CLASS_LIST.remove(c);
	}
	
	public Teacher CreateTeacher(){
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
	
	public void DeleteTeacher(Teacher t){
		PERSON_LIST.remove(t);
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
		case 2: break;
		case 3: break;
		}
	}
	
	public static void MenuTeacher(){
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Students:\n" + 
				"1: Create Teacher\n" + 
				"2: Delete Teacher\n" + 
				"3: Back\n");
		int chooser = input.nextInt();
		switch(chooser){
		case 1:
		case 2:
		case 3:
		}
		
	}
	public static void MenuCourse(){
		Scanner input = new Scanner(System.in);
		System.out.println(
				"Students:\n" + 
				"1: Create Course\n" + 
				"2: Delete Course\n" + 
				"3: Back\n");
		int chooser = input.nextInt();
		switch(chooser){
		case 1:
		case 2:
		case 3:
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		case 0: break;
		case 1: MenuStudent(); break;
		case 2: MenuTeacher(); break;
		case 3: MenuCourse(); break;

		}
	}

}
