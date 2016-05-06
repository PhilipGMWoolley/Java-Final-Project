import java.util.List;
import java.util.UUID;

public class Course implements Comparable<Course>{
	UUID courseID;
	String coursename;
	List<Student> roster;
	Teacher Instructor;
	
	@Override
	public String toString(){
		return courseID.toString();
	}
	
	
	@Override
	public int compareTo(Course c) {
		if(coursename.charAt(0) < c.coursename.charAt(0)){
			return -1;
		}
		else if(coursename.charAt(0) > c.coursename.charAt(0)){
			return 1;
		}
		else{
		return 0;
		}
	}
	
	public void AddStudent(Student s){
		roster.add(s);
	}
	
	public void RemoveStudent(Student s){
		roster.remove(s);
	}
	
	
	
}
