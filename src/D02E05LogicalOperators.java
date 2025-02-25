public class D02E05LogicalOperators {
    public static void main(String[] args) {

        // Logical AND (&&): Returns true if both conditions are true. Otherwise, it
        // returns false.
        int i = 7;
        System.out.println(i < 10 && 1 > 0);

        // Logical OR (||): Returns true if at least one of the conditions is true. If both are false, it returns false.
        System.out.println(i<-1 || i < 10);

        //Logical NOT (!): Reverses the logical state of its operand. If the condition is true, it returns false, and vice versa.
        System.out.println(!(i<-1 || i < 10));
    }
}
