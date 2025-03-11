public class D07E01For {
    /* 
     * for ( Khởi tạo ; Điều kiện ; Bước lặp) {
     * <Khối lệnh> 
     * }
     */
    public static void main(String[] args) {
        int i;
        for (i = 0 ; i <= 20; i+=2){
            System.out.println("i = "+ i);
        }
        for (i = 20 ; i >= 0 ; i -=2) {
            System.out.println("i = " + i);
        }
    }
    
}
