package com.raven.form;

import GetModelData.Register_Modify;
import GetModelData.Student_Modify;
import Model.Register;
import com.raven.dialog.Message;
import com.raven.main.Main;
import com.raven.model.ModelCard;
import com.raven.model.ModelStudent;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import com.raven.swing.noticeboard.ModelNoticeBoard;
import com.raven.swing.table.EventAction;
import com.raven.swing.table.EventActionRegister;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Form_Register extends javax.swing.JPanel {

    public Form_Register() {
        initComponents();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
    }

    private void initData() {
        initCardData();
    
        initTableData();
    }

    private void initTableData() {
        EventActionRegister eventAction = new EventActionRegister() {
            @Override
            public void delete(Register register) {
                if (showMessage("Block course  : " + register.getID_COURSE()+" "+"Student:"+register.getID_STUDENT())) {
                       Register_Modify.update(Boolean.FALSE,register.getID_REGISTER());
                       int row = table1.getSelectedRow();
                       table1.setValueAt(false, row,3);
                } else {
                   
                }
            }

            @Override
            public void update(Register register) {
                if (showMessage("Open course : " + register.getID_COURSE()+" "+"Student:"+register.getID_STUDENT())) {
                      Register_Modify.update(Boolean.TRUE,register.getID_REGISTER());
                    int row = table1.getSelectedRow();
                       table1.setValueAt(true, row,3);
                } else {
                
                }
            }
        };
        
        List<Register> registerList=Register_Modify.findAll();
        for(Register rgs : registerList){
           table1.addRow(new Register(rgs.getID_REGISTER(),rgs.getID_COURSE(),rgs.getID_STUDENT(),rgs.getAdminAcceptedBoolean()).toRowTable(eventAction)); 
        }
        
   
        
        
        
        
        
    }

    private void initCardData() {
          int count=0;
        List<Register> modelregisterList = Register_Modify.findAll();

        for(Register register : modelregisterList){
          count++;
        }

        Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.CREDIT_CARD, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card1.setData(new ModelCard("TOTAL REGISTER",count,100,icon2));
        
        
        
        
        
        
     
    }

    

    private boolean showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new com.raven.component.Card();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.table.TableRegister();
        myTextFieldSearch = new swing.MyTextField();

        card1.setColorGradient(new java.awt.Color(211, 28, 215));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 72, 210));
        jLabel1.setText("Dashboard / Register");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 76, 76));
        jLabel5.setText("Data Register");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Idcourse", "Idstd", "Adminaccepted", "Open/Block"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );

        myTextFieldSearch.setText("Find student");
        myTextFieldSearch.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_search_20px.png")));
        myTextFieldSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTextFieldSearchMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myTextFieldSearchMouseExited(evt);
            }
        });
        myTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                myTextFieldSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(myTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(473, 473, 473))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myTextFieldSearchKeyPressed
        if ( myTextFieldSearch.getText().length() >= 20){
            evt.consume();
        }
        String input = myTextFieldSearch.getText();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if(!input.equalsIgnoreCase("")){
                table1.removeRow();
                EventActionRegister eventAction = new EventActionRegister() {
            @Override
            public void delete(Register register) {
                if (showMessage("Block course  : " + register.getID_COURSE()+" "+"Student:"+register.getID_STUDENT())) {
                       Register_Modify.update(Boolean.FALSE,register.getID_REGISTER());
                       int row = table1.getSelectedRow();
                       table1.setValueAt(false, row,3);
                } else {
                   
                }
            }

            @Override
            public void update(Register register) {
                if (showMessage("Open course : " + register.getID_COURSE()+" "+"Student:"+register.getID_STUDENT())) {
                      Register_Modify.update(Boolean.TRUE,register.getID_REGISTER());
                    int row = table1.getSelectedRow();
                       table1.setValueAt(true, row,3);
                } else {
                
                }
            }
        };
                List<Register> rgslist=Register_Modify.findStudentregisterbyid(input);
                 for(Register rgs : rgslist){
           table1.addRow(new Register(rgs.getID_REGISTER(),rgs.getID_COURSE(),rgs.getID_STUDENT(),rgs.getAdminAcceptedBoolean()).toRowTable(eventAction)); 
        }

            } else if(input.equalsIgnoreCase("")){
                table1.removeRow();
                initTableData();
            }
        }
    }//GEN-LAST:event_myTextFieldSearchKeyPressed

    private void myTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseClicked
          myTextFieldSearch.setText("");
    }//GEN-LAST:event_myTextFieldSearchMouseClicked

    private void myTextFieldSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseExited
          myTextFieldSearch.setText("Find student");
        jLabel1.requestFocus();
    }//GEN-LAST:event_myTextFieldSearchMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.MyTextField myTextFieldSearch;
    private com.raven.swing.table.TableRegister table1;
    // End of variables declaration//GEN-END:variables
}
