package assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex5_InputFromConsole {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		// Create group
				Group group1 = new Group();
				group1.id = 1;
				group1.name = "Java Fresher";

				Group group2 = new Group();
				group2.id = 2;
				group2.name = "DB Fresher";

				Group group3 = new Group();
				group3.id = 3;
				group3.name = "C++ Fresher";
				

		// Create Deparment
				Department department1 = new Department();
				department1.id = 1;
				department1.name = "Sale";

				Department department2 = new Department();
				department2.id = 2;
				department2.name = "Marketting";

				Department department3 = new Department();
				department3.id = 3;
				department3.name = "HR";
				

		// Create Position
				Position position1 = new Position();
				position1.id = 1;
				position1.name = "Dev";

				Position position2 = new Position();
				position2.id = 2;
				position2.name = "Test";

				Position position3 = new Position();
				position3.id = 3;
				position3.name = "Scrum Master";

				Position position4 = new Position();
				position4.id = 4;
				position4.name = "PM";

		// Create account
				Account account1 = new Account();
				account1.id = 1;
				account1.department = department1;
				account1.email = "An@gmail.com";
				account1.fullname = "Nguyen Van An";
				account1.position = position1;
				account1.username = "an.nguyenvan";

				Account account2 = new Account();
				account2.id = 2;
				account2.department = department1;
				account2.email = "Linh@gmail.com";
				account2.fullname = "Nguyen Hoai Linh";
				account2.position = position3;
				account2.username = "Linh.nguyenhoai";

				Account account3 = new Account();
				account3.id = 3;
				account3.department = department2;
				account3.email = "ha@gmail.com";
				account3.fullname = "Pham Hai Ha";
				account3.position = position1;
				account3.username = "Ha.phamhai";

		// add group to account
				Group[] groupOfAccount1 = { group1 };
				account1.groups = groupOfAccount1;

				Group[] groupOfAccount2 = { group3 };
				account2.groups = groupOfAccount2;

				Group[] groupOfAccount3 = { group1 };
				account3.groups = groupOfAccount3;

		// add account to group
				Account[] accountOfGroups1 = { account1, account2, account3 };
				group1.accounts = accountOfGroups1;
				
				Account[] accountOfGroups2 = {  };
				group2.accounts = accountOfGroups2;
				
				Account[] accountOfGroups3 = {  };
				group3.accounts = accountOfGroups3;
				
	}

//			Question 1:
//			Vi???t l???nh cho ph??p ng?????i d??ng nh???p 3 s??? nguy??n v??o ch????ng tr??nh

	public static void nhapBaSoNguyen() {
		System.out.println("________________________Question 1________________________");
		Scanner scanner = new Scanner(System.in);
		int[] soNguyen = new int[3];
		for (int i = 0; i < soNguyen.length; i++) {
			System.out.print("Nhap vao so nguyen thu " + (i + 1) + ": ");
			soNguyen[i] = scanner.nextInt();
		}
		;
		for (int i = 0; i < soNguyen.length; i++) {
			System.out.println(soNguyen[i]);
		}
		;
		scanner.close();
	}

//			Question 2:
//			Vi???t l???nh cho ph??p ng?????i d??ng nh???p 2 s??? th???c v??o ch????ng tr??nh

	public static void nhapHaiSoThuc() {
		System.out.println("________________________Question 2________________________");
		Scanner scanner = new Scanner(System.in);
		double[] soThuc = new double[2];
		for (int i = 0; i < soThuc.length; i++) {
			System.out.print("Nhap vao so thuc thu " + (i + 1) + ": ");
			soThuc[i] = scanner.nextDouble();
		}
		;
		for (int i = 0; i < soThuc.length; i++) {
			System.out.println(soThuc[i]);
		}
		;
		scanner.close();
	}

//			Question 3:
//			Vi???t l???nh cho ph??p ng?????i d??ng nh???p h??? v?? t??n

	public static void nhapHoTen() {
		System.out.println("________________________Question 3________________________");
		Scanner scanner = new Scanner(System.in);
		String[] hoVaTen = new String[2];
		System.out.print("Nhap vao ho cua ban: ");
		hoVaTen[0] = scanner.next();
		System.out.print("Nhap vao ten cua ban: ");
		hoVaTen[1] = scanner.next();
		System.out.println("Ho cua ban la: " + hoVaTen[0]);
		System.out.println("Ten cua ban la: " + hoVaTen[1]);
		scanner.close();
	}

//			Question 4:
//			Vi???t l???nh cho ph??p ng?????i d??ng nh???p v??o ng??y sinh nh???t c???a h???

	public static void nhapNgaySinh() throws ParseException {
		System.out.println("________________________Question 4________________________");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ngay sinh cua ban theo dinh dang \"dd-mm-yyyy\": ");
		String doB = scanner.nextLine();
		Date q4 = new SimpleDateFormat("dd-MM-yyyy").parse(doB);
		System.out.println(q4);
		scanner.close();
	}

//			Question 5:
//			Vi???t l???nh cho ph??p ng?????i d??ng t???o account (vi???t th??nh method) ?????i v???i property Position, Ng?????i d??ng nh???p v??o 1 2 3 4 v?? v??o ch????ng tr??nh s??? chuy???n th??nh Position.Dev, Position.Test, Position.ScrumMaster, Position.PM

	public static void taoAccount() {
		System.out.println("________________________Question 5________________________");
		Scanner scanner = new Scanner(System.in);
		Account acc = new Account();
		System.out.print("Moi ban nhap ID cho account: ");
		acc.id = scanner.nextInt();
		System.out.print("Moi ban nhap email cho account: ");
		acc.email = scanner.nextLine();
		System.out.print("Moi ban nhap username cho account: ");
		acc.username = scanner.next();
		System.out.print("Moi ban nhap full name cho accounnt: ");
		acc.fullname = scanner.nextLine();
		System.out.print("Moi ban nhap position ID cho account (1-4): ");
		int i = scanner.nextInt();
		switch (i) {
		case 1:
			Position pos1 = new Position();
			pos1.id = 1;
			pos1.name = "Dev";
			acc.position = pos1;
			break;
		case 2:
			Position pos2 = new Position();
			pos2.id = 2;
			pos2.name = "Test";
			acc.position = pos2;
			break;
		case 3:
			Position pos3 = new Position();
			pos3.id = 3;
			pos3.name = "Scrum Master";
			acc.position = pos3;
			break;
		case 4:
			Position pos4 = new Position();
			pos4.id = 4;
			pos4.name = "PM";
			acc.position = pos4;
			break;
		default:
			System.out.println("Position ID khong hop le.");
			break;
		}
		scanner.close();
	}

//			Question 6:
//			Vi???t l???nh cho ph??p ng?????i d??ng t???o department (vi???t th??nh method)

	public static void taoDepartment() {
		System.out.println("________________________Question 6________________________");
		Scanner scanner = new Scanner(System.in);
		Department newDep = new Department();
		System.out.print("Moi ban nhap ID cho department: ");
		newDep.id = scanner.nextInt();
		System.out.print("Moi ban nhap ten cho department: ");
		newDep.name = scanner.nextLine();
		scanner.close();

		System.out.println("Department vua tao co thong tin nhu sau:");
		System.out.println("ID: " + newDep.id);
		System.out.println("Name: " + newDep.name);
	}

//			Question 7:
//			Nh???p s??? ch???n t??? console

	public static void nhapSoChan() {
		System.out.println("________________________Question 7________________________");
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int soChan;
		while (true) {
			System.out.print("Nhap vao mot so chan: ");
			soChan = scanner.nextInt();
			if (i % 2 == 0) {
				System.out.println("So " + soChan + " la mot so chan.");
			} else {
				System.out.println("So ban nhap khong phai la so chan.");
				break;
			}
		}
		scanner.close();
	}

//			Question 8:
//			Vi???t ch????ng tr??nh th???c hi???n theo flow sau: 
//				B?????c 1: Ch????ng tr??nh in ra text "m???i b???n nh???p v??o ch???c n??ng mu???n s??? d???ng"
//				B?????c 2: N???u ng?????i d??ng nh???p v??o 1 th?? s??? th???c hi???n t???o account N???u ng?????i d??ng nh???p v??o 2 th?? s??? th???c hi???n ch???c n??ng t???o department N???u ng?????i d??ng nh???p v??o s??? kh??c th?? in ra text "M???i b???n nh???p l???i" v?? quay tr??? l???i b?????c 1

	public static void chonChucNang() {
		System.out.println("________________________Question 8________________________");
		Scanner scanner = new Scanner(System.in);
		int i;
		do {
			System.out.println("Moi ban nhap vao chuc nang muon su dung: ");
			System.out.println("1. Tao Account");
			System.out.println("2. Tao Department");
			i = scanner.nextInt();
			switch (i) {
			case 1:
				taoAccount();
				break;
			case 2:
				taoDepartment();
				break;
			default:
				System.out.println("Moi ban nhap lai chuc nang.");
				break;
			}
		} while (i != 1 || i != 2);
		scanner.close();
	}

//			Question 9:
//			Vi???t method cho ph??p ng?????i d??ng th??m group v??o account theo flow sau: 
//				B?????c 1: In ra t??n c??c usernames c???a user cho ng?????i d??ng xem 
//				B?????c 2: Y??u c???u ng?????i d??ng nh???p v??o username c???a account 
//				B?????c 3: In ra t??n c??c group cho ng?????i d??ng xem 
//				B?????c 4: Y??u c???u ng?????i d??ng nh???p v??o t??n c???a group 
//				B?????c 5: D???a v??o username v?? t??n c???a group ng?????i d??ng v???a ch???n, h??y th??m account v??o group ???? .

	public static void themGroup() {
		System.out.println("________________________Question 9________________________");
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}

//			Question 10: Ti???p t???c Question 8 v?? Question 9 
//			B??? sung th??m v??o b?????c 2 c???a Question 8 nh?? sau: 
//				N???u ng?????i d??ng nh???p v??o 3 th?? s??? th???c hi???n ch???c n??ng th??m group v??o account
//			B??? sung th??m B?????c 3 c???a Question 8 nh?? sau: 
//				Sau khi ng?????i d??ng th???c hi???n xong ch???c n??ng ??? b?????c 2 th?? in ra d??ng text ????? h???i ng?????i d??ng "B???n c?? mu???n th???c hi???n ch???c n??ng kh??c kh??ng?". N???u ng?????i d??ng ch???n "C??" th?? quay l???i b?????c 1, n???u ng?????i d??ng ch???n "Kh??ng" th?? k???t th??c ch????ng tr??nh (s??? d???ng l???nh return ????? k???t th??c ch????ng tr??nh) 

	public static void q10() {
		System.out.println("________________________Question 10________________________");
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}

//				Question 11: Ti???p t???c Question 10 
//				B??? sung th??m v??o b?????c 2 c???a Question 8 nh?? sau: 
//					N???u ng?????i d??ng nh???p v??o 4 th?? s??? th???c hi???n ch???c n??ng th??m account v??o 1 nh??m ng???u nhi??n, ch???c n??ng s??? ???????c c??i ?????t nh?? sau: 
//						B?????c 1: In ra t??n c??c usernames c???a user cho ng?????i d??ng xem
//						B?????c 2: Y??u c???u ng?????i d??ng nh???p v??o username c???a account 
//						B?????c 3: Sau ???? ch????ng tr??nh s??? ch???n ng???u nhi??n 1 group 
//						B?????c 4: Th??m account v??o group ch????ng tr??nh v???a ch???n ng???u nhi??n

	public static void q11() {
		System.out.println("________________________Question 11________________________");
		Scanner scanner = new Scanner(System.in);
		scanner.close();
	}

}
