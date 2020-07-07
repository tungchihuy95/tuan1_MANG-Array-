package findLocation;

import java.util.Scanner;

public class findlocation {
    public static void main(String[] args) {
        String students[] = {"Lan", "Lam", "Hoa", "Trung", "Duong", "Mai", "Chi", "Anh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten Hoc sinh: ");
        String inputName = sc.nextLine();

        //Duyetmang
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Vi tri cua hoc sinh" + inputName + "trong danh sach la:" + (i + 1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Khong tim thay!");
        }
    }
}
