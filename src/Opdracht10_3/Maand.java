package Opdracht10_3;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Maand extends Applet {
    TextField tekstvak;
    String s, s1, tekst, tekst2;
    int maand, dag;

    public void init() {
        tekstvak = new TextField("");
        TekstvakListener tl = new TekstvakListener();
        tekstvak.addActionListener( tl );
        tekst = "";
        tekst2 = "";
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("Maand: " + tekst,50,60);
        g.drawString("Aantal dagen in de maand: " + tekst2,50,80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch(dag) {
                case 1:
                    tekst2 = "31";
                    break;
                case 2:
                    tekst2 = "28";
                    break;
                case 3:
                    tekst2 = "31";
                    break;
                case 4:
                    tekst2 = "30";
                    break;
                case 5:
                    tekst2 = "31";
                    break;
                case 6:
                    tekst2 = "30";
                    break;
                case 7:
                    tekst2 = "31";
                    break;
                case 8:
                    tekst2 = "31";
                    break;
                case 9:
                    tekst2 = "30";
                    break;
                case 10:
                    tekst2 = "31";
                    break;
                case 11:
                    tekst2 = "30";
                    break;
                case 12:
                    tekst2 = "31";
                    break;
                default:
                    tekst2 = "Geef een geldige maand";
                    break;
            }
            s1 = tekstvak.getText();
            maand = Integer.parseInt(s1);
            switch (maand){
                case 1:
                    tekst = "Januari";
                    break;
                case 2:
                    tekst = "Februari";
                    break;
                case 3:
                    tekst = "Maart";
                    break;
                case 4:
                    tekst = "April";
                    break;
                case 5:
                    tekst = "Mei";
                    break;
                case 6:
                    tekst = "Juni";
                    break;
                case 7:
                    tekst = "Juli";
                    break;
                case 8:
                    tekst = "Augustus";
                    break;
                case 9:
                    tekst = "September";
                    break;
                case 10:
                    tekst = "Oktober";
                    break;
                case 11:
                    tekst = "November";
                    break;
                case 12:
                    tekst = "December";
                    break;
                default:
                    tekst = "Geef een geldige maand";
                    break;
            }
            repaint();


        }
    }
}
