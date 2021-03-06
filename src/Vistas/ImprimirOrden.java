/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.crearPdf;
import modelo.impOrdenCarta;
import modelo.impOrdenLegal;
import modelo.imprimirOrden;
import modelo.orden;
import modelo.plantillaPDF;
import modelo.pruebapdf;
import modelo.tiquet;

/**
 *
 * @author Usuario
 */
public class ImprimirOrden extends javax.swing.JFrame {
    
    tiquet nuevoTiquet = new tiquet();
    plantillaPDF nuevoPDF = new plantillaPDF();
    crearPdf xxx=new crearPdf();
    int idOrden =0, tiq =0;
    String idCadOrden = "";
    orden nuevaOrden = new orden();
//    imprimirOrden impOrd = new imprimirOrden();
    String valTiquet="";
    int numRegTiq=0;
    pruebapdf prueba = new pruebapdf();
    impOrdenLegal legal = new impOrdenLegal();
    impOrdenCarta carta = new impOrdenCarta();
    /**
     * Creates new form ImprimirOrden
     */
    public ImprimirOrden() throws SQLException {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Calzado Seiya");
        this.setResizable(false);
        llenarCB();
    }
    
    public void llenarCB() throws SQLException{
        cmbOrden.removeAllItems(); //Vaciamos el JComboBox
        ArrayList<String> resultat;
        resultat = nuevoTiquet.CargarCombo();//La consulta tiene que retornar un ArrayList

        for(int i=0; i<resultat.size();i++){
            cmbOrden.addItem(resultat.get(i));
        }
    }
    
    public void mostrarDatosOrden(){
        ArrayList<orden> resultat;
        resultat = nuevaOrden.CargarDatosOrden(idCadOrden);//La consulta tiene que retornar un ArrayList
        
        int idc =0;
        String ciu ="";
        String fecent ="";
        String fecped = "";
        String nom = "";
        for (orden ord : new orden().CargarDatosOrden(idCadOrden)){
                  idc = ord.getCliente();
                  ciu=  ord.getCiudad();
                  fecped = ord.getPedido();
                  fecent = ord.getEntrega();                  
        }
        
        //this.texto.setText("id del cliente " + idc + "\n ciudad " + ciu + "\n fececha pedido " + fecped + "\n  fecha entrega " + fecent );
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
        cmbOrden = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imprimir Orden"));

        cmbOrden.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdenActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione Orden:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo.png"))); // NOI18N

        jButton1.setText("Descargar Orden Carta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Descargar Orden Legal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(cmbOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdenActionPerformed
        try {

            idCadOrden = (String) cmbOrden.getSelectedItem();
            idOrden= nuevoTiquet.consultarIdOrden(idCadOrden);
            

        } catch (SQLException ex) {
            Logger.getLogger(Tiquet.class.getName()).log(Level.SEVERE, null, ex);
            this.mensaje.setText("Error al Cargar tiqued desde la orden");
        }
    }//GEN-LAST:event_cmbOrdenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            this.mostrarDatosOrden();
            numRegTiq = this.nuevoTiquet.consultarRegistrosOrdenTiquet(idOrden);
          //  System.out.println ("\n numero de  tiquets en la orden: "+ numRegTiq+"\n"); 
          if(this.carta.impOrden(idOrden, idCadOrden, numRegTiq))
              this.mensaje.setText("Orden N° " + idCadOrden + " Tamaño Carta Generada");
          
          //  this.prueba.impOrden(idOrden, idCadOrden, numRegTiq);
           // this.legal.impOrden(idOrden, idCadOrden, numRegTiq);
        } catch (SQLException ex) {
            this.mensaje.setText("No se pudo generar el PDF");
            Logger.getLogger(ImprimirOrden.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            this.mostrarDatosOrden();
            numRegTiq = this.nuevoTiquet.consultarRegistrosOrdenTiquet(idOrden);
            
          if(this.legal.impOrden(idOrden, idCadOrden, numRegTiq)){
              this.mensaje.setText("Orden N° " + idCadOrden + " Tamaño Legal Generada");
             
             // this.mensaje.setText("");
               //Thread.currentThread().sleep (10000);
          }
            
        } catch (SQLException ex) {
            Logger.getLogger(ImprimirOrden.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public String seleccionarTiquet(int id){
        ArrayList<String> resultat;
        resultat = nuevoTiquet.CargarComboTiquet(id);//La consulta tiene que retornar un ArrayList
        String vec[] = null;
        String valorTiquet ="";
     // System.out.print(resultat);
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        /*
        Iterator<String> tiquetIterator = resultat.iterator();
        while(tiquetIterator.hasNext()){
               valorTiquet = tiquetIterator.next();
                //System.out.print(valorTiquet+" / ");
                this.impOrd.imp(valorTiquet, idOrden, idCadOrden, numRegTiq );
        }*/
        
        
        
        return valorTiquet;
    }
    
    private static void printArray(String[] anArray) {
      for (int i = 0; i < anArray.length; i++) {
         
         System.out.print(anArray[i]);
      }
   }
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
            java.util.logging.Logger.getLogger(ImprimirOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ImprimirOrden().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ImprimirOrden.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOrden;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    // End of variables declaration//GEN-END:variables
}
