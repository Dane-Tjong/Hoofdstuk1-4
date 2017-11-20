import java.awt.*;
import java.applet.*;

public class gewicht extends Applet {

    public void init() {
    }

    /*gewicht y as 20x 1*/

    public void paint(Graphics g) {
        setBackground(Color.lightGray);

        /*graph box*/
        g.drawRect(50,50,450,300);



        /*metric line*/
            /*vertical*/
        g.drawLine(100,90,100,300);

            /*horizontal*/
        g.drawLine(100,300,400,300);
            /*weight lines*/
                                /*weight line*/
                            g.drawString("gewicht in kilogram",55,70);

                /*100kg*/
        g.setColor(Color.black);
        g.drawLine(100,100,400,100);
        g.drawLine(100,100,80,100);
        g.drawString("100",55,105);
                /*80kg*/
        g.setColor(Color.black);
        g.drawLine(100,140,400,140);
        g.drawLine(100,140,80,140);
        g.drawString("80",55,145);
                /*60kg*/
        g.setColor(Color.black);
        g.drawLine(100,180,400,180);
        g.drawLine(100,180,80,180);
        g.drawString("60",55,185);
                /*40kg*/
        g.setColor(Color.black);
        g.drawLine(100,220,400,220);
        g.drawLine(100,220,80,220);
        g.drawString("40",55,225);
                /*20g*/
        g.setColor(Color.black);
        g.drawLine(100,260,400,260);
        g.drawLine(100,260,80,260);
        g.drawString("20",55,265);


        /*names*/

            /*Valerie (40kg)*/
        g.setColor(Color.red);
        g.drawString("Valerie",150,320);
            /*jeroen (100kg)*/
        g.setColor(Color.blue);
        g.drawString("Jeroen",250,320);
            /*hans (80kg)*/
        g.setColor(Color.yellow);
        g.drawString("Hans",350,320);

        /*boxes*/
            /*Valerie*/
        g.setColor(Color.red);
        g.drawRect(150,300,25,-80);
            /*Jeroen*/
        g.setColor(Color.blue);
        g.drawRect(250,300,25,-200);
            /*Hans*/
        g.setColor(Color.yellow);
        g.drawRect(350,300,25,-160);




    }
}