package src;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Graphics.*;


public class Gui extends Canvas{
    /**
     *
     */
    private static final long serialVersionUID = -6830645329870752524L;
    private String title;
    private int width;
    private int height;


    public Gui(String title, int widthx, int heightx) {
        JFrame frame = new JFrame(title);
        this.title = title;
        width = widthx;
        height = heightx;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        
        frame.getContentPane().add(new Gui(width,height));
        frame.setVisible(true);
        
    }
    public Gui(int width, int height){
        this.width = width;
        this.height = height;
    }

   public void paint(Graphics g) {
        
        
        splitgraph(g,width,height,20);
        // Color black = new Color(255,255,255);
        //g2.drawLine(10, 20, 20, 30);
        
        // g.setColor(Color.BLACK);
        // g.fillRect(20, 20, 1, 1);
        
        
        g.dispose();
   }
   public void splitgraph(Graphics g, int width, int height, int div){
        Graphics2D g2 = (Graphics2D) g;
       
        for (int i = 0; i<div; i++){
         //g2.drawLine(x1, y1, x2, y2);
             g2.drawLine((width/div) * i, 0, 0+(width/div) * i,height);
     
        }  
        for (int i = 0; i<div; i++){
            //g2.drawLine(x1, y1, x2, y2);
                g2.drawLine(0, (height/div) * i, width,(height/div) * i);
        
           }  
        
   }

    public static void main (String arg[]){
        new Gui("Graph", 400,400);
        
       
      

    }
}