/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panels;

import java.awt.event.ItemEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import java.net.URL;


import panels.PanelImageTransformations;
import panels.PanelImage;

import imageprocessing.filters.Filter;
import imageprocessing.transformations.Transformation;

/**
 *
 * @author Renan
 */
public class PanelImageTransformations extends javax.swing.JInternalFrame {
    //private PanelImage panelImageInput;
    private BufferedImage image;
    private BufferedImage imageResult;
    private int[][] imageMatrix;
    private int[][] imageMatrix1;
    private int[][] imageMatrix2; 
    private int imgWidth;
    private int imgHeight;
    private int imgValorMaximo;
    private int valor, valor2;
    private float valor3;

    /*
    public void setPanelImageInput(PanelImage panel) {
        this.panelImageInput = panel;
    }
    */
    /**
     * Creates new form PanelImageFilters
     */
    public PanelImageTransformations() {
        initComponents();
        
        transformacoesComboBox.removeAllItems();
        transformacoesComboBox.addItem("Gamma");
        transformacoesComboBox.addItem("Negative");
        transformacoesComboBox.addItem("Logarithm");
        transformacoesComboBox.addItem("Linear");
        transformacoesComboBox.addItem("Dynamic Range");
        transformacoesComboBox.addItem("Sigmoid");
        panelImageOriginal.setBackground(Color.GRAY);
        panelImageResult.setBackground(Color.GRAY);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 270, 50, null);
        //panelImageResult.getGraphics().drawImage(imageResult, 320, 50, null);
    }

    /*
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        panelImageOriginal.getGraphics().drawImage(image, 0, 0, null);
        panelImageOriginal.repaint();

    }
    */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transformacoesComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        aplicarNaImagemButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelImageOriginal = new javax.swing.JPanel();
        selecionarImgButton = new javax.swing.JButton();
        panelImageResult = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valorLabel = new javax.swing.JLabel();
        valorText = new javax.swing.JTextField();
        valor2Label = new javax.swing.JLabel();
        valor2Text = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Transformações de Imagens");
        setPreferredSize(new java.awt.Dimension(890, 444));

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

        jLabel1.setText("Transformações de Imagens");

        aplicarNaImagemButton.setText("Aplicar na Imagem");
        aplicarNaImagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarNaImagemButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecionar Imagem");

        panelImageOriginal.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout panelImageOriginalLayout = new javax.swing.GroupLayout(panelImageOriginal);
        panelImageOriginal.setLayout(panelImageOriginalLayout);
        panelImageOriginalLayout.setHorizontalGroup(
            panelImageOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelImageOriginalLayout.setVerticalGroup(
            panelImageOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        selecionarImgButton.setText("Selecionar");
        selecionarImgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarImgButtonActionPerformed(evt);
            }
        });

        panelImageResult.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout panelImageResultLayout = new javax.swing.GroupLayout(panelImageResult);
        panelImageResult.setLayout(panelImageResultLayout);
        panelImageResultLayout.setHorizontalGroup(
            panelImageResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelImageResultLayout.setVerticalGroup(
            panelImageResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel3.setText("Imagem Original");

        jLabel4.setText("Imagem Resultado");

        valorLabel.setText("A:");

        valor2Label.setText("B:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transformacoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(selecionarImgButton)
                            .addComponent(aplicarNaImagemButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(valor2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(panelImageOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelImageResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(222, 222, 222)
                .addComponent(jLabel4)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImageResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImageOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transformacoesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valorLabel)
                            .addComponent(valorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor2Label)
                            .addComponent(valor2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(aplicarNaImagemButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecionarImgButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transformacoesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transformacoesComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transformacoesComboBoxActionPerformed

    private void transformacoesComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_transformacoesComboBoxItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Gamma")) {
            valorLabel.setText("Gamma:");
            valorLabel.setVisible(true);
            valorText.setVisible(true);
            valor2Label.setVisible(false);
            valor2Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Negative")) {
            valorLabel.setVisible(false);
            valorText.setVisible(false);
            valor2Label.setVisible(false);
            valor2Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Logarithm")) {
            valorLabel.setText("Constante:");
            valorLabel.setVisible(true);
            valorText.setVisible(true);
            valor2Label.setVisible(false);
            valor2Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Linear")) {
            valorLabel.setText("Constante A:");
            valorLabel.setVisible(true);
            valorText.setVisible(true);
            valor2Label.setText("Constante B:");
            valor2Label.setVisible(true);
            valor2Text.setVisible(true);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Dynamic Range")) {
            valorLabel.setText("Alvo:");
            valorLabel.setVisible(true);
            valorText.setVisible(true);
            valor2Label.setVisible(false);
            valor2Text.setVisible(false);
        } else if(evt.getStateChange() == ItemEvent.SELECTED && transformacoesComboBox.getSelectedItem().equals("Sigmoid")) {
            valorLabel.setText("Grey Center:");
            valorLabel.setVisible(true);
            valorText.setVisible(true);
            valor2Label.setText("Sigma:");
            valor2Label.setVisible(true);
            valor2Text.setVisible(true);
        }
    }//GEN-LAST:event_transformacoesComboBoxItemStateChanged

    private void aplicarNaImagemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicarNaImagemButtonActionPerformed
        // TODO add your handling code here:
        if(transformacoesComboBox.getSelectedItem().equals("Gamma")) {
            valor3 = Float.parseFloat(valorText.getText());
            this.imageResult = Transformation.gamma(imageMatrix, valor3, false);
            this.getGraphics().drawImage(imageResult, 590, 50, null);
            
        } else if(transformacoesComboBox.getSelectedItem().equals("Negative")) {
            this.imageResult = Transformation.negative(imageMatrix, true);
            this.getGraphics().drawImage(imageResult, 590, 50, null);
            
        } else if(transformacoesComboBox.getSelectedItem().equals("Logarithm")) {
            valor3 = Float.parseFloat(valorText.getText());
            this.imageResult = Transformation.logarithm(imageMatrix, valor3, true);
            this.getGraphics().drawImage(imageResult, 590, 50, null);

        } else if(transformacoesComboBox.getSelectedItem().equals("Linear")) {
            valor = Integer.parseInt(valorText.getText());
            valor2 = Integer.parseInt(valor2Text.getText());
            this.imageResult = Transformation.linear(imageMatrix, valor, valor2, true);
            this.getGraphics().drawImage(imageResult, 590, 50, null);

        } else if(transformacoesComboBox.getSelectedItem().equals("Dynamic Range")) {
            valor = Integer.parseInt(valorText.getText());
            this.imageResult = Transformation.dynamicRange(imageMatrix, valor, false);
            this.getGraphics().drawImage(imageResult, 590, 50, null);

        } else if(transformacoesComboBox.getSelectedItem().equals("Sigmoid")) {
            valor = Integer.parseInt(valorText.getText());
            valor2 = Integer.parseInt(valor2Text.getText());
            this.imageResult = Transformation.sigmoid(imageMatrix, valor, valor2, true);
            this.getGraphics().drawImage(imageResult, 590, 50, null);

        }
    }//GEN-LAST:event_aplicarNaImagemButtonActionPerformed

    private void selecionarImgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarImgButtonActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("src/images/"));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PGM Images", "pgm");
            fileChooser.setFileFilter(filter);
            int returnVal = fileChooser.showOpenDialog(aplicarNaImagemButton);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                //imageMatrix1 = createImage(fileChooser.getSelectedFile());
                //populaImgInPanel(imageMatrix1, panelImageOriginal);
               // createImage(fileChooser.getSelectedFile());
               
                File path = fileChooser.getSelectedFile();
                System.out.println(path);
                createImage(path.getAbsolutePath());
                //btAplicaFiltro.setEnabled(true);
                //panelImgOutput.repaint();
                //panelImageOriginal.setImage(imgT);

                //panelImageInput.setImage(image);
                //panelImageInput.repaint();

                //panelImageOriginal.getGraphics().drawImage(image, 0, 0, null);
                //panelImageOriginal.repaint();
                this.repaint();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "OPS! N�o foi possivel carregar a imagem.");
        }
    }//GEN-LAST:event_selecionarImgButtonActionPerformed

    /**
     *  Ler o arquivo pgm e monta a popula a matriz imagem
     */
    public int[][] createImage(String path) {
        /*
        FileInputStream fileInputStream = null;
        Scanner scan = null;
        try {
            fileInputStream = new FileInputStream(file);
            scan = new Scanner(fileInputStream);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(PanelOperacoes.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Descarta a primeira linha
        scan.nextLine();
        // Read pic width, height and max value
        imgWidth = scan.nextInt();
        imgHeight = scan.nextInt();
        imgValorMaximo = scan.nextInt();
        */ 
        //BufferedImage bimg = null;
        int width;
        int height;

        InputStream inputStream = null;
        Scanner scan = null;
        try {

            System.out.println(path);
            inputStream = new FileInputStream(path);
            scan = new Scanner(inputStream);

            // Descarta a primeira linha
            scan.nextLine();
            // Read pic width, height and max value
            width = scan.nextInt();
            height = scan.nextInt();
            imgValorMaximo = scan.nextInt();

            BufferedImage bimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            System.out.printf ("W : %d\n", width);
            System.out.printf ("H : %d\n", height);

            //width = i.getWidth();
            //height = i.getHeight();
            /*
            if (path == null)
                System.out.println("File Null");
            if (inputStream == null) 
                System.out.println("input Null");
            if (bimg == null)
                System.out.println("bimg Null");

            width = bimg.getWidth();
            height = bimg.getHeight();
            */
            //this.image = bimg;

            /**
            * Monta a matriz imagem com os pixels da imagem selecionada
            */
            imageMatrix = new int[width][height];

            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    // Popula a matriz com os pixels da imagem
                    imageMatrix[row][col] = scan.nextInt();
                }
            }
            inputStream.close();

            /**
            * Monta a matriz imagem com os pixels da imagem selecionada
            */
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    // Prepara a imagem para ser desenhada no jpanel
                    bimg.setRGB(col, row, getCorPixel(imageMatrix[row][col]));
                }
            }

            this.image = bimg;


        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "OPS! criar a imagem.");
        }


        /*
        try {
            fileInputStream.close();
        } catch (IOException ex) {
            //Logger.getLogger(PanelOperacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        return imageMatrix;
    }

    /**
     * Exibe a imagem no jPanel
     *
     */
    public void populaImgInPanel(int[][] img, JPanel imgPanel) {
        /**
         * Monta a matriz imagem com os pixels da imagem selecionada
         */
        BufferedImage imagemInput = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
        for (int row = 0; row < img.length; row++) {
            for (int col = 0; col < img[0].length; col++) {
                // Prepara a imagem para ser desenhada no jpanel
                imagemInput.setRGB(col, row, getCorPixel(imageMatrix[row][col]));
            }
        }
        /**
         * Exibe a imagem no jpanel
         */
        //panelImageOriginal.setImage(imagemInput);
        panelImageOriginal.getGraphics().drawImage(imagemInput, 75, 75, null);
        //panelImageOriginal.repaint();
    }

    /**
     * Retorna o valor em RGB de acordo com o valor do pixel
     */
    private int getCorPixel(int corRGB) {
        return new Color(corRGB, corRGB, corRGB).getRGB();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aplicarNaImagemButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelImageOriginal;
    private javax.swing.JPanel panelImageResult;
    private javax.swing.JButton selecionarImgButton;
    private javax.swing.JComboBox<String> transformacoesComboBox;
    private javax.swing.JLabel valor2Label;
    private javax.swing.JTextField valor2Text;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JTextField valorText;
    // End of variables declaration//GEN-END:variables
}
