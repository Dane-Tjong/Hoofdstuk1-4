import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.setColor(Color.black);

        /*box house*/
        g.drawRect(100,160,200,220);
        g.drawRect(99,159,202,222);

        /*house fundation*/
        g.fillRect(84,381,232,15);

       /*rooftop*/
            /*left part*/
        g.drawLine(99,159,200,80);
        g.drawLine(99,158,200,79);

            /*right part*/
        g.drawLine(200,80,301,161);
        g.drawLine(200,79,301,160);



        /*window top floor*/
            /*box*/
        g.drawRect(120,180,55,40);
        g.drawRect(119,179,57,42);
            /*horizontal stripe*/
        g.drawLine(120,207,175,207);
        g.drawLine(120,208,175,208);
            /*vertical stripe*/
        g.drawLine(148,207,148,220);

        /*window bottem floor*/
            /*box*/
        g.drawRect(120,280,55,40);
        g.drawRect(119,279,57,42);
            /*horizontal stripe*/
        g.drawLine(120,307,175,307);
        g.drawLine(120,308,175,308);
            /*vertical stripe*/
        g.drawLine(148,307,148,320);


        /*door*/
            /*doorframe*/
        g.drawRect(240,320,30,55);
        g.drawRect(239,319,32,57);
            /*doorknob*/
        g.drawArc(243,345,3,3,0,360);





        /**/

    }
}

