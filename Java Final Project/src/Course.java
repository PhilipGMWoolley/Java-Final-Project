import java.util.List;
import java.util.UUID;

public class Course implements Comparable{
	UUID courseID;
	String coursename;
	List<Student> roster;
	Teacher Instructor;
	
	@Override
	public String toString(){
		return courseID.toString();
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void AddStudent(Student s){
		roster.add(s);
	}
	
	public void RemoveStudent(Student s){
		roster.remove(s);
	}
	
	
	
}
