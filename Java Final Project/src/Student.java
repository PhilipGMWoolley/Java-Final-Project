import java.util.UUID;

public 	class Student extends AbstractPerson implements Comparable<Student>{
	UUID StudentID;
	
	@Override
	public String toString(){
		return StudentID.toString();
	}
	
	
	@Override
	public int compareTo(Student arg0) {
		if(lastname.charAt(0) > arg0.lastname.charAt(0)){
			return 1;
		}
		else if(lastname.charAt(0) < arg0.lastname.charAt(0)){
			return -1;
		}
		else{
			return 0;
		}
	}
	
}
