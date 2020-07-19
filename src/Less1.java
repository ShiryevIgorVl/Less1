public class Less1 {
    public static void main (String[] args) {
        byte a = 127;
        short d = -32700;
        int c = 125453;
        long b = 123456789777777L;
        float e = 1.15f;
        double f = 154.1546;
        char i = 'l';
        boolean g = true;
    }
    public static float expression (float a, float b, float c, float d) {

        return a * (b + (c/ d));
    }

    public static boolean bool (int a, int b){
        return (a + b) >= 10 && (a + b) <= 20;
    }
    public static void posNeg (int a) {
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean poset (int a){
        return a >= 0;
    }
    public static void printName (String Name) {
        System.out.println("Привет, " + Name);
    }
    public static void leapYear (int Year) {
        if (Year % 4 == 0 && Year % 100 != 0 && Year % 400 == 0) {
            System.out.println(Year + " високосный год");
        } else {
            System.out.println(Year + " год обыкновеный");
            System.out.println(Year + " гад обыкновеный");
            System.out.println(Year + " гид обыкновеный");
            System.out.println(Year + " гуд обыкновеный");
        }
    }
}
