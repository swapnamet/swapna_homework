public class Maxnumofarray {
    //int max=input[0];
    public int findmax(int[] input){
        int max=input[0];
    for(int i=0;i<input.length;i++){
        if(input[i]>max){
            max=input[i];
        }
    }
    return max;

}
        public static  void main(String[] args){
        int result;
        Maxnumofarray m=new Maxnumofarray();
        int[] i1={20,80,56,92,43};
        result=m.findmax(i1);
        System.out.println("max num of array is="+result);

    }
}

