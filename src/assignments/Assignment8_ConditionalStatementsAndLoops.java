package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_ConditionalStatementsAndLoops {

	public static void main(String[] args) {
		
		List<Integer> transactionAmounts = new ArrayList<Integer>();
		
		transactionAmounts.add(50000);
		transactionAmounts.add(-2000);
		transactionAmounts.add(3000);
		transactionAmounts.add(-15000);
		transactionAmounts.add(-200);
		transactionAmounts.add(-300);
		transactionAmounts.add(4000);
		transactionAmounts.add(-3000);
		
		int creditTransactions=0;
		int debitTransactions=0;
		
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		
		int remainingAmount = 0;
		int suspiciousTransactions = 0;
		
		for(int amount: transactionAmounts) {
			
			if(amount>0) {
				creditTransactions++;
				totalCreditAmount += amount;
			}else {
				debitTransactions++;
				totalDebitAmount +=amount;
			}
			
			remainingAmount +=amount;
			
			if(amount>=10000 || amount<=-10000) {
				
				System.out.println("Suspicious Credit/Debit transactions with amount: "+amount);
				suspiciousTransactions++;
			}
		}
		
		System.out.println("Total number of credited transacations: "+creditTransactions);  //3
		System.out.println("Total number of debited transacations: "+debitTransactions);    //5
		System.out.println("Total amount credited in account: "+totalCreditAmount);			//57000
		System.out.println("Total amount debited in account: "+totalDebitAmount);			//-20500
		System.out.println("Total amount remaining at the end in Bank Account: "+remainingAmount); //36500
		System.out.println("Total number of Suspicious transactions: "+suspiciousTransactions); //2

	}

}
