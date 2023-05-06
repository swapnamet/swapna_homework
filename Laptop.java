import javax.crypto.Mac;
import java.util.Objects;
public class Laptop {
    int modelno;
    int inches;
    String processor;
    String name;

    //constructor with two parameters
    Laptop(int model, String ssss) {
        //modelno = model;
        //System.out.println("constructor called");
        System.out.println("11constructer called =" + model + "   " + ssss);
        System.out.println("22constructer called =" + modelno + "   " + name);
    }

    public boolean eqauls(Object Macbook) {
        Laptop laptop = (Laptop) Macbook;
        return (this.inches == ((Laptop) Macbook).modelno && this.name == ((Laptop) Macbook).name && this.processor == ((Laptop) Macbook).processor);


    }

    public int hashcode() {
        return Objects.hash(inches, name, processor);
    }

    public void touchpad() {
        System.out.println("Touchscreen enabled");
    }

    public void bluetooth() {
        System.out.println("blueetooth  feature available");
    }

    public static void main(String args[]) {
        Laptop delllaptop = new Laptop(1232567, "dell");
        delllaptop.inches = 16;
        delllaptop.modelno = 2376;
        delllaptop.processor = "intel";

        delllaptop.bluetooth();
        Laptop Macbook = new Laptop(23446, "Mac");
        Macbook.inches = 19;
        Macbook.bluetooth();
        Macbook.modelno = 4535;
        Macbook.processor = "ios";
        Macbook.touchpad();
        System.out.println(delllaptop.inches + "   " + Macbook.inches + "\n" + delllaptop.modelno + "  " + Macbook.modelno + "\n" + delllaptop.processor + "   " + Macbook.processor);
        System.out.println(delllaptop.eqauls(Macbook));
        System.out.println(delllaptop.hashcode());
        System.out.println(Macbook.hashcode());

    }
}
