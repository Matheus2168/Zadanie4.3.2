import java.awt.*;
import java.awt.event.KeyEvent;

public class KotWritter extends Thread {



    public synchronized void run(){


        try {
            Robot LeftHand = new Robot();
            Robot RightHand = new Robot();

                    LeftHand.keyPress(KeyEvent.VK_CONTROL); //Przelaczenie sie IntelliJ'a na okno 4:Run
                RightHand.keyPress(KeyEvent.VK_TAB);        //zeby tekst wpisany byl w konsole, a nie w oknie kodu apki
                    LeftHand.delay(1000);
                RightHand.keyPress(KeyEvent.VK_4);
                    LeftHand.keyRelease(KeyEvent.VK_CONTROL);

                LeftHand.keyPress(KeyEvent.VK_SHIFT);   //Kot miał być wielkimi literami
                LeftHand.delay(1000);
            RightHand.keyPress(KeyEvent.VK_K);         //Wpisanie KOTa
            RightHand.keyPress(KeyEvent.VK_O);
            RightHand.keyPress(KeyEvent.VK_T);
                LeftHand.keyRelease(KeyEvent.VK_SHIFT);
            RightHand.keyPress(KeyEvent.VK_ENTER);



        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
