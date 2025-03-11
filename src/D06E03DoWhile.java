public class D06E03DoWhile {
    public static void main(String[] args) {
        /*
         * Tính tổng các số 1-5
         */
        int a = 1;
        int tong = 0;
        do {
            tong += a; // tong = tong + a
            a++;
        } while (a <= 5);
        System.out.println("Tổng = " + tong);
        // Nếu giải bằng while
        // while (a<=5) {
        // tong +=a;
        // a++;
        // }
        // System.out.println("Tổng = " + tong);

    }

}
