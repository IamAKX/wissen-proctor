package wissen;

import java.util.HashSet;
import java.util.Set;

public class UniqueDigits {
	public static void main(String[] args) {
		int num = 12316;
		
		System.out.println(countDigits(num));
	}

	private static int countDigits(int num) {
		Set<Integer> set = new HashSet<Integer>();
		while(num>0) {
			int temp = num%10;
			set.add(temp);
			num/=10;
		}
		return set.size();
	}
	
}
