package cm.belrose.others;

public class OtherMain {
    public static void main(String[] args) {
        //Utilisation du Factory Method getPropertyInstance() pour creer une instance de Property
        //Utilisation du Factory Method getPropertyInstance() pour creer une instance de Property
        Property property= Property.getPropertyInstance("Residential","Apha");
        System.out.println("Property: "+ property);

    }
}
