package Part1;
import TurtleGraphics.*;
import BreezySwing.*;

public class ObjectExample {

   
    public static void main(String[] args) {
       StandardPen p1 = new StandardPen();
       
       /*
       
       */
       
       
       
       
      p1.move(25);
      p1.move(-30,50);
      
      /*
      p1. -> brings up a list of methods 
      some methods are found directly in pen
      others are INHERITED from "Class of all classes " -> objects
      //examples -> toString, hashCode, compareTo
      */
      
      SketchPadWindow w = new SketchPadWindow (500,500);
      WigglePen wp = new WigglePen(w);
      RainbowPen rp = new RainbowPen(w);
      /*
      it is common to have more than 1 way to make an object 
      can make a pen with a custom window or default window 
      */
      wp.move(200);
      rp.setDirection(145);
      rp.move(100);
      
      /*
      even thought wp and rp are differny types of pens 
      they respond to the same commands as pl
      since all 3 pen have the "pen" class are their parents 
      pen is where most of these methods are defined and the 3 
      achual pens inherit these methods 
      */
    }
    
}
