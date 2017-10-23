
import org.apache.log4j.Logger;
import java.util.Scanner;


public class main {

    final static Logger log = Logger.getLogger(main.class);

    public static void  main(String[] args)
    {
        org.apache.log4j.BasicConfigurator.configure();
        String idiom;
        String p;

        /*Singleton.getInstance().AddIdiom("ca");
        Singleton.getInstance().AddIdiom("en");
        Singleton.getInstance().AddIdiom("es");
        Singleton.getInstance().AddIdiom("it");*/



        log.info("En que idioma quieres la palabra? (Escribe idioma: ca, es, en, it, ge)");
        Scanner input = new Scanner(System.in);
        idiom = input.nextLine();
        log.info("Escribe t1, t2, t3 o t4 para escoger la palabra");
        p = input.nextLine();
        String palabra = Singleton.getInstance().getText(idiom , p);

        log.info("La palabra es: " + palabra + ".");



    }
}
