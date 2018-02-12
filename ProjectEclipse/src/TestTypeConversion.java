
public class TestTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Accept a double from command line
		
		Double salaryDb1 = new Double (args [0]);	
		if (salaryDb1.isNan()) {
			System.out.println("salary is not valid:" + salaryDb1);
			
		}else {
			
		
		double salary = salaryDb1.doubleValue();
		
		String salaryStr = String.valueOf(salary);
		
		System.out.println (salaryStr);
		
	}
	}
}
