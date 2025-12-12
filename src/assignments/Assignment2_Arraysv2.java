package assignments;

public class Assignment2_Arraysv2 {

	public static void main(String[] args) {
		
		String[][][] memo = new String[5][2][6];
		
		memo[0][0][0] = "Mathematics 1";
		memo[0][0][1] = "Physics";
		memo[0][0][2] = "Chemistry";
		memo[0][0][3] = "Computer Programming";
		memo[0][0][4] = "Engineering Drawing";
		memo[0][0][5] = "Basic Electrical Engineering";
		
		memo[0][1][0] = "Pass(78)";
		memo[0][1][1] = "Pass(85)";
		memo[0][1][2] = "Fail(21)";
		memo[0][1][3] = "Pass(74)";
		memo[0][1][4] = "Pass(88)";
		memo[0][1][5] = "Pass(79)";
		
		memo[1][0][0] = "Mathematics 2";
		memo[1][0][1] = "Mechanics";
		memo[1][0][2] = "Environment Science";
		memo[1][0][3] = "Basic Electronics";
		memo[1][0][4] = "Engineering Physics";
		memo[1][0][5] = "Engineering Graphics";
		
		memo[1][1][0] = "Pass(82)";
		memo[1][1][1] = "Pass(77)";
		memo[1][1][2] = "Pass(93)";
		memo[1][1][3] = "Fail(19)";
		memo[1][1][4] = "Fail(24)";
		memo[1][1][5] = "Pass(90)";
		
		memo[2][0][0] = "Data Structures";
		memo[2][0][1] = "Discrete Mathematics";
		memo[2][0][2] = "Digital Electronics";
		memo[2][0][3] = "Operating Systems";
		memo[2][0][4] = "Signals & Systems";
		memo[2][0][5] = "Object-oriented Programming";
		
		memo[2][1][0] = "Pass(88)";
		memo[2][1][1] = "Pass(81)";
		memo[2][1][2] = "Pass(76)";
		memo[2][1][3] = "Fail(32)";
		memo[2][1][4] = "Pass(85)";
		memo[2][1][5] = "Pass(78)";
		
		memo[3][0][0] = "Algorithms";
		memo[3][0][1] = "Computer Networks";
		memo[3][0][2] = "Database Systems";
		memo[3][0][3] = "Microprocessors";
		memo[3][0][4] = "Communication Engineering";
		memo[3][0][5] = "Software Engineering";
		
		memo[3][1][0] = "Pass(91)";
		memo[3][1][1] = "Pass(73)";
		memo[3][1][2] = "Fail(19)";
		memo[3][1][3] = "Pass(80)";
		memo[3][1][4] = "Pass(76)";
		memo[3][1][5] = "Pass(87)";
		
		memo[4][0][0] = "Probability & Stats";
		memo[4][0][1] = "Machine Learning";
		memo[4][0][2] = "Compiler Design";
		memo[4][0][3] = "Theory of Computation";
		memo[4][0][4] = "Embedded Systems";
		memo[4][0][5] = "Compuer Graphics";
		
		memo[4][1][0] = "Pass(86)";
		memo[4][1][1] = "Pass(88)";
		memo[4][1][2] = "Pass(84)";
		memo[4][1][3] = "Pass(95)";
		memo[4][1][4] = "Pass(73)";
		memo[4][1][5] = "Pass(90)";
		
		System.out.println("Semister-2 subject 4 and subject 5 names: "+memo[1][0][3]+", "+memo[1][0][4]);
		System.out.println("Status/Marks of Semister-4 subject 3 and subject 6: "+memo[3][1][2]+", "+memo[3][1][5]);

	}

}
