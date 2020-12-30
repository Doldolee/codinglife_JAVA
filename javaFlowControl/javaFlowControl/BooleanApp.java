package javaFlowControl;

public class BooleanApp {

	public static void main(String[] args) {
		
		String[][] array1 = {
				{"egoing","1111"},
				{"star","2222"}
			
		};
		String inputId = args[0];
		
		boolean isLogined = false;
		
		for(int i = 0; i<array1.length; i++) {
			String[] Id = array1[i];
			
			if(Id[0].equals(inputId)) {
				isLogined = true;
				break;	
			}
		}
		 
		System.out.println(isLogined);
		

	}

}
