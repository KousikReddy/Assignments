package language.basics;

public class PrintStatements {

	public static void main(String[] args) {
		
		System.out.println("Print the Statement and Goes to next line: Println");
		
		System.out.print("Print the Statement and stays on the same line: Print");
		
		System.out.println();
		
		System.out.printf("Kousik completed the B.Tech in the year of 2016 and Collected all the documents - true with the aggreagate of 6.2CGPA");
		System.out.println();
		System.out.printf("%s completed the B.Tech in the year of %d and collected all the documents - %b with the aggreagate of %dCGPA","Kousik",2016,true,6);
		System.out.println();
		
		double grade = 6.2;
		System.out.printf("%.1f",grade);
		
		
	}

}
