public class Even_ele_arr{
    int cnt_even=0;
    int cnt_odd=0;
    int[] i1={4,10,8,5,9,11,13};

    //int[] i2={5,6,7,8,9};

    public void get_cnt_odd_even(int[] i1) {

        for(int i=0;i<i1.length;i++){

            if(i1[i]%2==0) {
                cnt_even += 1;
            }
            //return cnt_even;

        }

    }
    public void get_cnt_odd(int[] i1) {

        for(int i=0;i<i1.length;i++){

            if(i1[i]%2!=0) {
                cnt_odd += 1;
            }
            //return cnt_odd;
        }
        //return cnt_odd;
    }


    public static void main(String[] args){


        Even_ele_arr iseven_obj=new Even_ele_arr();

        iseven_obj.get_cnt_odd_even(iseven_obj.i1);
        iseven_obj.get_cnt_odd(iseven_obj.i1);

        System.out.println("count of even numbers is="+iseven_obj.cnt_even);
        System.out.println("count of odd numbers is="+iseven_obj.cnt_odd);

    }




}



