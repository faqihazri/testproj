import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salaries [] = {2222,100,50,60,170,80,1,5,10};
		Arrays.sort(salaries);
		System.out.println (Arrays.binarySearch(salaries, 80));
		
		for (int sal :salaries) {
			System.out.println(sal + ",");
		}
		//System.out.println("Array list is empty:" + al.isEmpty());
		//al.add(new Integer(10));
		//al.add(Boolean.TRUE);
		
		//Object ar [] = al.toArray();
		//System.out.println(al);
	}

}
