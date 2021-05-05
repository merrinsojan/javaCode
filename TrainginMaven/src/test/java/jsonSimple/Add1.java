package jsonSimple;
import java.security.PrivateKey;
import jsonSimple.details;
public class Add1 {
	private String name;
	private String job;
	private String[] skills;	
	details details;
		public details getDetails() {
		return details;
	}
	public void setDetails(details details) {
		this.details = details;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	public String getName() {
		return name;
	}

}

