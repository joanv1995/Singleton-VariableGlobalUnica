import java.util.Enumeration;
import java.util.ResourceBundle;


public abstract class MyResources {


    public static void main(String[] args) {
        ResourceBundle ca = ResourceBundle.getBundle("i18n.ca");
        ResourceBundle es = ResourceBundle.getBundle("i18n.es");
        ResourceBundle en = ResourceBundle.getBundle("i18n.en");

        System.out.println(ca.getString("t1"));
    }



}
