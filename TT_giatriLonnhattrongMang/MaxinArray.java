package TT_giatriLonnhattrongMang;

import java.util.Scanner;

public class MaxinArray {
    public static void main(String[] args) {
        //Mô tả
        //Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép xác định phần tử có giá trị lớn nhất trong mảng.
        //
        //Ứng dụng cho phép người dùng lần lượt nhập vào giá trị tài sản của các tỷ phú thế giới (đơn vị tỉ đô), tối đa cho phép nhập 20 giá trị, sau đó hiển thị giá trị tài sản lớn nhất và vị trí của nó trong danh sách.
        //
        //Các bước thực hiện
        //Để tìm GTLN trong 1 mảng, đầu tiên ta gán GTLN bằng một phần tử bất kì trong mảng. Sau đó duyệt các phần tử còn lại, nếu có giá trị  lớn hơn GTLN tiếp tục gán GTLN bằng phần tử đó.
        //
        //Bước 1: Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        //Bước 2: Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        //Bước 3: In ra danh sách tài sản đã nhập
        System.out.print("Property List:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Bước 4: Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int location = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                location = j + 1;
            }

        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + location);

    }

}
