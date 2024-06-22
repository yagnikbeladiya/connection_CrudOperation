package connection_CrudOperation.crud_operation;

public class DemoCrud {

	public static void main(String[] args) {
	
	PersonalInfo pi = new PersonalInfo();
	PersonalInfo pi1 = new PersonalInfo("5","yagnik","20","yagnik@gmail.com"," 2023-09-01");
	
	pi.setid("7");
	pi.setname("pinal");
	pi.setage("12");
	pi.setemail("pinal@yahoo.co.in");
	pi.setenrollment_date("2023-09-01");
	
	
		
		CrudOperations cr = new CrudOperations();
		
		
		CrudOperations.insertData(pi.getid(),pi.getname(),pi.getage(),pi.getemail(),pi.getenrollment_date());
	
		CrudOperations.insertData(pi1.getid(),pi1.getname(),pi1.getage(),pi1.getemail(),pi1.getenrollment_date());		
		
        System.out.println(pi);
		
		
		CrudOperations.getData();
	}

}
