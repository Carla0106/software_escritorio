/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class Pantalla02 extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla02
     */
    public Pantalla02() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jSpinner1 = new javax.swing.JSpinner();
        TituloPa02 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        opInicio = new javax.swing.JMenu();
        opUsuario = new javax.swing.JMenu();
        opSaldo = new javax.swing.JMenuItem();
        opTransferencias = new javax.swing.JMenuItem();
        opHistorial = new javax.swing.JMenuItem();
        opConfiguracion = new javax.swing.JMenu();
        opActualizarContraseña = new javax.swing.JMenuItem();
        opSalir = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TituloPa02.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        TituloPa02.setText("BANK WORLD");

        jLabel1.setText("Bienvenido al mejor banco del mundo.....");

        opInicio.setText("Inicio");
        jMenuBar3.add(opInicio);

        opUsuario.setText("Usuario");

        opSaldo.setText("Saldo");
        opUsuario.add(opSaldo);

        opTransferencias.setText("Transferencia");
        opUsuario.add(opTransferencias);

        opHistorial.setText("Historial");
        opUsuario.add(opHistorial);

        jMenuBar3.add(opUsuario);

        opConfiguracion.setText("Configuracion");

        opActualizarContraseña.setText("Actualizar Contraseña");
        opConfiguracion.add(opActualizarContraseña);

        jMenuBar3.add(opConfiguracion);

        opSalir.setText("Salir");
        jMenuBar3.add(opSalir);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TituloPa02, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(TituloPa02)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(114, 114, 114))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Pantalla02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloPa02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JMenuItem opActualizarContraseña;
    private javax.swing.JMenu opConfiguracion;
    private javax.swing.JMenuItem opHistorial;
    private javax.swing.JMenu opInicio;
    private javax.swing.JMenuItem opSaldo;
    private javax.swing.JMenu opSalir;
    private javax.swing.JMenuItem opTransferencias;
    private javax.swing.JMenu opUsuario;
    // End of variables declaration//GEN-END:variables
}
