import java.util.Comparator;
import java.util.UUID;

public 	class Student extends AbstractPerson implements Comparable{
	UUID StudentID;
	
	@Override
	public String toString(){
		return StudentID.toString();
	}
	
	static final Comparator<Student> SCOMP = 
            new Comparator<Student>() {
public int compare(Student e1, Student e2) {
return e2.compareTo(e1);
}
};
	
	
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
