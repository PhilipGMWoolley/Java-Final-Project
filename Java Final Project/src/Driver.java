import java.util.List;
import java.util.UUID;

public class Driver {
	int List_Positioner = 0;
	public List<Student> STUDENT_LIST;
	public List<Teacher> TEACHER_LIST;

	
	
	public Student AddStudentToSchool(String f, String l){
		Student s = new Student();
		s.firstname = f;
		s.lastname = l;
		s.StudentID = UUID.randomUUID();
		
		
		
		return null;
		
	}
	public void AddStudentToClass(Course c, Student s){
		
	}
	
	public void DropStudentFromSchool(Student s){
		STUDENT_LIST.remove(s);
	}
	
	public void DropStudentFromClass(Course c){
		c.roster.remove(c);
	}
	
	
	public Course AddCourse(String CourseName){
		
		
		return null;
	}
	
	public void DeleteCourse(){
		
	}
	
	public void AddTeacherToClass(Course c, Teacher t){
		c.Instructor = t;
		
		System.out.println(c.coursename + " is now taught by " + c.Instructor);
	}
	
	public Teacher AddTeacherToSchool(Teacher t){
		
		
		return null;
	}
	
	public void DeleteTeacherFromSchool(Teacher t){
		TEACHER_LIST.remove(t);
	}
	
	public void DeleteTeacherFromClass(Course c){
		c.Instructor = null;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("x");
	}

}
