import java.util.UUID;


public abstract class AbstractPerson {
	String firstname;
	String lastname;
	
	@Override
	public String toString(){
		return firstname + " " + lastname;
	}

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


