class Accounting1{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public void print() {
			System.out.println("value of supply: "+ valueOfSupply);
			System.out.println("vat:" + getVAT());
			System.out.println("Total:" + getTotal());
			System.out.println("Expense:" + getExpense());
			System.out.println("income:" + getIncome());
			System.out.println("dividend1:" + getdividend1());
			System.out.println("dividend2:" + getdividend2());
			System.out.println("dividend3:" + getdividend3());
		
	}
		public double getdividend1() {
			return getIncome() * 0.5;
		}
		public double getdividend2() {
			return getIncome() * 0.3;
		}
		public double getdividend3() {
			return getIncome() * 0.2;
		}
		public double getIncome() {
			return valueOfSupply - getExpense();
		}
		public double getExpense() {
			return valueOfSupply * expenseRate;
		}
		public double getTotal() {
			return valueOfSupply + getVAT();
		}
		public double getVAT() {
			return valueOfSupply * vatRate;
		}
}

public class AccountingClassApp {
	public static void main(String[] args) {
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		Accounting1.print();
		
		//인스턴스
		Accounting1 a1 = new Accounting1();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
	}
}