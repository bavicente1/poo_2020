/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.awt.Color;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bavic
 */
public class form_Registro extends javax.swing.JFrame {

    /**
     * Creates new form form_Registro
     */
    private static DefaultTableModel model;
    private static ArrayList<Object> listaProductos = Menu.getListaProductos();
    

    public form_Registro() {
        initComponents();
        lbl_AVISO.setVisible(false);
        IniciarTabla();
    

    }


    private void IniciarTabla() {
        String[] Titulos = {"ID", "NOMBRE", "STOCK", "Valor c/u"};
        model = new DefaultTableModel(Titulos, 0);
        table_Productos.setModel(model);

        try {

            for (Object producto : listaProductos) {

                Method metodoGetID = producto.getClass().getMethod("getId");
                int id = (int) metodoGetID.invoke(producto);
                String nombreProducto = (String) producto.getClass().getMethod("getNombre").invoke(producto);
                int stock = (int) producto.getClass().getMethod("getStock").invoke(producto);
                double valor = (double) producto.getClass().getMethod("getValor").invoke(producto);
                //Guarda los datos en la tabla
                String[] nuevoProd = {String.valueOf(id), nombreProducto, String.valueOf(stock), String.valueOf(valor)};
                model.addRow(nuevoProd);
            }

        } catch (Exception e) {
            System.out.println("Formulario de Registro error: " + e);

        }

    }

    public static ArrayList<Object> getListaProductos() {
        return listaProductos;
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
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_FechaVenc = new javax.swing.JTextField();
        cb_TipoProducto = new javax.swing.JComboBox<>();
        txt_fechaElab = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Productos = new javax.swing.JTable();
        txt_Precio = new javax.swing.JTextField();
        txt_Cantidad = new javax.swing.JTextField();
        btn_Nuevo = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        lbl_AVISO = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mI_Inicio = new javax.swing.JMenuItem();
        meIt_Venta = new javax.swing.JMenuItem();
        mI_Registro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(524, 401));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel8.setText("Elaboración:");

        jLabel3.setText("TIpo Producto:");

        cb_TipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Utensilio", "Oficina", "Industrial" }));
        cb_TipoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TipoProductoActionPerformed(evt);
            }
        });

        txt_fechaElab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaElabActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio:");

        jLabel9.setText("Vencimiento:");

        jLabel5.setText("Cantidad:");

        jLabel10.setText("Nombre:");

        jLabel6.setText("ID:");

        table_Productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_Productos);

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        lbl_AVISO.setForeground(new java.awt.Color(255, 0, 51));
        lbl_AVISO.setText("*Ingrese todos los datos requeridos*");

        jLabel7.setText("REGISTRO DE PRODUCTO");

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(53, 53, 53)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_Id)
                                            .addComponent(txt_Precio)
                                            .addComponent(cb_TipoProducto, 0, 103, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(38, 38, 38)
                                        .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_fechaElab, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_FechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lbl_AVISO, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Registrar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_TipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_FechaVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_fechaElab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(lbl_AVISO)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Registrar)
                    .addComponent(btn_Nuevo)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        mI_Inicio.setText("Inicio");
        mI_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mI_InicioActionPerformed(evt);
            }
        });
        jMenu1.add(mI_Inicio);

        meIt_Venta.setText("Venta");
        meIt_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meIt_VentaActionPerformed(evt);
            }
        });
        jMenu1.add(meIt_Venta);

        mI_Registro.setText("Registro");
        jMenu1.add(mI_Registro);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_TipoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TipoProductoActionPerformed
        limpiarTxt();
        if (cb_TipoProducto.getSelectedItem().equals("Comestible")) {
            txt_FechaVenc.setEditable(true);
            txt_fechaElab.setEditable(true);
            txt_FechaVenc.setBackground(Color.white);
            txt_fechaElab.setBackground(Color.white);
        } else {
            txt_FechaVenc.setEditable(false);
            txt_fechaElab.setEditable(false);
            txt_FechaVenc.setBackground(Color.GRAY);
            txt_fechaElab.setBackground(Color.gray);
        }
    }//GEN-LAST:event_cb_TipoProductoActionPerformed

    private void txt_fechaElabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaElabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaElabActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed

        if (camposLLenos()) {
            try {
                lbl_AVISO.setVisible(false);
                //Comprueba que sea un comestible y crea su respectivo objeto;
                //Guarda los datos en variables
                String nombre = txt_Nombre.getText();
                int id = Integer.parseInt(txt_Id.getText());
                int stock = Integer.parseInt(txt_Cantidad.getText());
                double valor = Double.parseDouble(txt_Precio.getText());
                String[] nuevoProducto = new String[4];
                //Añade el objeto a la lista según el nombre
                String className = cb_TipoProducto.getSelectedItem().toString();
                switch (className) {
                    case "Comestible":
                        Comestible com = new Comestible(txt_FechaVenc.getText(), txt_fechaElab.getText(), id, nombre, stock, valor);
                        listaProductos.add(com);
                        nuevoProducto[0] = String.valueOf(com.getId());
                        nuevoProducto[1] = com.getNombre();
                        nuevoProducto[2] = String.valueOf(com.getStock());
                        nuevoProducto[3] = String.valueOf(com.getValor());
                        break;
                    case "Industrial":
                        Industrial industrial = new Industrial(id, nombre, stock, valor);
                        listaProductos.add(industrial);
                        nuevoProducto[0] = String.valueOf(industrial.getId());
                        nuevoProducto[1] = industrial.getNombre();
                        nuevoProducto[2] = String.valueOf(industrial.getStock());
                        nuevoProducto[3] = String.valueOf(industrial.getValor());
                        break;
                    case "Oficina":
                        Oficina oficina = new Oficina(id, nombre, stock, valor);
                        listaProductos.add(oficina);
                        nuevoProducto[0] = String.valueOf(oficina.getId());
                        nuevoProducto[1] = oficina.getNombre();
                        nuevoProducto[2] = String.valueOf(oficina.getStock());
                        nuevoProducto[3] = String.valueOf(oficina.getValor());
                        break;
                    case "Utensilio":
                        Utensilio utensilio = new Utensilio(id, nombre, stock, valor);
                        listaProductos.add(utensilio);
                        nuevoProducto[0] = String.valueOf(utensilio.getId());
                        nuevoProducto[1] = utensilio.getNombre();
                        nuevoProducto[2] = String.valueOf(utensilio.getStock());
                        nuevoProducto[3] = String.valueOf(utensilio.getValor());

                        break;
                }
                model.addRow(nuevoProducto);
                limpiarTxt();
                     lbl_AVISO.setVisible(false);
            } catch (Exception e) {
                System.out.println(e);
                lbl_AVISO.setText("LLene los campos Correctamente");
                lbl_AVISO.setVisible(true);
            }

        } else {
            System.out.println("ingrese todos los campos requeridos");
            lbl_AVISO.setVisible(true);
        }


    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void meIt_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meIt_VentaActionPerformed
        form_Compra men = new form_Compra();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_meIt_VentaActionPerformed

    private void mI_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mI_InicioActionPerformed
        Menu men = new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mI_InicioActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
     
       limpiarTxt();
            
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
  int fila = table_Productos.getSelectedRow();

        if (fila != -1) {
            try {
                
               
                int id = Integer.parseInt(table_Productos.getValueAt(fila, 0).toString());
                int id2;
                //Busca el objeto en la lista de productos y le duevelve la cantidad a su stock
                for (Object producto : listaProductos) {

                    Method metodoGetID = producto.getClass().getMethod("getId");
                    id2 = (int) metodoGetID.invoke(producto);
                    if (id == id2) {
                        listaProductos.remove(producto);
                        
                        break;
                    }
                }

                //Actualiza los datos de la lista y la tabla
                
                model.removeRow(fila);

                
            } catch (Exception e) {
                System.out.println("btn_Eliminar" + e);

            }
        }       
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private boolean camposLLenos() {
        lbl_AVISO.setText("Rellene todos los campos");
        //Comprueba que todos los datos requeridos esten llenos
        if (!txt_Cantidad.getText().equals("") && !txt_Id.getText().equals("") && !txt_Nombre.getText().equals("") && !txt_Precio.getText().equals("")) {
            if (cb_TipoProducto.getSelectedItem().equals("Comestible")) {
                if (!txt_FechaVenc.getText().equals("") && !txt_fechaElab.getText().equals("")) {
                    lbl_AVISO.setVisible(false);
                    return true;
                } else {
                    return false;
                }
            } else {
                lbl_AVISO.setVisible(false);
                return true;
            }
        } else {
            return false;
        }

    }

    private void limpiarTxt() {
        //Vacia los txt_Field
        txt_Cantidad.setText("");
        txt_FechaVenc.setText("");
        txt_Id.setText("");
        txt_Nombre.setText("");
        txt_Precio.setText("");
        txt_fechaElab.setText("");
        lbl_AVISO.setVisible(false);
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
            java.util.logging.Logger.getLogger(form_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> cb_TipoProducto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_AVISO;
    private javax.swing.JMenuItem mI_Inicio;
    private javax.swing.JMenuItem mI_Registro;
    private javax.swing.JMenuItem meIt_Venta;
    private static javax.swing.JTable table_Productos;
    private javax.swing.JTextField txt_Cantidad;
    private javax.swing.JTextField txt_FechaVenc;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Precio;
    private javax.swing.JTextField txt_fechaElab;
    // End of variables declaration//GEN-END:variables
}