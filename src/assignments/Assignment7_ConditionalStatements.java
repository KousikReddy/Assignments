package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {

		loanForm("John Doe", 720, 55000.0, true, 35.0);
	}

	public static void loanForm(String customerName, int creditScore, double income, boolean isEmployed,double debtToIncomeRatio) {

		System.out.println("Customer name: " + customerName);

		if (creditScore > 750) {
			System.out.println("The Loan is Approved (High Credit Score)");

		} else if (creditScore >= 650 && creditScore <= 750) {
			System.out.println("Additional checks are performed");

			if (income >= 50000) {
				System.out.println("The Loan to be considered(Income Criteria met)");

				if (isEmployed) {
					System.out.println("Customer is Employed");

					if (debtToIncomeRatio < 40) {
						System.out.println("Loan Approved");

					} else if (debtToIncomeRatio >= 40) {
						System.out.println("Loan Denied (High DTI Ratio)");
					}
				} else {
					System.out.println("Loan Denied (Income less than 50000)");
				}
			}

		} else if (creditScore < 650) {
			System.out.println("Loan Denied (Low Credit Score)");

		}
	}

}
