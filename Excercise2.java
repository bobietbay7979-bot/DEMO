package baitap;

public class Excercise2 {
// Bài 2: Tính tổng & trung bình
//	Cho mảng int[] numbers.
//	Tính:
//	Tổng các phần tử
//	Giá trị trung bình
	public static void main(String[] args) {
		int[] a = { 1, 2, 45, 5, 6, 2, 36, 56, 96, 3 };
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double average = sum / a.length;
		System.out.println("Tổng các phần tử:" + sum);
		System.out.println("Giá trị trung bình:" + average);
	}

}
