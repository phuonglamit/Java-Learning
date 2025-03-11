import java.util.Scanner;

public class D07E04Ex1 {
    public static void main(String[] args) {
        /*
         * Viết chương trình nhập vào số nguyên n, tính n! (n giai thừa)
         * Biết n! = 1*2*3*4*n
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int giaiThua = 1;
        int i = 1;
        sc.close();
        /* for
        for (int i = 1; i <= n; i++) {
            giaiThua = giaiThua*i;
        }
        System.out.println("Giai thừa của n = " + giaiThua); */
        //while
        while (i <= n) {
            giaiThua = giaiThua*i;
            i++;
            
        }
        System.out.println("Giai thừa của n =" + giaiThua);

    }

}
