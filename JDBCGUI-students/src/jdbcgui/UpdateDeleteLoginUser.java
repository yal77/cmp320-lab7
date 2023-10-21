package jdbcgui;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static jdbcgui.AddNewLoginUser.bytesToHex;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wissam
 */
public class UpdateDeleteLoginUser extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;

    ResultSet rs;
    
    boolean buttonsEnabled = true;

    public UpdateDeleteLoginUser() {
        initComponents();
        // center form in screen 
        this.setLocationRelativeTo(null);
        
        // set all error labels to invisible
        lblUsernameError.setVisible(false);
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setVisible(false);
        lblNameError.setVisible(false);
      
        // connect to db and get user data and populate form fields
        getNewData();
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
    btnUpdateUser = new javax.swing.JButton();
    lblUsernameError = new javax.swing.JLabel();
    lblConfirmPasswordError = new javax.swing.JLabel();
    lblPasswordError = new javax.swing.JLabel();
    lblNameError = new javax.swing.JLabel();
    txtPassword = new javax.swing.JPasswordField();
    txtConfirmPassword = new javax.swing.JPasswordField();
    btnDeleteUser = new javax.swing.JButton();
    btnNext = new javax.swing.JButton();
    btnPrevious = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Add New Login User");
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("Update Login User");

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

    btnUpdateUser.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
    btnUpdateUser.setText("Update");
    btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUpdateUserActionPerformed(evt);
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
    txtPassword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtPasswordActionPerformed(evt);
      }
    });

    txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

    btnDeleteUser.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
    btnDeleteUser.setText("Delete");
    btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDeleteUserActionPerformed(evt);
      }
    });

    btnNext.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
    btnNext.setText("Next >>");
    btnNext.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNextActionPerformed(evt);
      }
    });

    btnPrevious.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
    btnPrevious.setText("<< Previous");
    btnPrevious.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPreviousActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(76, 76, 76)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel3)
              .addComponent(jLabel2)
              .addComponent(jLabel4)
              .addComponent(jLabel5)
              .addComponent(jLabel8)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnPrevious)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
              .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtUsername)
              .addComponent(txtPassword)
              .addComponent(txtConfirmPassword))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(lblPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
              .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnUpdateUser)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnDeleteUser)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnNext)))
        .addContainerGap(102, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(202, 202, 202))
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
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblPasswordError))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblConfirmPasswordError))
        .addGap(12, 12, 12)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnUpdateUser)
          .addComponent(btnDeleteUser)
          .addComponent(btnNext)
          .addComponent(btnPrevious))
        .addGap(0, 41, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    int nRows = 0;
    void getNewData() {
        // get all user data and populate fields 
        dbCon = new myDBCon();
        try {
            rs = dbCon.executeStatement("SELECT * from USERTYPE");
            // populate mgr combo box
            while (rs.next()) {
                cmbUserType.addItem(rs.getString("description"));
            }
            rs = dbCon.executeStatement("SELECT * from LOGINUSERS");
            if (rs.last()){
              nRows = rs.getRow();
              rs.beforeFirst();
            }
            if (nRows == 1){
              EnableDisableButtons();
            }
            rs.next();
            btnPrevious.setEnabled(false);
            
            populateFields();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }

    private void populateFields() {
        // populate fields with the current user details
        try {
          txtUsername.setText(rs.getString("username"));
          txtName.setText(rs.getString("name"));
          cmbUserType.setSelectedIndex(rs.getInt("type"));
        }  catch (SQLException e) {
            System.out.println(e);
        }
        
    }

    private void EnableDisableButtons() {
        // enable/disable Previous/Next buttons
        buttonsEnabled = !buttonsEnabled;
        btnNext.setEnabled(buttonsEnabled);
        btnPrevious.setEnabled(buttonsEnabled);
        
    }

    void clearErrorLabels() {
        // clear all error labels and set their visibility to false 
        lblUsernameError.setVisible(false);
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setVisible(false);
        lblNameError.setVisible(false);
        lblUsernameError.setText("");
        lblPasswordError.setText("");
        lblConfirmPasswordError.setText("");
        lblNameError.setText("");
        
    }

    boolean isValidPassword() {
        // check validity of new password in case of update 
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
    
    private int getUserTypeNum(String type) {
      try {
        myDBCon tempDB;
        ResultSet rstemp = dbCon.executeStatement(String.format("SELECT * from USERTYPE where description = '%s'", type));
        // populate mgr combo box
        if (rstemp.next()) {
            return rstemp.getInt("type");
        }
        rstemp.close();
      } catch (SQLException e) {
        System.out.println(e);
      }
      return -1;
    }
    
    boolean isValidData() {
        // check validity of new data before update 
        boolean result = true;
        
        String username = txtUsername.getText();

          try {
           if (!rs.getString("username").equals( username)) {
              myDBCon tempDB = new myDBCon();
              ResultSet rstemp = tempDB.executeStatement(String.format("SELECT count(*) as count from loginUsers where username = '%s'", username));
                            

              // populate mgr combo box
              int numUsers = 0;
              if(rstemp.next()){
                numUsers = rstemp.getInt("count");
              }
              if (numUsers != 0) {
                result = false;
                lblUsernameError.setText("Username already exists");
                lblUsernameError.setVisible(true);
              } 

              rstemp.close();
           }
          } catch (SQLException e) {
              
              System.out.println(e);
              System.out.println("Checking username");
          }
        
        return result;
    }

    void clearInputBoxes() {
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        cmbUserType.setSelectedIndex(0);
    }

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        // TODO add your handling code here:
        // verify input data
        // verify that new user does not currently exist 
        String conf = JOptionPane.showInputDialog("Are you sure you want to update?\nYES to update\nAnything else to cancel");
        System.out.println(conf);
        if(conf.equalsIgnoreCase("YES") != true){
            //if user doesn't enter "YES", do nothing
            return;
        }
        String name = txtName.getText();
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String type = String.valueOf(cmbUserType.getSelectedItem());
        System.out.println(name +username +password +type);
        if (!isValidPassword() || !isValidData()) {
          return;
        }
        try {
          if (password.length() == 0) {
            try {
              int rs = dbCon.executePrepared(String.format("UPDATE loginusers SET name = '%s', username='%s', type=%d where username='%s'", name, username, getUserTypeNum(type), username));

              if(rs > 0){
                javax.swing.JLabel label = new javax.swing.JLabel("User updated successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                clearInputBoxes();
              }
            } catch (SQLException e) {
              System.out.println(e);
              JOptionPane.showMessageDialog(null, "Error updating user.");
            }
          } else{
            System.out.println("Change pass");
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            String hashedPassword = bytesToHex(digest);
            try {
              int rs = dbCon.executePrepared(String.format("UPDATE loginusers SET name = '%s', username = '%s',password = '%s', type= %d where username = '%s'", name, username, hashedPassword, getUserTypeNum(type), username));

              if(rs > 0){
                javax.swing.JLabel label = new javax.swing.JLabel("User updated successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                clearInputBoxes();
              }
            } catch (SQLException e) {
              System.out.println(e);
              JOptionPane.showMessageDialog(null, "Error updating user.");
            }
          }
        } catch (NoSuchAlgorithmException e) {e.printStackTrace();}
        getNewData();
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
        String conf = JOptionPane.showInputDialog("Are you sure you want to update?\nYES to update\nAnything else to cancel");
        System.out.println(conf);
        if(conf.equalsIgnoreCase("YES") != true){
            //if user doesn't enter "YES", do nothing
            return;
        }
      String username = txtUsername.getText();
       
      try {
        dbCon.executePrepared(String.format("DELETE from loginusers  where username='%s'", username));
      } catch (SQLException e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(null, "Error deleting user.");
      }
      getNewData();
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void MoveNext() {
        // move result set to next record 
        try {
          rs.next();
          populateFields();
          if (rs.getRow() >= nRows) {
            btnNext.setEnabled(false);
            btnPrevious.setEnabled(true);
            
          }
        } catch (SQLException e) {
          System.out.println(e);
         }
        
    }

    private void MovePrevious() {
        // move result set to next record
        try {
          rs.previous();
          populateFields();
          if (rs.getRow() == 1) {
            btnPrevious.setEnabled(false);
            btnNext.setEnabled(true);
          }
        } catch (SQLException e) {
          System.out.println(e);
         }
        
    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDeleteUser;
  private javax.swing.JButton btnNext;
  private javax.swing.JButton btnPrevious;
  private javax.swing.JButton btnUpdateUser;
  private javax.swing.JComboBox<String> cmbUserType;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel lblConfirmPasswordError;
  private javax.swing.JLabel lblNameError;
  private javax.swing.JLabel lblPasswordError;
  private javax.swing.JLabel lblUsernameError;
  private javax.swing.JPasswordField txtConfirmPassword;
  private javax.swing.JTextField txtName;
  private javax.swing.JPasswordField txtPassword;
  private javax.swing.JTextField txtUsername;
  // End of variables declaration//GEN-END:variables
}
