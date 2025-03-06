import java.util.Scanner;

public class D03E10Ex {
    public static void main(String[] args) {

        /*
         * Viết chương trình giải phương trình bậc 2: ax^2 + bx + c = 0
         */
        Scanner sc = new Scanner(System.in);
        // Nhap vao cac so a,b,c
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        // Kiem tra xem a co bang 0 hay khong, neu = 0 thi tro thanh phuong trinh bac
        // nhat
        if (a == 0) {
            // Có thể viết cách này hoặc cách bên dưới
            // if (b == 0) {
            // System.out.println(c == 0 ? "Phuong trinh vo so nghiem" : "Phuong trinh vo
            // nghiem");

            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong Trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }

            } else {
                double x = -c / b;
                System.out.println("Phuong trinh co mot nghiem: x = " + x);
            }

        } else {
            // Tinh Delta
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co mot nghiem kep: x = " + x);

            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem:");
                System.out.println(x1);
                System.out.println(x2);

            }
            sc.close();
        }

    }
}
