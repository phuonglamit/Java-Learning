public class D02E06PrePostOperators {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;
        int d = 8;
        // Pre-increment (++variable):

        ++a; // a = a + 1
        System.out.println(++a);

        // Post-increment (variable++)
        b++; // b = b + 1
        System.out.println(b++);

        // Pre-decrement (--variable)
        --c; // c = c - 1
        System.out.println(--c);
        // Post-decrement (variable--)
        d--; // d = d -1
        System.out.println(d--);

        /* Note
         * Prefix - postfix priority
         * Step 1: Prefix evaluated first
         * Step 2: Tinh cac phep tinh con lai
         * Step 3: Gan gia tri cho bien ben trai
         * Step 4: Postfix
         */

         int x = 1;
         int y = 2;
         int z = x++ - ++y +1; // ++y => y = 3 => z = 1 - 3 + 1 = -1 => x++ => x = 2
         System.out.println(x);
         System.out.println(y);
         System.out.println(z);
    }

}