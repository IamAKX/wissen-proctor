package wissen;

import java.util.Scanner;

public class MedianQuery {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		int A[] = new int[N];
		String[] ar = s.nextLine().split(" ");
		for (int i = 0; i < ar.length; i++) {
			A[i] = Integer.parseInt(ar[i]);
		}
		int Q = Integer.parseInt(s.nextLine());

		while (Q > 0) {
			Q--;
			String[] lr = s.nextLine().split(" ");
			int L = Integer.parseInt(lr[0]);
			int R = Integer.parseInt(lr[1]);
			findMedian(L - 1, R - 1, A.clone());
		}
	}

	private static void findMedian(int L, int R, int[] A) {
		// TODO Auto-generated method stub
		int a[] = new int[R - L + 1];
		int n = 0;
		for (int i = L; i <= R; i++) {
			a[n++] = A[i];
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++)
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		}

//			 int mid = (int) Math.ceil(n/2);
		int mid = n % 2 != 0 ? n / 2 : (n / 2) - 1;
		if (n == 1)
			mid = 0;
		System.out.println(a[mid]);
	}

}
