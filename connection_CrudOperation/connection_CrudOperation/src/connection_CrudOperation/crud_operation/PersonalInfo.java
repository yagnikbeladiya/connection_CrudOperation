package connection_CrudOperation.crud_operation;

public class PersonalInfo {
	
	private String id, name,age ,email,enrollment_date;

	public PersonalInfo()
	{
		
	}
	public PersonalInfo(String id, String name,String age, String email, String enrollment_date) {
		 
		this.id = id;
		this.name = name;
		this.age =age;
		this.email = email;
		this.enrollment_date = enrollment_date;
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id=id;
	}
	public String getname() {
		return name;
	}
	
    public void setname(String name) {
		this.name = name;
	}
    public String getage() {
		return age;
	}
	
    public void setage(String age) {
		this.age = age;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getenrollment_date() {
		return enrollment_date;
	}
	public void setenrollment_date(String enrollment_date) {
		this.enrollment_date = enrollment_date;
	}
	@Override
	public String toString() {
	
		CrudOperations.insertData(id, name,age, email, enrollment_date);
		return "students [adharno=" + id + ", name=" + name + ", age=" + age+ " , email=" + email + ", enrollment_date=" +  enrollment_date+ "";
	} 
	
	

	
	
}
