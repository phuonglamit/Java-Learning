public class D07E07Ex5 {
    public static void main(String[] args) {
        /* 
         * Viết ct tính tổng s = 1! + 2! + ... + 10!
         */
        int sum = 0;
        int gt = 1;
        for(int i = 1; i <=10; i++){
            gt = gt*i;
            sum +=gt;

        }
        System.out.println(sum);
    }
    
}
