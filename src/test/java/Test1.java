import org.junit.*;
import static org.junit.Assert.*;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Test1 {

    final static Logger log = Logger.getLogger(Test1.class.getName());
    Singleton sing;


    @Before
    public void initialSet(){
        this.sing = Singleton.getInstance();
    }

    @After
    public void  afterSet(){
        sing.getInstance().reset();
    }           // Perque utilitza Sing i no this.Sing ??


    @Test
    public void idiomasVacios(){
        int idiomasLength = sing.idiomas.size();
        assertEquals(0, idiomasLength);

    }


    @Test
    public void languageInCache(){
        String language = "ca";
        String t1 = "t1";

        assertFalse(sing.hasLanguage(language));            // Inicialmente no tiene el language agregado en sing.idiomas (caché)
        assertEquals("Hola", sing.getText(language, t1));
        assertTrue(sing.hasLanguage(language));

    }





}
