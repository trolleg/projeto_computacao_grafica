/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.event.ItemEvent;
import java.awt.Graphics;
import java.awt.Color;
import panels.PanelBoard;
import panels.PencilPanel;
import transformations.Matrix;
import math.Polygon;
import math.PolygonType;

import main.Main;

/**
 *
 * @author Renan
 */
public class Panel3D extends javax.swing.JInternalFrame {
    private int assistantX = 0, assistantY = 0;
    private Polygon polygon = new Polygon(PolygonType.TRANSFORMATION3D);
    private PanelBoard panelBoard;
    
    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }

    public void setPanelBoard(PanelBoard panelBoard) {
        this.panelBoard = panelBoard;
        this.panelBoard.setPolygon(this.polygon);
        this.panelBoard.setPencil(new PencilPanel(){
            @Override
            public void draw (PanelBoard board, Graphics g) {
                g.setColor(Color.black);
                // Draw N polygon
                for (int i = 0; i < board.getPolygon().getSize(); i++)
                {
                    if (i == board.getPolygon().getSize() - 1) {
                            g.drawLine(
                                    board.getCenterX() + (int)board.getPolygon().getPolygon()[0][i],
                                    board.getCenterY() - (int)board.getPolygon().getPolygon()[1][i],
                                    board.getCenterX() + (int)board.getPolygon().getPolygon()[0][0],
                                    board.getCenterY() - (int)board.getPolygon().getPolygon()[1][0]);
                            continue;
                    }
                    g.drawLine(
                            board.getCenterX() + (int)board.getPolygon().getPolygon()[0][i],
                            board.getCenterY() - (int)board.getPolygon().getPolygon()[1][i],
                            board.getCenterX() + (int)board.getPolygon().getPolygon()[0][i+1],
                            board.getCenterY() - (int)board.getPolygon().getPolygon()[1][i+1]);
                }
            }
        });
    }

    /**
     * Creates new form Panel3D
     */
    public Panel3D() {
        initComponents();
        
        transformacoesComboBox.removeAllItems();
        transformacoesComboBox.addItem("Translation");
        transformacoesComboBox.addItem("Scaling");
        transformacoesComboBox.addItem("Rotation");
        transformacoesComboBox.addItem("Reflection");
        transformacoesComboBox.addItem("Shear");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emYLabel = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        desenharObjetoButton = new javax.swing.JButton();
        aplicarNoObjetoButton = new javax.swing.JButton();
        y = new javax.swing.JTextField();
        transformacoesComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emXLabel = new javax.swing.JLabel();
        emXText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emYText = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        z = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emZText = new javax.swing.JTextField();
        emZLabel = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Transformações 3D");

        emYLabel.setText("Em Y:");

        x.setText("0");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        desenharObjetoButton.setText("Desenhar Objeto");
        desenharObjetoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenharObjetoButtonActionPerformed(evt);
            }
        });

        aplicarNoObjetoButton.setText("Aplicar no Objeto");
        aplicarNoObjetoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarNoObjetoButtonActionPerformed(evt);
            }
        });

        y.setText("0");
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });

        transformacoesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        transformacoesComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                transformacoesComboBoxItemStateChanged(evt);
            }
        });
        transformacoesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transformacoesComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Objeto 3D");

        jLabel6.setText("Y:");

        jLabel5.setText("Transformações 3D");

        emXLabel.setText("Em X:");

        emXText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emXTextActionPerformed(evt);
            }
        });

        jLabel4.setText("X:");

        emYText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emYTextActionPerformed(evt);
            }
        });

        resetButton.setText("Resetar");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        z.setText("0");
        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });

        jLabel7.setText("Z:");

        emZText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emZTextActionPerformed(evt);
            }
        });

        emZLabel.setText("Em Z:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(desenharObjetoButton)
                    .addComponent(aplicarNoObjetoButton))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emXLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emXText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emYLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emYText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emZLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emZText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(transformacoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(resetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desenharObjetoButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transformacoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emXLabel)
                    .addComponent(emXText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emYLabel)
                    .addComponent(emYText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emZLabel)
                    .addComponent(emZText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(aplicarNoObjetoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resetButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xActionPerformed

    private void desenharObjetoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenharObjetoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desenharObjetoButtonActionPerformed

    private void aplicarNoObjetoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarNoObjetoButtonActionPerformed
        // TODO add your handling code here:
        if(transformacoesComboBox.getSelectedItem().equals("Translation")) {
            
            panelBoard.repaint();
        } else if(transformacoesComboBox.getSelectedItem().equals("Scaling")) {
            
            panelBoard.repaint();
        } else if(transformacoesComboBox.getSelectedItem().equals("Rotation")) {
            
            panelBoard.repaint();
        } else if(transformacoesComboBox.getSelectedItem().equals("Reflection")) {
            
            panelBoard.repaint();
        } else if(transformacoesComboBox.getSelectedItem().equals("Shear")) {
            
            panelBoard.repaint();
        }
    }//GEN-LAST:event_aplicarNoObjetoButtonActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yActionPerformed

    private void transformacoesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformacoesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transformacoesComboBoxActionPerformed

    private void emXTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emXTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emXTextActionPerformed

    private void emYTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emYTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emYTextActionPerformed

    private void transformacoesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_transformacoesComboBoxItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Translation")) {
            emXLabel.setText("Em X:");
            emXLabel.setVisible(true);
            emXText.setVisible(true);
            emYLabel.setText("Em Y:");
            emYLabel.setVisible(true);
            emYText.setVisible(true);
            emZLabel.setText("Em Z:");
            emZLabel.setVisible(true);
            emZText.setVisible(true);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Scaling")) {
            emXLabel.setText("Em X:");
            emXLabel.setVisible(true);
            emXText.setVisible(true);
            emYLabel.setText("Em Y:");
            emYLabel.setVisible(true);
            emYText.setVisible(true);
            emZLabel.setText("Em Z:");
            emZLabel.setVisible(true);
            emZText.setVisible(true);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Rotation")) {
            emXLabel.setText("Rotação:");
            emXLabel.setVisible(true);
            emXText.setVisible(true);
            emYLabel.setText("Em Y:");
            emYLabel.setVisible(false);
            emYText.setVisible(false);
            emZLabel.setText("Em Z:");
            emZLabel.setVisible(false);
            emZText.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Reflection")) {
            emXLabel.setText("Reflexão (X, Y, O):");
            emXLabel.setVisible(true);
            emXText.setVisible(true);
            emYLabel.setText("Em Y:");
            emYLabel.setVisible(false);
            emYText.setVisible(false);
            emZLabel.setText("Em Z:");
            emZLabel.setVisible(false);
            emZText.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Shear")) {
            emXLabel.setText("Em X:");
            emXLabel.setVisible(true);
            emXText.setVisible(true);
            emYLabel.setText("Em Y:");
            emYLabel.setVisible(true);
            emYText.setVisible(true);
            emZLabel.setText("Em Z:");
            emZLabel.setVisible(true);
            emZText.setVisible(true);
        }
    }//GEN-LAST:event_transformacoesComboBoxItemStateChanged

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        polygon.reset2D();
        panelBoard.repaint();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zActionPerformed

    private void emZTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emZTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emZTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicarNoObjetoButton;
    private javax.swing.JButton desenharObjetoButton;
    private javax.swing.JLabel emXLabel;
    private javax.swing.JTextField emXText;
    private javax.swing.JLabel emYLabel;
    private javax.swing.JTextField emYText;
    private javax.swing.JLabel emZLabel;
    private javax.swing.JTextField emZText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> transformacoesComboBox;
    private javax.swing.JTextField x;
    private javax.swing.JTextField y;
    private javax.swing.JTextField z;
    // End of variables declaration//GEN-END:variables
}
