import java.util.UUID;

public 	class Teacher extends AbstractPerson implements Comparable{
	UUID TeacherID;
	
	@Override
	public String toString(){
		return TeacherID.toString();
	}
	
	@Override
	public int compareTo(Object arg0) {
		//if (this.TeacherID > arg0.TeacherID){
			
		//}
		return 0;
	}
	
}