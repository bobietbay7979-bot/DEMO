package baitap;

public class Excercise3 {
//		Bài 3: Tìm số lớn nhất và nhỏ nhất
//		Cho mảng số nguyên.
//		Tìm:
//		Giá trị lớn nhất
//		Giá trị nhỏ nhất
	public static void main(String[] args) {
		int[] a = { 2, 1, 45, 5, 6, 2, 36, 56, 96, 3 };
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println("Giá trị lớn nhất là:" + max);
		System.out.println("Giá trị nhỏ nhất là:" + min);
	}
}
