package collection;

class cName{
	private String cname;
	private Empl Emp;
	public String getname() {
		return cname;
	}
	public void setcname( String cname) {
		this.cname = cname;
	}
	public Empl getEmp() {
		return Emp;
	}
	public void setEmp(Empl emp) {  // data type Emp
		Emp = emp;
	}
}

class Empl {

	private String empName;
	private int empId;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	



	public static void main(String[] args) {
		
		cName c =new cName();
		c.setcname("Flipkart...");
		Empl e = new Empl();

		e.setEmpName("vishal");
		e.setEmpId(3);
		c.setEmp(e);
		System.out.println("Company Name :" + c.getname());

        Empl my=c.getEmp();
		System.out.println("Name :" + my.getEmpName());
		System.out.println("ID :" + my.getEmpId());

	}

}
