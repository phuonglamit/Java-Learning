public class D06E04WhileTrue {
    public static void main(String[] args) {
        /* 
         *  Tăng n lên 1 đến khi n = 10 thì dừng
         */
        int n = 0;
        while (true) {
            n++;
            System.out.println("n = " + n);
            if (n==10) {
                break; // Dùng dk và break để dừng lại, nếu không có break thì sẽ chạy mãi ko dừng
            }
        }
    }
}
