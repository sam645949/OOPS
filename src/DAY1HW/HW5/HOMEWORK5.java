package DAY1HW.HW5;

public class HOMEWORK5 {
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        System.out.println("Given num is "+num);
        if(num % 2 == 0){
            System.out.println("Given num is a EVEN number");
        } else {
            System.out.println("Given num is an ODD number");
        }
    }
}
