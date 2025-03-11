import java.util.Scanner;

public class D05E01SwitchCase {
    /*
     * Cú pháp
     * switch (Biến cần kiểm tra) {
     * case <Giá trị 1> : <Câu lệnh 1>
     * break;
     * case <Giá trị 2> : <câu lệnh 2>
     * break;
     * default : <Câu lệnhm mặc định nếu không thoả mãm các cậu lệnh phía trên>
     * break;
     * }
     */
    public static void main(String[] args) {
        // Nhập 1 số và ktra tính chẵn lẻ
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int div = a % 2;
        sc.close();
        switch (div) {
            case 0:
                System.out.println(a + " là số chẵn");

                break;

            default:
                System.out.println(a + " là số lẻ");
                break;
        }
    }
}
