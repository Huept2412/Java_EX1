package javabasic.bai1;
import java.util.Scanner;
public class MyMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giá trị x= ");
		x = sc.nextDouble();
		System.out.println("Nhập giá trị y= ");
		y = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhập lệnh Action là ");
		String action = sc.nextLine();
		CalculateUtils phepTinh = new CalculateUtils(x, y);
		switch (action) {
		case "CONG": {
			phepTinh.printCONG();
			break;
		}
		case "TRU": {
			phepTinh.printTRU();
			break;
		}
		case "NHAN": {
			phepTinh.printNHAN();
			break;
		}

		case "CHIA": {
			phepTinh.printCHIA();
			break;

		}
		default:
			System.out.println("Giá trị ACTION không hợp lệ");
			break;
		}
		sc.close();
	}

}
