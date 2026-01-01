package baitap;

public class Exercise4 {
//	Bài 4: Đếm số chẵn & số lẻ
//	Cho mảng int.
//	Đếm xem có bao nhiêu số chẵn, bao nhiêu số lẻ.
	public static void main(String[] args) {
		int[] a = { 2, 1, 45, 5, 6, 2, 36, 56, 96, 3 };
		int countodd = 0;
		int counteven = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				counteven++;
			} else {
				countodd++;
			}
		}
		System.out.println("The amount of even number" + counteven);
		System.out.println("The amount of odd number:" + countodd);
	}
}


