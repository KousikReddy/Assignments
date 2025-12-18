package assignments;

public class Assignment7_ConditionalStatements {
	
	

	public static void main(String[] args) {
		
		/*
		 * A bank evaluates loan applicants based on the following criteria:
			1. Credit Score:
			o If the credit score is above 750, the loan is automatically approved.
			o If the credit score is between 650 and 750, additional checks are performed.
			o If the credit score is below 650, the loan is denied.
			2. Income:
			o For credit scores between 650 and 750, the customer’s income must be at least $50,000
			for the loan to be considered.

			3. Employment Status:
			o If the customer’s income is at least 50,000, the system checks whether the customer is
			employed.
			o If the customer is unemployed, the loan is denied.
			4. Debt-to-Income Ratio:
			o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
			o If the DTI ratio is less than 40%, the loan is approved.
			o If the DTI ratio is 40% or greater, the loan is denied. 
			*/
		
		loanForm(760, 50000, true, 40);
		System.out.println();
		loanForm(690, 50000, true, 35);
		System.out.println();
		loanForm(670, 50000, false, 35);
		System.out.println();
		loanForm(620, 0, false, 0);
	}
		
		public static void loanForm(int creditScore,long income,boolean isEmployed,int dtiRatio) {
		/*int creditScore ;
		long income;
		boolean isEmployed;
		int dtiRatio;*/
		
		if(creditScore>750) {
			System.out.println("The Loan is Approved (High Credit Score)");
			
		}else if (creditScore>=650 && creditScore<=750) {
			System.out.println("Additional checks are performed");
			
			if(income>=50000) {
				System.out.println("The Loan to be considered(Income Criteria met)");
				
				if(isEmployed) {
					System.out.println("Customer is Employed");
					
					if(dtiRatio<40) {
						System.out.println("Loan Approved");
						
					}else if(dtiRatio>=40) {
						System.out.println("Loan Denied (High DTI Ratio)");
					}
				}else {
					System.out.println("Loan Denied (Income less than 50000)");
				}
			}
			
		}else if(creditScore<650) {
			System.out.println("Loan Denied (Low Credit Score)");
			
		}

	}
	
}
