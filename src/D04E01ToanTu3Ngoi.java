import java.util.Scanner;

public class D04E01ToanTu3Ngoi {
    public static void main(String[] args) {
        // Nhập vào số n, kiểm tra là số chẵn hay lẻ
        Scanner sc = new Scanner(System.in);

        // Nhập vào n
        int n = sc.nextInt();
        System.out.println( n%2==0 ? "Số nhập vào là chẵn" : "Số nhập vào là lẻ");
        
    }
    
}
