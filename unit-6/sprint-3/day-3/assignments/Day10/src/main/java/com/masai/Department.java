package com.masai;

import java.util.Objects;

public class Department {
	
	private int deptId;
	private String deptName;
	private String location;
	public Department(int deptId, String deptName, String location) {
		
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptId, deptName, location);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Department)) {
			return false;
		}
		Department other = (Department) obj;
		return deptId == other.deptId && Objects.equals(deptName, other.deptName)
				&& Objects.equals(location, other.location);
	}
	
	
	


}
