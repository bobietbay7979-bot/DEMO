package Excercise;

import java.util.Arrays;

public class Excercise5 {
//	Bài 5: Đảo ngược mảng
//	Cho mảng int[].
//	Đảo ngược thứ tự phần tử trong mảng.
	public static void main(String[] args) {
		int[] a = { 2, 1, 45, 5, 6, 2, 36, 56, 96, 3 };
		int i = a.length - 1;
		int []b=new int[10];
		int j=0;
		while (i >= 0) {
		b[j]=a[i];
			j++;
			i--;
		}
		System.out.println(Arrays.toString(b));
	
	}
}
