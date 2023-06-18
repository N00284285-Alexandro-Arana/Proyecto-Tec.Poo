/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservacionlosadeportiva.pantallas;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Piero354
 */
public class JFrameReservaciones extends javax.swing.JFrame {

    private Cliente cliente;
    List<Cliente> clientes = new ArrayList<>();
    DefaultListModel modeloLista = new DefaultListModel();
    
    /**
     * Creates new form JFrameReservaciones
     */
    public JFrameReservaciones() {
        initComponents();
        List_Reservaciones.setModel(modeloLista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List_Reservaciones = new javax.swing.JList<>();
        btn_agregar_reservacion = new javax.swing.JButton();
        btn_quitar_reservacion = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_actualizar_lista = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        btn_soporte = new javax.swing.JButton();
        cancha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lbl_TotalReservacionesDia = new javax.swing.JLabel();
        btn_quitar_reservacion1 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("RESERVACIONES");

        List_Reservaciones.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List_Reservaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                List_ReservacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List_Reservaciones);

        btn_agregar_reservacion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_agregar_reservacion.setText("AGREGAR RESERVACION");
        btn_agregar_reservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_reservacionActionPerformed(evt);
            }
        });

        btn_quitar_reservacion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_quitar_reservacion.setText("QUITAR RESERVACION");
        btn_quitar_reservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitar_reservacionActionPerformed(evt);
            }
        });

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida-de-la-puerta.png"))); // NOI18N
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Reservaciones ya hechas:");

        btn_actualizar_lista.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_actualizar_lista.setText("ACTUALIZAR LISTA");
        btn_actualizar_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizar_listaActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_buscar.setText("BUSCAR ");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_soporte.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_soporte.setText("CONTACO SOPORTE");
        btn_soporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_soporteActionPerformed(evt);
            }
        });

        cancha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/campo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/variante-de-balon-de-futbol.png"))); // NOI18N

        lblTotal.setText("...");

        lbl_TotalReservacionesDia.setText("...");

        btn_quitar_reservacion1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_quitar_reservacion1.setText("IMPRIMIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar)))
                        .addGap(46, 46, 46)
                        .addComponent(cancha)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45)
                        .addComponent(btn_regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_TotalReservacionesDia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTotal)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_agregar_reservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_quitar_reservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_actualizar_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_quitar_reservacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btn_soporte)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_regresar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_buscar))))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_TotalReservacionesDia)
                                .addComponent(btn_soporte))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregar_reservacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_quitar_reservacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar_lista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_quitar_reservacion1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_soporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_soporteActionPerformed
        JFrameSoporteTecnico Soporte = new JFrameSoporteTecnico(this);
        Soporte.setLocationRelativeTo(this);
        Soporte.setVisible(true);
        this.setVisible(false);           
    }//GEN-LAST:event_btn_soporteActionPerformed

    private void btn_agregar_reservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_reservacionActionPerformed
        JFrameNuevaReservacion NuevaReservacion = new JFrameNuevaReservacion(this);
        NuevaReservacion.setLocationRelativeTo(this);
        NuevaReservacion.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_btn_agregar_reservacionActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        Buscar();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_actualizar_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizar_listaActionPerformed
        // TODO add your handling code here:
        actulizarList();        
        Sumar();
        TotalReservacionesDia();
    }//GEN-LAST:event_btn_actualizar_listaActionPerformed

    private void List_ReservacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_List_ReservacionesMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_List_ReservacionesMouseClicked

    private void btn_quitar_reservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitar_reservacionActionPerformed
        // TODO add your handling code here:
        Eliminar(); 
        actulizarList();        
    }//GEN-LAST:event_btn_quitar_reservacionActionPerformed
    
    void Eliminar(){
        int eliminar = List_Reservaciones.getSelectedIndex();
        clientes.remove(eliminar);
    }
    
    void actulizarList(){
        modeloLista.removeAllElements();
            for(Cliente listaCliente: clientes) {
            modeloLista.addElement(listaCliente.mostrarDatosClientes());    
        }
    }
    
    void Buscar(){
        modeloLista.removeAllElements();
        for(Cliente listaCliente: clientes){
            if (listaCliente.getDni().toLowerCase().contains(txt_buscar.getText())) {
                modeloLista.addElement(listaCliente.mostrarDatosClientes());
            }
        }
    }
    
    void Sumar(){
        int tam = clientes.size();
        int count = 0;
        String TotalActulizado;
        for (int i = 0; i < tam; i++) {
            count+=clientes.get(i).getTarifa();
        }   
        TotalActulizado = Integer.toString(count);
        lblTotal.setText("Total S/."+TotalActulizado); //
    }
    
    void TotalReservacionesDia(){
        String TotalReserva = Integer.toString(clientes.size());
        lbl_TotalReservacionesDia.setText("Total Reservas: "+TotalReserva);
    }
     
    void setCliente(Cliente cliente){
        clientes.add(cliente);  
    }
    
    /*void setReservacion(Reservacion reservacion){
        reservaciones.add(reservacion);
    }*/
    
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
            java.util.logging.Logger.getLogger(JFrameReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameReservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameReservaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List_Reservaciones;
    private javax.swing.JButton btn_actualizar_lista;
    private javax.swing.JButton btn_agregar_reservacion;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_quitar_reservacion;
    private javax.swing.JButton btn_quitar_reservacion1;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_soporte;
    private javax.swing.JLabel cancha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbl_TotalReservacionesDia;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
