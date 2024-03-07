public class Ex2_8 {

    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("x="+x); // x=10
        System.out.println("y="+y); // y=5

        int tmp = x; // tmp = 10
        x = y; // x = 5
        y = tmp; // y = 10
        System.out.println("x="+x); // x=5
        System.out.println("y="+y);// y=10
    }
}
