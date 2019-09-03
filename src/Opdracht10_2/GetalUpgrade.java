package Opdracht10_2;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GetalUpgrade extends Applet {
    TextField tekstvak;
    int begingetal, getal;
    String grootsteGetal, kleinsteGetal, leeg;

    public void init() {
        tekstvak = new TextField("",5);
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener( tl );
        grootsteGetal = "";
        kleinsteGetal = "";
        begingetal = 0;
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(grootsteGetal,50,45);
        g.drawString(kleinsteGetal,50,65 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt( s );
            if ( getal > begingetal ) {
                grootsteGetal = s;
                begingetal = getal;
            }
            else if ( getal < begingetal ) {
                kleinsteGetal = s;
                begingetal = getal;
            }
            else {
                leeg ="";
            }
            repaint();

        }
    }

}
