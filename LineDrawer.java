import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
import javax.swing.JColorChooser;
/**
 * Write a description of class LineDrawer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LineDrawer
{
    // fields
    private double startX, startY; // fields to remember the "pressed" position
    private Color currentColor = Color.black;

    /**
     * Constructor for objects of class LineDrawer
     */
    public LineDrawer()
    {
        // initialise instance variables
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }

    
    /**
     * Colour Chooser
     */
    
    public void doChooseColour() {
        this.currentColor = JColorChooser.showDialog(null, "Choose Colour", this.currentColor);
        UI.setColor(this.currentColor);
        
    }
    
    
    
    /**
     * Mouse actioner
     */
    public void doMouse(String action, double x, double y) {
        if (action.equals("pressed")) {
            this.startX = x;
            this.startY = y;
        // put your code here
        
       } else if (action.equals("released")) {
           UI.drawLine(this.startX, this.startY, x, y);
        }
    }
    
    /**
     * Main routine
     */
    public static void main(String[] args){
        LineDrawer obj = new LineDrawer();
        UI.setLineWidth(10);
        UI.setMouseListener(obj::doMouse);
        UI.addButton("Color", obj::doChooseColour);
    }
}
