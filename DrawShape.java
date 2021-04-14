import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
import javax.swing.JColorChooser;
/**
 * Write a description of class DrawShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawShape
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class LineDrawer
     */
    public DrawShape()
    {
        // initialise instance variables
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void doMouse(String action, double x, double y) {
      final int SIZE = 50;
        // put your code here
        if (action.equals("clicked")) {
            UI.fillOval(x, y, 50, 50);
      }
    
   }
   
   /**
    * Make a random colour
    */
   private void changeColor(){
       Color col = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
       UI.setColor(col);
    }
   
   /**
     * Main routine
     */
    public static void main(String[] args){
        DrawShape obj = new DrawShape();
        UI.addButton("Change Color", obj::changeColor);
        UI.setMouseListener(obj::doMouse);
    }
}