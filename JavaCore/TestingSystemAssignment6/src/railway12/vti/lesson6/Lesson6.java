package railway12.vti.lesson6;

import assignment6.exception.Department;
import assignment6.exception.Position;

public class Lesson6 {

	public static void main(String[] args) throws Exception {
		
		Position pos1 = new Position();
		System.out.println(pos1.getId());
		System.out.println(pos1.getName());
		
		Position pos2 = new Position();
		System.out.println(pos2.getId());
		System.out.println(pos2.getName());
		
		Position pos3 = new Position();
		System.out.println(pos3.getId());
		System.out.println(pos3.getName());
		
		Position pos4 = new Position();
		System.out.println(pos4.getId());
		System.out.println(pos4.getName());
		
	}
//		
//		try {
//			int[] num = { 1, 2 };
//			System.out.println(num[4]);

//			String s = null;
//			System.out.println(s.length());

//			int data = 50 / 0;

//			String a = "123a";
//			int b = Integer.parseInt(a);
//		} catch (ArithmeticException e) { // catch exception từ nhỏ đến to ( Exception là to nhất ở cuối)
//			System.out.println("Loi toan hoc");
//		} catch (NullPointerException e) {
//			System.out.println("String null");
//		} catch (Exception e) {
//			System.out.println(e);
//			System.out.println("Loi khac");
//		} finally { // gặp bất cứ ngoại lệ gì hoặc không có ngoại lệ cũng thực hiện khối lệnh finally
//			System.out.println("Kieu gi cung phai in ra thang nay");
//		}
//
//		System.out.println("Toi muon in ra dong nay");
//		checkAge(14);
//		try {
//			transferMoney();
//		} catch (Exception e) {
//			System.out.println("Moi ban nhap vao so");
//		}
//	}
//
//	public static void checkAge(int age) {
//		if (age < 18) {
//			throw new ArithmeticException("FBI warning!!!");
//		} else {
//			System.out.println("Welcome to the dark side.");
//		}
//	}
//
//	public static void transferMoney() throws Exception {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Moi ban nhap vao so tien: ");
//		double money = scanner.nextDouble();
//		System.out.println("So tien can chuyen la : " + money);
//	}
}
