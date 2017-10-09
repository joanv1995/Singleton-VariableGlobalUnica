import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.io.File;
public class Singleton {


    private static   Singleton instance;

    Map<String, ResourceBundle> idiomas;
    ResourceBundle ca;
    ResourceBundle es;
    ResourceBundle en;

    private Singleton(){
        this.idiomas=new HashMap();





    }
   /* public void addIdiom(String x){
        ResourceBundle b;

        try{idiomas.put(x,ResourceBundle.getBundle("i18n."+x));}
        catch(Exception er){
            System.err.println(er.getMessage());
        }
    }*/



    public static Singleton getInstance(){
        if(instance ==null)
        {
            instance = new Singleton();
        }
        return  instance;
    }


    public String getText(String language, String key) {

        String ret = null;
        ResourceBundle s;
        s=idiomas.get(language);
        try{
            if (s==null) {
                s = ResourceBundle.getBundle("i18n." + language);
                idiomas.put(language, s);
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
            }

        ret = s.getString(key);

        return ret;



    }
}
