package excercise;

import java.util.Scanner;

public class Excercise {
	public static void main(String[] args) {
		int[] a = { 2, 14, 1, 34, 32, 13, 434, 3, 132, 23, 34, 1, 2, 24, 1 };
		Scanner num = new Scanner(System.in);
		int x;
		x = num.nextInt();
		find(a, x);
		System.out.println("position of vaålue is :" + search(a, x));
	}

	public static int search(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void find(int[] a, int x) {
		int first = -1;
		int last = -1;
		for (int j = 0; j < a.length; j++) {
			if (x == a[j]) {
				first = j;
				break;
			}
		}
		for (int k = a.length - 1; k >= 0; k--) {
			if (a[k] == x) {
				last = k;
				break;
			}
		}
		System.out.println("value :" + x + " 2" + "first appear : " + first + "last apppear :" + last);
	}
}