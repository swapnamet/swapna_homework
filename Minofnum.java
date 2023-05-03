
public class Minofnum {
//    int min = input[0];
    //method
    public int getminelement(int[] input){
        int min=input[0];
    for(int i = 1;i<input.length;i++)

    {
        if (input[i] < min) {
            min = input[i];
        }
    }
        return min;
}

    public static void main(String[] args) {
        Minofnum m = new Minofnum();
        int[] i = {12, 4, 1, 19, 20};
        System.out.println("min element is="+m.getminelement(i));
    }





}