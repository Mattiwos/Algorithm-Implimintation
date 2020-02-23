package src;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Graphics.*;


public class Gui extends Canvas implements ActionListener{
    /**
     *
     */
    private static final long serialVersionUID = -6830645329870752524L;
    private String title;
    private int width;
    private int height;
    JMenuItem i1, i2, i3, i4, i5;  
    JMenu menu, sortmenu;
    JMenuBar mb;

    public Gui(String title, int widthx, int heightx) {
        JFrame frame = new JFrame(title);
        this.title = title;
        width = widthx;
        height = heightx;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        
       
        
        mb =new JMenuBar(); 
        menu = new JMenu("Menu");  
        sortmenu = new JMenu("Sorting Methods");
        
        i1=new JMenuItem("Bubble Sort");
        i1.addActionListener(this);  
        i2=new JMenuItem("Insertion Sort");  
        i2.addActionListener(this);  
        i3=new JMenuItem("Merge Sort");  
        i3.addActionListener(this);  
        i4=new JMenuItem("Quick Sort");  
        i4.addActionListener(this);  
        i5=new JMenuItem("Selection Sort");  
        i5.addActionListener(this);  
        sortmenu.add(i1); 
        sortmenu.add(i2); 
        sortmenu.add(i3);  
        sortmenu.add(i4);
        sortmenu.add(i5); 

        menu.add(sortmenu);
        mb.add(menu);  
        frame.setJMenuBar(mb); 

        frame.getContentPane().add(new Gui(width,height));

        frame.setVisible(true);
        
    }
    public Gui(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void actionPerformed(ActionEvent e) {   
        if(e.getSource()==i1)    
        System.out.println("Bubble Sort");
        if(e.getSource()==i2)    
        System.out.println("Insertion Sort");
        if(e.getSource()==i3)    
        System.out.println("Merge Sort");
        if(e.getSource()==i4)    
        System.out.println("Quick Sort");
        if(e.getSource()==i5)    
        System.out.println("Selection Sort");
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
   public void showoval(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.fillOval(20, 40, 30, 40);
   }

    public static void main (String arg[]){
        new Gui("Graph", 400,400);
        
       
      

    }
}