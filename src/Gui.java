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
    public int x = 0;
    JMenuItem i1, i2, i3, i4, i5, e1,e2,e3,e4,o;  
    JMenu menu, sortmenu, pathfindingmenu;
    JMenuBar mb;
    JFrame frame;

    public Gui(String title, int widthx, int heightx) {
        frame = new JFrame(title);
        this.title = title;
        width = widthx;
        height = heightx;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        mb =new JMenuBar(); 
        menu = new JMenu("Menu");  
        mb.setLayout(null);
        JLabel author = new JLabel("By Mattiwos");
        sortMenu();
        pathfindingMenu();
        menu.add(sortmenu);
        menu.add(pathfindingmenu);

        mb.add(menu);
        mb.add(author);  
        
        frame.setJMenuBar(mb); 

        frame.getContentPane().add(new Gui(width,height));

        frame.setVisible(true);
        
    }
    public Gui(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void sortMenu(){
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
    }
    
    public void pathfindingMenu(){
        pathfindingmenu = new JMenu("Pathfinding");
        e1=new JMenuItem("A* algoritham");
        e1.addActionListener(this);  
        e2=new JMenuItem("Dijkstra's algorithm");  
        e2.addActionListener(this);  
        e3=new JMenuItem("Sample algorithm");  
        e3.addActionListener(this);  
        e4=new JMenuItem("D* algoritham");  
        e4.addActionListener(this);  
        pathfindingmenu.add(e1); 
        pathfindingmenu.add(e2); 
        pathfindingmenu.add(e3);  
        pathfindingmenu.add(e4);
       

    }
    
    public void actionPerformed(ActionEvent e) {  
        
        JMenuItem  o = (JMenuItem) (e.getSource());

        System.out.println(o.getText()); 
        if(e.getSource()==i1)    
        bubbleSortDisp();
        if(e.getSource()==i2)    
        System.out.println("Insertion Sort");
        if(e.getSource()==i3)    
        System.out.println("Merge Sort");
        if(e.getSource()==i4)    
        System.out.println("Quick Sort");
        if(e.getSource()==i5)    
        System.out.println("Selection Sort");
    }
    public void bubbleSortDisp(){

    }     

   public void paint(Graphics g) {
        
        
        splitgraph(g,width,height,20,x);
        // Color black = new Color(255,255,255);
        //g2.drawLine(10, 20, 20, 30);
        
        // g.setColor(Color.BLACK);
        // g.fillRect(20, 20, 1, 1);
        
        
        g.dispose();
   }
   public void splitgraph(Graphics g, int width, int height, int div,int x){
        Graphics2D g2 = (Graphics2D) g;
       
        for (int i = 0; i<div; i++){
         //g2.drawLine(x1, y1, x2, y2);
             g2.drawLine((width/div) * i, 0, this.x+((width/div) * i),height);
            System.out.println(this.x);
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
   public void render(){
    // frame.invalidate();
    // frame.validate();
    frame.repaint();
    frame.setVisible(false); frame.setVisible(true);
    
   }
   public void run() {
    
    int timepassed = 0;
    boolean running = false;
    int init = (int)System.currentTimeMillis() / 1000;
    while (running == true){
        int start = (int)System.currentTimeMillis() / 1000 - init;

        while (timepassed >= 1){
           

            render();
            x+= 10;
            System.out.println(x);
            System.out.println("Rendering");
            timepassed=0;
        }
        timepassed += ((int)System.currentTimeMillis() / 1000 - init) - start;
        
        if (running == false)
        break;
    }
   }

    public static void main(String arg[]) {
        new Gui("Graph", 400, 400);
        
       
      

    }
}