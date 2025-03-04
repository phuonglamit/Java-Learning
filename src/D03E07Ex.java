import java.util.Scanner;

public class D03E07Ex {
    public static void main(String[] args) {
        /*
         * Viết chương trình nhập vào chiều cao, cân nặng => Tính BMI, và xuất ra thông
         * báo
         * BMI < 15 thân hình quá gầy
         * BMI >= 15 && BMI < 16 thân hình hơi gầy
         * BMI >=16 && BMI < 25 Thân hình bình thường
         * BMI >=25 Thân hình béo
         * Biết BMI = cân nặng / chiều cao^2
         */

        Scanner sc = new Scanner(System.in);

        // Nhập vào chiều cao, cân nặng

        double cc = sc.nextDouble();
        double cn = sc.nextDouble();
        double BMI = cn / Math.pow(cc, 2); // Hàm tính bình phương
        System.out.println("BMI = " + BMI);
        if(BMI < 15){
            System.out.println("Thân hình quá gầy");
        }
        else if(BMI >= 15 && BMI < 16){
            System.out.println("Thân hình hơi gầy");
        }
        else if (BMI >= 16 && BMI < 25){
            System.out.println("Thân hình bình thường");
        }
        else 
            System.out.println("Thân hình béo");
        sc.close();
        

    }

}
