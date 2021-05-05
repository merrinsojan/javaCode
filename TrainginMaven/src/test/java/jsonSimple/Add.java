package jsonSimple;

public class Add {

	String name;

	String job;
	String[] skills;
	
	details details;
	

	public details getDetails() {
		return details;
	}


	public void setDetails(details details) {
		this.details = details;
	}


	public Add(String name, String job, String[] skills, String companyName, String emails) {
		this.name=name;
		this.job=job;
		this.skills=skills;
		details  = new details(companyName,emails);
	
	
	}

}
