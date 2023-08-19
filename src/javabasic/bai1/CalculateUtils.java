package javabasic.bai1;

public class CalculateUtils {

	public double x,y;
	public CalculateUtils(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static double tinhCong(double x, double y) {
		return (x + y);
	}

	public static double tinhNhan(double x, double y) {
		return x * y;

	}

	public static double tinhTru(double x, double y) {
		return x - y;
	}

	public static double tinhChia(double x, double y) {
		return x / y;
	}

	public void printCONG() {
		System.out.println("Tổng là " + tinhCong(x, y));
	}

	public void printTRU() {
		System.out.println("Hiệu là " + tinhTru(x, y));
	}

	public void printNHAN() {
		System.out.println("Tích là " + tinhNhan(x, y));
	}

	public void printCHIA() {
		System.out.println("Thương là " + tinhChia(x, y));
	}
}