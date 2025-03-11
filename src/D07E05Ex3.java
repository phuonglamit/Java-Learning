import java.util.Scanner;

public class D07E05Ex3 {
    public static void main(String[] args) {
        /* 
         * Nhập vào số a, tính tổng các số lẻ từ 0 đến a
         * continue khi i = 3
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        sc.close();
        if (a%2==0) {
            System.out.println("Không tính tổng vì là số chẵn");
            
        }
        else {
            for (int i = 1; i <=a ; i+=2){
                if (i == 3) {
                    continue;
                    
                } else
                sum +=i;

            }
            System.out.println("Tổng các số lẻ là: " + sum);
        }
        
    }
    
}
