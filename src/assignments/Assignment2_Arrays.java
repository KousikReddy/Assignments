package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		
		String[][][] gradeSheet = {
				
				{ // Sem 1
                    {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Engineering"},
                    {"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"}
            },
            { // Sem 2
                    {"Mathematics II", "Mechanics", "Environmental Science", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
                    {"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"}
            },
            { // Sem 3
                    {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Programming"},
                    {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}
            },
            { // Sem 4
                    {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Engineering", "Software Engineering"},
                    {"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"}
            },
            { // Sem- 5
                    {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
                    {"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"}
            }
    };
				
		
		System.out.println("Semister-2 subject 4 and subject 5 names: "+gradeSheet[1][0][3]+", "+gradeSheet[1][0][4]); //Basic Electronics & Engineering Physics
		System.out.println("Status/Marks of Semister-4 subject 3 and subject 6: "+gradeSheet[3][1][2]+", "+gradeSheet[3][1][5]); //Fail(19) & Pass(87)
		

	}

}
