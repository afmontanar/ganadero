/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package productos;

import areas.ClasArea;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import menuactivofijo.ValidarCamposVacios;

/**
 *
 * @author OSPINO Y ASOCIADO
 */
public class RegistroProducto extends javax.swing.JDialog {
ValidarCamposVacios va;
Object poder;
    /**
     * Creates new form RegistroProducto
     */
    public RegistroProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Component[] c={codeprod,nameproduct,codegrupo,vidadutil};
        this.va=new ValidarCamposVacios(c);
    }
void mayuscula(){
        nameproduct.setText(nameproduct.getText().toUpperCase());
    }
public void guardar() {
        try {   
           Producto.c.EjecutarMysql("insert into producto (codepreoducto,nameproducto,codegrupo,namegrupo,vidautil) values('" +codeprod.getText() + "','" + nameproduct.getText() +"','" + codegrupo.getText() +"','" + namegrupo.getText() +"','" + vidadutil.getText() +"')");
           GrillaProducto get = (GrillaProducto) ClasArea.are.get("grillaproduc");
            String s[]={codeprod.getText(),namegrupo.getText()};
            get.refrescarGrilla(s);
            JOptionPane.showMessageDialog(this, " insertado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR" + e);
        }
    }

public void update() {
//        ProcedimientoSelec catius = (ProcedimientoSelec) Procedimientos.procedimiento.get("procedimientoSelectivo");
        try {
            Producto.c.EjecutarMysql("update producto set  nameproducto='" + namegrupo.getText()+"' where codepreoducto='" + codeprod.getText() + "'");
            JOptionPane.showMessageDialog(this, " SUS DATOS FUERON GUARDADOS CORREPTAMENTE");
            String m[]={codeprod.getText(),namegrupo.getText()};
            GrillaProducto y = (GrillaProducto) ClasArea.are.get("grillaproduc");
            y.refrescarGrilla1(m);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR" + e);
        }
    }
public void cod(String codepr){
codeprod.setText(codepr);
}
public void namepr(String namprodv){
nameproduct.setText(namprodv);
}
public void codgru(String codgrue){
codegrupo.setText(codgrue);
}
public void namegru(String namegrue){
namegrupo.setText(namegrue);
}
public void vidaut(String vidaugrue){
vidadutil.setText(vidaugrue);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codegrupo = new javax.swing.JTextField();
        codeprod = new javax.swing.JTextField();
        namegrupo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jButton6 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton7 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        jSeparator19 = new javax.swing.JToolBar.Separator();
        jSeparator23 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        vidadutil = new javax.swing.JTextField();
        nameproduct = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Datos Generales de los Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codegrupo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        codegrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("Grupo:"));
        codegrupo.setName("Grupo:"); // NOI18N
        codegrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codegrupoActionPerformed(evt);
            }
        });
        jPanel1.add(codegrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 40));

        codeprod.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo:"));
        codeprod.setName("Codigo:"); // NOI18N
        jPanel1.add(codeprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 420, 40));

        namegrupo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        namegrupo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(namegrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 210, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BUSCAR 1OK.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 80, 30));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setRollover(true);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardaruni.jpg"))); // NOI18N
        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator6);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/udapte.jpg"))); // NOI18N
        jButton7.setText("Actualizar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator10);
        jToolBar1.add(jSeparator9);
        jToolBar1.add(jSeparator8);
        jToolBar1.add(jSeparator11);
        jToolBar1.add(jSeparator15);
        jToolBar1.add(jSeparator18);
        jToolBar1.add(jSeparator16);
        jToolBar1.add(jSeparator20);
        jToolBar1.add(jSeparator17);
        jToolBar1.add(jSeparator19);
        jToolBar1.add(jSeparator23);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 440, 40));

        vidadutil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vidadutil.setText("0");
        vidadutil.setBorder(javax.swing.BorderFactory.createTitledBorder("Vida Util"));
        vidadutil.setName("Vida Util:"); // NOI18N
        jPanel1.add(vidadutil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, -1));

        nameproduct.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Producto"));
        nameproduct.setName("Nombre del Producto"); // NOI18N
        nameproduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameproductKeyReleased(evt);
            }
        });
        jPanel1.add(nameproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 420, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/afhce curso activo fijo1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 440, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(this.va.validacionCamposNulosB()){
            guardar();
            codeprod.setText("");
            namegrupo.setText("");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(this.va.validacionCamposNulosB()){
            update();
            this.setVisible(false);
            codeprod.setText("");
            namegrupo.setText("");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        codeprod.setText("");
        namegrupo.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nameproductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameproductKeyReleased
     mayuscula();
    }//GEN-LAST:event_nameproductKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.poder = ClasArea.are.get("grillgrup");
        JDialog pu = (JDialog) this.poder;
        pu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void codegrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codegrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codegrupoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroProducto dialog = new RegistroProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField codegrupo;
    private javax.swing.JTextField codeprod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator23;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JLabel namegrupo;
    private javax.swing.JTextField nameproduct;
    public static javax.swing.JTextField vidadutil;
    // End of variables declaration//GEN-END:variables
}
