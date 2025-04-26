package pojo;

import java.util.List;

public class Subject {
	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	private List<String> subject;
	/*
	 * List<String> is an interface from the java.util package, which represents an ordered collection (like an array but dynamic).
	 * by dynamic we mean :-
	 * Array (String[]): You must define its size at the time of creation, and it cannot be changed later.
	 * List (List<String>): No fixed size is needed; elements can be added or removed dynamically.
	 *
	 */
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return subject.toString() ;
	}

}
