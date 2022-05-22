package com.raven.form;

import GetModelData.Chapter_Modify;
import GetModelData.Course_Modify;
import GetModelData.Teacher_Modify;
import static LoginAdmin.SignIn.main;
import Model.Chapter;
import Model.Course;
import Model.Teacher;
import static com.raven.form.Form_Course.updatebutton;
import static com.raven.main.Main.main;
import com.raven.swing.scrollbar.ScrollBarCustom;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javaswingdev.message.MessageDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Chapter extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    static boolean insertbutton = false;
    static boolean updatebutton = false;

    public Form_Chapter() {
        initComponents();
        setOpaque(false);
        tableModel = (DefaultTableModel) tablecourse.getModel();
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        inittabledata();
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        Text_ID.setEnabled(false);
        Text_Idcourse.setEnabled(false);
        Text_Name.setEnabled(false);
           delete.setEnabled(false);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablecourse = new com.raven.swing.table.Table();
        jPanel1 = new javax.swing.JPanel();
        Text_ID = new com.raven.swing.TextField();
        Text_Name = new com.raven.swing.TextField();
        Text_Idcourse = new com.raven.swing.TextField();
        myTextFieldSearch = new swing.MyTextField();
        jToolBar1 = new javax.swing.JToolBar();
        fix = new swing.MyButton();
        add = new swing.MyButton();
        save = new swing.MyButton();
        delete = new swing.MyButton();
        esc = new swing.MyButton();

        jScrollPane1.setBorder(null);

        tablecourse.setForeground(new java.awt.Color(255, 255, 255));
        tablecourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "IdCourse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablecourse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablecourse.setGridColor(new java.awt.Color(255, 255, 255));
        tablecourse.getTableHeader().setReorderingAllowed(false);
        tablecourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablecourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablecourse);
        if (tablecourse.getColumnModel().getColumnCount() > 0) {
            tablecourse.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data chapter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        Text_ID.setEditable(false);
        Text_ID.setBackground(new java.awt.Color(255, 255, 255));
        Text_ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Text_ID.setLabelText("ID");
        Text_ID.setLineColor(new java.awt.Color(0, 0, 0));

        Text_Name.setEditable(false);
        Text_Name.setBackground(new java.awt.Color(255, 255, 255));
        Text_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_Name.setLabelText("NAME");
        Text_Name.setLineColor(new java.awt.Color(0, 0, 0));

        Text_Idcourse.setEditable(false);
        Text_Idcourse.setBackground(new java.awt.Color(255, 255, 255));
        Text_Idcourse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_Idcourse.setLabelText("ID COURSE");
        Text_Idcourse.setLineColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(Text_Idcourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Text_Idcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        myTextFieldSearch.setText("Find chapter");
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

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(null);
        jToolBar1.setRollover(true);

        fix.setBackground(new java.awt.Color(0, 153, 0));
        fix.setForeground(new java.awt.Color(255, 255, 255));
        fix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/6_1.png"))); // NOI18N
        fix.setText("Edit");
        fix.setColor(new java.awt.Color(0, 153, 0));
        fix.setColorOver(new java.awt.Color(0, 153, 0));
        fix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixActionPerformed(evt);
            }
        });
        jToolBar1.add(fix);

        add.setBackground(new java.awt.Color(0, 153, 0));
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/9_1.png"))); // NOI18N
        add.setText("Add");
        add.setColor(new java.awt.Color(0, 153, 0));
        add.setColorOver(new java.awt.Color(0, 153, 0));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jToolBar1.add(add);

        save.setBackground(new java.awt.Color(0, 153, 0));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/icons8_save_20px_1.png"))); // NOI18N
        save.setText("Save");
        save.setColor(new java.awt.Color(0, 153, 0));
        save.setColorOver(new java.awt.Color(0, 153, 0));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jToolBar1.add(save);

        delete.setBackground(new java.awt.Color(0, 153, 0));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.setColor(new java.awt.Color(0, 153, 0));
        delete.setColorOver(new java.awt.Color(0, 153, 0));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jToolBar1.add(delete);

        esc.setBackground(new java.awt.Color(0, 153, 0));
        esc.setForeground(new java.awt.Color(255, 255, 255));
        esc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/shutdown.png"))); // NOI18N
        esc.setText("ESC");
        esc.setColor(new java.awt.Color(0, 153, 0));
        esc.setColorOver(new java.awt.Color(0, 153, 0));
        esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escActionPerformed(evt);
            }
        });
        jToolBar1.add(esc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(myTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 515, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkexistID(String idchapter) {
        Boolean check = false;
        List<Chapter> chapterList = Chapter_Modify.findAll();
        for (Chapter chapter : chapterList) {
            if (chapter.getID_CHAPTER().equalsIgnoreCase(idchapter)) {
                check = true;
            }
        }
        return check;
    }

    public void inittabledata() {
        List<Chapter> chapterList = Chapter_Modify.findAll();
        tableModel.setRowCount(0);

        chapterList.forEach((chapter) -> {
            tableModel.addRow(new Object[]{chapter.getID_CHAPTER(),chapter.getNAME_CHAPTER(),chapter.getID_COURSE()});
        });
    }


    private void fixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixActionPerformed
        add.setEnabled(false);
        fix.setEnabled(false);
        save.setEnabled(true);
        esc.setEnabled(true);
        Text_Name.setEnabled(true);
        Text_Idcourse.setEnabled(true);
        delete.setEnabled(false);
        updatebutton = true;
    }//GEN-LAST:event_fixActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (insertbutton == true) {
            String ID_CHAPTER = Text_ID.getText();
            String ID_COURSE = Text_Idcourse.getText();
            String CHAPTER_NAME = Text_Name.getText();
            Chapter chapter=new Chapter(ID_CHAPTER,ID_COURSE,CHAPTER_NAME);

         

           

            if (checkexistID(ID_CHAPTER)) {
                //  JOptionPane.showMessageDialog(null,"COURSE ID ALREADY EXISTS"+":"+idcourse,"",2);  
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("ID chapter trùng!", "Bấm OK để tiếp tục.");

            } else {
                Chapter_Modify.insert(chapter);
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("Thêm mới chapter thành công!", "Bấm OK để tiếp tục.");
                

            }
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            Text_Idcourse.setEnabled(false);
            Text_Name.setEnabled(false);
      
            
            Text_ID.setText("");
            Text_Idcourse.setText("");
            Text_Name.setText("");

         
           
            insertbutton = false;
        } else if (updatebutton == true) {
                 String ID_CHAPTER = Text_ID.getText();
            String ID_COURSE = Text_Idcourse.getText();
            String CHAPTER_NAME = Text_Name.getText();
            Chapter chapter=new Chapter(ID_CHAPTER,ID_COURSE,CHAPTER_NAME);
            Chapter_Modify.update(chapter);
         
       
           
            MessageDialog obj = new MessageDialog(main);
            obj.showMessage("Chỉnh chapter thành công!", "Bấm OK để tiếp tục.");
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            Text_Idcourse.setEnabled(false);
            Text_Name.setEnabled(false);
     
            
            Text_ID.setText("");
            Text_Idcourse.setText("");
            Text_Name.setText("");
       
            updatebutton=false;
        }
          inittabledata();
     }//GEN-LAST:event_saveActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        add.setEnabled(false);
        fix.setEnabled(false);
        save.setEnabled(true);
        esc.setEnabled(true);
        delete.setEnabled(false);
        Text_ID.setEnabled(true);
        Text_Idcourse.setEnabled(true);
        Text_Name.setEnabled(true);
     
        
        Text_ID.setText("");
        Text_Idcourse.setText("");
        Text_Name.setText("");

        insertbutton = true;

    }//GEN-LAST:event_addActionPerformed

    private void escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escActionPerformed
        // TODO add your handling code here: 
        add.setEnabled(true);
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        Text_ID.setEnabled(false);
        Text_Idcourse.setEnabled(false);
        Text_Name.setEnabled(false);

        
        Text_ID.setText("");
        Text_Idcourse.setText("");
        Text_Name.setText("");
     
        updatebutton=false;
        insertbutton = false;
    }//GEN-LAST:event_escActionPerformed

    private void tablecourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecourseMouseClicked
        fix.setEnabled(true);
        delete.setEnabled(true);
        int row = tablecourse.getSelectedRow();
        String idchapter = String.valueOf(tablecourse.getValueAt(row, 0));
        String name = String.valueOf(tablecourse.getValueAt(row, 1));
        String idcourse = String.valueOf(tablecourse.getValueAt(row, 2));

       
        Text_ID.setText(idchapter);
        Text_Idcourse.setText(idcourse);
        Text_Name.setText(name);
   
    }//GEN-LAST:event_tablecourseMouseClicked

    private void myTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseClicked
           myTextFieldSearch.setText("");
    }//GEN-LAST:event_myTextFieldSearchMouseClicked

    private void myTextFieldSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseExited
          myTextFieldSearch.setText("Find chapter");
        jPanel1.requestFocus();
    }//GEN-LAST:event_myTextFieldSearchMouseExited

    private void myTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myTextFieldSearchKeyPressed
          if ( myTextFieldSearch.getText().length() >= 20){
          evt.consume();
        } 
        String input = myTextFieldSearch.getText();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if(!input.equalsIgnoreCase("")){
                  List<Chapter> chapterlist=Chapter_Modify.findChapterbyname(input);
                  tableModel.setRowCount(0);
                    chapterlist.forEach((chapter) -> {
            tableModel.addRow(new Object[]{chapter.getID_CHAPTER(),chapter.getNAME_CHAPTER(),chapter.getID_COURSE()});
        });
             } else{
                inittabledata(); 
             }
        }
    }//GEN-LAST:event_myTextFieldSearchKeyPressed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int row = tablecourse.getSelectedRow();
        String idchapter= String.valueOf(tablecourse.getValueAt(row, 0));
        int respone=JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa chương học và đồng thời xóa các dữ liệu liên quan tới chương học ?", "CONFIRM",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(respone==JOptionPane.YES_OPTION){
            Chapter_Modify.delete(idchapter);
        } else if(respone==JOptionPane.NO_OPTION){

        }
          inittabledata();
    }//GEN-LAST:event_deleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.TextField Text_ID;
    private com.raven.swing.TextField Text_Idcourse;
    private com.raven.swing.TextField Text_Name;
    private swing.MyButton add;
    private swing.MyButton delete;
    private swing.MyButton esc;
    private swing.MyButton fix;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private swing.MyTextField myTextFieldSearch;
    private swing.MyButton save;
    private com.raven.swing.table.Table tablecourse;
    // End of variables declaration//GEN-END:variables
}
