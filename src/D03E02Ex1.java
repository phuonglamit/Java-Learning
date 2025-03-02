import java.util.Scanner;

public class D03E02Ex1 {
    public static void main(String[] agrs) {

        // Khai bao đối tương scanner
        Scanner sc = new Scanner(System.in);

        /*
         * Viết chương trình tính chu vi và diện tích hình tròn
         * C=2×π×r (Công thức tính chu vi)
         * A=π×r^2 (Công thức tính diện tích)
         */
        System.out.println("Nhập bán kính đường tròn");
        double r = sc.nextDouble();
        double cv = 2 * r * Math.PI;
        double dt = Math.PI * Math.pow(r, 2); // Math.pow(r,2) tính bình phương của rÏ
        System.out.println("Chu vi hình tròn là:" + cv);
        System.out.println("Diện tích hình tròn là:" + dt);
        sc.close();

    }

}
