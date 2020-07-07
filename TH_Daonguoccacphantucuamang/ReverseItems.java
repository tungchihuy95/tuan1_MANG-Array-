package TH_Daonguoccacphantucuamang;

import java.util.Scanner;

public class ReverseItems {
    public static void main(String[] args) {
        //Mục tiêu
        //Luyện tập thực hiện các thao tác cơ bản với mảng.
        //
        //Mô tả
        //Trong phần này, chúng ta sẽ xây dựng một ứng dụng cho phép đảo ngược thứ tự của các phần tử trong mảng.
        //
        //Ứng dụng cho phép nhập vào lần lượt các phần tử của một mảng (tối đa là 20 phần tử) và sau đó đảo ngược thứ tự của các phần tử.
        //
        //Các bước thực hiện
        //Để đảo ngược thứ tự phần tử trong mảng chúng ta sẽ hoán đổi giá trị của tất cả các phần tử đối xứng nhau trong mảng.
        //
        //Bước 1: Khai báo các biến, nhập và kiểm tra kích thước mảng

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        //Thực thi chương trình.
        //
        //Bước 2: Nhập giá trị cho các phần tử của mảng

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        //Thực thi chương trình.
        //
        //Bước 3: In ra mảng đã nhập

        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        //Thực thi chương trình.
        //
        //Bước 4: Đảo ngược thứ tự các phần tử trong mảng
        //
        //Sử dụng biến trung gian để hoán đổi giá trị giữa 2 phần tử.

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        //Bước 5: In ra mảng sau khi đã đảo ngược thứ tự các phần tử
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
