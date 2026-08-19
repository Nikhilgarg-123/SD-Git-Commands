package prototype_design_pattern;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		DeptCache.loadDeptCache();
		
		Dept cloneCSE =DeptCache.getDeptDetails("CSE");
		cloneCSE.rank();
		System.out.println("Dept name : " + cloneCSE.getDeptType());
		
		Dept cloneECE =DeptCache.getDeptDetails("ECE");
		cloneECE.rank();
		System.out.println("Dept name : " + cloneECE.getDeptType());
		

	}

}
