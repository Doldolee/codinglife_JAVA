
public class AccountingArrayApp {
	public static double vlaueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		
		vlaueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		double VAT = getVAT();
		double Total = getTotal();
		double expense = getExpense();
		double income = getIncome();
		
	
		//¹è¿­
		double[] dividendRates = new double[3];
		dividendRates[0]=0.5;
		dividendRates[1]=0.3;
		dividendRates[2]=0.2;
		
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		
		System.out.println("value of supply : "+vlaueOfSupply);
		System.out.println("VAT:"+VAT);
		System.out.println("Total:"+Total);
		System.out.println("Expense:"+expense);
		System.out.println("Income:"+income);
		
		int i = 0;
		while(i<dividendRates.length) {
			System.out.println("Devidend:"+ income * dividendRates[i]);
			i = i+1;
		}
	}

	private static double getIncome() {
		return vlaueOfSupply - getExpense();
	}

	private static double getExpense() {
		return vlaueOfSupply*expenseRate;
	}

	private static double getTotal() {
		return vlaueOfSupply + getVAT();
	}

	private static double getVAT() {
		return vlaueOfSupply*vatRate;
	}

}
