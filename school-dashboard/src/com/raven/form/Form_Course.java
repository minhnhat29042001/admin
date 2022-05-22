package com.raven.form;

import GetModelData.Course_Modify;
import GetModelData.Student_Modify;
import static LoginAdmin.SignIn.main;
import Model.Course;
import static com.raven.form.Form_Teacher.insertbutton;
import static com.raven.form.Form_Teacher.updatebutton;
import static com.raven.main.Main.main;
import com.raven.model.ModelStudent;
import com.raven.swing.scrollbar.ScrollBarCustom;
import com.raven.swing.table.EventAction;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.message.MessageDialog;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Form_Course extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    static boolean insertbutton = false;
    static boolean updatebutton = false;
    String s;

    public Form_Course() {
        initComponents();
        setOpaque(false);
        tableModel = (DefaultTableModel) tablecourse.getModel();
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        inittabledata();
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        delete.setEnabled(false);
        Text_ID.setEnabled(false);
        
        jLabelAvatar.setEnabled(false);
 
        Text_Name.setEnabled(false);
        Text_IDCate.setEnabled(false);
        Text_birefdescrip.setEnabled(false);
        Text_fulldescrip.setEnabled(false);
        Text_idteacher.setEnabled(false);
        Text_price.setEnabled(false);
        Text_createdate.setEnabled(false);
        Text_updatedate.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablecourse = new com.raven.swing.table.Table();
        jPanel1 = new javax.swing.JPanel();
        Text_ID = new com.raven.swing.TextField();
        Text_Name = new com.raven.swing.TextField();
        Text_IDCate = new com.raven.swing.TextField();
        Text_birefdescrip = new com.raven.swing.TextField();
        Text_fulldescrip = new com.raven.swing.TextField();
        Text_idteacher = new com.raven.swing.TextField();
        Text_price = new com.raven.swing.TextField();
        Text_createdate = new com.raven.swing.TextField();
        Text_updatedate = new com.raven.swing.TextField();
        jLabelAvatar = new javax.swing.JLabel();
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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Idcate", "Briefdescription", "Fulldescription", "Idteacher", "Price", "Createdate", "Updatedate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data course", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        Text_ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Text_ID.setLabelText("ID");
        Text_ID.setLineColor(new java.awt.Color(0, 0, 0));
        Text_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_IDActionPerformed(evt);
            }
        });

        Text_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_Name.setLabelText("NAME");
        Text_Name.setLineColor(new java.awt.Color(0, 0, 0));

        Text_IDCate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_IDCate.setLabelText("ID CATE");
        Text_IDCate.setLineColor(new java.awt.Color(0, 0, 0));

        Text_birefdescrip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_birefdescrip.setLabelText("BRIEF DESCRIPTION");
        Text_birefdescrip.setLineColor(new java.awt.Color(0, 0, 0));

        Text_fulldescrip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_fulldescrip.setLabelText("FULL DESCRIPTION");
        Text_fulldescrip.setLineColor(new java.awt.Color(0, 0, 0));

        Text_idteacher.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_idteacher.setLabelText("ID TEACHER");
        Text_idteacher.setLineColor(new java.awt.Color(0, 0, 0));

        Text_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_price.setLabelText("PRICE");
        Text_price.setLineColor(new java.awt.Color(0, 0, 0));
        Text_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Text_priceKeyPressed(evt);
            }
        });

        Text_createdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_createdate.setLabelText("CREATE DATE");
        Text_createdate.setLineColor(new java.awt.Color(0, 0, 0));

        Text_updatedate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_updatedate.setLabelText("UPDATE DATE");
        Text_updatedate.setLineColor(new java.awt.Color(0, 0, 0));

        jLabelAvatar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAvatar.setText("AVATAR");
        jLabelAvatar.setPreferredSize(new java.awt.Dimension(56, 30));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_fulldescrip, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(Text_birefdescrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_price, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_createdate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_idteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Text_ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(Text_updatedate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_IDCate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_idteacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_birefdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_updatedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_fulldescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_createdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_IDCate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );

        myTextFieldSearch.setText("Find course");
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
        fix.setText("Sửa");
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
        add.setText("Thêm mới");
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
        save.setText("Lưu lại");
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
        delete.setText("Xóa");
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
        esc.setText("Hủy bỏ");
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkexistID(String idcourse) {
        Boolean check = false;
        List<Course> courseList = Course_Modify.findAll();
        for (Course course : courseList) {
            if (course.getID_COURSE().equalsIgnoreCase(idcourse)) {
                check = true;
            }
        }
        return check;
    }

    public void inittabledata() {
        List<Course> courseList = Course_Modify.findAll();
        tableModel.setRowCount(0);

        courseList.forEach((course) -> {
            tableModel.addRow(new Object[]{course.getID_COURSE(), course.getCOURSE_NAME(), course.getID_CATE(), course.getBRIEF_DESCRIPTION(), course.getFULL_DESCRIPTION(), course.getID_TEACHER(), course.getPRICE(), course.getCREATE_DATE(), course.getUPDate_DATE()});
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
        delete.setEnabled(false);
        jLabelAvatar.setEnabled(true);
        Text_Name.setEnabled(true);
        Text_IDCate.setEnabled(true);
        Text_birefdescrip.setEnabled(true);
        Text_fulldescrip.setEnabled(true);
        Text_idteacher.setEnabled(true);
        Text_price.setEnabled(true);
        Text_createdate.setEnabled(true);
        Text_updatedate.setEnabled(false);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String aString = formatter.format(date);
        Text_updatedate.setText(aString);
        updatebutton = true;
    }//GEN-LAST:event_fixActionPerformed

    private void Text_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_IDActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (insertbutton == true) {
            String idcourse = Text_ID.getText();
            String ID_CATE = Text_IDCate.getText();
            String ID_TEACHER = Text_idteacher.getText();
            
            String COURSE_NAME = Text_Name.getText();
            boolean isBLOCKED = false;
            String BRIEF_DESCRIPTION = Text_birefdescrip.getText();
            String FULL_DESCRIPTION = Text_fulldescrip.getText();
            int SCORE = 0;
            int NUM_REVIEW = 0;
            int NUM_STUDENT = 0;
            int PRICE = Integer.valueOf(Text_price.getText());
              String sDate1=Text_createdate.getText();
              
         
            try {  
            Date CREATE_DATE=new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            
            Date date = new Date();
            String aString = formatter.format(date);
            Date UPDate_DATE = new SimpleDateFormat("dd-MM-yyyy").parse(aString);
                Course course = new Course(idcourse, ID_CATE, ID_TEACHER, null, COURSE_NAME, isBLOCKED, BRIEF_DESCRIPTION, FULL_DESCRIPTION, SCORE, NUM_REVIEW, NUM_STUDENT, PRICE, CREATE_DATE, UPDate_DATE);
         
            if (checkexistID(idcourse)) {
                //  JOptionPane.showMessageDialog(null,"COURSE ID ALREADY EXISTS"+":"+idcourse,"",2);  
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("ID khóa học trùng!", "Bấm OK để tiếp tục.");

            } else {
                Course_Modify.insert(course,s);
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("Thêm mới khóa học thành công!", "Bấm OK để tiếp tục.");

            }
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            jLabelAvatar.setEnabled(false);
            Text_Name.setEnabled(false);
            Text_IDCate.setEnabled(false);
            Text_birefdescrip.setEnabled(false);
            Text_fulldescrip.setEnabled(false);
            Text_idteacher.setEnabled(false);
            Text_price.setEnabled(false);
            Text_createdate.setEnabled(false);
            Text_updatedate.setEnabled(false);
            
            jLabelAvatar.setIcon(null);
            Text_ID.setText("");
            Text_Name.setText("");
            Text_IDCate.setText("");
            Text_birefdescrip.setText("");
            Text_fulldescrip.setText("");
            Text_idteacher.setText("");
            Text_price.setText("");
            Text_createdate.setText("");
            Text_updatedate.setText("");
            insertbutton = false;
            s="";
            inittabledata();
            } catch (ParseException ex) {
            Logger.getLogger(Form_Course.class.getName()).log(Level.SEVERE, null, ex);
            }
    

           
        
        } else if (updatebutton == true) {
            String idcourse = Text_ID.getText();
            String ID_CATE = Text_IDCate.getText();
            String ID_TEACHER = Text_idteacher.getText();

            String COURSE_NAME = Text_Name.getText();
            boolean isBLOCKED = false;
            String BRIEF_DESCRIPTION = Text_birefdescrip.getText();
            String FULL_DESCRIPTION = Text_fulldescrip.getText();
            int SCORE = 0;
            int NUM_REVIEW = 0;
            int NUM_STUDENT = 0;
            int PRICE = Integer.valueOf(Text_price.getText());
            String sDate1=Text_createdate.getText();
            Date CREATE_DATE;
            try {
            CREATE_DATE = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String aString = formatter.format(date);
            Date UPDate_DATE = new SimpleDateFormat("dd-MM-yyyy").parse(aString);
            
            Course course = new Course(idcourse, ID_CATE, ID_TEACHER, null, COURSE_NAME, isBLOCKED, BRIEF_DESCRIPTION, FULL_DESCRIPTION, SCORE, NUM_REVIEW, NUM_STUDENT, PRICE, CREATE_DATE, UPDate_DATE);
            Course_Modify.update(course,s);
            MessageDialog obj = new MessageDialog(main);
            obj.showMessage("Chỉnh sửa khóa học thành công!", "Bấm OK để tiếp tục.");
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            jLabelAvatar.setEnabled(false);
            Text_Name.setEnabled(false);
            Text_IDCate.setEnabled(false);
            Text_birefdescrip.setEnabled(false);
            Text_fulldescrip.setEnabled(false);
            Text_idteacher.setEnabled(false);
            Text_price.setEnabled(false);
            Text_createdate.setEnabled(false);
            Text_updatedate.setEnabled(false);
            Text_ID.setText("");
            
            jLabelAvatar.setIcon(null);
            Text_Name.setText("");
            Text_IDCate.setText("");
            Text_birefdescrip.setText("");
            Text_fulldescrip.setText("");
            Text_idteacher.setText("");
            Text_price.setText("");
            Text_createdate.setText("");
            Text_updatedate.setText("");
            updatebutton=false;
            s="";
            inittabledata();
            } catch (ParseException ex) {
                Logger.getLogger(Form_Course.class.getName()).log(Level.SEVERE, null, ex);
            }
             inittabledata();
        }
     }//GEN-LAST:event_saveActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        add.setEnabled(false);
        fix.setEnabled(false);
        save.setEnabled(true);
        esc.setEnabled(true);
        delete.setEnabled(false);
        Text_ID.setEnabled(true);
        jLabelAvatar.setEnabled(true);
        Text_Name.setEnabled(true);
        Text_IDCate.setEnabled(true);
        Text_birefdescrip.setEnabled(true);
        Text_fulldescrip.setEnabled(true);
        Text_idteacher.setEnabled(true);
        Text_price.setEnabled(true);
        Text_createdate.setEnabled(true);
        Text_updatedate.setEnabled(false);
        Text_ID.setText("");
 
        Text_Name.setText("");
        Text_IDCate.setText("");
        Text_birefdescrip.setText("");
        Text_fulldescrip.setText("");
        Text_idteacher.setText("");
        Text_price.setText("");
        Text_createdate.setText("");
        Text_updatedate.setText("");
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
        Text_IDCate.setEnabled(false);
        Text_birefdescrip.setEnabled(false);
        Text_fulldescrip.setEnabled(false);
        Text_idteacher.setEnabled(false);
        Text_price.setEnabled(false);
        Text_createdate.setEnabled(false);
        Text_updatedate.setEnabled(false);
        Text_ID.setText("");

        Text_Name.setText("");
        Text_IDCate.setText("");
        Text_birefdescrip.setText("");
        Text_fulldescrip.setText("");
        Text_idteacher.setText("");
        Text_price.setText("");
        Text_createdate.setText("");
        Text_updatedate.setText("");
        jLabelAvatar.setIcon(null);
        updatebutton=false;
        insertbutton = false;
    }//GEN-LAST:event_escActionPerformed

    private void tablecourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecourseMouseClicked
        fix.setEnabled(true);
        delete.setEnabled(true);
        int row = tablecourse.getSelectedRow();
        String idcourse = String.valueOf(tablecourse.getValueAt(row, 0));
        jLabelAvatar.setIcon(  ResizeImagetable(Course_Modify.findCoursebyID(idcourse).getAVATAR_URL()));
        String name = String.valueOf(tablecourse.getValueAt(row, 1));
        String idcate = String.valueOf(tablecourse.getValueAt(row, 2));
        String briefdescrip = String.valueOf(tablecourse.getValueAt(row, 3));
        String fulldescrip = String.valueOf(tablecourse.getValueAt(row, 4));
        String idteacher = String.valueOf(tablecourse.getValueAt(row, 5));
        int price = Integer.valueOf(String.valueOf(tablecourse.getValueAt(row, 6)));
        String createdate = String.valueOf(tablecourse.getValueAt(row, 7));
        String update = String.valueOf(tablecourse.getValueAt(row, 8));
        Text_ID.setText(idcourse);
        Text_Name.setText(name);
        Text_IDCate.setText(idcate);
        Text_birefdescrip.setText(briefdescrip);
        Text_fulldescrip.setText(fulldescrip);
        Text_idteacher.setText(idteacher);
        Text_price.setText(String.valueOf(price));
        Text_createdate.setText(createdate);
        Text_updatedate.setText(update);
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

    private void myTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myTextFieldSearchKeyPressed
        if ( myTextFieldSearch.getText().length() >= 20){
          evt.consume();
        } 
        String input = myTextFieldSearch.getText();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if(!input.equalsIgnoreCase("")){
                  List<Course> crslist=Course_Modify.findCoursebyname(input);
                  tableModel.setRowCount(0);
                    crslist.forEach((course) -> {
            tableModel.addRow(new Object[]{course.getID_COURSE(), course.getCOURSE_NAME(), course.getID_CATE(), course.getBRIEF_DESCRIPTION(), course.getFULL_DESCRIPTION(), course.getID_TEACHER(), course.getPRICE(), course.getCREATE_DATE(), course.getUPDate_DATE()});
        });
             } else{
                inittabledata(); 
             }
        }
    }//GEN-LAST:event_myTextFieldSearchKeyPressed

    private void myTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseClicked
       myTextFieldSearch.setText("");
    }//GEN-LAST:event_myTextFieldSearchMouseClicked

    private void myTextFieldSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseExited
         myTextFieldSearch.setText("Find course");
        jPanel1.requestFocus();
    }//GEN-LAST:event_myTextFieldSearchMouseExited

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int row = tablecourse.getSelectedRow();
        String idcourse= String.valueOf(tablecourse.getValueAt(row, 0));
        int respone=JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa khóa học và đồng thời xóa các dữ liệu liên quan tới khóa học ?", "CONFIRM",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(respone==JOptionPane.YES_OPTION){
            Course_Modify.delete(idcourse);
            jLabelAvatar.setIcon(null);
        } else if(respone==JOptionPane.NO_OPTION){

        }
          inittabledata();
    }//GEN-LAST:event_deleteActionPerformed

    private void Text_priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_priceKeyPressed
          String phoneNumber = Text_price.getText();
        int length = phoneNumber.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<10)
            {
                Text_price.setEditable(true);
            }
            else
            {
                Text_price.setEditable(false);
            }
        }else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                Text_price.setEditable(true);
            }
            else
            {
                Text_price.setEditable(false);
            }
        }
    }//GEN-LAST:event_Text_priceKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.TextField Text_ID;
    private com.raven.swing.TextField Text_IDCate;
    private com.raven.swing.TextField Text_Name;
    private com.raven.swing.TextField Text_birefdescrip;
    private com.raven.swing.TextField Text_createdate;
    private com.raven.swing.TextField Text_fulldescrip;
    private com.raven.swing.TextField Text_idteacher;
    private com.raven.swing.TextField Text_price;
    private com.raven.swing.TextField Text_updatedate;
    private swing.MyButton add;
    private swing.MyButton delete;
    private swing.MyButton esc;
    private swing.MyButton fix;
    private javax.swing.JLabel jLabelAvatar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private swing.MyTextField myTextFieldSearch;
    private swing.MyButton save;
    private com.raven.swing.table.Table tablecourse;
    // End of variables declaration//GEN-END:variables
}
