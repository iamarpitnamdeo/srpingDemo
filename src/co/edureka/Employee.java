package co.edureka;
//Bean or Model or POJO(Plain old java object)
public class Employee {
	//attributes
	int eid;
	String ename;
	Address address;
	
	//methods
	public Employee() {
		System.out.println("--Employee object constructed--");
	}
	
	public Employee(Address address) {
		this.address=address;
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


	public Address getEaddress() {
		return address;
	}


	public void setEaddress(Address address) {
		this.address = address;
	}

	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

	public void myInit() {
		System.out.println("--Object Initialized--");
	}
	public void myDestroy() {
		System.out.println("--Object Destroyed--");
	}
}
