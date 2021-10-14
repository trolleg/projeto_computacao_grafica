/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.event.ItemEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import panels.PanelBoard;
import math.Matrix;
import math.Polygon;
import math.PolygonType;
import geometric.Line;
import geometric.Circle;
import geometric.Coordinate;
import main.Main;

/**
 *
 * @author Renan
 */
public class PanelPrimitive extends javax.swing.JInternalFrame {
    private int assistantX1 = 0;
    private int assistantY1 = 0;
    private int assistantX2 = 0;
    private int assistantY2 = 0;
    private int assistantX3 = 0;
    private int assistantY3 = 0;
    private int assistantX4 = 0;
    private int assistantY4 = 0;
    private int radius, smallerRadius, biggerRadius;
    private Polygon polygon = new Polygon(PolygonType.PRIMITIVE);
    private PanelBoard panelBoard;
    
    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }

    public void setPanelBoard(PanelBoard panelBoard) {
        this.panelBoard = panelBoard;
        this.panelBoard.setPolygon(this.polygon);
        this.panelBoard.setPencil(new PencilPanel() {
            @Override
            public void draw (PanelBoard board, Graphics g) {
                // Axis X
                g.setColor(Color.red);
                g.drawLine(0, board.getCenterY(), board.getWidth(), board.getCenterY());

                // Axis Y
                g.setColor(Color.green);
                g.drawLine(board.getCenterX(), 0, board.getCenterX(), board.getHeight());

                g.setColor(Color.black);
                for (int i = 0; i < board.getPolygon().getSize(); i++)
                {
                    g.drawRect(
                            board.getCenterX() + (int)board.getPolygon().getPolygon()[0][i],
                            board.getCenterY() - (int)board.getPolygon().getPolygon()[1][i], 1, 1);
                }
            }
        });
    }

    /**
     * Creates new form PanelPrimitive
     */
    public PanelPrimitive() {
        initComponents();
        
        primitivasComboBox.removeAllItems();
        primitivasComboBox.addItem("Bresenham");
        primitivasComboBox.addItem("Coordinates");
        primitivasComboBox.addItem("DDA");
        primitivasComboBox.addItem("Mid Point Circle");
        primitivasComboBox.addItem("Polynomial Circle");
        primitivasComboBox.addItem("Trigonometric Circle");
        primitivasComboBox.addItem("Mid Point Ellipse");
        primitivasComboBox.addItem("Cohen Suther Land Clip");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emY1Label = new javax.swing.JLabel();
        aplicarNoObjetoButton = new javax.swing.JButton();
        primitivasComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        emX1Label = new javax.swing.JLabel();
        emX1Text = new javax.swing.JTextField();
        emY1Text = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        point1Label = new javax.swing.JLabel();
        emY2Label = new javax.swing.JLabel();
        emX2Label = new javax.swing.JLabel();
        emX2Text = new javax.swing.JTextField();
        emY2Text = new javax.swing.JTextField();
        point2Label = new javax.swing.JLabel();
        emY3Label = new javax.swing.JLabel();
        emX3Label = new javax.swing.JLabel();
        emX3Text = new javax.swing.JTextField();
        emY3Text = new javax.swing.JTextField();
        xMinLabel = new javax.swing.JLabel();
        xMaxLabel = new javax.swing.JLabel();
        emY4Label = new javax.swing.JLabel();
        emX4Label = new javax.swing.JLabel();
        emX4Text = new javax.swing.JTextField();
        emY4Text = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Primitivas Geométricas");

        emY1Label.setText("Em Y:");

        aplicarNoObjetoButton.setText("Aplicar no Objeto");
        aplicarNoObjetoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarNoObjetoButtonActionPerformed(evt);
            }
        });

        primitivasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        primitivasComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                primitivasComboBoxItemStateChanged(evt);
            }
        });
        primitivasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primitivasComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Primitivas Geométricas");

        emX1Label.setText("Em X:");

        emX1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emX1TextActionPerformed(evt);
            }
        });

        emY1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emY1TextActionPerformed(evt);
            }
        });

        resetButton.setText("Resetar");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        point1Label.setText("Point 1");

        emY2Label.setText("Em Y:");

        emX2Label.setText("Em X:");

        emX2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emX2TextActionPerformed(evt);
            }
        });

        emY2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emY2TextActionPerformed(evt);
            }
        });

        point2Label.setText("Point 2");

        emY3Label.setText("Em Y:");

        emX3Label.setText("Em X:");

        emX3Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emX3TextActionPerformed(evt);
            }
        });

        emY3Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emY3TextActionPerformed(evt);
            }
        });

        xMinLabel.setText("X Mínimo");

        xMaxLabel.setText("X Máximo");

        emY4Label.setText("Em Y:");

        emX4Label.setText("Em X:");

        emX4Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emX4TextActionPerformed(evt);
            }
        });

        emY4Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emY4TextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(primitivasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(point1Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(resetButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emX3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aplicarNoObjetoButton)
                                    .addComponent(emX3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(emX1Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emX1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(emY1Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emY1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(emX2Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emX2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emY2Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emY2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addComponent(emY3Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emY3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(xMinLabel)
                                    .addComponent(point2Label)
                                    .addComponent(xMaxLabel)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emX4Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emX4Text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(emY4Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emY4Text, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(primitivasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(point1Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emX1Label)
                    .addComponent(emX1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emY1Label)
                    .addComponent(emY1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(point2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emX2Label)
                    .addComponent(emX2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emY2Label)
                    .addComponent(emY2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(xMinLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emX3Label)
                    .addComponent(emX3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emY3Label)
                    .addComponent(emY3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xMaxLabel)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emX4Label)
                    .addComponent(emX4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emY4Label)
                    .addComponent(emY4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aplicarNoObjetoButton)
                .addGap(18, 18, 18)
                .addComponent(resetButton)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aplicarNoObjetoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarNoObjetoButtonActionPerformed
        // TODO add your handling code here:
        if(primitivasComboBox.getSelectedItem().equals("Bresenham")) {
            assistantX1 = Integer.parseInt(emX1Text.getText());
            assistantY1 = Integer.parseInt(emY1Text.getText());
            assistantX2 = Integer.parseInt(emX2Text.getText());
            assistantY2 = Integer.parseInt(emY2Text.getText());
            Line.bresenham(this.polygon, assistantX1, assistantY1, assistantX2, assistantY2);
            panelBoard.repaint();
        } else if(primitivasComboBox.getSelectedItem().equals("Coordinates")) {
            assistantX1 = Integer.parseInt(emX1Text.getText());
            assistantY1 = Integer.parseInt(emY1Text.getText());
            polygon.setPolygon(Coordinate.world_to_normalized(new int[][]{{assistantX1}, {assistantY1}}, panelBoard.getWidth(), panelBoard.getHeight()));
            panelBoard.repaint();
        } else if(primitivasComboBox.getSelectedItem().equals("DDA")) {
            assistantX1 = Integer.parseInt(emX1Text.getText());
            assistantY1 = Integer.parseInt(emY1Text.getText());
            assistantX2 = Integer.parseInt(emX2Text.getText());
            assistantY2 = Integer.parseInt(emY2Text.getText());
            Line.digital_differential_analyzer(this.polygon, assistantX1, assistantY1, assistantX2, assistantY2);
            panelBoard.repaint();
        } else if(primitivasComboBox.getSelectedItem().equals("Mid Point Circle")) {
            assistantX1 = Integer.parseInt(emX1Text.getText());
            assistantY1 = Integer.parseInt(emY1Text.getText());
            radius = Integer.parseInt(emX2Text.getText());
            Circle.mid_point_circle(this.polygon, assistantX1, assistantY2, radius);
            panelBoard.repaint();
        } else if(primitivasComboBox.getSelectedItem().equals("Polynomial Circle")) {
            assistantX1 = Integer.parseInt(emX1Text.getText());
            assistantY1 = Integer.parseInt(emY1Text.getText());
            radius = Integer.parseInt(emX2Text.getText());
            Circle.polynomial_circle(this.polygon, assistantX1, assistantY1, radius);
            panelBoard.repaint();
        } else if(primitivasComboBox.getSelectedItem().equals("Trigonometric Circle")) {
            assistantX1 = Integer.parseInt(emX1Text.getText());
            assistantY1 = Integer.parseInt(emY1Text.getText());
            radius = Integer.parseInt(emX2Text.getText());
            Circle.trigonometric_circle(this.polygon, assistantX1, assistantY1, radius);
            panelBoard.repaint();
        } else if(primitivasComboBox.getSelectedItem().equals("Mid Point Ellipse")) {
            assistantX1 = Integer.parseInt(emX1Text.getText());
            assistantY1 = Integer.parseInt(emY1Text.getText());
            smallerRadius = Integer.parseInt(emX2Text.getText());
            biggerRadius = Integer.parseInt(emY2Text.getText());
            Circle.midPointEllipse(polygon, assistantX1, assistantY1, smallerRadius, biggerRadius);
            panelBoard.repaint();
        } else if(primitivasComboBox.getSelectedItem().equals("Cohen Suther Land Clip")) {
            assistantX1 = Integer.parseInt(emX1Text.getText());
            assistantY1 = Integer.parseInt(emY1Text.getText());
            assistantX2 = Integer.parseInt(emX2Text.getText());
            assistantY2 = Integer.parseInt(emY2Text.getText());
            assistantX3 = Integer.parseInt(emX3Text.getText());
            assistantY3 = Integer.parseInt(emY3Text.getText());
            assistantX4 = Integer.parseInt(emX4Text.getText());
            assistantY4 = Integer.parseInt(emY4Text.getText());
            Line.clippingArea(assistantX3, assistantY3, assistantX4, assistantY4);
            Line.cohenSutherlandClip(polygon, assistantX1, assistantY1, assistantX2, assistantY2);
            panelBoard.repaint();
        }
    }//GEN-LAST:event_aplicarNoObjetoButtonActionPerformed

    private void primitivasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primitivasComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primitivasComboBoxActionPerformed

    private void emX1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emX1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emX1TextActionPerformed

    private void emY1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emY1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emY1TextActionPerformed

    private void primitivasComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_primitivasComboBoxItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED && primitivasComboBox.getSelectedItem().equals("Bresenham")) {
            point1Label.setText("Point 1");
            point1Label.setVisible(true);
            emX1Label.setVisible(true);
            emX1Text.setVisible(true);
            emY1Label.setVisible(true);
            emY1Text.setVisible(true);
            point2Label.setText("Point 2");
            point2Label.setVisible(true);
            emX2Label.setText("Em X:");
            emX2Label.setVisible(true);
            emX2Text.setVisible(true);
            emY2Label.setText("Em Y:");
            emY2Label.setVisible(true);
            emY2Text.setVisible(true);
            xMinLabel.setVisible(false);
            emX3Label.setVisible(false);
            emX3Text.setVisible(false);
            emY3Label.setVisible(false);
            emY3Text.setVisible(false);
            xMaxLabel.setVisible(false);
            emX4Label.setVisible(false);
            emX4Text.setVisible(false);
            emY4Label.setVisible(false);
            emY4Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && primitivasComboBox.getSelectedItem().equals("Coordinates")) {
            point1Label.setText("Point");
            point1Label.setVisible(true);
            emX1Label.setVisible(true);
            emX1Text.setVisible(true);
            emY1Label.setVisible(true);
            emY1Text.setVisible(true);
            point2Label.setVisible(false);
            emX2Label.setText("Em X:");
            emX2Label.setVisible(false);
            emX2Text.setVisible(false);
            emY2Label.setVisible(false);
            emY2Text.setVisible(false);
            xMinLabel.setVisible(false);
            emX3Label.setVisible(false);
            emX3Text.setVisible(false);
            emY3Label.setVisible(false);
            emY3Text.setVisible(false);
            xMaxLabel.setVisible(false);
            emX4Label.setVisible(false);
            emX4Text.setVisible(false);
            emY4Label.setVisible(false);
            emY4Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && primitivasComboBox.getSelectedItem().equals("DDA")) {
            point1Label.setText("Point 1");
            point1Label.setVisible(true);
            emX1Label.setVisible(true);
            emX1Text.setVisible(true);
            emY1Label.setVisible(true);
            emY1Text.setVisible(true);
            point2Label.setText("Point 2");
            point2Label.setVisible(true);
            emX2Label.setText("Em X:");
            emX2Label.setVisible(true);
            emX2Text.setVisible(true);
            emY2Label.setText("Em Y:");
            emY2Label.setVisible(true);
            emY2Text.setVisible(true);
            xMinLabel.setVisible(false);
            emX3Label.setVisible(false);
            emX3Text.setVisible(false);
            emY3Label.setVisible(false);
            emY3Text.setVisible(false);
            xMaxLabel.setVisible(false);
            emX4Label.setVisible(false);
            emX4Text.setVisible(false);
            emY4Label.setVisible(false);
            emY4Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && primitivasComboBox.getSelectedItem().equals("Mid Point Circle")) {
            point1Label.setText("Coordinates");
            point1Label.setVisible(true);
            emX1Label.setVisible(true);
            emX1Text.setVisible(true);
            emY1Label.setVisible(true);
            emY1Text.setVisible(true);
            point2Label.setVisible(false);
            emX2Label.setText("Radius:");
            emX2Label.setVisible(true);
            emX2Text.setVisible(true);
            emY2Label.setVisible(false);
            emY2Text.setVisible(false);
            xMinLabel.setVisible(false);
            emX3Label.setVisible(false);
            emX3Text.setVisible(false);
            emY3Label.setVisible(false);
            emY3Text.setVisible(false);
            xMaxLabel.setVisible(false);
            emX4Label.setVisible(false);
            emX4Text.setVisible(false);
            emY4Label.setVisible(false);
            emY4Text.setVisible(false);
            emY3Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && primitivasComboBox.getSelectedItem().equals("Polynomial Circle")) {
            point1Label.setText("Coordinates");
            point1Label.setVisible(true);
            emX1Label.setVisible(true);
            emX1Text.setVisible(true);
            emY1Label.setVisible(true);
            emY1Text.setVisible(true);
            point2Label.setVisible(false);
            emX2Label.setText("Radius:");
            emX2Label.setVisible(true);
            emX2Text.setVisible(true);
            emY2Label.setVisible(false);
            emY2Text.setVisible(false);
            xMinLabel.setVisible(false);
            emX3Label.setVisible(false);
            emX3Text.setVisible(false);
            emY3Label.setVisible(false);
            emY3Text.setVisible(false);
            xMaxLabel.setVisible(false);
            emX4Label.setVisible(false);
            emX4Text.setVisible(false);
            emY4Label.setVisible(false);
            emY4Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && primitivasComboBox.getSelectedItem().equals("Trigonometric Circle")) {
            point1Label.setText("Coordinates");
            point1Label.setVisible(true);
            emX1Label.setVisible(true);
            emX1Text.setVisible(true);
            emY1Label.setVisible(true);
            emY1Text.setVisible(true);
            point2Label.setVisible(false);
            emX2Label.setText("Radius:");
            emX2Label.setVisible(true);
            emX2Text.setVisible(true);
            emY2Label.setVisible(false);
            emY2Text.setVisible(false);
            xMinLabel.setVisible(false);
            emX3Label.setVisible(false);
            emX3Text.setVisible(false);
            emY3Label.setVisible(false);
            emY3Text.setVisible(false);
            xMaxLabel.setVisible(false);
            emX4Label.setVisible(false);
            emX4Text.setVisible(false);
            emY4Label.setVisible(false);
            emY4Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && primitivasComboBox.getSelectedItem().equals("Mid Point Ellipse")) {
            point1Label.setText("Coordinates");
            point1Label.setVisible(true);
            emX1Label.setVisible(true);
            emX1Text.setVisible(true);
            emY1Label.setVisible(true);
            emY1Text.setVisible(true);
            point2Label.setVisible(false);
            emX2Label.setText("S Radius:");
            emX2Label.setVisible(true);
            emX2Text.setVisible(true);
            emY2Label.setText("B Radius:");
            emY2Label.setVisible(true);
            emY2Text.setVisible(true);
            xMinLabel.setVisible(false);
            emX3Label.setVisible(false);
            emX3Text.setVisible(false);
            emY3Label.setVisible(false);
            emY3Text.setVisible(false);
            xMaxLabel.setVisible(false);
            emX4Label.setVisible(false);
            emX4Text.setVisible(false);
            emY4Label.setVisible(false);
            emY4Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && primitivasComboBox.getSelectedItem().equals("Cohen Suther Land Clip")) {
            point1Label.setText("Point 1");
            point1Label.setVisible(true);
            emX1Label.setVisible(true);
            emX1Text.setVisible(true);
            emY1Label.setVisible(true);
            emY1Text.setVisible(true);
            point2Label.setText("Point 2");
            point2Label.setVisible(true);
            emX2Label.setText("Em X:");
            emX2Label.setVisible(true);
            emX2Text.setVisible(true);
            emY2Label.setText("Em Y:");
            emY2Label.setVisible(true);
            emY2Text.setVisible(true);
            xMinLabel.setVisible(true);
            emX3Label.setVisible(true);
            emX3Text.setVisible(true);
            emY3Label.setVisible(true);
            emY3Text.setVisible(true);
            xMaxLabel.setVisible(true);
            emX4Label.setVisible(true);
            emX4Text.setVisible(true);
            emY4Label.setVisible(true);
            emY4Text.setVisible(true);
        }
    }//GEN-LAST:event_primitivasComboBoxItemStateChanged

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        polygon.resetPrimitive();
        panelBoard.repaint();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void emX2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emX2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emX2TextActionPerformed

    private void emY2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emY2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emY2TextActionPerformed

    private void emX3TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emX3TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emX3TextActionPerformed

    private void emY3TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emY3TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emY3TextActionPerformed

    private void emX4TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emX4TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emX4TextActionPerformed

    private void emY4TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emY4TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emY4TextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicarNoObjetoButton;
    private javax.swing.JLabel emX1Label;
    private javax.swing.JTextField emX1Text;
    private javax.swing.JLabel emX2Label;
    private javax.swing.JTextField emX2Text;
    private javax.swing.JLabel emX3Label;
    private javax.swing.JTextField emX3Text;
    private javax.swing.JLabel emX4Label;
    private javax.swing.JTextField emX4Text;
    private javax.swing.JLabel emY1Label;
    private javax.swing.JTextField emY1Text;
    private javax.swing.JLabel emY2Label;
    private javax.swing.JTextField emY2Text;
    private javax.swing.JLabel emY3Label;
    private javax.swing.JTextField emY3Text;
    private javax.swing.JLabel emY4Label;
    private javax.swing.JTextField emY4Text;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel point1Label;
    private javax.swing.JLabel point2Label;
    private javax.swing.JComboBox<String> primitivasComboBox;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel xMaxLabel;
    private javax.swing.JLabel xMinLabel;
    // End of variables declaration//GEN-END:variables
}
