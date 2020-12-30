
public class AccountingApp2 {

	public static void main(String[] args) {
		
		double vlaueOfSupply = Double.parseDouble(args[0]);
		double expenseRate = 0.3;
		double vatRate = 0.1;
		double VAT = vlaueOfSupply*vatRate;
		double Total = vlaueOfSupply + VAT;
		double expense = vlaueOfSupply*expenseRate;
		double income = vlaueOfSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if (income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		}else {
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		
		
		
		System.out.println("value of supply : "+vlaueOfSupply);
		System.out.println("VAT:"+VAT);
		System.out.println("Total:"+Total);
		System.out.println("Expense:"+expense);
		System.out.println("Income:"+income);
		System.out.println("Devidend1:"+dividend1);
		System.out.println("Devidend2:"+dividend2);
		System.out.println("Devidend3:"+dividend3);
		
		

	}

}
