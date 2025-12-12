package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		
		String[][][] gradeSheet = {
									{	//Sem-1(Subjects & Marks)
										{"Mathematics 1","Pass(78)"},
										{"Physics","Pass(85)"},
										{"Chemistry","Fail(21)"},
										{"Computer Programming","Pass(74)"},
										{"Engineering Drawing","Pass(88)"},
										{"Basic Electrical Engineering","Pass(79)"}
									},
									{   //Sem-2(Subjects & Marks)
										{"Mathematics 2","Pass(82)"},
										{"Mechanics","Pass(77)"},
										{"Environmental Science","Pass(93)"},
										{"Basic Electronics","Fail(19)"},
										{"Engineering Physics","Fail(24)"},
										{"Engineering Graphics","Pass(90)"}
									},
									{	//Sem-3(Subjects & Marks)
										{"Data Structures","Pass(88)"},
										{"Discrete Mathematics","Pass(81)"},
										{"Digital Electronics","Pass(76)"},
										{"Operating Systems","Fail(32)"},
										{"Signals and Systems","Pass(85)"},
										{"Object-Oriented Programming","Pass(78)"}
									},
									{	//Sem-4(Subjects & Marks)
										{"Algorithms","Pass(91)"},
										{"Computer Networks","Pass(73)"},
										{"Database SYstems","Fail(19)"},
										{"Microprocessors","Pass(80)"},
										{"COmmunication Engineering","Pass(76)"},
										{"Software Engineering","Pass(87)"}
									},
									{	//Sem-5(Subjects & Marks)
										{"Probability and Stats","Pass(86)"},
										{"Machine Learning","Pass(88)"},
										{"Compiler Design","Pass(84)"},
										{"Theory of Computation","Pass(95)"},
										{"Embedded Systems","Pass(73)"},
										{"Computer Graphics","Pass(90)"}
									},
									}; 
		
		System.out.println("Semister-2 subject 4 and subject 5 names: "+gradeSheet[1][3][0]+", "+gradeSheet[1][4][0]);
		System.out.println("Status/Marks of Semister-4 subject 3 and subject 6: "+gradeSheet[3][2][1]+", "+gradeSheet[3][5][1]);
		

	}

}
