import java.util.Arrays;
    public class Numgrt_thanten {
        int numgrtthanten = 0;
        int[] i1 = {12, 10, 8, 66, 9, 11, 657, 45, 7, 13};
        int[] grt10 = new int[10];

        public int get_grtthan_10(int[] i1) {

            for (int i = 0; i < i1.length; i++) {

                if (i1[i] > 10) {

                    grt10[i] = i1[i];
                    numgrtthanten += 1;
                }
            }
            return numgrtthanten;
        }

        public static void main(String[] args) {
            int Greaternumbers;
            Numgrt_thanten N1 = new Numgrt_thanten();
            Greaternumbers = N1.get_grtthan_10(N1.i1);
            System.out.println("greater than 10 numbers in array are" + Greaternumbers);
        }
    }






