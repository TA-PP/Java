public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) throws Exception {
        int n = 10;
        Integer intObject = n;
        System.out.println("intObject = " + intObject);

        int m = intObject + 10;
        System.out.println("m = " + m);
    }
}
