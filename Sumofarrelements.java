public class Sumofarrelements {

        int[] i1={3,4,6,7};//20

        int[] i2={5,6,7,8,9};//35

        public int Addarray(int[] i1, int[] i2) {

            int sum1=i1[0];
            int sum2=i2[0];
            int sum;

            for(int i=0;i<i1.length;i++){
                sum1+=i1[i];
            }

            for(int i=0;i<i2.length;i++){
                sum2+=i2[i];
            }
            sum=sum1+sum2;
            System.out.println("sum="+sum);
            return sum;
        }
        public static void main(String[] args){

            int addioftwoarrays;
            Sumofarrelements sumarr=new Sumofarrelements();
            addioftwoarrays= sumarr.Addarray(sumarr.i1,sumarr.i2);
            System.out.println("Addition of two array elements="+addioftwoarrays);

        }
    }










