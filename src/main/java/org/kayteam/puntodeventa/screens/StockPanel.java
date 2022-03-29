/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.kayteam.puntodeventa.screens;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.kayteam.puntodeventa.objects.Product;

/**
 *
 * @author segun
 */
public class StockPanel extends javax.swing.JFrame {

    /**
     * Creates new form StockPanel
     */
    public StockPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        addProductButton = new javax.swing.JButton();
        removeProductButton = new javax.swing.JButton();
        searchProductButton = new javax.swing.JButton();
        editProductButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        addStockButton = new javax.swing.JButton();
        setStockButton = new javax.swing.JButton();
        removeStockButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Stock", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        loadTable();
        stockTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(stockTable);
        if (stockTable.getColumnModel().getColumnCount() > 0) {
            stockTable.getColumnModel().getColumn(0).setResizable(false);
            stockTable.getColumnModel().getColumn(1).setResizable(false);
            stockTable.getColumnModel().getColumn(2).setResizable(false);
            stockTable.getColumnModel().getColumn(3).setResizable(false);
        }

        addProductButton.setFont(new Font("Arial", Font.PLAIN, 20));
        addProductButton.setText("Añadir producto");
        addProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });

        removeProductButton.setFont(new Font("Arial", Font.PLAIN, 20));
        removeProductButton.setText("Elminar producto");
        removeProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProductButtonActionPerformed(evt);
            }
        });

        searchProductButton.setFont(new Font("Arial", Font.PLAIN, 20));
        searchProductButton.setText("Buscar");
        searchProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductButtonActionPerformed(evt);
            }
        });

        editProductButton.setFont(new Font("Arial", Font.PLAIN, 20));
        editProductButton.setText("Editar producto");
        editProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductButtonActionPerformed(evt);
            }
        });

        goBackButton.setFont(new Font("Arial", Font.PLAIN, 20));
        goBackButton.setText("Volver");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        addStockButton.setFont(new Font("Arial", Font.PLAIN, 20));
        addStockButton.setText("Agregar stock");
        addStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockButtonActionPerformed(evt);
            }
        });

        setStockButton.setFont(new Font("Arial", Font.PLAIN, 20));
        setStockButton.setText("Establecer stock");
        setStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setStockButtonActionPerformed(evt);
            }
        });

        removeStockButton.setFont(new Font("Arial", Font.PLAIN, 20));
        removeStockButton.setText("Restar stock");
        removeStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStockButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(setStockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 274, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductButtonActionPerformed
        // TODO add your handling code here:
        //searchProduct();
    }//GEN-LAST:event_searchProductButtonActionPerformed

    private void editProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductButtonActionPerformed
        // TODO add your handling code here:
        editProduct();
    }//GEN-LAST:event_editProductButtonActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void removeProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProductButtonActionPerformed
        // TODO add your handling code here:
        removeProduct();
    }//GEN-LAST:event_removeProductButtonActionPerformed

    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed
        // TODO add your handling code here:
        addProduct();
    }//GEN-LAST:event_addProductButtonActionPerformed

    private void addStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockButtonActionPerformed
        // TODO add your handling code here:
        addProductStock();
    }//GEN-LAST:event_addStockButtonActionPerformed

    private void setStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setStockButtonActionPerformed
        // TODO add your handling code here:
        setProductStock();
    }//GEN-LAST:event_setStockButtonActionPerformed

    private void removeStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStockButtonActionPerformed
        // TODO add your handling code here:
        removeProductStock();
    }//GEN-LAST:event_removeStockButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StockPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockPanel().setVisible(true);
            }
        });
    }

    private void editProduct(){
        JLabel codeInputLabel = new JLabel("<html>Ingrese el CÓDIGO del producto a editar<html>");
        codeInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
        String codeInput = JOptionPane.showInputDialog(codeInputLabel);
        if(codeInput == null){
            return;
        }
        try{
            long productCode = Long.parseLong(codeInput);
            if(MainPanel.getProductManager().isProduct(productCode)){
                Product editedProduct = MainPanel.getProductManager().getProduct(productCode);
                JLabel nameInputLabel = new JLabel("<html>Ingrese el nuevo NOMBRE del producto<br/>Nombre actual: "+editedProduct.getDescription()+"<html>");
                nameInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
                String nameInput = JOptionPane.showInputDialog(nameInputLabel);
                if(nameInput == null){
                    return;
                }
                String price = String.format("%,d", editedProduct.getPrice());
                JLabel priceInputLabel = new JLabel("<html>Ingrese el nuevo PRECIO del producto<br/>Precio actual: $"+price+"<html>");
                priceInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
                String priceInput = JOptionPane.showInputDialog(priceInputLabel);
                if(priceInput == null){
                    return;
                }
                int productPrice = Integer.parseInt(priceInput);
                editedProduct.setPrice(productPrice);
                editedProduct.setDescription(nameInput);
                MainPanel.getProductManager().saveProduct(editedProduct);
                loadTable();
            }else{
                JLabel label = new JLabel("El código de producto ingresado no existe.");
                label.setFont(new Font("Arial", Font.BOLD, 20));
                JOptionPane.showMessageDialog(this, label);
                addProduct();
            }
        }catch(Exception e){
            JLabel label = new JLabel("Debe ingresar un valor válido.");
            label.setFont(new Font("Arial", Font.BOLD, 20));
            JOptionPane.showMessageDialog(this, label);
            addProduct();
        }
    }

    private void addProduct(){
        JLabel codeInputLabel = new JLabel("<html>Ingrese el CÓDIGO del nuevo producto<html>");
        codeInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
        String codeInput = JOptionPane.showInputDialog(codeInputLabel);
        if(codeInput == null){
            return;
        }
        try{
            long productCode = Long.parseLong(codeInput);
            if(!MainPanel.getProductManager().isProduct(productCode)){
                JLabel nameInputLabel = new JLabel("<html>Ingrese el NOMBRE del nuevo producto<html>");
                nameInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
                String nameInput = JOptionPane.showInputDialog(nameInputLabel);
                if(nameInput == null){
                    return;
                }
                JLabel priceInputLabel = new JLabel("<html>Ingrese el PRECIO del nuevo producto<html>");
                priceInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
                String priceInput = JOptionPane.showInputDialog(priceInputLabel);
                if(priceInput == null){
                    return;
                }
                int productPrice = Integer.parseInt(priceInput);
                Product newProduct = new Product(nameInput, productPrice, productCode, 0);
                MainPanel.getProductManager().saveProduct(newProduct);
                loadTable();
            }else{
                JLabel label = new JLabel("El código de producto ingresado ya existe.");
                label.setFont(new Font("Arial", Font.BOLD, 20));
                JOptionPane.showMessageDialog(this, label);
                addProduct();
            }
        }catch(Exception e){
            JLabel label = new JLabel("Debe ingresar un valor válido.");
            label.setFont(new Font("Arial", Font.BOLD, 20));
            JOptionPane.showMessageDialog(this, label);
            addProduct();
        }
    }

    private void removeProductStock(){
        JLabel codeInputLabel = new JLabel("<html>Ingrese el CÓDIGO del producto<html>");
        codeInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
        String codeInput = JOptionPane.showInputDialog(codeInputLabel);
        if(codeInput == null){
            return;
        }
        try{
            long productCode = Long.parseLong(codeInput);
            if(MainPanel.getProductManager().isProduct(productCode)){
                JLabel stockInputLabel = new JLabel("<html>Ingrese la CANTIDAD a remover del stock<html>");
                stockInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
                String stockInput = JOptionPane.showInputDialog(stockInputLabel);
                if(stockInput == null){
                    return;
                }
                Product product = MainPanel.getProductManager().getProduct(productCode);
                int finalStock = product.getStock()-Integer.parseInt(stockInput);
                if(finalStock < 0){
                    finalStock = 0;
                }
                product.setStock(finalStock);
                MainPanel.getProductManager().saveProduct(product);
                loadTable();
            }else{
                JLabel label = new JLabel("El código de producto ingresado no existe.");
                label.setFont(new Font("Arial", Font.BOLD, 20));
                JOptionPane.showMessageDialog(this, label);
                addProduct();
            }
        }catch(Exception e){
            JLabel label = new JLabel("Debe ingresar un valor válido.");
            label.setFont(new Font("Arial", Font.BOLD, 20));
            JOptionPane.showMessageDialog(this, label);
            addProduct();
        }
    }

    private void addProductStock(){
        JLabel codeInputLabel = new JLabel("<html>Ingrese el CÓDIGO del producto<html>");
        codeInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
        String codeInput = JOptionPane.showInputDialog(codeInputLabel);
        if(codeInput == null){
            return;
        }
        try{
            long productCode = Long.parseLong(codeInput);
            if(MainPanel.getProductManager().isProduct(productCode)){
                JLabel stockInputLabel = new JLabel("<html>Ingrese el STOCK del producto<html>");
                stockInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
                String stockInput = JOptionPane.showInputDialog(stockInputLabel);
                if(stockInput == null){
                    return;
                }
                Product product = MainPanel.getProductManager().getProduct(productCode);
                product.setStock(product.getStock()+Integer.parseInt(stockInput));
                MainPanel.getProductManager().saveProduct(product);
                loadTable();
            }else{
                JLabel label = new JLabel("El código de producto ingresado no existe.");
                label.setFont(new Font("Arial", Font.BOLD, 20));
                JOptionPane.showMessageDialog(this, label);
                addProduct();
            }
        }catch(Exception e){
            JLabel label = new JLabel("Debe ingresar un valor válido.");
            label.setFont(new Font("Arial", Font.BOLD, 20));
            JOptionPane.showMessageDialog(this, label);
            addProduct();
        }
    }

    private void setProductStock(){
        JLabel codeInputLabel = new JLabel("<html>Ingrese el CÓDIGO del producto<html>");
        codeInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
        String codeInput = JOptionPane.showInputDialog(codeInputLabel);
        if(codeInput == null){
            return;
        }
        try{
            long productCode = Long.parseLong(codeInput);
            if(MainPanel.getProductManager().isProduct(productCode)){
                JLabel stockInputLabel = new JLabel("<html>Ingrese el STOCK del producto<html>");
                stockInputLabel.setFont(new Font("Arial", Font.BOLD, 20));
                String stockInput = JOptionPane.showInputDialog(stockInputLabel);
                if(stockInput == null){
                    return;
                }
                Product product = MainPanel.getProductManager().getProduct(productCode);
                product.setStock(Integer.parseInt(stockInput));
                MainPanel.getProductManager().saveProduct(product);
                loadTable();
            }else{
                JLabel label = new JLabel("El código de producto ingresado no existe.");
                label.setFont(new Font("Arial", Font.BOLD, 20));
                JOptionPane.showMessageDialog(this, label);
                addProduct();
            }
        }catch(Exception e){
            JLabel label = new JLabel("Debe ingresar un valor válido.");
            label.setFont(new Font("Arial", Font.BOLD, 20));
            JOptionPane.showMessageDialog(this, label);
            addProduct();
        }
    }

    private void removeProduct(){
        try{
            JLabel inputLabel = new JLabel("<html>Ingrese el código del producto<html>");
            inputLabel.setFont(new Font("Arial", Font.BOLD, 20));
            String input = JOptionPane.showInputDialog(inputLabel);
            if(input == null){
                return;
            }
            long productCode = Long.parseLong(input);
            Product productToDelete = MainPanel.getProductManager().getProduct(productCode);
            JLabel confirmLabel = new JLabel("<html>Producto: "+productToDelete.getDescription()+"<br/><br/>¿Estás seguro de eliminar?<html>");
            confirmLabel.setFont(new Font("Arial", Font.BOLD, 20));
            int option = JOptionPane.showConfirmDialog(this, confirmLabel);
            if(option == 0){
                MainPanel.getProductManager().deleteProduct(productCode);
                loadTable();
            }
        }catch(Exception e){
            JLabel label = new JLabel("Debe ingresar un código de producto válido.");
            label.setFont(new Font("Arial", Font.BOLD, 20));
            JOptionPane.showMessageDialog(this, label);
            removeProduct();
        }
    }

    private void loadTable(){
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        model.setRowCount(0);
        for(Product product : MainPanel.getProductManager().getProducts().values()){
            model.addRow(new Object[]{product.getCode(), product.getDescription(), product.getStock(), product.getPrice()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductButton;
    private javax.swing.JButton addStockButton;
    private javax.swing.JButton editProductButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeProductButton;
    private javax.swing.JButton removeStockButton;
    private javax.swing.JButton searchProductButton;
    private javax.swing.JButton setStockButton;
    private javax.swing.JTable stockTable;
    // End of variables declaration//GEN-END:variables
}
