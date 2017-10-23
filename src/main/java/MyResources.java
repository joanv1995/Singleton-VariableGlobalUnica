import java.util.Enumeration;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;


public abstract class MyResources {

    final static Logger log = Logger.getLogger(MyResources.class.getName());

    public static void main(String[] args) {
        ResourceBundle ca = ResourceBundle.getBundle("i18n.ca");
        ResourceBundle es = ResourceBundle.getBundle("i18n.es");
        ResourceBundle en = ResourceBundle.getBundle("i18n.en");

        log.info(ca.getString("t1"));
    }



}
