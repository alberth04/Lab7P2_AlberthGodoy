/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_alberthgodoy;

import java.util.ArrayList;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author godoy
 */
public class PlantvzZombies extends javax.swing.JFrame {

    private ArrayList<Planta> plantas = new ArrayList();
    private ArrayList<Zombi> zombis = new ArrayList();
    
    /**
     * Creates new form PlantvzZombies
     */
    public PlantvzZombies() {
        initComponents();
        //Cargar Planta de archivo
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Rango = new javax.swing.ButtonGroup();
        buttonGroup_TipoZombi = new javax.swing.ButtonGroup();
        jPanel_FondoInicio = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree_Testear = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Testear = new javax.swing.JTextArea();
        jButton_Testear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_NombreZombi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSpinner_EdadZombi = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jSpinner_AtaqueZombi = new javax.swing.JSpinner();
        jSpinner_SizeZombi = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jSpinner_VidaZombi = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton_Cargado = new javax.swing.JRadioButton();
        jRadioButton_Clasico = new javax.swing.JRadioButton();
        jTextField_ColorBanderaClasico = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField_DirrecionImage = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jSpinner_EnojoZombi = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jTextField_PersonaComida = new javax.swing.JTextField();
        jButton_ComidaAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_PersonasComidas = new javax.swing.JTextArea();
        jButton_CrearZombi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton_Medio = new javax.swing.JRadioButton();
        jRadioButton_Bajo = new javax.swing.JRadioButton();
        jRadioButton_Alto = new javax.swing.JRadioButton();
        jRadioButton_Defensa = new javax.swing.JRadioButton();
        jRadioButton_Disparo = new javax.swing.JRadioButton();
        jRadioButton_Explosiva = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinner_AtaquePlanta = new javax.swing.JSpinner();
        jSpinner_MagnitudExplosionExplosiva = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_NombrePlanta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSpinner_VidaPlanta = new javax.swing.JSpinner();
        jSpinner_AlturaExplosivo = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_NombreProyectilDisparo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSpinner_PesoDisparo = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jTextField_ColorDefensa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSpinner_DurezaDefensa = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jButton_CrearPlanta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Entidades");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Plantas");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Defensa");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bajo");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medio");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Alto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Disparo");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bajo");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medio");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Alto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Explosivo");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Bajo");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Medio");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Alto");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Zombis");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Clasico");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cargado");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree_Testear.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree_Testear);

        jTextArea_Testear.setColumns(20);
        jTextArea_Testear.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Testear);

        jButton_Testear.setText("Testear");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jButton_Testear, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Testear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Nombre");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel3.add(jTextField_NombreZombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 30));

        jLabel17.setText("Edad");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));
        jPanel3.add(jSpinner_EdadZombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 90, 30));

        jLabel18.setText("Ataque");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel3.add(jSpinner_AtaqueZombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));
        jPanel3.add(jSpinner_SizeZombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 90, 30));

        jLabel19.setText("Tamaño");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));
        jPanel3.add(jSpinner_VidaZombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 30));

        jLabel20.setText("Tipo");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel21.setText("Vida");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        buttonGroup_TipoZombi.add(jRadioButton_Cargado);
        jRadioButton_Cargado.setText("Cargado");
        jPanel3.add(jRadioButton_Cargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        buttonGroup_TipoZombi.add(jRadioButton_Clasico);
        jRadioButton_Clasico.setText("Clasico");
        jRadioButton_Clasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ClasicoActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton_Clasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));
        jPanel3.add(jTextField_ColorBanderaClasico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, 30));

        jLabel22.setText("Color Bandera");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel23.setText("Direccion Imagen");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));
        jPanel3.add(jTextField_DirrecionImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 110, 30));

        jLabel24.setText("Enojo");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));
        jPanel3.add(jSpinner_EnojoZombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 90, 30));

        jLabel25.setText("Persona Comida");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));
        jPanel3.add(jTextField_PersonaComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 110, 30));

        jButton_ComidaAgregar.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jButton_ComidaAgregar.setText("+");
        jButton_ComidaAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ComidaAgregarMouseClicked(evt);
            }
        });
        jButton_ComidaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ComidaAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_ComidaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 60, 30));

        jTextArea_PersonasComidas.setColumns(20);
        jTextArea_PersonasComidas.setRows(5);
        jScrollPane3.setViewportView(jTextArea_PersonasComidas);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 270, 210));

        jButton_CrearZombi.setText("Crear");
        jButton_CrearZombi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CrearZombiMouseClicked(evt);
            }
        });
        jPanel3.add(jButton_CrearZombi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, 30));

        jTabbedPane1.addTab("Zombis", jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Rango");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 6, 41, -1));

        buttonGroup_Rango.add(jRadioButton_Medio);
        jRadioButton_Medio.setText("Medio");
        jPanel2.add(jRadioButton_Medio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        buttonGroup_Rango.add(jRadioButton_Bajo);
        jRadioButton_Bajo.setText("Bajo");
        jPanel2.add(jRadioButton_Bajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, -1));

        buttonGroup_Rango.add(jRadioButton_Alto);
        jRadioButton_Alto.setText("Alto");
        jPanel2.add(jRadioButton_Alto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        buttonGroup_Rango.add(jRadioButton_Defensa);
        jRadioButton_Defensa.setText("Defensa");
        jPanel2.add(jRadioButton_Defensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, -1));

        buttonGroup_Rango.add(jRadioButton_Disparo);
        jRadioButton_Disparo.setText("Disparo");
        jPanel2.add(jRadioButton_Disparo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, -1));

        buttonGroup_Rango.add(jRadioButton_Explosiva);
        jRadioButton_Explosiva.setText("Explosiva");
        jRadioButton_Explosiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ExplosivaActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton_Explosiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, -1));

        jLabel3.setText("Tipo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 41, -1));

        jLabel4.setText("Ataque");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel5.setText("Magnitud Explosion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel2.add(jSpinner_AtaquePlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 90, 30));
        jPanel2.add(jSpinner_MagnitudExplosionExplosiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 30));

        jLabel6.setText("Vida");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel7.setText("Explosiva");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel2.add(jTextField_NombrePlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 110, 30));

        jLabel8.setText("Nombre");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));
        jPanel2.add(jSpinner_VidaPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 90, 30));
        jPanel2.add(jSpinner_AlturaExplosivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 90, 30));

        jLabel9.setText("Altura");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        jLabel10.setText("Defensa");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));
        jPanel2.add(jTextField_NombreProyectilDisparo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 110, 30));

        jLabel11.setText("Nombre Proyectil");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel12.setText("Peso");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));
        jPanel2.add(jSpinner_PesoDisparo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 90, 30));

        jLabel13.setText("Color");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));
        jPanel2.add(jTextField_ColorDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, 30));

        jLabel14.setText("Dureza");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));
        jPanel2.add(jSpinner_DurezaDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 90, 30));

        jLabel15.setText("Disparo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jButton_CrearPlanta.setText("Crear Planta");
        jButton_CrearPlanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CrearPlantaMouseClicked(evt);
            }
        });
        jPanel2.add(jButton_CrearPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 90, 40));

        jTabbedPane1.addTab("Plantas", jPanel2);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("PLANT VS ZOMBIES");

        javax.swing.GroupLayout jPanel_FondoInicioLayout = new javax.swing.GroupLayout(jPanel_FondoInicio);
        jPanel_FondoInicio.setLayout(jPanel_FondoInicioLayout);
        jPanel_FondoInicioLayout.setHorizontalGroup(
            jPanel_FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(jPanel_FondoInicioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel_FondoInicioLayout.setVerticalGroup(
            jPanel_FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FondoInicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_FondoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_FondoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_ClasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ClasicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_ClasicoActionPerformed

    private void jButton_ComidaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ComidaAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ComidaAgregarActionPerformed

    private void jRadioButton_ExplosivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ExplosivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_ExplosivaActionPerformed

    private void jButton_CrearPlantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CrearPlantaMouseClicked
        //Crear Planta
        String nombre = jTextField_NombrePlanta.getText();
        int ataque = (int) jSpinner_AtaquePlanta.getValue();
        int vida = (int) jSpinner_VidaPlanta.getValue();
        String rango;
        if (jRadioButton_Bajo.isSelected()) {
            rango = "bajo";
        } else if (jRadioButton_Medio.isSelected()) {
            rango = "medio";
        } else if (jRadioButton_Alto.isSelected()) {
            rango = "alto";
        }
        if (jRadioButton_Explosiva.isSelected()) {
            int magnitud = (int) jSpinner_MagnitudExplosionExplosiva.getValue();
            //Agregamos la planta
            //Agregar una planta de tipo Explosiva
            plantas.add(new Explosiva(magnitud, nombre, ataque, vida));
            //La colocamos en el arbol
            //Obtenemos  el modelo
            DefaultTreeModel treemodel
                    = (DefaultTreeModel) jTree_Testear.getModel();
            //Agregar una planta de tipo Disparo
        } else if (jRadioButton_Disparo.isSelected()) {
            String nombreProyectil = jTextField_NombreProyectilDisparo.getText();
            String Color = jTextField_ColorDefensa.getText();
            plantas.add(new Disparo(nombreProyectil, Color, nombre, ataque, vida));
            //Agregar una planta de tipo Defensa
        } else if (jRadioButton_Defensa.isSelected()) {
            int altura = (int) jSpinner_AlturaExplosivo.getValue();
            int peso = (int) jSpinner_PesoDisparo.getValue();
            int nivelDureza = (int) jSpinner_DurezaDefensa.getValue();
            plantas.add(new Defensa(altura, nivelDureza, peso, nombre, ataque, vida));
        }
        JOptionPane.showMessageDialog(jPanel2, "Planta Agregada", "Planta", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton_CrearPlantaMouseClicked

    private void jButton_CrearZombiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CrearZombiMouseClicked
        //Agregar Zombi
        String nombre = jTextField_NombreZombi.getText();
        int ataque = (int) jSpinner_AtaqueZombi.getValue();
        int vida = (int) jSpinner_VidaZombi.getValue();
        //Si el zombi es clasico
        if (jRadioButton_Clasico.isSelected()) {
            int expy = (int) jSpinner_EdadZombi.getValue();
            //Atributos bandera
            String color = jTextField_ColorBanderaClasico.getText();
            String direccion = jTextField_DirrecionImage.getText();
            Bandera b = new Bandera(color, direccion);
            //Agregamos el zombi
            zombis.add(new Clasico(expy, b, nombre, ataque, vida));

        } else if (jRadioButton_Cargado.isSelected()) {
            int size = (int) jSpinner_SizeZombi.getValue();
            int edad = (int) jSpinner_EdadZombi.getValue();
            int nivelEnojo = (int) jSpinner_EnojoZombi.getValue();
            //Agregamos el zombi
            zombis.add(new Cargado(size, edad, nivelEnojo, nombre, ataque, vida));
            //Si tiene personas comidas
            if (!jTextArea_PersonasComidas.getText().equalsIgnoreCase("")) {
                int index = zombis.size() - 1;
                String personasComidas = jTextArea_PersonasComidas.getText();
                String[] personasSerapadas = personasComidas.split("");
                for (int i = 0; i < personasSerapadas.length; i++) {
                    ((Cargado) zombis.get(index)).getPlantasComidas().add(personasSerapadas[i]);
                }
            }
        }
    }//GEN-LAST:event_jButton_CrearZombiMouseClicked

    private void jButton_ComidaAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ComidaAgregarMouseClicked
        //Agregar Personas a Comer
        if (!jTextField_PersonaComida.getText().equals("")) {

            if (jTextArea_PersonasComidas.getText().equals("")) {
                String persona = jTextField_PersonaComida.getText();
                jTextArea_PersonasComidas.setText(String.format("%s%n", persona));
                jTextField_PersonaComida.setText("");
                
            }else {
                String persona = jTextField_PersonaComida.getText();
                String area = jTextArea_PersonasComidas.getText();
                jTextArea_PersonasComidas.setText(String.format("%s%s%n",area, persona));
                jTextField_PersonaComida.setText("");
            }
            
        }

    }//GEN-LAST:event_jButton_ComidaAgregarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        administrarPlantasvsZombis ap = new administrarPlantasvsZombis("./Zombies.txt");
        ap.cargarArchivoZombi();
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
            java.util.logging.Logger.getLogger(PlantvzZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlantvzZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlantvzZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlantvzZombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlantvzZombies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_Rango;
    private javax.swing.ButtonGroup buttonGroup_TipoZombi;
    private javax.swing.JButton jButton_ComidaAgregar;
    private javax.swing.JButton jButton_CrearPlanta;
    private javax.swing.JButton jButton_CrearZombi;
    private javax.swing.JButton jButton_Testear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_FondoInicio;
    private javax.swing.JRadioButton jRadioButton_Alto;
    private javax.swing.JRadioButton jRadioButton_Bajo;
    private javax.swing.JRadioButton jRadioButton_Cargado;
    private javax.swing.JRadioButton jRadioButton_Clasico;
    private javax.swing.JRadioButton jRadioButton_Defensa;
    private javax.swing.JRadioButton jRadioButton_Disparo;
    private javax.swing.JRadioButton jRadioButton_Explosiva;
    private javax.swing.JRadioButton jRadioButton_Medio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner_AlturaExplosivo;
    private javax.swing.JSpinner jSpinner_AtaquePlanta;
    private javax.swing.JSpinner jSpinner_AtaqueZombi;
    private javax.swing.JSpinner jSpinner_DurezaDefensa;
    private javax.swing.JSpinner jSpinner_EdadZombi;
    private javax.swing.JSpinner jSpinner_EnojoZombi;
    private javax.swing.JSpinner jSpinner_MagnitudExplosionExplosiva;
    private javax.swing.JSpinner jSpinner_PesoDisparo;
    private javax.swing.JSpinner jSpinner_SizeZombi;
    private javax.swing.JSpinner jSpinner_VidaPlanta;
    private javax.swing.JSpinner jSpinner_VidaZombi;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea_PersonasComidas;
    private javax.swing.JTextArea jTextArea_Testear;
    private javax.swing.JTextField jTextField_ColorBanderaClasico;
    private javax.swing.JTextField jTextField_ColorDefensa;
    private javax.swing.JTextField jTextField_DirrecionImage;
    private javax.swing.JTextField jTextField_NombrePlanta;
    private javax.swing.JTextField jTextField_NombreProyectilDisparo;
    private javax.swing.JTextField jTextField_NombreZombi;
    private javax.swing.JTextField jTextField_PersonaComida;
    private javax.swing.JTree jTree_Testear;
    // End of variables declaration//GEN-END:variables
}
