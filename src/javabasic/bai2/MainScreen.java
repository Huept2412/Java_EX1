package javabasic.bai2;

import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) {
		// Nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số nguyên N: ");
		int N = scanner.nextInt();
		if (N > 0) {
			// Tính tổng các số chẵn và tổng các số lẻ từ 1 đến N
			int tongChan = 0;
			int tongLe = 0;
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					tongChan += i;
				} else {
					tongLe += i;
				}
			}

			// In kết quả ra màn hình
			System.out.println("Tổng các số chẵn: " + tongChan);
			System.out.println("Tổng các số lẻ: " + tongLe);
			// Đếm số các số chia hết cho 3 nhưng không chia hết cho 2
			int count = 0;
			for (int i = 0; i <= N; i++) {
				if (i % 3 == 0 && i % 2 != 0) {
					count++;
				}
			}

			// In kết quả ra màn hình
			System.out.println("Số lượng các số chia hết cho 3 nhưng không chia hết cho 2: " + count);
		} else {
			System.out.println("N phải là số nguyên dương.");
		}

		// Đóng scanner
		scanner.close();

	}
}
