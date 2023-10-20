package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wissam
 */
public class AddNewLoginUser extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;
    ResultSet rs;

    public AddNewLoginUser() {
        initComponents();
        
        // center form in screen 
        this.setLocationRelativeTo(null);
      
        // set all error labels to invisible
        lblUsernameError.setVisible(false);
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setVisible(false);
        lblNameError.setVisible(false);
        
        defaultChar = txtPassword.getEchoChar();

        // populate the user type combo box
        try {
            dbCon = new myDBCon();
            rs = dbCon.executeStatement("SELECT * from USERTYPE");
            // populate mgr combo box
            while (rs.next()) {
                cmbUserType.addItem(rs.getString("description"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    txtUsername = new javax.swing.JTextField();
    txtName = new javax.swing.JTextField();
    cmbUserType = new javax.swing.JComboBox<>();
    btnAddNewEmp = new javax.swing.JButton();
    lblUsernameError = new javax.swing.JLabel();
    lblConfirmPasswordError = new javax.swing.JLabel();
    lblPasswordError = new javax.swing.JLabel();
    lblNameError = new javax.swing.JLabel();
    txtPassword = new javax.swing.JPasswordField();
    txtConfirmPassword = new javax.swing.JPasswordField();
    jToggleButton1 = new javax.swing.JToggleButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Add New Login User");
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("Add New Login User");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setText("Username:");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setText("Password:");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel4.setText("Confirm Password:");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setText("Type:");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel8.setText("Name:");

    txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

    cmbUserType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    cmbUserType.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbUserTypeActionPerformed(evt);
      }
    });

    btnAddNewEmp.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
    btnAddNewEmp.setText("Add New");
    btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddNewEmpActionPerformed(evt);
      }
    });

    lblUsernameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
    lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
    lblUsernameError.setText("error label");

    lblConfirmPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
    lblConfirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
    lblConfirmPasswordError.setText("error label");

    lblPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
    lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
    lblPasswordError.setText("error label");

    lblNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
    lblNameError.setForeground(new java.awt.Color(255, 0, 0));
    lblNameError.setText("error label");

    txtPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

    txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

    jToggleButton1.setText("Toggle Show");
    jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(76, 76, 76)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel3)
              .addComponent(jLabel2)
              .addComponent(jLabel4)
              .addComponent(jLabel5)
              .addComponent(jLabel8))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnAddNewEmp)
              .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
              .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtUsername)
              .addComponent(txtPassword)
              .addComponent(txtConfirmPassword))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addComponent(jToggleButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGap(111, 111, 111)
            .addComponent(jLabel1)))
        .addContainerGap(55, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1)
        .addGap(35, 35, 35)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblNameError))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblUsernameError))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel3)
            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblPasswordError)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblConfirmPasswordError))
        .addGap(12, 12, 12)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnAddNewEmp)
        .addGap(34, 34, 34))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    void clearErrorLabels() {
        // erase error label text and set visibility to false 
        
    }

    boolean isValidPassword() {
        // check validity of the password value entered by the user based on your design 
        boolean result = false;
        
        if (Arrays.equals(txtPassword.getPassword(), txtConfirmPassword.getPassword())) {
          result = true;
          lblConfirmPasswordError.setVisible(false);
        } else {
          lblConfirmPasswordError.setText("Passwords don't match");
          lblConfirmPasswordError.setVisible(true);
        }
        
        return result;
    }

    boolean isValidData() {
        // check validity of all values entered 
        boolean result = true;
        String username = txtUsername.getText();
        
        if (getUserTypeNum((String)cmbUserType.getSelectedItem()) == -1){
          result = false;
          lblUsernameError.setText("Username already exists");
          lblUsernameError.setVisible(true);
        }        
        
        try {
            dbCon = new myDBCon();
            rs = dbCon.executeStatement(String.format("SELECT count(*) as count from loginUsers where username = '%s'", username));
            // populate mgr combo box
            int numUsers = 0;
            if(rs.next()){
              numUsers = rs.getInt("count");
            }
            if (numUsers != 0) {
              result = false;
              lblUsernameError.setText("Username already exists");
              lblUsernameError.setVisible(true);
            } 
            
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        
        
        return result;
    }

    void clearInputBoxes() {
        // clear all text boxes and set the user type combo to the default value
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        
    }
    
    private int getUserTypeNum(String type) {
      try {
        dbCon = new myDBCon();
        rs = dbCon.executeStatement(String.format("SELECT * from USERTYPE where description = '%s'", type));
        // populate mgr combo box
        if (rs.next()) {
            return rs.getInt("type");
        }
        rs.close();
      } catch (SQLException e) {
        System.out.println(e);
      }
      return -1;
    }
    
    public static String bytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }


    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String type = String.valueOf(cmbUserType.getSelectedItem());
        System.out.println(name +username +password +type);

        // verify input data
        if (!isValidPassword() || !isValidData()) {
          return;
        }
        try {
          MessageDigest md = MessageDigest.getInstance("MD5");
          md.update(password.getBytes());
          byte[] digest = md.digest();
          String hashedPassword = bytesToHex(digest);
          try {
          dbCon = new myDBCon();
          int rs = dbCon.executePrepared(String.format("INSERT INTO loginusers VALUES ('%s', '%s', '%s', %d)", name, username, hashedPassword, getUserTypeNum(type)));
          
          if(rs > 0){
            javax.swing.JLabel label = new javax.swing.JLabel("New user added successfully.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            clearInputBoxes();
          }
          } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error adding new user.");
          }
        } catch (NoSuchAlgorithmException e) {e.printStackTrace();}
        
        // verify that new user does not currently exist
        // done in isValidData()
        
        // if all validations are successful then enter the new user
        
        
        
    }//GEN-LAST:event_btnAddNewEmpActionPerformed

  private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    // TODO add your handling code here:
    if (txtPassword.getEchoChar() == defaultChar) {
      txtPassword.setEchoChar((char) 0);
    } else {
      txtPassword.setEchoChar(defaultChar);
    }
  }//GEN-LAST:event_jToggleButton1ActionPerformed

  private void cmbUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserTypeActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cmbUserTypeActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnAddNewEmp;
  private javax.swing.JComboBox<String> cmbUserType;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JToggleButton jToggleButton1;
  private javax.swing.JLabel lblConfirmPasswordError;
  private javax.swing.JLabel lblNameError;
  private javax.swing.JLabel lblPasswordError;
  private javax.swing.JLabel lblUsernameError;
  private javax.swing.JPasswordField txtConfirmPassword;
  private javax.swing.JTextField txtName;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
  private char defaultChar;
}
