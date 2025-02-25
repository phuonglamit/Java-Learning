public class D02E01TypeCasting {
    public static void main (String[] args) throws Exception {
        int a = 5;
        int b = 10;
        System.out.println(a/b); // 5/10 = 0.5 >> int >> result will print 0
        System.out.println((double)a/b); // 5/10 = 0.5 >> double >> result will print 0.5

        int x = 15;
        byte y = (byte)x;
        System.out.println(y);

        int a1 = 128;
        byte a2 = (byte)a1; // Wrong > Result is incorrct due to bype only has max value = 127 (overflow)
        System.out.println(a2); 
    }

    
}
