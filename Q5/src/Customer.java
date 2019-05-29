import java.util.Date;

public class Customer {

    private Long id;
    private String name;
    private Character gender;
    private String email;
    private String contactNumber;
    private Date createdOn;
	public Customer(Long id, String name, Character gender, String email, String contactNumber, Date createdOn) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.createdOn = createdOn;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	//Generate getters and setters.
    
}
