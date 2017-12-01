
public class ClassInsensitiveString {
	private final String s;
	public ClassInsensitiveString(String s) {
		if (s==null) {
			throw new NullPointerException();
			
		}
		this.s=s;
	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof ClassInsensitiveString) {
			return s.equalsIgnoreCase(((ClassInsensitiveString) o).s);
		}
		if(o instanceof String)
			return s.equalsIgnoreCase((string) o);
		return false;
	}
}
