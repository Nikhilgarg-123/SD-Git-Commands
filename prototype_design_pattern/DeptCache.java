package prototype_design_pattern;

import java.util.*;

public class DeptCache {
	
	private static Hashtable<String, Dept> deptHashTable = new Hashtable<String, Dept>();

	public static Dept getDeptDetails(String deptId) throws CloneNotSupportedException{
		
	Dept cachedDept = deptHashTable.get(deptId);
	return (Dept) cachedDept.clone();
		
	}
	
	public static void loadDeptCache() {
		CSE cse = new CSE();
		cse.setDeptId("CSE");
		deptHashTable.put(cse.getDeptId(), cse);
		
		ECE ece = new ECE();
		ece.setDeptId("ECE");
		deptHashTable.put(ece.getDeptId(), ece);
	}

}
