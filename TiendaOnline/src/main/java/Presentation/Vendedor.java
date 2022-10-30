/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentation;

import datos.Conexion;
import datos.VendedorDaoJDBC;
import domain.VendedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Vendedor extends javax.swing.JFrame {

    /**
     * Creates new form Vendedor
     */
    public Vendedor() {
        initComponents();
       
    }
    
    public void Tabla(){
       DefaultTableModel model =  (DefaultTableModel)tab.getModel();
       model.setRowCount(0);
       
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       
        Connection conexion = null;
        try {
        conexion = Conexion.getConnection();
        ps = conexion.prepareStatement("SELECT id_vendedor, nombre, password FROM Vendedor");
        
        rs = ps.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();
        
        while(rs.next()){
            Object [] fila = new Object[columnas];
            for(int ind=0; ind<columnas; ind++){
                fila[ind] = rs.getObject(ind +1);   
            }
            model.addRow(fila);
        }
        
        } catch (SQLException ex1) {
             ex1.printStackTrace(System.out);
        }
       
       
    }
    
   
    
     public void borrar(){
      
        idvendedor.setText("");
        nombre.setText("");
        contraseña.setText("");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idvendedor = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        insertar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        contraseña = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        selec = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("     SELLER");

        jLabel2.setText("ID");

        jLabel3.setText("NAME");

        jLabel4.setText("PASSWORD");

        insertar.setText("INSERT");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        actualizar.setText("UPDATE");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        borrar.setText("DELETE");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(tab);

        selec.setText("Seleccionar");
        selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(insertar)
                .addGap(40, 40, 40)
                .addComponent(actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(borrar)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(87, 87, 87)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selec)
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizar)
                    .addComponent(insertar)
                    .addComponent(borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selec)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            
            //autocommit por default es true, lo pasamos a false
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
               
                System.out.println("SE HA CONECTADO");
            }

            VendedorDaoJDBC vendedorJdbc = new VendedorDaoJDBC(conexion);
            
           

            VendedorDTO nuevoVendedor = new VendedorDTO();
            nuevoVendedor.setId_vendedor(Integer.parseInt(idvendedor.getText()));
            nuevoVendedor.setNombre(""+nombre.getText());
            nuevoVendedor.setPassword(Integer.parseInt(contraseña.getText()));
            vendedorJdbc.insert(nuevoVendedor);
            
         conexion.commit();
            
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        borrar();
    }//GEN-LAST:event_insertarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
      Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            
            //autocommit por default es true, lo pasamos a false
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
               
                System.out.println("SE HA CONECTADO");
            }

            VendedorDaoJDBC vendedorJdbc = new VendedorDaoJDBC(conexion);
            
           

            VendedorDTO acVendedor = new VendedorDTO();
            acVendedor.setId_vendedor(Integer.parseInt(idvendedor.getText()));
            acVendedor.setNombre(""+nombre.getText());
            acVendedor.setPassword(Integer.parseInt(contraseña.getText()));
            vendedorJdbc.update( acVendedor);
            
         conexion.commit();
            
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        borrar();
    }//GEN-LAST:event_actualizarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            
            //el autocommit por default es true, lo pasamos a false
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
                
                System.out.println("SE HA CONECTADO");
            }

            VendedorDaoJDBC vendedorJdbc = new VendedorDaoJDBC(conexion);
            
           

            VendedorDTO deletVendedor = new VendedorDTO();
            deletVendedor.setId_vendedor(Integer.parseInt(idvendedor.getText()));
             
            vendedorJdbc.delete(deletVendedor );
            
         conexion.commit();
            
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        borrar();
        
    }//GEN-LAST:event_borrarActionPerformed

    private void selecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecActionPerformed
        
        Tabla();
        
        
    }//GEN-LAST:event_selecActionPerformed

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
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField contraseña;
    private javax.swing.JTextField idvendedor;
    private javax.swing.JButton insertar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton selec;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}