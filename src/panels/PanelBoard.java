/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import transformations.Polygon;

/**
 *
 * @author Renan
 */
public class PanelBoard extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelBoard
     */
    public PanelBoard() {
        initComponents();
        repaint(); 
    }

   public Polygon polygon = new Polygon();

   public void setPolygon(Polygon polygon) {
       this.polygon = polygon;
   }

   private int getCenterX() {
       return super.getWidth()/2;
   }

   private int getCenterY() {
       return super.getHeight()/2;
   }
   
   public void paint(Graphics g) {
       super.paint(g);
       this.setBackground(Color.white);
       
       // Draw Axis
       g.setColor(Color.red);
       g.drawLine(0, super.getHeight()/2, super.getWidth(), super.getHeight()/2);

       g.setColor(Color.green);
       g.drawLine(super.getWidth()/2, 0, super.getWidth()/2, super.getHeight());

       // Draw Square
       g.setColor(Color.black);
       g.drawLine(
               getCenterX() + (int)polygon.getSquare()[0][0], getCenterY() - (int)polygon.getSquare()[1][0], 
               getCenterX() + (int)polygon.getSquare()[0][1], getCenterY() - (int)polygon.getSquare()[1][1]);
       g.drawLine(
               getCenterX() + (int)polygon.getSquare()[0][1], getCenterY() - (int)polygon.getSquare()[1][1],
               getCenterX() + (int)polygon.getSquare()[0][2], getCenterY() - (int)polygon.getSquare()[1][2]);
       g.drawLine(
               getCenterX() + (int)polygon.getSquare()[0][2], getCenterY() - (int)polygon.getSquare()[1][2],
               getCenterX() + (int)polygon.getSquare()[0][3], getCenterY() - (int)polygon.getSquare()[1][3]);
       g.drawLine(
               getCenterX() + (int)polygon.getSquare()[0][3], getCenterY() - (int)polygon.getSquare()[1][3],
               getCenterX() + (int)polygon.getSquare()[0][0], getCenterY() - (int)polygon.getSquare()[1][0]);
   }
   
   public Dimension getPreferredSize() {
      //return new Dimension(RECT_WIDTH + 2 * (int)square[0][0], RECT_HEIGHT + 2 * (int)square[1][0]);
      return new Dimension(355, 445);
   }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setTitle("Board");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
