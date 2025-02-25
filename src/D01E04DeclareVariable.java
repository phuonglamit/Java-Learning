public class D01E04DeclareVariable {
    public static void main(String[] args) {
        // Declare variable (Khai bao bien)
        int number;
        float numberPointing;

        // Declare multiple variables (Khai bao nhieu bien)
        int x, y, z;

        // Initialize a variable (Khoi tao bien)
        int age = 10;
        float score = 8.06f;
        double scoreSum = 46.09;
        System.out.println(age);
        // assign age = 15 (gan gia tri cho bien)
        age = 15;
        System.out.println(age);

        // constant > add final before data type // Data type name should be uppercase
        // (Hang so)
        final int NUOCSOI = 100;
        // constant can't be assigned >> Can't like this => NUOCSOI = 300;

    }
}