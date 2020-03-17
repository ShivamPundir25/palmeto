package inheritance;

public class SingleInheritance {

	
private	int id;
private	String ename;
private	String cname;
	
	public SingleInheritance() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void display() {
		System.out.println("EMPID : "+id);
		System.out.println();
		System.out.println("ENAME : "+ename);
		System.out.println();
		System.out.println("CNAME : "+cname);
		
	}
	
	
	
}
