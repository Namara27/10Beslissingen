package Praktijkopdracht;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Beoordelen extends Applet {
    TextField tekstvak;
    String s, tekst;
    Double cijfer;

    public void init() {
        tekstvak = new TextField("",10);
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener(tl);
        tekst = "";
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Double.parseDouble(s);

            if (cijfer <= 3) {
                tekst = "Slecht";
            }
            else if (cijfer == 4) {
                tekst = "Onvoldoende";
            }
            else if (cijfer == 5) {
                tekst = "Matig";
            }
            else if (cijfer == 6) {
                tekst = "Voldoende";
            }
            else if (cijfer == 7) {
                tekst = "Voldoende";
            }
            else if (cijfer == 8) {
                tekst = "Goed";
            }
            else if (cijfer == 9) {
                tekst = "Goed";
            }
            else if (cijfer == 10) {
                tekst = "Goed";
            }
            else {
                tekst = "Ongeldig cijfer";
            }
            repaint();

        }
    }
}
