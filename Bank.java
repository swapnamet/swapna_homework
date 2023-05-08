public class Bank {
    public void  rateofintrest() {
        System.out.println("intrest rate is zero");
        //return 0;
    }
}
     class SBI extends Bank{
       public void  rateofintrest() {
           System.out.println("rate of intrest is 4 percent");
       }
        }

     class AXIS extends Bank {
        public void rateofintrest() {//overriding method
            System.out.println("rate of intrset is 8 percent");
            super.rateofintrest();
        }

        public static void main(String[] args) {
            AXIS obj = new AXIS();
            SBI obj2=new SBI();
            //Bank obj1 = new Bank();
            obj.rateofintrest();
            obj2.rateofintrest();;

            //super.rateofintrest();
        }
    }
//}
