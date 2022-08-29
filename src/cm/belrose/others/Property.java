package cm.belrose.others;

import java.util.function.BiFunction;

public class Property {
   private String propertyType;
   private String projectName;

   //Contructor with private access modificator
    //Impossible de creer une instace directe de cet objet avec new Property.....
    //Pour cela il faut utiliser le Factory Method Pattern et le Singleton Pattern
    private Property(String propertyType, String projectName) {
        this.propertyType = propertyType;
        this.projectName = projectName;
    }

    //Pour invoker ce constructeur, il faut créer une methode statique qui va retourner une instance de Property
    public static Property getPropertyInstance(String propertyType, String projectName){
        return new Property(propertyType,projectName);
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
