import java.util.Scanner;

public class D03E01Scanner {
    public static void main(String[] args) {

        //Khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in); //System.in để cho phép nhập từ bàn phím

        //Mời bạn nhập dữ liệu input
        System.out.println("Input a, b:");
         
        //Nhập vào 2 số a và b, sau đó in ra dữ liệu là a +b
        int a;
        int b;
        int c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Output a + b:");
        System.out.println(c);
        
        //Nhập vào chuỗi x và y, sau đó in ra chuỗi x + y
        System.out.println("Input x:");
        String x = sc.nextLine();
        System.out.println("Input y:");
        String y = sc.nextLine(); //Vì ở trên đang dùng nextInt nên giờ khi khai báo nextLine thì hệ thống không nhận input y, để xử lý cần phải comment đoạn phía trên lại để chạy thử
        String z = x + y;
        System.out.println("Output x + y:");
        System.out.println(z);
        
        //Nhập vào số thực x1, sau đó in ra số thực đó
        System.out.println("Input x1:");
        float x1 = sc.nextFloat();
        System.out.println("Output x1:");
        System.out.println(x1);
        sc.close();
    }
    
}
