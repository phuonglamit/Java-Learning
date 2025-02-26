import java.util.Scanner;

public class D03E01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println(c);
        
        String x = sc.nextLine();
        String y = sc.nextLine();
        String z = x + y;
        System.out.println(z);
        
        float x1 = sc.nextFloat();
        System.out.println(x1);
        sc.close();
    }
    
}
