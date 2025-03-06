import java.util.Scanner;

public class D04E02Ex {
    /*
     * Viết chương trình nhập vào điểm trung bình
     * Dùng toán tử 3 ngôi viết ct xếp loại hs
     * Giỏi: >=8 && <=10
     * Khá >= 6.5 && < 8
     * TB >=5 && < 6.5
     * Yếu < 5
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào điểm tb
        double dtb = sc.nextDouble();
        sc.close();
        // Xử lý lệnh để tính
        String xepLoai = (dtb <= 10 && dtb >= 8.5) ? "Giỏi"
                : ((dtb < 8.5 && dtb >= 6.5) ? "Khá"
                        : (dtb < 6.5 && dtb >= 5) ? "TB" : (dtb < 5 && dtb >= 0) ? "Yếu" : "Số nhập vào không hợp lệ");
        System.out.println(xepLoai);

    }
}
