package live.learnjava.collections_framework.entities;

public class Employee {
	private Integer empId;
	private String name;
	private String empAddr;
	
	public Employee(Integer empId, String name, String empAddr) {
		super();
		this.empId = empId;
		this.name = name;
		this.empAddr = empAddr;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", empAddr=" + empAddr + "]";
	}
	
	
}
