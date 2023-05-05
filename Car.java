
   public class Car {
       int numberplate;
       String name;
       int year;

       public int lanemerging_en() {

           System.out.println("mirrors will show red light signal in mirrors if there is blindspot");
           return 1;
       }

       public int selfdriving_en() {
           System.out.println("self driving is enabled");
           return 1;
       }
       //public static void main(String[] args) {}
   }

   class Tesla extends Car {
           int plugin_enable = 1;

       //}
        public String merge(int blind_spot_en) {
           if(blind_spot_en ==0) {
               return "DONT MERGE";
           }
           else { return "LANE CLEAR";
           }
           //if(1) {
               //super.
         }
      // }
       public static void main(String[] args){
            //creatig object
        Tesla tesla= new Tesla();
        System.out.println("Lane merging_en = "+tesla.lanemerging_en());
        System.out.println("Plunging_en = "+tesla.plugin_enable);
               //methods from child class
                System.out.println("LANE_MERGE_OKAY  = "+tesla.merge(0));
                System.out.println("LANE_MERGE_OKay = "+tesla.merge(1));
                //method from parent class
                System.out.println("Plunging_en = "+tesla.selfdriving_en());

       }
   }