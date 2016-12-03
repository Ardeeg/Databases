/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballinfo;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author derpferd
 */
public class BaseballTeams extends javax.swing.JFrame {

    /**
     * Creates new form BaseballTeams
     */
    public BaseballTeams() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btnGetTeamInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        titleMessage = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        startYear = new javax.swing.JTextField();
        endYear = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        tolabel = new javax.swing.JLabel();
        selection = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        btnGetTeamInfo.setText("Get Team Info");
        btnGetTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetTeamInfoActionPerformed(evt);
            }
        });

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblInfo.setToolTipText("");
        jScrollPane2.setViewportView(tblInfo);

        titleMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleMessage.setText("Welcome to the Baseball Database");

        btnNext.setText("Next 100");
        btnNext.setEnabled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setText("Prev 100");
        btnPrev.setEnabled(false);
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        tolabel.setText("to");

        selection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${action}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, submitButton, eLProperty, selection);
        bindingGroup.addBinding(jComboBoxBinding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGetTeamInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(startYear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tolabel)
                        .addGap(2, 2, 2)
                        .addComponent(endYear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitButton)
                        .addGap(41, 41, 41)
                        .addComponent(btnPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnGetTeamInfo)
                    .addComponent(btnPrev)
                    .addComponent(startYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton)
                    .addComponent(tolabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selection, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetTeamInfoActionPerformed
        updateTable();
    }//GEN-LAST:event_btnGetTeamInfoActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        page++;
        updateTable();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        
        if (page > 0) {
            page--;
        }
        updateTable();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        updateComboBox();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

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
            java.util.logging.Logger.getLogger(BaseballTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseballTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseballTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseballTeams.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseballTeams().setVisible(true);
            }
        });
    }
    
    public Connection getConnection() throws SQLException {
        OracleDataSource ds;
        Connection conn = null;
        ds = new OracleDataSource();
        ds.setURL("jdbc:oracle:thin:@akka.d.umn.edu:1521:XE");
        if (username == null || password == null) {
            getUsernameAndPassword();
        }
        ds.setUser(username);
        ds.setPassword(password);
        conn=ds.getConnection();
        return conn;
    }
    
    private void getUsernameAndPassword() {
        username = JOptionPane.showInputDialog("Enter DB username");
        password = PasswordDialog.showPasswordDialog();
    }
    
    
    private void updateComboBox()
    { 
        boolean error = false;
        Connection conn = null;
        try  {
            conn = getConnection();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(rootPane, "Error: Could not connect to Database.", "Error", JOptionPane.WARNING_MESSAGE);
            username = null;
            password = null;
            error = true;
        }
        if (!error) {
            try {
                Statement stmt = conn.createStatement();
//                String query = "SELECT * FROM BEAU0307.BASEBALLTEAMS WHERE ROWNUM <= 100";
                String query = "SELECT NAME FROM BEAU0307.BASEBALLTEAMS";
                ResultSet rset = stmt.executeQuery(query);
                //List<String> col_names = new ArrayList();
                //col_names.add("Team Name");
                List<List<String>> data = new ArrayList();
                Integer count = 0;
                while (rset.next()) {
                    List<String> row = new ArrayList();
                    row.add(rset.getString("NAME"));
                    data.add(row);
                    count++;
                }
                
                selection = new JComboBox<String>(data);
                
                String[][] dataArray = data.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
                
                DefaultTableModel model = new DefaultTableModel(dataArray, col_names.toArray()) {
                    
                    @Override
                    public boolean isCellEditable(int row, int col) {
                        return false;
                    }
                    
                };
                
                tblInfo.setModel(model);
                if (page > 0) {
                    btnPrev.setEnabled(true);
                } else {
                    btnPrev.setEnabled(false);
                }
                if (count != ROWS_PER_PAGE) {
                    btnNext.setEnabled(false);
                } else {
                    btnNext.setEnabled(true);
                }
            } catch (SQLException s) {
                JOptionPane.showMessageDialog(rootPane, "Error: Could not execute sql query.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    private void updateTable() {
        boolean error = false;
        Connection conn = null;
        try  {
            conn = getConnection();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(rootPane, "Error: Could not connect to Database.", "Error", JOptionPane.WARNING_MESSAGE);
            username = null;
            password = null;
            error = true;
        }
        if (!error) {
            try {
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
//                String query = "SELECT * FROM BEAU0307.BASEBALLTEAMS WHERE ROWNUM <= 100";
                String query = "SELECT * FROM "
                        + "(SELECT TEAMID, NAME, PARK, ROWNUM RN FROM BEAU0307.BASEBALLTEAMS) "
                        + "WHERE RN > "+ (page*ROWS_PER_PAGE) +" AND RN <= " + ((page+1)*ROWS_PER_PAGE);
                ResultSet rset = stmt.executeQuery(query);
                List<String> col_names = new ArrayList();
                col_names.add("Team ID");
                col_names.add("Team Name");
                col_names.add("Team Park");
                List<List<String>> data = new ArrayList();
                Integer count = 0;
                while (rset.next()) {
                    List<String> row = new ArrayList();
                    
                    row.add(rset.getString("TEAMID"));
                    row.add(rset.getString("NAME"));
                    row.add(rset.getString("PARK"));
                    data.add(row);
                    count++;
                }
                
                String[][] dataArray = data.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
                
                DefaultTableModel model = new DefaultTableModel(dataArray, col_names.toArray()) {
                    
                    @Override
                    public boolean isCellEditable(int row, int col) {
                        return false;
                    }
                    
                };
                
                tblInfo.setModel(model);
                if (page > 0) {
                    btnPrev.setEnabled(true);
                } else {
                    btnPrev.setEnabled(false);
                }
                if (count != ROWS_PER_PAGE) {
                    btnNext.setEnabled(false);
                } else {
                    btnNext.setEnabled(true);
                }
            } catch (SQLException s) {
                JOptionPane.showMessageDialog(rootPane, "Error: Could not execute sql query.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    private String username = null;
    private String password = null;
    private Integer page = 0;
    private final Integer ROWS_PER_PAGE = 100;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetTeamInfo;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JTextField endYear;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> selection;
    private javax.swing.JTextField startYear;
    private javax.swing.JButton submitButton;
    private javax.swing.JTable tblInfo;
    private javax.swing.JLabel titleMessage;
    private javax.swing.JLabel tolabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}