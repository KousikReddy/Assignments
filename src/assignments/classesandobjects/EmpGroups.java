package assignments.classesandobjects;

public class EmpGroups {

	public static void main(String[] args) {
		
		Employees emp = new Employees();
		
		String[] employeNames = new String[3];
		int[] employeIds = new int[3];
		
		employeNames[0] = emp.employeName1;
		employeNames[1] = emp.employeName2;
		employeNames[2] = emp.employeName3;
		
		employeIds[0] = emp.employeId1;
		employeIds[1] = emp.employeId2;
		employeIds[2] = emp.employeId3;
		
		System.out.println("Employee Name: "+employeNames[0]+" and Employee Id: "+employeIds[0]);
		System.out.println("Employee Name: "+employeNames[1]+" and Employee Id: "+employeIds[1]);
		System.out.println("Employee Name: "+employeNames[2]+" and Employee Id: "+employeIds[2]);

	}

}
