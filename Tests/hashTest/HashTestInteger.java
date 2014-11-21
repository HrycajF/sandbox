package hashTest;

public class HashTestInteger {

	private Integer i1;
	private Integer i2;

	public HashTestInteger(Integer i1, Integer i2) {
		this.i1 = i1;
		this.i2 = i2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i1 == null) ? 0 : i1.hashCode());
		result = prime * result + ((i2 == null) ? 0 : i2.hashCode());
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
		HashTestInteger other = (HashTestInteger) obj;
		if (i1 == null) {
			if (other.i1 != null)
				return false;
		} else if (!i1.equals(other.i1))
			return false;
		if (i2 == null) {
			if (other.i2 != null)
				return false;
		} else if (!i2.equals(other.i2))
			return false;
		return true;
	}

}
