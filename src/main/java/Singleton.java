import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

public class Singleton {

    Logger log = Logger.getLogger(Singleton.class);

    private static Singleton instance;

    Map <String, ResourceBundle> idiomas;
    ResourceBundle ca, es, en, it, ge;

    private Singleton(){
        this.idiomas = new HashMap();
    }


   /* public void addIdiom(String x){
        ResourceBundle b;

        try{idiomas.put(x,ResourceBundle.getBundle("i18n."+x));}
        catch(Exception er){
            System.err.println(er.getMessage());
        }
    }*/


    public static Singleton getInstance(){                 // Tiene que ser estático ??
        if(instance == null) {
            instance = new Singleton();
            //log.info("Se ha instanciado el Singleton por primera vez.");
        }
        return  instance;
    }


    public String getText(String language, String key) {

        String ret = null;
        ResourceBundle s;
        s = idiomas.get(language);
        try{
            if (s == null) {
                s = ResourceBundle.getBundle("i18n." + language);       // Guarda_todo el fichero "ca" con path i18n.ca en el parametro "s".
                idiomas.put(language, s);                               // Se añade al Hashmap el language (ca) con las 4 palabras.
                log.info("Se ha añadido el idioma: " + language + " en la caché idiomas.");
            }
        }
        catch(Exception e){
            log.fatal(e.getMessage());
            }

        ret = s.getString(key);             // Busca en "s" el Value(palabra) de la key (t1,t2,t3,t4).

        return ret;



    }

    public void reset() {
        this.instance = null;
    }

    public boolean hasLanguage(String language) {
        return (this.idiomas.get(language) != null);

    }
}
