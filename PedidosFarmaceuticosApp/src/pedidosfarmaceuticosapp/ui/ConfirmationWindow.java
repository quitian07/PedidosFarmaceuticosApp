package pedidosfarmaceuticosapp.ui;

import pedidosfarmaceuticosapp.model.Order;
import javax.swing.JOptionPane;

public class ConfirmationWindow extends javax.swing.JFrame {
    private Order order;
    
    public ConfirmationWindow(){
        initComponents();
        
        getContentPane().setBackground(new java.awt.Color(144, 238, 144));
    }
    // Creacion del constructor-
    public ConfirmationWindow(Order order){
        this.order = order;
        initComponents();
        setTitle("Pedido al distribuidor " + order.getDistributor());
        
        lblTitle.setText("Resumen del pedido");
        
        String medicineInfo = order.getQuantity() + " unidades del " +
                              order.getMedicineType().toLowerCase() + " " +
                              order.getMedicineName();
        lblMedicineInfo.setText(medicineInfo);
        
        String addressInfo = "Para la farmacia situada en ";
        if (order.isMainBranch() && order.isSecondaryBranch()) {
            addressInfo += "Calle 1 # 23 - 15";
        } else if (order.isMainBranch()) {
            addressInfo += "Calle 114 b sur # 7c este - 48";
        } else if (order.isSecondaryBranch()) {
            addressInfo += "Calle 123 # 11 - 48";
        }
        lblAddressInfo.setText(addressInfo);
    }
 
      //clase main                                    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ConfirmationWindow().setVisible(true));
    }
    // 
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblMedicineInfo = new javax.swing.JLabel();
        lblAddressInfo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        lblTitle.setText("jLabel1");

        lblMedicineInfo.setText("jLabel1");

        lblAddressInfo.setText("jLabel1");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddressInfo)
                            .addComponent(lblMedicineInfo)
                            .addComponent(lblTitle)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnCancelar)
                        .addGap(117, 117, 117)
                        .addComponent(btnEnviar)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblMedicineInfo)
                .addGap(18, 18, 18)
                .addComponent(lblAddressInfo)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEnviar))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose(); // cerrar ventana
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        System.out.println("Pedido enviado");
        JOptionPane.showMessageDialog(this, 
            "Pedido enviado con éxito", 
            "Confirmación", 
            JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel lblAddressInfo;
    private javax.swing.JLabel lblMedicineInfo;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
