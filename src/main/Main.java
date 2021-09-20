/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import panels.Panel2D;
import panels.PanelBoard;
/**
 *
 * @author Renan
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JMenuBar();
        menu2D = new javax.swing.JMenu();
        menuTransformacoes = new javax.swing.JMenu();
        itemDeMenuTransformacoes2D = new javax.swing.JMenuItem();
        itemDeMenuTransformacoes3D = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setToolTipText("");

        menu2D.setText("Lab1 (Em Breve)");
        menu.add(menu2D);

        menuTransformacoes.setText("Transformações");

        itemDeMenuTransformacoes2D.setText("Transformações 2D");
        itemDeMenuTransformacoes2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuTransformacoes2DActionPerformed(evt);
            }
        });
        menuTransformacoes.add(itemDeMenuTransformacoes2D);

        itemDeMenuTransformacoes3D.setText("Transformações 3D");
        itemDeMenuTransformacoes3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeMenuTransformacoes3DActionPerformed(evt);
            }
        });
        menuTransformacoes.add(itemDeMenuTransformacoes3D);

        menu.add(menuTransformacoes);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemDeMenuTransformacoes3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuTransformacoes3DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDeMenuTransformacoes3DActionPerformed

    private void itemDeMenuTransformacoes2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeMenuTransformacoes2DActionPerformed
        // TODO add your handling code here:
        Panel2D panel2d = new Panel2D();
        panel2d.setVisible(true);
        this.add(panel2d);
        
        PanelBoard panelBoard = new PanelBoard();
        panelBoard.setLocation(222, 0);
        panelBoard.setVisible(true);
        this.add(panelBoard);
    }//GEN-LAST:event_itemDeMenuTransformacoes2DActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemDeMenuTransformacoes2D;
    private javax.swing.JMenuItem itemDeMenuTransformacoes3D;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu2D;
    private javax.swing.JMenu menuTransformacoes;
    // End of variables declaration//GEN-END:variables
}
