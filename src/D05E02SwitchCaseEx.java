import java.util.Scanner;

public class D05E02SwitchCaseEx {
    /*
     * Nhập vào số và xuất ra các method tìm kiếm
     * 1 là tìm theo tên
     * 2 là tìm theo tác giả
     * 3 là tìm theo nhà xuất bản
     * 4 là tìm theo tiêu đề
     * != 1,2,3 4 thì phím bấm không hợp lệ
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nhapvao = sc.nextInt();
        sc.close();
        switch (nhapvao) {
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;

            default:
                System.out.println("Phím bấm không hợp lệ");
                break;
        }
    }

}
