package assignment2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex5_InputFromConsole {
	public static void main(String[] args) {

	}

//			Question 1:
//			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình

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
	}

//			Question 2:
//			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình

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
	}

//			Question 3:
//			Viết lệnh cho phép người dùng nhập họ và tên

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
	}

//			Question 4:
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ

	public static void nhapNgaySinh() throws ParseException {
		System.out.println("________________________Question 4________________________");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ngay sinh cua ban theo dinh dang \"dd-mm-yyyy\": ");
		String doB = scanner.nextLine();
		Date q4 = new SimpleDateFormat("dd-MM-yyyy").parse(doB);
		System.out.println(q4);
	}

//			Question 5:
//			Viết lệnh cho phép người dùng tạo account (viết thành method) Đối với property Position, Người dùng nhập vào 1 2 3 4 và vào chương trình sẽ chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM

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
	}

//			Question 6:
//			Viết lệnh cho phép người dùng tạo department (viết thành method)

	public static void taoDepartment() {
		System.out.println("________________________Question 6________________________");
		Scanner scanner = new Scanner(System.in);
		Department newDep = new Department();
		System.out.print("Moi ban nhap ID cho department: ");
		newDep.id = scanner.nextInt();
		System.out.print("Moi ban nhap ten cho department: ");
		newDep.name = scanner.nextLine();

		System.out.println("Department vua tao co thong tin nhu sau:");
		System.out.println("ID: " + newDep.id);
		System.out.println("Name: " + newDep.name);
	}

//			Question 7:
//			Nhập số chẵn từ console

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
	}

//			Question 8:
//			Viết chương trình thực hiện theo flow sau: 
//				Bước 1: Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
//				Bước 2: Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại" và quay trở lại bước 1

	public static void chonChucNang(int a) {
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

	}

//			Question 9:
//			Viết method cho phép người dùng thêm group vào account theo flow sau: 
//				Bước 1: In ra tên các usernames của user cho người dùng xem 
//				Bước 2: Yêu cầu người dùng nhập vào username của account 
//				Bước 3: In ra tên các group cho người dùng xem 
//				Bước 4: Yêu cầu người dùng nhập vào tên của group 
//				Bước 5: Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó .

	public static void themGroup() {
		System.out.println("________________________Question 9________________________");
		Scanner scanner = new Scanner(System.in);
	}

//			Question 10: Tiếp tục Question 8 và Question 9 
//			Bổ sung thêm vào bước 2 của Question 8 như sau: 
//				Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào account
//			Bổ sung thêm Bước 3 của Question 8 như sau: 
//				Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để kết thúc chương trình) 

	public static void q10() {
		System.out.println("________________________Question 10________________________");
		Scanner scanner = new Scanner(System.in);
	}

//				Question 11: Tiếp tục Question 10 
//				Bổ sung thêm vào bước 2 của Question 8 như sau: 
//					Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau: 
//						Bước 1: In ra tên các usernames của user cho người dùng xem
//						Bước 2: Yêu cầu người dùng nhập vào username của account 
//						Bước 3: Sau đó chương trình sẽ chọn ngẫu nhiên 1 group 
//						Bước 4: Thêm account vào group chương trình vừa chọn ngẫu nhiên

	public static void q11() {
		System.out.println("________________________Question 11________________________");
		Scanner scanner = new Scanner(System.in);
	}

}