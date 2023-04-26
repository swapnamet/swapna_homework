// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Bicycle {
    int gear=5;
    //method of class
    public void braking(){
        System.out.println(" the brake is working");
    }
    public static void main(String[] args) {
          Bicycle sportsBicycle = new Bicycle();
       System.out.println("Bicycle gear is on "+sportsBicycle.gear);
          sportsBicycle.braking();

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        //for (int i = 1; i <= 5; i++) {
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
           // System.out.println("i = " + i);
        }
    }