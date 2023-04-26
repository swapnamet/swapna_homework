public class Calculator {
    int x, y,result;
    int a,b;
    public int Sub(){
        result=x-y;
        System.out.println("x-y=+result ");
        return result;
    }
    public int mul() {
        result = x * y;
        System.out.println("x*y=+result ");
        return result;
    }
    public int div(){
        result=a/b;
        System.out.println("a/b=+result");
        return result;
    }

    public static void main(String[] args) {
        Calculator mycalc = new Calculator();
        //mycalc.x=30;
        //mycalc.y=20;
        //mycalc.Sub();
        //int CalculationResult  = mycalc.Sub();

       // System.out.println("result =======" +CalculationResult);
        ///////////////////////////

        mycalc.x=10;
        mycalc.y=40;
        mycalc.mul();
        int CalculationResult1  = mycalc.mul();

        System.out.println("result =======" +CalculationResult1);
        mycalc.a=60;
        mycalc.b=20;
        mycalc.div();
        int CalculationResult2  = mycalc.div();
        System.out.println("result =======" +CalculationResult2);


    }


}
