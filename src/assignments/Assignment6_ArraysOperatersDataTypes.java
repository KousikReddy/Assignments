package assignments;

public class Assignment6_ArraysOperatersDataTypes {

	public static void main(String[] args) {
		
		String[] studentNames = {"Suresh","Mahesh","Naresh"};
		int[] studentMarks = {75,80,82};
		
		studentMarks[0] += 10;    //85
		studentMarks[1] += 10;	  //90
		studentMarks[2] += 10;	  //92
		
		int[] updatedStudentMarks = new int[3];
		updatedStudentMarks[0] = studentMarks[0];
		updatedStudentMarks[1] = studentMarks[1];
		updatedStudentMarks[2] = studentMarks[2];
		
		double average = (updatedStudentMarks[0]+updatedStudentMarks[1]+updatedStudentMarks[2])/3;
		
		System.out.println(studentNames[0]+": "+updatedStudentMarks[0]);   // Suresh: 85
		System.out.println(studentNames[1]+": "+updatedStudentMarks[1]);   // Mahesh: 90
		System.out.println(studentNames[2]+": "+updatedStudentMarks[2]);   // Naresh: 92
		
		System.out.println("The Average Marks of Total Students: "+average);  //89.0
		
		
		
		
	}

}
