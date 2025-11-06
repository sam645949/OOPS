package DAY1HW.HW6;

public class HOMEWORK6 {
    public static void main(String[] args) {
    if (args.length == 0) {
        System.out.println("No values");
    } else {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i < args.length - 1) {
                System.out.print(",");
            }
        }
    }
}
}
