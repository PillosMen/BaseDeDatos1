package base.de.datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class productos extends javax.swing.JFrame {

    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    DefaultTableModel model;
    
    public productos() {
        initComponents();
        setLocationRelativeTo(null);
        buscar("");
       
    }

    public void buscar(String valor){
            
        String [] titulos = {"CÓDIGO","NOMBRE","PRECIO"};
        String [] registros = new String[3];
        
        int x = 0;
        String aux = null;
        
        String sql = "SELECT * FROM alumnos WHERE nombre LIKE '%"+valor+"%' or nc LIKE '%"+valor+"%'";
          
        model = new DefaultTableModel(null,titulos);

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
 
            while(rs.next()){
                registros[0]=rs.getString("nc");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("domicilio");
              
                model.addRow(registros);
                x = rs.getRow();
                aux = Integer.toString(x);
                //cantidad.setText(aux);
            }
            tabla.setModel(model);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void limpiar(){
        num.setText(null);
        nom.setText(null);
        dom.setText(null);
    }
    
    public void EditarTabla(){

     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        dom = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Editar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre");

        jLabel3.setText("Precio:");

        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });

        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });

        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel4.setText("Nuevo Registro");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        Editar.setText("EDITAR");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Guardar.setText("GUARDAR");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Salir)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dom, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Editar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Eliminar)
                                        .addGap(71, 71, 71)
                                        .addComponent(Guardar)))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(jLabel7)
                    .addComponent(Editar)
                    .addComponent(Guardar)
                    .addComponent(Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
  
    }//GEN-LAST:event_numActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed


    }//GEN-LAST:event_nomActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String nc, nombre, domicilio;
        nc = num.getText();
        nombre = nom.getText();
        domicilio = dom.getText();
        
        String sql="INSERT INTO alumnos VALUES('"+nc+"' , '"+nombre+"' , '"+domicilio+"' ) ";
        
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
             JOptionPane.showMessageDialog(this, "Se guardo con Exito!!!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
             limpiar();
             buscar("");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        String nombre, domicilio, nc;
        nc = num.getText();
        nombre = nom.getText();
        domicilio = dom.getText();
        
        String sql="UPDATE alumnos SET nombre='"+nombre+"' , domicilio='"+domicilio+"' WHERE nc='"+nc+"' ";
         int fila = tabla.getSelectedRow();
        if(fila >=0){
             
        try {
             
            Statement st = cn.createStatement();
            
            st.executeUpdate(sql);
             JOptionPane.showMessageDialog(this, "Se Edito con Exito!!!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
             limpiar();
             buscar("");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
        else{
              JOptionPane.showMessageDialog(this, "ERROR!!!\nDebe de seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        String nc = num.getText();
        int fila = tabla.getSelectedRow();
        if(fila >=0){

            String sql="DELETE FROM alumnos WHERE nc='"+nc+"' ";
            try {
                Statement st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Se Elimino con Exito!!!", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                buscar("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "ERROR!!!\nDebe de seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if(fila >=0){
            num.setText((String) tabla.getModel().getValueAt(0, 0));
            nom.setText((String) tabla.getModel().getValueAt(0, 1));
            dom.setText((String) tabla.getModel().getValueAt(0, 2));
        }
        else{
            JOptionPane.showMessageDialog(this, "ERROR!!!\nDebe de seleccionar una fila", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tablaMouseClicked

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField dom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField num;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
