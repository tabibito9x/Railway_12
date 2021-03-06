package assignment2;


public class Ex1_FlowControl {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

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
		

		// IF
//		Question 1:
//		Ki???m tra account th??? 2 N???u kh??ng c?? ph??ng ban (t???c l?? department == null) th?? s??? in ra text "Nh??n vi??n n??y ch??a c?? ph??ng ban"
//		N???u kh??ng th?? s??? in ra text "Ph??ng ban c???a nh??n vi??n n??y l?? ???"

		System.out.println("________________________Question 1________________________");

		if (account2.department == null) {
			System.out.println("Nhan vien nay chua co phong ban.");
		} else {
			System.out.println("Phong ban cua nhan vien nay la " + account2.department.name);
		}

//		Question 2:
//		Ki???m tra account th??? 2 N???u kh??ng c?? group th?? s??? in ra text "Nh??n vi??n n??y ch??a c?? group"
//		N???u c?? m???t trong 1 ho???c 2 group th?? s??? in ra text "Group c???a nh??n vi??n n??y l?? Java Fresher, C# Fresher"
//		N???u c?? m???t trong 3 Group th?? s??? in ra text "Nh??n vi??n n??y l?? ng?????i quan tr???ng, tham gia nhi???u group"
//		N???u c?? m???t trong 4 group tr??? l??n th?? s??? in ra text "Nh??n vi??n n??y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group"		

		System.out.println("________________________Question 2________________________");
		int count = account2.groups.length;
		if (count == 0) {
			System.out.println("Nhan vien nay khong tham gia group.");
		} else if (count == 1 || count == 2) {
			System.out.println("Nhan vien nay tham gia group Java Fresher, C# Fresher");
		} else if (count == 3) {
			System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group.");
		} else {
			System.out.println("Nhan vien nay hong chuyen o tat ca cac group");
		}

//		Question 3:
//		S??? d???ng to??n t??? ternary ????? l??m Question 1

		System.out.println("________________________Question 3________________________");

		System.out.println((account2.department == null ? "Nhan vien nay chua co phong ban"
				: "Phong ban cua nhan vien nay la " + account2.department.name));

//		Question 4:
//		S??? d???ng to??n t??? ternary ????? l??m y??u c???u sau: Ki???m tra Position c???a account th??? 1 N???u Position = Dev th?? in ra text "????y l?? Developer"
//		N???u kh??ng ph???i th?? in ra text "Ng?????i n??y kh??ng ph???i l?? Developer"

		System.out.println("________________________Question 4________________________");

		System.out.println(account1.position.name == "Dev" ? "Day la Developer" : "Nguoi nay khong phai la Developer");

		// SWITCH CASE
//		Question 5:
//		L???y ra s??? l?????ng account trong nh??m th??? 1 v?? in ra theo format sau: N???u s??? l?????ng account = 1 th?? in ra "Nh??m c?? m???t th??nh vi??n"
//		N???u s??? l?????ng account = 2 th?? in ra "Nh??m c?? hai th??nh vi??n"
//		N???u s??? l?????ng account = 3 th?? in ra "Nh??m c?? ba th??nh vi??n"
//		C??n l???i in ra "Nh??m c?? nhi???u th??nh vi??n"

		System.out.println("________________________Question 5________________________");
		if (accountOfGroups1 == null)
			System.out.println("Nhom nay chua co thanh vien");
		else
			switch (accountOfGroups1.length) {
			case 1:
				System.out.println("Nhom co 1 thanh vien.");
				break;
			case 2:
				System.out.println("Nhom co 2 thanh vien.");
				break;
			case 3:
				System.out.println("Nhom co 3 thanh vien.");
				break;
			default:
				System.out.println("Nhom co nhieu thanh vien.");
				break;
			}

//		Question 6:
//		S??? d???ng switch case ????? l??m l???i Question 2

		System.out.println("________________________Question 6________________________");

		switch (account2.groups.length) {
		case 0:
			System.out.println("Thanh vien nay chua tham gia group.");
			break;
		case 1:
			System.out.println("Thanh vien nay tham gia group " + account2.groups[0].name);
			break;
		case 2:
			System.out.println(
					"Thanh vien nay chua tham gia 2 group " + account2.groups[0].name + ", " + account2.groups[1].name);
			break;
		case 3:
			System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group.");
			break;
		default:
			System.out.println("Nhan vien nay hong chuyen o tat ca cac group");
			break;
		}

//		Question 7:
//		S??? d???ng switch case ????? l??m l???i Question 4

		System.out.println("________________________Question 7________________________");

		switch (account1.position.name) {
		case "Test":
			System.out.println("Day la Tester.");
			break;
		case "Scrum Master":
			System.out.println("Day la Scrum Master.");
			break;
		case "PM":
			System.out.println("Day la Project Manager.");
			break;
		default:
			System.out.println("Day la Developer.");
			break;
		}

//		FOREACH
//		Question 8:
//		In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a h???

		System.out.println("________________________Question 8________________________");

		Account[] totalacc = { account1, account2, account3 };
		for (Account item : totalacc) {
			System.out.println("Email: " + item.email + "\nFull name: " + item.fullname + "\nDepartment: "
					+ item.department.name + "\n");
		}
		;

//		Question 9:
//		In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name

		System.out.println("________________________Question 9________________________");

		Department[] totalDep = { department1, department2, department3 };
		for (Department department : totalDep) {
			System.out.println("Department ID: " + department.id + "\nDepartment Name: " + department.name + "\n");
		}
		;

		// FOR
//		Question 10:
//		In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a h??? theo ?????nh d???ng nh?? sau: 
//		Th??ng tin account th??? 1 l??:
//		Email: NguyenVanA@gmail.com
//		Full name: Nguy???n V??n A Ph??ng ban: Sale Th??ng tin account th??? 2 l??:
//		Email: NguyenVanB@gmail.com
//		Full name: Nguy???n V??n B Ph??ng ban: Marketting

		System.out.println("________________________Question 10________________________");
		Account[] accArray = { account1, account2, account3 };
		for (int i = 0; i < accArray.length - 1; i++) {
			System.out.println("Thong tin account thu " + (i + 1) + " la: \nEmail: " + accArray[i].email
					+ "\nFull name: " + accArray[i].fullname + "\nPhong ban: " + accArray[i].department.name + "\n");
		}
		;

//		Question 11:
//		In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng sau: Th??ng tin department th??? 1 l??: Id: 1 Name: Sale Th??ng tin department th??? 2 l??: Id: 2 Name: Marketing

		System.out.println("________________________Question 11________________________");
		Department[] depArray = { department1, department2, department3 };
		for (int i = 0; i < depArray.length - 1; i++) {
			System.out.println("Thong tin department thu " + (i + 1) + " la: \nID: " + depArray[i].id + "\nName: "
					+ depArray[i].name + "\n");
		}
		;

//		Question 12:
//		Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng nh?? Question 10

		System.out.println("________________________Question 12________________________");
		for (int i = 0; i < 2; i++) {
			System.out.println("Thong tin department thu " + (i + 1) + " la: \nID: " + depArray[i].id + "\nName: "
					+ depArray[i].name + "\n");
		}
		;

//		Question 13:
//		In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2

		System.out.println("________________________Question 13________________________");
		for (int i = 0; i < accArray.length; i++) {
			if (i == 1) {
				continue;
			} else {
				System.out.println(accArray[i].email);
				System.out.println(accArray[i].fullname);
				System.out.println(accArray[i].username);
				System.out.println(accArray[i].position.name);
				System.out.println(accArray[i].department.name + "\n");
			}
		}
		;

//		Question 14:
//		In ra th??ng tin t???t c??? c??c account c?? id < 2

		System.out.println("________________________Question 14________________________");
		for (int i = 0; i < accArray.length; i++) {
			if (accArray[i].id == 2) {
				break;
			}
			System.out.println(accArray[i].email);
			System.out.println(accArray[i].fullname);
			System.out.println(accArray[i].username);
			System.out.println(accArray[i].position.name);
			System.out.println(accArray[i].department.name + "\n");
		}
		;

//		Question 15:
//		In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20

		System.out.println("________________________Question 15________________________");
		for (int i = 0; i < 21; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		;

		// WHILE
//		Question 16:
//		L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng WHILE k???t h???p v???i l???nh break, continue

		System.out.println("________________________Question 16________________________");
//		-10-
		int i = 0;
		while (i < accArray.length - 1) {
			System.out.println("Thong tin account thu " + (i + 1) + " la: \nEmail: " + accArray[i].email
					+ "\nFull name: " + accArray[i].fullname + "\nPhong ban: " + accArray[i].department.name + "\n");
			i++;
		}
		;

//		-11-
		i = 0;
		while (i < depArray.length - 1) {
			System.out.println("Thong tin department thu " + (i + 1) + " la: \nID: " + depArray[i].id + "\nName: "
					+ depArray[i].name + "\n");
			i++;
		}
		;

//		-12-
		i = 0;
		while (i < 2) {
			System.out.println("Thong tin department thu " + (i + 1) + " la: \nID: " + depArray[i].id + "\nName: "
					+ depArray[i].name + "\n");
			i++;
		}
		;

//		-13-
		i = 0;
		while (i < accArray.length) {
			if (i != 1) {
				System.out.println(accArray[i].email);
				System.out.println(accArray[i].fullname);
				System.out.println(accArray[i].username);
				System.out.println(accArray[i].position.name);
				System.out.println(accArray[i].department.name + "\n");
			}
			i++;
		}
		;

//		-14-
		i = 0;
		while (i < 2) {
			System.out.println(accArray[i].email);
			System.out.println(accArray[i].fullname);
			System.out.println(accArray[i].username);
			System.out.println(accArray[i].position.name);
			System.out.println(accArray[i].department.name + "\n");
			i++;
		}
		;

//		-15-
		i = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		;

		// DO-WHILE
//		Question 17:
//		L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng DO-WHILE k???t h???p v???i l???nh break, continue

		System.out.println("________________________Question 17________________________");
//		-10-
		i = 0;
		do {
			System.out.println("Thong tin account thu " + (i + 1) + " la: \nEmail: " + accArray[i].email
					+ "\nFull name: " + accArray[i].fullname + "\nPhong ban: " + accArray[i].department.name + "\n");
			i++;
		} while (i < accArray.length - 1);

//		-11-
		i = 0;
		do {
			System.out.println("Thong tin department thu " + (i + 1) + " la: \nID: " + depArray[i].id + "\nName: "
					+ depArray[i].name + "\n");
			i++;
		} while (i < depArray.length - 1);

//		-12-
		i = 0;
		do {
			System.out.println("Thong tin department thu " + (i + 1) + " la: \nID: " + depArray[i].id + "\nName: "
					+ depArray[i].name + "\n");
			i++;
		} while (i < 2);

//		-13-
		i = 0;
		do {
			if (i != 1) {
				System.out.println(accArray[i].email);
				System.out.println(accArray[i].fullname);
				System.out.println(accArray[i].username);
				System.out.println(accArray[i].position.name);
				System.out.println(accArray[i].department.name + "\n");
			}
			i++;
		} while (i < accArray.length);

//		-14-
		i = 0;
		do {
			System.out.println(accArray[i].email);
			System.out.println(accArray[i].fullname);
			System.out.println(accArray[i].username);
			System.out.println(accArray[i].position.name);
			System.out.println(accArray[i].department.name + "\n");
			i++;
		} while (i < 2);

//		-15-
		i = 0;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 20);

	}
}
