
// Bean or Model or Plain old Java Object (POJO)
public class Employee {

	// Attributes
	int eid;
	String ename;
	String eaddress;
	char gender;
	
	//Methods
	public Employee() {
		
	}

	public Employee(int eid, String ename, String eaddress, char gender) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.gender = gender;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", gender=" + gender + "]";
	}
	
	
}


