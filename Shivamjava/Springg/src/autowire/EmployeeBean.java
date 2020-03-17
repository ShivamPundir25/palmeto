package autowire;

public class EmployeeBean {

	private String fullName;
	private DepartmentBean departmentBean;
	
	public EmployeeBean(DepartmentBean departmentBean) {
		super();
		this.departmentBean = departmentBean;
	}
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}

	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}

	
	
	
}
