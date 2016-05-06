import java.util.UUID;

public 	class Teacher extends AbstractPerson implements Comparable<Teacher>{
	UUID TeacherID;
	
	@Override
	public String toString(){
		return TeacherID.toString();
	}
	
	@Override
	public int compareTo(Teacher arg0) {
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