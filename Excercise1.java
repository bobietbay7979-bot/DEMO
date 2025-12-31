package baitap;

import java.util.Arrays;

public class Excercise1 {
//	Bài 1: Duyệt mảng
//	Khai báo một mảng int gồm 10 phần tử.
//	In ra tất cả phần tử trong mảng bằng:
//	for
// while
//	for-each
	public static void main(String[] args) {
		int[] a = { 2, 1, 45, 5, 6, 2, 36, 56, 96, 3 };
		// use for
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// using while
		int j = 0;
		while (j < a.length) {
			System.out.println(a[j]);
			j++;

		}
		// use do while
		int k = 0;
		do {
			System.out.println(a[k]);
			k++;
		} while (k < a.length);

	}
}
