/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;


import static java.awt.Color.BLACK;
import java.util.Arrays;


/**
 *
 * @author Dimitrios
 */
public class Chemin extends AbstrChemin{
//    Arrive a = new Arrive();
//    Depart d = new Depart();
    int xPoints[]={1,10,4,25,5,30};
    int yPoints[]={1,20,12,36,8,24};
    int nPoints=6;
    
    public Chemin (){
//        FIND WAY TO PRINT ARRAY ON STRING
//    String x[] = ByteArrayStream();

String y=yPoints.toString();
        gr.drawPolyline(xPoints, yPoints, nPoints);
        gr.setColor(BLACK);
System.out.println("xPointsArray: " + java.util.Arrays.toString(xPoints) + " ,yPointsArray: " + y + " ,nPoints: " + nPoints);
    }

    public int[] getxPoints() {
        return xPoints;
    }

    public void setxPoints(int[] xPoints) {
        this.xPoints = xPoints;
    }

    public int[] getyPoints() {
        return yPoints;
    }

    public void setyPoints(int[] yPoints) {
        this.yPoints = yPoints;
    }

    public int getnPoints() {
        return nPoints;
    }

    public void setnPoints(int nPoints) {
        this.nPoints = nPoints;
    }
}
