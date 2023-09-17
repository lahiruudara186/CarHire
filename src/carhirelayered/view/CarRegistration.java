/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carhirelayered.view;

import carhirelayered.controller.CarControllor;
import carhirelayered.dao.car.CarDao;
import carhirelayered.dto.CarDto;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author udara
 */
public class CarRegistration extends javax.swing.JFrame {

    /**
     * Creates new form CarRegistration
     */
    private CarControllor carontrollor;

    public CarRegistration() {
        initComponents();
        carontrollor = new CarControllor();
        autiID();
//        table_update();
        loadAllCars();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regNoField = new javax.swing.JTextField();
        brandField = new javax.swing.JTextField();
        modelField = new javax.swing.JTextField();
        availabilityField = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carRegTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Car Register");

        jLabel2.setText("Reg No");

        jLabel3.setText("Brand");

        jLabel4.setText("Model");

        jLabel5.setText("Availability");

        availabilityField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(availabilityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(regNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addBtn)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(brandField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editBtn)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(availabilityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));

        carRegTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No", "Brand", "Model", "Awailability"
            }
        ));
        carRegTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carRegTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carRegTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
//        String regNo = regNoField.getText();
//        String brand = brandField.getText();
//        String model = modelField.getText();
//        String availability = availabilityField.getSelectedItem().toString();
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/car_rent", "root", "Lahiru@448");
//            pst = con.prepareStatement("insert into car_registration(car_number,brand,model,availability) values(?,?,?,?)");
//
//            pst.setString(1, regNo);
//            pst.setString(2, brand);
//            pst.setString(3, model);
//            pst.setString(4, availability);
//
//            pst.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Successfully added a new car");
//
//            brandField.setText("");
//            modelField.setText("");
//            availabilityField.setSelectedIndex(-1);
//            brandField.requestFocus();
//
//            autiID();
//            table_update();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
//        }
        addCar();
//        table_update();
        loadAllCars();
    }//GEN-LAST:event_addBtnActionPerformed

    private void carRegTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carRegTableMouseClicked
        DefaultTableModel defaultTableModel = (DefaultTableModel) carRegTable.getModel();

        int selectedWhere = carRegTable.getSelectedRow();

        regNoField.setText(defaultTableModel.getValueAt(selectedWhere, 0).toString());
        brandField.setText(defaultTableModel.getValueAt(selectedWhere, 1).toString());
        modelField.setText(defaultTableModel.getValueAt(selectedWhere, 2).toString());
        availabilityField.setSelectedItem(defaultTableModel.getValueAt(selectedWhere, 3).toString());
    }//GEN-LAST:event_carRegTableMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
//        DefaultTableModel defaultTableModel = (DefaultTableModel) carRegTable.getModel();
//        int selectedWhere = carRegTable.getSelectedRow();
//
//        try {
//            String id = defaultTableModel.getValueAt(selectedWhere, 0).toString();
//            String brand = brandField.getText();
//            String model = modelField.getText();
//            String availability = availabilityField.getSelectedItem().toString();
//
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/car_rent", "root", "Lahiru@448");
//
//            pst = con.prepareStatement("update car_registration set brand=?,model=?,availability=? where car_number=?");
//
//            pst.setString(1, brand);
//            pst.setString(2, model);
//            pst.setString(3, availability);
//            pst.setString(4, id);
//
//            pst.executeUpdate();
//
//            JOptionPane.showMessageDialog(this, "Successfully updated");
//            table_update();
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
//        }

        editCar();
        loadAllCars();
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
//        DefaultTableModel defaultTableModel = (DefaultTableModel) carRegTable.getModel();
//        int selectedWhere = carRegTable.getSelectedRow();
//
//        String id = defaultTableModel.getValueAt(selectedWhere, 0).toString();
//        int conf = JOptionPane.showConfirmDialog(this, "Do yo really want to delete this record?", "Warning", JOptionPane.YES_NO_OPTION);
//        if (conf == JOptionPane.YES_OPTION) {
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                con = DriverManager.getConnection("jdbc:mysql://localhost/car_rent", "root", "Lahiru@448");
//                pst = con.prepareStatement("delete from car_registration where car_number=?");
//                pst.setString(1, id);
//                pst.executeUpdate();
//                JOptionPane.showMessageDialog(this, "Recode is deleted");
//                table_update();
//
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (SQLException ex) {
//                Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
        deleteCar();
        loadAllCars();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CarRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> availabilityField;
    private javax.swing.JTextField brandField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTable carRegTable;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modelField;
    private javax.swing.JTextField regNoField;
    // End of variables declaration//GEN-END:variables

    Connection con;
    PreparedStatement pst;

//    public void table_update() {
//
//        int columnCount;
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/car_rent", "root", "Lahiru@448");
//            pst = con.prepareStatement("select * from car_registration");
//            ResultSet resultSet = pst.executeQuery();
//
//            ResultSetMetaData resultsetMetadata = resultSet.getMetaData();
//            columnCount = resultsetMetadata.getColumnCount();
//
//            DefaultTableModel defaultTableModel = (DefaultTableModel) carRegTable.getModel();
//            defaultTableModel.setRowCount(0);
//
//            while (resultSet.next()) {
//
//                Vector vector = new Vector();
//                for (int i = 1; i <= columnCount; i++) {
//                    vector.add(resultSet.getString("car_number"));
//                    vector.add(resultSet.getString("brand"));
//                    vector.add(resultSet.getString("model"));
//                    vector.add(resultSet.getString("availability"));
//                }
//                defaultTableModel.addRow(vector);
//
//            }
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    public void autiID() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/car_rent", "root", "Lahiru@448");
            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("select Max(car_number) from car_registration");

            resultSet.next();
            resultSet.getString("Max(car_number)");
            if (resultSet.getString("Max(car_number)") == null) {
                regNoField.setText("C001");
            } else {
                long id = Long.parseLong(resultSet.getString("Max(car_number)").substring(2, resultSet.getString("Max(car_number)").length()));
                id++;
                regNoField.setText("C0" + String.format("%03d", id));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addCar() {
        try {
            CarDto carDto = new CarDto(regNoField.getText(), brandField.getText(), modelField.getText(), availabilityField.getSelectedItem().toString());

            String result = carontrollor.addCar(carDto);
            JOptionPane.showMessageDialog(this, result);
            clearCarForm();
        } catch (Exception ex) {
            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void loadAllCars() {
        try {
            String[] columns = {"Reg No", "Brand", "Model", "Availability"};
            DefaultTableModel defaultTableModel = new DefaultTableModel(columns, 0) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            carRegTable.setModel(defaultTableModel);
            ArrayList<CarDto> cars = carontrollor.getAllCars();

            for (CarDto car : cars) {
                Object[] rowData = {car.getRegNo(), car.getBrand(), car.getModel(), car.getAvailability()};
                defaultTableModel.addRow(rowData);
            }
        } catch (Exception ex) {
            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearCarForm() {
        brandField.setText("");
        modelField.setText("");
        availabilityField.setSelectedIndex(-1);
        brandField.requestFocus();
    }

    private void editCar() {
        try {
            CarDto carDto = new CarDto(regNoField.getText(), brandField.getText(), modelField.getText(), availabilityField.getSelectedItem().toString());

            String result = carontrollor.editCar(carDto);
            JOptionPane.showMessageDialog(this, result);
            clearCarForm();
        } catch (Exception ex) {
            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void deleteCar() {
        try {
            DefaultTableModel defaultTableModel = (DefaultTableModel) carRegTable.getModel();
            int selectedWhere = carRegTable.getSelectedRow();

            String id = defaultTableModel.getValueAt(selectedWhere, 0).toString();

            String result = carontrollor.deleteCar(id);
            JOptionPane.showMessageDialog(this, result);
            clearCarForm();
        } catch (Exception ex) {
            Logger.getLogger(CarRegistration.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}
