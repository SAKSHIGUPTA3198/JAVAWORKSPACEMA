package com.lti.ObjSortingDemos;

public class Employee {
	
	

		int empId;
		String empName;
		float empSal;
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public float getEmpSal() {
			return empSal;
		}
		public void setEmpSal(float empSal) {
			this.empSal = empSal;
		}
		@Override
		public String toString() {
			return "\nEmployee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
		}
		public Employee(int empId, String empName, float empSal) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empSal = empSal;
		}
		public Employee() {
			super();
		}
		
	}

	
	
	

