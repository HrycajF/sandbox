package ueb04;

import java.util.Date;

public class Person {

	private String vorname;
	private String nachname;
	private Date geburtsdatum = new Date();
	private int alter;

	@Override
	public Object clone() {
		Person clone;
		try {
			clone = (Person) super.clone();
			clone.geburtsdatum = (Date) geburtsdatum.clone();
			return clone;
		} 
		catch (CloneNotSupportedException e) {
			return null;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alter;
		result = prime * result
				+ ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (alter != other.alter)
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}

}
