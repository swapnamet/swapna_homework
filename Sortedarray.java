
   public class Sortedarray {

       int[] arr1 = {10, 20, 30, 40, 50};
       int[] arr2 = {50, 40, 30, 60, 70};
       int temp = arr1[0];
       boolean sorted_yes;//ue;


       public boolean issorted(int[] arr1) {


           for (int i = 1; i < arr1.length; i++) {
               // System.out.println("my debug000 ="+arr1[i]);
               if (temp < arr1[i]) {
                   temp = arr1[i];
                   sorted_yes = true;
                   // System.out.println("my debug0 ="+sorted_yes);
               } else {
                   // sorted_yes = false;
                   // System.out.println("my debug1  ="+sorted_yes);
                   return false;
               }
               //  System.out.println("my debug2 ="+sorted_yes);
           }
           //  System.out.println("my debug ="+sorted_yes);

            return true;

       }

       public static void main(String[] args) {
           boolean my_result;

           Sortedarray sr = new Sortedarray();
           my_result = sr.issorted(sr.arr1);
           System.out.println("is arr1 sorted=" + my_result);

           my_result = sr.issorted(sr.arr2);
           System.out.println("is arr2 sorted=" + my_result);

       }
   }
