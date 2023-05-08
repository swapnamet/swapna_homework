public class Calculationoverloading {
    int x,y;
            float z,v;
    public int add(int x,int y) {
        return x + y;
    }
     public float add(int x,int y,float z){
     return x+y+z;
    }
    public float add(float z,float v){
        return  z+v;
    }
    public static void main(String[] args){
        Calculationoverloading co=new Calculationoverloading();
         System.out.println(co.add(20,40));
         System.out.println(co.add(15 ,30,10.5f));
         System.out.println(co.add(3.5f,4.6f));

    }
}