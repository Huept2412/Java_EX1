package javabasic.bai3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.DateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class MainScreen {
	private static final String DATE_FORMAT = "dd/mm/yyyy";
	private static final DateFormat formatter = new SimpleDateFormat(DATE_FORMAT);

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>(); 
		char continueInput;
		do {
			Student st = new Student();
			System.out.print("FullName: ");
			st.setFullName(scanner.nextLine());
			System.out.print("Address: ");
			st.setAddress(scanner.nextLine());
			try {
				System.out.print("Dob(dd/mm/yyyy): ");
				Date date = formatter.parse(scanner.nextLine());
				st.setDob(formatter.format(date));
			} catch (ParseException e) {
				System.out.println("Nhập ngày sinh theo format dd/mm/yyyy");
				System.out.println("DOB: ");
				st.setDob(scanner.nextLine());
			}
			System.out.print("Final Grade: ");
			st.setFinalGrade(scanner.nextFloat());

			students.add(st); // 
			scanner.nextLine();
			System.out.println("Do you want to continue (Y/N)?");
			continueInput = scanner.nextLine().charAt(0);

		} while (continueInput == 'Y' || continueInput == 'y');

		for (int i = 0; i < students.size(); i++) {
			System.out.println("Student " + (i + 1));
			Student st = students.get(i); 
			System.out.println("\tFull name: " + st.getFullName());
			System.out.println("\tAddress: " + st.getAddress());
			System.out.println("\tDOB: " + st.getDob());
			System.out.println("\tFinal Grade: " + st.getFinalGrade());
		}
		// Xét học lực

		for (int i = 0; i < students.size(); i++) {
			String studentGrade;
			if (students.get(i).getFinalGrade() < 4.0) {
				studentGrade = "học lực kém";
			} else if (students.get(i).getFinalGrade() >= 4.0 && students.get(i).getFinalGrade() < 5.0) {
				studentGrade = "học lực yếu";
			} else if (students.get(i).getFinalGrade() >= 5.0 && students.get(i).getFinalGrade() < 5.5) {
				studentGrade = "học lực trung bình yếu";
			} else if (students.get(i).getFinalGrade() >= 5.5 && students.get(i).getFinalGrade() < 6.5) {
				studentGrade = "học lực trung bình";
			} else if (students.get(i).getFinalGrade() >= 6.5 && students.get(i).getFinalGrade() < 7.0) {
				studentGrade = "học lực trung bình khá";
			} else if (students.get(i).getFinalGrade() >= 7.0 && students.get(i).getFinalGrade() < 8.0) {
				studentGrade = "học lực khá";
			} else if (students.get(i).getFinalGrade() >= 8.0 && students.get(i).getFinalGrade() < 8.5) {
				studentGrade = "học lực khá giỏi";
			} else {
				studentGrade = "học lực giỏi";
			}
			System.out.println("Student " + (i + 1) + ": ");
			System.out.println("\tHọc sinh " + students.get(i).getFullName() + " Điểm trung bình "
					+ students.get(i).getFinalGrade() + ": " + studentGrade);
		}

		// Tính điểm trung bình của tất cả học sinh
		float totalGrade = 0;
		for (int i = 0; i < students.size(); i++) {
			totalGrade += students.get(i).getFinalGrade();
		}
		float averageGrade = totalGrade / students.size();
		System.out.println("Average final grade of all students: " + averageGrade);
	}

}
