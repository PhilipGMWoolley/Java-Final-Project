import java.util.UUID;

public 	class Teacher extends AbstractPerson implements Comparable{
	UUID TeacherID;
	
	@Override
	public String toString(){
		return TeacherID.toString();
	}
	
	@Override
	public int compareTo(AbstractPerson arg0) {
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


}