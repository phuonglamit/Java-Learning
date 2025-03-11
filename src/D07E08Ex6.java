public class D07E08Ex6 {
    public static void main(String[] args) {
        /*
         * Số hoàn hảo là số, tổng các ước thực bằng chính nó
         * 6 = 1 + 2 +3 (6)
         * tìm tất cả số hoàn thiện từ 1 - 1000
         */
        int n;
        
        for( n = 1; n <= 1000; n++){
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
    
                }

        }
        if (sum == n) {
            System.out.println(n + " là số hoàn hảo");

        } 
        
        }
       
    }

}
