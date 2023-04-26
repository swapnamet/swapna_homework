// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exception {

    static void div(int num1, int num3) {
        //result=num1/num3;
        try {
            System.out.println(num1/num3);
        } catch(ArithmeticException e) {
            System.out.println("cannot be divided by zero");
        }
    }
    public static void main(String[] args) {
        int num1 = 30, num2 = 0, num3=5,result;
        //System.out.println(5/0);
        div(100,5);
        div(2,0);
        div(2,2);
    }
}
