package Opdracht10_5;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Cijfers extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4, tekstvak5;
    String s, getal1, tekst1, getal2, tekst2, getal3, tekst3, getal4, tekst4, getal5, tekst5, tekst6;
    Double cijfer, begingetal, nummer1, nummer2, nummer3, nummer4, nummer5, gemiddelde;
    Button okKnop;

    public void init() {
        //Tekstvak1
        tekstvak1 = new TextField("Cijfer 1",5);
        Tekstvak1Listener tl1 = new Tekstvak1Listener();
        tekstvak1.addActionListener( tl1 );
        //Tekstvak2
        tekstvak2 = new TextField("Cijfer 2",5);
        Tekstvak2Listener tl2 = new Tekstvak2Listener();
        tekstvak2.addActionListener( tl2 );
        //tekstvak3
        tekstvak3 = new TextField("Cijfer 3",5);
        Tekstvak3Listener tl3 = new Tekstvak3Listener();
        tekstvak3.addActionListener( tl3 );
        //tekstvak4
        tekstvak4 = new TextField("Cijfer 4",5);
        Tekstvak4Listener tl4 = new Tekstvak4Listener();
        tekstvak4.addActionListener( tl4 );
        //tekstvak5
        tekstvak5 = new TextField("Cijfer 5",5);
        Tekstvak5Listener tl5 = new Tekstvak5Listener();
        tekstvak5.addActionListener( tl5 );
        //OkKnop
        okKnop = new Button("Ok");
        OkListener ol = new OkListener();
        okKnop.addActionListener( ol );

        getal1 = "";
        tekst1 = "";
        getal2 = "";
        tekst2 = "";
        getal3 = "";
        tekst3 = "";
        getal4 = "";
        tekst4 = "";
        getal5 = "";
        tekst5 = "";
        tekst6 = "";
        gemiddelde = 0.0;
        begingetal = 0.0;

        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);
        add(okKnop);

    }

    public void paint(Graphics g) {
        g.drawString("Cijfer 1: " + getal1,50,60);
        g.drawString(tekst1,120,60);
        g.drawString("Cijfer 2: " + getal2,50,80);
        g.drawString(tekst2,120,80);
        g.drawString("Cijfer 3: " + getal3,50,100);
        g.drawString(tekst3,120,100);
        g.drawString("Cijfer 4: " + getal4,50,120);
        g.drawString(tekst4,120,120);
        g.drawString("Cijfer 5: " + getal5,50,140);
        g.drawString(tekst5,120,140);
        g.drawString("Gemiddelde is: " + gemiddelde,50,160);
        g.drawString(tekst6,180,160);
    }

    class Tekstvak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            cijfer = Double.parseDouble(s);
            getal1 = s;
            tekstvak1.setText(String.valueOf(cijfer));


            if (cijfer >= 5.5 ) {
                tekst1 = "Voldoende";
            }
            else {
                tekst1 = "Onvoldoende";
            }
            repaint();

        }
    }

    class Tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            cijfer = Double.parseDouble(s);
            getal2 = s;
            tekstvak2.setText(String.valueOf(cijfer));

            if (cijfer >= 5.5 ) {
                tekst2 = "Voldoende";
            }
            else {
                tekst2 = "Onvoldoende";
            }
            repaint();

        }
    }

    class Tekstvak3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak3.getText();
            cijfer = Double.parseDouble(s);
            getal3 = s;
            tekstvak3.setText(String.valueOf(cijfer));


            if (cijfer >= 5.5 ) {
                tekst3 = "Voldoende";
            }
            else {
                tekst3 = "Onvoldoende";
            }
            repaint();

        }
    }

    class Tekstvak4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak4.getText();
            cijfer = Double.parseDouble(s);
            getal4 = s;
            tekstvak4.setText(String.valueOf(cijfer));


            if (cijfer >= 5.5 ) {
                tekst4 = "Voldoende";
            }
            else {
                tekst4 = "Onvoldoende";
            }
            repaint();

        }
    }

    class Tekstvak5Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak5.getText();
            cijfer = Double.parseDouble(s);
            getal5 = s;
            tekstvak5.setText(String.valueOf(cijfer));


            if (cijfer >= 5.5 ) {
                tekst5 = "Voldoende";
            }
            else {
                tekst5 = "Onvoldoende";
            }
            repaint();

        }
    }

    class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            s = tekstvak1.getText();
            nummer1 = Double.parseDouble(s);
            s = tekstvak2.getText();
            nummer2 = Double.parseDouble(s);
            s = tekstvak3.getText();
            nummer3 = Double.parseDouble(s);
            s = tekstvak4.getText();
            nummer4 = Double.parseDouble(s);
            s = tekstvak5.getText();
            nummer5 = Double.parseDouble(s);
            gemiddelde = (nummer1 + nummer2 + nummer3 + nummer4 + nummer5) / 5;

            if (gemiddelde >= 5.5 ) {
                tekst6 = "Voldoende";
            }
            else {
                tekst6 = "Onvoldoende";
            }
            repaint();
        }
    }
}
