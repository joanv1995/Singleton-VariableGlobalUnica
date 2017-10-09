
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Scanner;
import java.util.ResourceBundle;
public class main {


    public static void  main(String[] args)
    {
        /*Singleton.getInstance().AddIdiom("ca");
        Singleton.getInstance().AddIdiom("en");
        Singleton.getInstance().AddIdiom("es");
        Singleton.getInstance().AddIdiom("it");*/
        System.out.println("En que idioma quieres la palabra? (Escribe las dos primeras letras del idioma)");
        String idioma;
        Scanner s = new Scanner(System.in);
        idioma= s.nextLine();
        System.out.println(("\nEscribe t1, t2, t3 o t4 para escoger la palabra"));
        String p;
        p=s.nextLine();
        String palabra=Singleton.getInstance().getText(idioma,p);

        System.out.println("\nLa palabra es '"+palabra+"'");

    }
}
