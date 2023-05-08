public class Multiply {
    public int multiply(int a,int b){
      return a*b;
    }

public float multiply(int c,float d,int e){
    return c*d*e;
    }
public  float multiply(float f,float g){
    return f*g;
    }
    public static void main(String[] args){
        Multiply obj=new Multiply();
        System.out.println(obj.multiply(3,6));
        System.out.println(obj.multiply(6,2.7f,8));
        System.out.println(obj.multiply(2.5f,5.6f));
    }
}
