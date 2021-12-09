package wissen;

import java.util.Scanner;

public class FarthestFromZero {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        int A[] = new int[N];
        
        for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(s.nextLine());
		}
        int max = 0;
        for (int i = 0; i < N; i++) {
			if(Math.abs(max) < Math.abs(A[i]))
				max = A[i];
			else
				if(Math.abs(max) == Math.abs(A[i]))
				{
					if(A[i]< 0) {
						max = A[i];
					}
				}
		}
        System.out.println(max);
	}
}
