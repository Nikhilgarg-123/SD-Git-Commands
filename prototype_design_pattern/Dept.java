package prototype_design_pattern;

public abstract class Dept implements Cloneable{
	
	private String deptId;
	protected String deptType;
	
	public String getDeptType() {
		return deptType;
	}
	
	public String getDeptId() {
		return deptId;
	}
	
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	// Abstract method
	abstract void rank();
	
	// From Cloneable
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
