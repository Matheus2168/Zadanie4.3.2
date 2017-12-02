import java.awt.*;
import java.awt.event.KeyEvent;

public class Test {





    public static void main(String[] args) throws AWTException {

        Asker ask = new Asker();
        new KotWritter().start();
        System.out.println( ask.askForKot());







    }



}
