package com.raven.form;

import GetModelData.Course_Modify;
import GetModelData.Teacher_Modify;
import GetModelData.whatwelearn_Modify;
import static LoginAdmin.SignIn.main;
import Model.Course;
import Model.Teacher;
import static com.raven.form.Form_Course.updatebutton;
import static com.raven.main.Main.main;
import com.raven.swing.scrollbar.ScrollBarCustom;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javaswingdev.message.MessageDialog;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Form_Teacher extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    static boolean insertbutton = false;
    static boolean updatebutton = false;
        String s;

    public Form_Teacher() {
        initComponents();
        setOpaque(false);
        tableModel = (DefaultTableModel) tablecourse.getModel();
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        inittabledata();
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        Text_ID.setEnabled(false);
        jLabelAvatar.setEnabled(false);
        Text_Name.setEnabled(false);
        jTextAreaExperience.setEnabled(false);
        Text_Role.setEnabled(false);
        Text_Phonenumber.setEnabled(false);
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBar(new ScrollBarCustom());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablecourse = new com.raven.swing.table.Table();
        jPanel1 = new javax.swing.JPanel();
        Text_ID = new com.raven.swing.TextField();
        Text_Name = new com.raven.swing.TextField();
        Text_Role = new com.raven.swing.TextField();
        Text_Phonenumber = new com.raven.swing.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaExperience = new javax.swing.JTextArea();
        jLabelAvatar = new javax.swing.JLabel();
        myTextFieldSearch = new swing.MyTextField();
        jToolBar1 = new javax.swing.JToolBar();
        fix = new swing.MyButton();
        add = new swing.MyButton();
        save = new swing.MyButton();
        esc = new swing.MyButton();

        jScrollPane1.setBorder(null);

        tablecourse.setForeground(new java.awt.Color(255, 255, 255));
        tablecourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Role", "Phonenumber", "Experience"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data teacher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        Text_ID.setBackground(new java.awt.Color(255, 255, 255));
        Text_ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Text_ID.setLabelText("ID");
        Text_ID.setLineColor(new java.awt.Color(0, 0, 0));
        Text_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_IDActionPerformed(evt);
            }
        });

        Text_Name.setBackground(new java.awt.Color(255, 255, 255));
        Text_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_Name.setLabelText("NAME");
        Text_Name.setLineColor(new java.awt.Color(0, 0, 0));

        Text_Role.setBackground(new java.awt.Color(255, 255, 255));
        Text_Role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_Role.setLabelText("ROLE TEACHER");
        Text_Role.setLineColor(new java.awt.Color(0, 0, 0));

        Text_Phonenumber.setBackground(new java.awt.Color(255, 255, 255));
        Text_Phonenumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_Phonenumber.setLabelText("PHONE NUMBER");
        Text_Phonenumber.setLineColor(new java.awt.Color(0, 0, 0));

        jTextAreaExperience.setColumns(20);
        jTextAreaExperience.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextAreaExperience.setRows(5);
        jTextAreaExperience.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teacher experience", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(140, 140, 140))); // NOI18N
        jScrollPane2.setViewportView(jTextAreaExperience);

        jLabelAvatar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAvatar.setText("AVATAR");
        jLabelAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAvatarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_Role, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(Text_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_Phonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Text_Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Text_Phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jLabelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        myTextFieldSearch.setText("Find teacher");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 582, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkexistID(String idcourse) {
        Boolean check = false;
        List<Teacher> teacherList = Teacher_Modify.findAll();
        for (Teacher teacher : teacherList) {
            if (teacher.getID_TEACHER().equalsIgnoreCase(idcourse)) {
                check = true;
            }
        }
        return check;
    }

    public void inittabledata() {
        List<Teacher> teacherList = Teacher_Modify.findAll();
        tableModel.setRowCount(0);

        teacherList.forEach((teacher) -> {
            tableModel.addRow(new Object[]{teacher.getID_TEACHER(),teacher.getNAME_TEACHER(),teacher.getROLE_TEACHER(),teacher.getPHONE_NUMBER(),teacher.getEXPERIENCE()});
        });
    }

     public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(jLabelAvatar.getWidth(), jLabelAvatar.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
     
        public ImageIcon ResizeImagetable(ImageIcon imgIcon){
        Image img = imgIcon.getImage();
        Image newImage = img.getScaledInstance(jLabelAvatar.getWidth(), jLabelAvatar.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    private void fixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixActionPerformed
        add.setEnabled(false);
        fix.setEnabled(false);
        save.setEnabled(true);
        esc.setEnabled(true);
        jTextAreaExperience.setEnabled(true);
        Text_Name.setEnabled(true);
        jLabelAvatar.setEnabled(true);
  
        Text_Role.setEnabled(true);
  
        Text_Phonenumber.setEnabled(true);
        updatebutton = true;
    }//GEN-LAST:event_fixActionPerformed

    private void Text_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_IDActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (insertbutton == true) {
            String idteacher = Text_ID.getText();

            String ROLE_TEACHER = Text_Role.getText();

            String TEACHER_NAME = Text_Name.getText();
            String PHONENUMBER_TEACHER=Text_Phonenumber.getText();
            String TEACHER_EXPERIENCE=jTextAreaExperience.getText();
            Teacher teacher=new Teacher(idteacher,TEACHER_NAME,ROLE_TEACHER,PHONENUMBER_TEACHER,TEACHER_EXPERIENCE,null);
         

           

            if (checkexistID(idteacher)) {
                //  JOptionPane.showMessageDialog(null,"COURSE ID ALREADY EXISTS"+":"+idcourse,"",2);  
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("ID giáo viên trùng!", "Bấm OK để tiếp tục.");

            } else {
                Teacher_Modify.insert(teacher,s);
                inittabledata();
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("Thêm mới giáo viên thành công!", "Bấm OK để tiếp tục.");

            }
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            jLabelAvatar.setEnabled(false);
            Text_Name.setEnabled(false);
            Text_Role.setEnabled(false);
            Text_Phonenumber.setEnabled(false);
            jTextAreaExperience.setEnabled(false);
            
            Text_ID.setText("");
            Text_Name.setText("");
            jTextAreaExperience.setText("");
            Text_Role.setText("");
            Text_Phonenumber.setText("");
           
            insertbutton = false;
        } else if (updatebutton == true) {
            String idteacher = Text_ID.getText();
            String ROLE_TEACHER = Text_Role.getText();
            String TEACHER_NAME = Text_Name.getText();
            String PHONENUMBER_TEACHER=Text_Phonenumber.getText();
            String TEACHER_EXPERIENCE=jTextAreaExperience.getText();
            Teacher teacher=new Teacher(idteacher,TEACHER_NAME,ROLE_TEACHER,PHONENUMBER_TEACHER,TEACHER_EXPERIENCE,null);
            Teacher_Modify.update(teacher,s);
            inittabledata();
            MessageDialog obj = new MessageDialog(main);
            obj.showMessage("Chỉnh sửa giáo viên thành công!", "Bấm OK để tiếp tục.");
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            jLabelAvatar.setEnabled(false);
            Text_Name.setEnabled(false);
            jTextAreaExperience.setEnabled(false);
            Text_Role.setEnabled(false);
            Text_Phonenumber.setEnabled(false);
            
            Text_ID.setText("");
            Text_Name.setText("");
            jTextAreaExperience.setText("");
            Text_Role.setText("");
            Text_Phonenumber.setText("");
            updatebutton=false;
        }
          inittabledata();
     }//GEN-LAST:event_saveActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        add.setEnabled(false);
        fix.setEnabled(false);
        save.setEnabled(true);
        esc.setEnabled(true);
        Text_ID.setEnabled(true);
        jLabelAvatar.setEnabled(true);
        Text_Name.setEnabled(true);
        jTextAreaExperience.setEnabled(true);
        Text_Role.setEnabled(true);
        Text_Phonenumber.setEnabled(true);
        
        Text_ID.setText("");
        Text_Name.setText("");
        jTextAreaExperience.setText("");
        Text_Role.setText("");
        Text_Phonenumber.setText("");
        insertbutton = true;

    }//GEN-LAST:event_addActionPerformed

    private void escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escActionPerformed
        // TODO add your handling code here: 
        add.setEnabled(true);
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        Text_ID.setEnabled(false);
        jLabelAvatar.setEnabled(false);
        Text_Name.setEnabled(false);
        Text_Role.setEnabled(false);
        jTextAreaExperience.setEnabled(false);
        Text_Phonenumber.setEnabled(false);
        
        Text_ID.setText("");
 
        Text_Name.setText("");
        jTextAreaExperience.setText("");
        Text_Role.setText("");
        Text_Phonenumber.setText("");
        updatebutton=false;
        insertbutton = false;
    }//GEN-LAST:event_escActionPerformed

    private void tablecourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecourseMouseClicked
        fix.setEnabled(true);
        int row = tablecourse.getSelectedRow();
        String idteacher = String.valueOf(tablecourse.getValueAt(row, 0));
        jLabelAvatar.setIcon( ResizeImagetable(Teacher_Modify.findteacherbyID(idteacher).getAVATARURL()));
        String name = String.valueOf(tablecourse.getValueAt(row, 1));
        String role = String.valueOf(tablecourse.getValueAt(row, 2));
        String phonenumber = String.valueOf(tablecourse.getValueAt(row, 3));
        String experience =String.valueOf(tablecourse.getValueAt(row, 4));
       
        Text_ID.setText(idteacher);
        Text_Name.setText(name);
        Text_Role.setText(role);
        Text_Phonenumber.setText(phonenumber);
        jTextAreaExperience.setText(experience);
    }//GEN-LAST:event_tablecourseMouseClicked

    private void jLabelAvatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAvatarMouseClicked
          JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            ImageIcon MyImage =  ResizeImage(path);
            jLabelAvatar.setIcon(MyImage);
            s = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Data");
        }
    }//GEN-LAST:event_jLabelAvatarMouseClicked

    private void myTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseClicked
          myTextFieldSearch.setText("");
    }//GEN-LAST:event_myTextFieldSearchMouseClicked

    private void myTextFieldSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseExited
        myTextFieldSearch.setText("Find teacher");
        jPanel1.requestFocus();
    }//GEN-LAST:event_myTextFieldSearchMouseExited

    private void myTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myTextFieldSearchKeyPressed
         if ( myTextFieldSearch.getText().length() >= 20){
          evt.consume();
        } 
        String input = myTextFieldSearch.getText();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if(!input.equalsIgnoreCase("")){
          List<Teacher> teacherList = Teacher_Modify.findWTeacherbyName(input);
        tableModel.setRowCount(0);
        teacherList.forEach((teacher) -> {
            tableModel.addRow(new Object[]{teacher.getID_TEACHER(),teacher.getNAME_TEACHER(),teacher.getROLE_TEACHER(),teacher.getPHONE_NUMBER(),teacher.getEXPERIENCE()});
        });
             } else{
                inittabledata(); 
             }
        }
    }//GEN-LAST:event_myTextFieldSearchKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.TextField Text_ID;
    private com.raven.swing.TextField Text_Name;
    private com.raven.swing.TextField Text_Phonenumber;
    private com.raven.swing.TextField Text_Role;
    private swing.MyButton add;
    private swing.MyButton esc;
    private swing.MyButton fix;
    private javax.swing.JLabel jLabelAvatar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaExperience;
    private javax.swing.JToolBar jToolBar1;
    private swing.MyTextField myTextFieldSearch;
    private swing.MyButton save;
    private com.raven.swing.table.Table tablecourse;
    // End of variables declaration//GEN-END:variables
}
