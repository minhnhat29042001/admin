package com.raven.form;

import GetModelData.Chapter_Modify;
import GetModelData.Course_Modify;
import GetModelData.Teacher_Modify;
import GetModelData.Video_Modify;
import GetModelData.whatwelearn_Modify;
import static LoginAdmin.SignIn.main;
import Model.Chapter;
import Model.Course;
import Model.Teacher;
import Model.Video;
import Model.Whatwelearn;
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

public class Form_Video extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    static boolean insertbutton = false;
    static boolean updatebutton = false;

    public Form_Video() {
        initComponents();
        setOpaque(false);
        tableModel = (DefaultTableModel) tablecourse.getModel();
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        inittabledata();
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        Text_ID.setEnabled(false);
        Text_IDCHAPTER.setEnabled(false);
        Text_URL.setEnabled(false);
        Text_NAME.setEnabled(false);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablecourse = new com.raven.swing.table.Table();
        jPanel1 = new javax.swing.JPanel();
        Text_ID = new com.raven.swing.TextField();
        Text_IDCHAPTER = new com.raven.swing.TextField();
        Text_NAME = new com.raven.swing.TextField();
        Text_URL = new com.raven.swing.TextField();
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID ", "ID CHAPTER", "URL", "NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data video", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        Text_ID.setEditable(false);
        Text_ID.setBackground(new java.awt.Color(255, 255, 255));
        Text_ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Text_ID.setLabelText("VIDEO ID");
        Text_ID.setLineColor(new java.awt.Color(0, 0, 0));

        Text_IDCHAPTER.setEditable(false);
        Text_IDCHAPTER.setBackground(new java.awt.Color(255, 255, 255));
        Text_IDCHAPTER.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_IDCHAPTER.setLabelText("ID CHAPTER");
        Text_IDCHAPTER.setLineColor(new java.awt.Color(0, 0, 0));

        Text_NAME.setEditable(false);
        Text_NAME.setBackground(new java.awt.Color(255, 255, 255));
        Text_NAME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_NAME.setLabelText("NAME");
        Text_NAME.setLineColor(new java.awt.Color(0, 0, 0));

        Text_URL.setEditable(false);
        Text_URL.setBackground(new java.awt.Color(255, 255, 255));
        Text_URL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_URL.setLabelText("URL");
        Text_URL.setLineColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Text_IDCHAPTER, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(Text_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_URL, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(Text_NAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(554, 554, 554))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_URL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_IDCHAPTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        myTextFieldSearch.setText("Find video");
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
    public boolean checkexistID(String idString){
        boolean check=false;
        List<Video> videoList = Video_Modify.findAll();
        for( Video video :videoList){
            if(video.getID_VIDEO().equalsIgnoreCase(idString) ){
                check=true;
            }
        }
        return check;
    }

    public void inittabledata() {
        List<Video> videoList = Video_Modify.findAll();
        tableModel.setRowCount(0);

        videoList.forEach((video) -> {
            tableModel.addRow(new Object[]{video.getID_VIDEO(),video.getID_CHAPTER(),video.getURL_VIDEO(),video.getNAME_VIDEO()});
        });
    }


    private void fixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixActionPerformed
        add.setEnabled(false);
        fix.setEnabled(false);
        save.setEnabled(true);
        esc.setEnabled(true);
        Text_IDCHAPTER.setEnabled(true);
        Text_URL.setEnabled(true);
        Text_NAME.setEnabled(true);
  
        updatebutton = true;
    }//GEN-LAST:event_fixActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (insertbutton == true) {
            String ID_VIDEO = Text_ID.getText();
            String ID_CHAPTER = Text_IDCHAPTER.getText();
            String URL=Text_URL.getText();
            String NAME=Text_NAME.getText();
            Video video=new Video(ID_VIDEO,ID_CHAPTER,NAME,URL);
       

         

           

            if (checkexistID(ID_VIDEO)) {
                //  JOptionPane.showMessageDialog(null,"COURSE ID ALREADY EXISTS"+":"+idcourse,"",2);  
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("ID course và bạn học được gì trùng!", "Bấm OK để tiếp tục.");

            } else {
             Video_Modify.insert(video);
             MessageDialog obj = new MessageDialog(main);
             obj.showMessage("Thêm mới bạn học được gì thành công!", "Bấm OK để tiếp tục.");
                

            }
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            Text_IDCHAPTER.setEnabled(false);
            Text_URL.setEnabled(false);
            Text_NAME.setEnabled(false);
   
            
            Text_ID.setText("");
            Text_IDCHAPTER.setText("");
            Text_URL.setText("");
            Text_NAME.setText("");

         
           
            insertbutton = false;
        } else if (updatebutton == true) {
            String ID_VIDEO = Text_ID.getText();
            String ID_CHAPTER = Text_IDCHAPTER.getText();
            String URL=Text_URL.getText();
            String NAME=Text_NAME.getText();
            Video video=new Video(ID_VIDEO,ID_CHAPTER,NAME,URL);
         
       
            Video_Modify.update(video);
            MessageDialog obj = new MessageDialog(main);
            obj.showMessage("Chỉnh bạn học được gì thành công!", "Bấm OK để tiếp tục.");
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            Text_IDCHAPTER.setEnabled(false);
            Text_URL.setEnabled(false);
            Text_NAME.setEnabled(false);
              
            Text_ID.setText("");
            Text_IDCHAPTER.setText("");
            Text_URL.setText("");
            Text_NAME.setText("");
       
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
        Text_IDCHAPTER.setEnabled(true);
        Text_URL.setEnabled(true);
        Text_NAME.setEnabled(true);
        
        Text_ID.setText("");
        Text_IDCHAPTER.setText("");
        Text_URL.setText("");
        Text_NAME.setText("");

        insertbutton = true;

    }//GEN-LAST:event_addActionPerformed

    private void escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escActionPerformed
        // TODO add your handling code here: 
        add.setEnabled(true);
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        Text_ID.setEnabled(false);
        Text_IDCHAPTER.setEnabled(false);
        Text_URL.setEnabled(false);
        Text_NAME.setEnabled(false);

        
        Text_ID.setText("");
        Text_IDCHAPTER.setText("");
        Text_URL.setText("");
        Text_NAME.setText("");
        
        updatebutton=false;
        insertbutton = false;
    }//GEN-LAST:event_escActionPerformed

    private void tablecourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecourseMouseClicked
        fix.setEnabled(true);
        int row = tablecourse.getSelectedRow();
        String idchapter = String.valueOf(tablecourse.getValueAt(row, 1));
        String idvideo = String.valueOf(tablecourse.getValueAt(row, 0));
        String url = String.valueOf(tablecourse.getValueAt(row, 2));
        String name = String.valueOf(tablecourse.getValueAt(row, 3));

       
        Text_ID.setText(idvideo);
        Text_IDCHAPTER.setText(idchapter);
        Text_URL.setText(url);
        Text_NAME.setText(name);
   
    }//GEN-LAST:event_tablecourseMouseClicked

    private void myTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseClicked
        myTextFieldSearch.setText("");
    }//GEN-LAST:event_myTextFieldSearchMouseClicked

    private void myTextFieldSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseExited
               myTextFieldSearch.setText("Find video");
        jPanel1.requestFocus();
    }//GEN-LAST:event_myTextFieldSearchMouseExited

    private void myTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myTextFieldSearchKeyPressed
           if ( myTextFieldSearch.getText().length() >= 20){
          evt.consume();
        } 
        String input = myTextFieldSearch.getText();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if(!input.equalsIgnoreCase("")){
        tableModel.setRowCount(0);
        List<Video> videoList = Video_Modify.findvideobyName(input);
        tableModel.setRowCount(0);
        videoList.forEach((video) -> {
            tableModel.addRow(new Object[]{video.getID_VIDEO(),video.getID_CHAPTER(),video.getURL_VIDEO(),video.getNAME_VIDEO()});
        });
             } else{
                inittabledata(); 
             }
        }
    }//GEN-LAST:event_myTextFieldSearchKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.TextField Text_ID;
    private com.raven.swing.TextField Text_IDCHAPTER;
    private com.raven.swing.TextField Text_NAME;
    private com.raven.swing.TextField Text_URL;
    private swing.MyButton add;
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
