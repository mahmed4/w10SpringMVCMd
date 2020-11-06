package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class ClassInstructors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	@Autowired
	private ClassItems classItems;
	
	public ClassInstructors() {
		super();
	}
	
	public ClassInstructors(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public ClassInstructors(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public ClassInstructors(long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ClassItems getClassItems() {
		return classItems;
	}

	public void setClassItems(ClassItems classItems) {
		this.classItems = classItems;
	}

	@Override
	public String toString() {
		return "ClassInstructors [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", classItems=" + classItems + "]";
	}
	

}
