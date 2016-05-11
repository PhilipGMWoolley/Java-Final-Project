import java.util.Comparator;
import java.util.UUID;


public abstract class AbstractPerson implements Comparable{
	String firstname;
	static String lastname;
	
	@Override
	public String toString(){
		return firstname + " " + lastname;
	}
	
	static final Comparator<AbstractPerson> ACOMP = 
            new Comparator<AbstractPerson>() {
public int compare(AbstractPerson e1, AbstractPerson e2) {
return e2.compareTo(e1);
}
};
	
	
	

	public int compareTo(AbstractPerson arg0) {
		if (this.lastname.charAt(0) > arg0.lastname.charAt(0)){
			return 1;
		}
		else if(this.lastname.charAt(0) < arg0.lastname.charAt(0)){
			return -1;
		}
		else{
		return 0;
		}
	}



}


