import java.util.Scanner;

public class D03E05MultiIfElse {
    public static void main(String[] args) {
        /* 
         * if(ĐK 1)
         *      Lệnh 1
         * else if (DK 2)
         *      Lệnh 2.1
         *      Lệnh 2.2...
         * else
         *      Lệnh else
         */

         //Bài tập xếp loại học sinh giỏi, khá, tb, yếu

         Scanner sc = new Scanner(System.in);

         // Nhập vào dtb
         double dtb = sc.nextDouble();

         // Xét điều kiện
         if(dtb >= 8.5 && dtb <= 10){
            System.out.println("Bạn xếp loại giỏi");
         }
         else if(dtb < 8.5 && dtb >=6.5) {
            System.out.println("Bạn xếp loại khá");

         } else if(dtb < 6.5 && dtb >=5){
            System.out.println("Bạn xếp loại trung bình");

         } else {
            System.out.println("Bạn xếp loại yếu");
         }
         sc.close();

    }
    
}
