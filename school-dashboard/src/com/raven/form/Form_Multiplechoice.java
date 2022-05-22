package com.raven.form;

import GetModelData.Chapter_Modify;
import GetModelData.Course_Modify;
import GetModelData.MultipleChoice_Modify;
import GetModelData.Teacher_Modify;
import static LoginAdmin.SignIn.main;
import Model.Chapter;
import Model.Course;
import Model.MultipleChoice;
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

public class Form_Multiplechoice extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    static boolean insertbutton = false;
    static boolean updatebutton = false;

    public Form_Multiplechoice() {
        initComponents();
        setOpaque(false);
        tableModel = (DefaultTableModel) tablecourse.getModel();
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        inittabledata();
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        Text_ID.setEnabled(false);
        Text_IDCOURSE.setEnabled(false);
        Text_Question.setEnabled(false);
        Text_Score.setEnabled(false);
        Text_CorrectAnswer.setEnabled(false);
        Text_optionA.setEnabled(false);
        Text_optionB.setEnabled(false);
        Text_optionC.setEnabled(false);
        Text_optionD.setEnabled(false);
            delete.setEnabled(false);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablecourse = new com.raven.swing.table.Table();
        jPanel1 = new javax.swing.JPanel();
        Text_ID = new com.raven.swing.TextField();
        Text_Question = new com.raven.swing.TextField();
        Text_IDCOURSE = new com.raven.swing.TextField();
        Text_Score = new com.raven.swing.TextField();
        Text_CorrectAnswer = new com.raven.swing.TextField();
        Text_optionA = new com.raven.swing.TextField();
        Text_optionD = new com.raven.swing.TextField();
        Text_optionC = new com.raven.swing.TextField();
        Text_optionB = new com.raven.swing.TextField();
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
                "ID", "Idcourse", "Question", "optionA", "optionB", "optionC", "optionD", "score", "Correct answer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data multiplechoice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        Text_ID.setEditable(false);
        Text_ID.setBackground(new java.awt.Color(255, 255, 255));
        Text_ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Text_ID.setLabelText("ID");
        Text_ID.setLineColor(new java.awt.Color(0, 0, 0));
        Text_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_IDActionPerformed(evt);
            }
        });

        Text_Question.setEditable(false);
        Text_Question.setBackground(new java.awt.Color(255, 255, 255));
        Text_Question.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_Question.setLabelText("QUESTION");
        Text_Question.setLineColor(new java.awt.Color(0, 0, 0));

        Text_IDCOURSE.setEditable(false);
        Text_IDCOURSE.setBackground(new java.awt.Color(255, 255, 255));
        Text_IDCOURSE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_IDCOURSE.setLabelText("ID COURSE");
        Text_IDCOURSE.setLineColor(new java.awt.Color(0, 0, 0));

        Text_Score.setEditable(false);
        Text_Score.setBackground(new java.awt.Color(255, 255, 255));
        Text_Score.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_Score.setLabelText("SCORE");
        Text_Score.setLineColor(new java.awt.Color(0, 0, 0));

        Text_CorrectAnswer.setEditable(false);
        Text_CorrectAnswer.setBackground(new java.awt.Color(255, 255, 255));
        Text_CorrectAnswer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_CorrectAnswer.setLabelText("CORRECT ANSWER");
        Text_CorrectAnswer.setLineColor(new java.awt.Color(0, 0, 0));

        Text_optionA.setEditable(false);
        Text_optionA.setBackground(new java.awt.Color(255, 255, 255));
        Text_optionA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_optionA.setLabelText("OPTION A");
        Text_optionA.setLineColor(new java.awt.Color(0, 0, 0));

        Text_optionD.setEditable(false);
        Text_optionD.setBackground(new java.awt.Color(255, 255, 255));
        Text_optionD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_optionD.setLabelText("OPTION D");
        Text_optionD.setLineColor(new java.awt.Color(0, 0, 0));

        Text_optionC.setEditable(false);
        Text_optionC.setBackground(new java.awt.Color(255, 255, 255));
        Text_optionC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_optionC.setLabelText("OPTION C");
        Text_optionC.setLineColor(new java.awt.Color(0, 0, 0));

        Text_optionB.setEditable(false);
        Text_optionB.setBackground(new java.awt.Color(255, 255, 255));
        Text_optionB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Text_optionB.setLabelText("OPTION B");
        Text_optionB.setLineColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_CorrectAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_optionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_Question, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_optionB, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_optionC, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_optionA, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Text_IDCOURSE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(Text_optionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_CorrectAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_optionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_Question, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_optionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_optionD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Text_IDCOURSE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Text_Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        myTextFieldSearch.setText("Tìm khóa học");
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
                        .addGap(0, 412, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkexistID(String idcourse) {
        Boolean check = false;
        List<MultipleChoice> MultipleChoiceList = MultipleChoice_Modify.findAll();
        for (MultipleChoice multiplechoice : MultipleChoiceList) {
            if (multiplechoice.getID_MTPC().equalsIgnoreCase(idcourse)) {
                check = true;
            }
        }
        return check;
    }

    public void inittabledata() {
        List<MultipleChoice> MultipleChoiceList = MultipleChoice_Modify.findAll();
        tableModel.setRowCount(0);

        MultipleChoiceList.forEach((MultipleChoice) -> {
            tableModel.addRow(new Object[]{MultipleChoice.getID_MTPC(),MultipleChoice.getID_COURSE(),MultipleChoice.getQUESTION(),MultipleChoice.getOPTIONA(),MultipleChoice.getOPTIONB(),MultipleChoice.getOPTIONC(),MultipleChoice.getOPTIOND(),MultipleChoice.getSCORE(),MultipleChoice.getCorrectAnswer()});
        });
    }


    private void fixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixActionPerformed
        add.setEnabled(false);
        fix.setEnabled(false);
        save.setEnabled(true);
        esc.setEnabled(true);
            delete.setEnabled(false);
        Text_Question.setEnabled(true);
        Text_Score.setEnabled(true);
        Text_CorrectAnswer.setEnabled(true);
        Text_optionA.setEnabled(true);
        Text_optionB.setEnabled(true);
        Text_optionC.setEnabled(true);
        Text_optionD.setEnabled(true);
        Text_CorrectAnswer.setEnabled(true);
        
        updatebutton = true;
    }//GEN-LAST:event_fixActionPerformed

    private void Text_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_IDActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (insertbutton == true) {
            String idmultiplechoice = Text_ID.getText();
            String ID_COURSE = Text_IDCOURSE.getText();
            int SCORE = Integer.valueOf(Text_Score.getText());
            String CORRECTANSWER = Text_CorrectAnswer.getText();
            String QUESTION = Text_Question.getText();
            String OPTIONA=Text_optionA.getText();
            String OPTIONB=Text_optionB.getText();
            String OPTIONC=Text_optionC.getText();
            String OPTIOND=Text_optionD.getText();
            MultipleChoice multipleChoice=new MultipleChoice(idmultiplechoice,ID_COURSE,QUESTION,OPTIONA,OPTIONB,OPTIONC,OPTIONC,CORRECTANSWER,SCORE);
         

           

            if (checkexistID(multipleChoice.getID_COURSE())) {
                //  JOptionPane.showMessageDialog(null,"COURSE ID ALREADY EXISTS"+":"+idcourse,"",2);  
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("ID trắc nghiệm trùng!", "Bấm OK để tiếp tục.");

            } else {
                MultipleChoice_Modify.insert(multipleChoice);
                MessageDialog obj = new MessageDialog(main);
                obj.showMessage("Thêm mới trắc nghiệm thành công!", "Bấm OK để tiếp tục.");

            }
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            Text_IDCOURSE.setEnabled(false);
            Text_Question.setEnabled(false);
            Text_Score.setEnabled(false);
            Text_CorrectAnswer.setEnabled(false);
            Text_optionA.setEnabled(false);
            Text_optionB.setEnabled(false);
            Text_optionC.setEnabled(false);
            Text_optionD.setEnabled(false);
    
            
            Text_ID.setText("");
            Text_IDCOURSE.setText("");
            Text_Question.setText("");
            Text_Score.setText("");
            Text_CorrectAnswer.setText("");
            Text_optionA.setText("");
            Text_optionB.setText("");
            Text_optionC.setText("");
            Text_optionD.setText("");
           
            insertbutton = false;
        } else if (updatebutton == true) {
            String idmultiplechoice = Text_ID.getText();
            String ID_COURSE = Text_IDCOURSE.getText();
            int SCORE = Integer.valueOf(Text_Score.getText());
            String CORRECTANSWER = Text_CorrectAnswer.getText();
            String QUESTION = Text_Question.getText();
            String OPTIONA=Text_optionA.getText();
            String OPTIONB=Text_optionB.getText();
            String OPTIONC=Text_optionC.getText();
            String OPTIOND=Text_optionD.getText();
            MultipleChoice multipleChoice=new MultipleChoice(idmultiplechoice,ID_COURSE,QUESTION,OPTIONA,OPTIONB,OPTIONC,OPTIONC,CORRECTANSWER,SCORE);
          
    
            MultipleChoice_Modify.update(multipleChoice);
            MessageDialog obj = new MessageDialog(main);
            obj.showMessage("Chỉnh sửa trắc nghiệm thành công!", "Bấm OK để tiếp tục.");
            add.setEnabled(true);
            fix.setEnabled(false);
            save.setEnabled(false);
            esc.setEnabled(true);
            Text_ID.setEnabled(false);
            Text_IDCOURSE.setEnabled(false);
            Text_Question.setEnabled(false);
            Text_Score.setEnabled(false);
            Text_CorrectAnswer.setEnabled(false);
            Text_optionA.setEnabled(false);
            Text_optionB.setEnabled(false);
            Text_optionC.setEnabled(false);
            Text_optionD.setEnabled(false);
    
            Text_ID.setText("");
            Text_IDCOURSE.setText("");
            Text_Question.setText("");
            Text_Score.setText("");
            Text_CorrectAnswer.setText("");
            Text_optionA.setText("");
            Text_optionB.setText("");
            Text_optionC.setText("");
            
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
        Text_IDCOURSE.setEnabled(true);
        Text_Question.setEnabled(true);
        Text_Score.setEnabled(true);
        Text_CorrectAnswer.setEnabled(true);
        Text_optionA.setEnabled(true);
        Text_optionB.setEnabled(true);
        Text_optionC.setEnabled(true);
        Text_optionD.setEnabled(true);
        Text_ID.setText("");
        Text_IDCOURSE.setText("");
        Text_Question.setText("");
        Text_Score.setText("");
        Text_CorrectAnswer.setText("");
        Text_optionA.setText("");
        Text_optionB.setText("");
        Text_optionC.setText("");
        Text_optionD.setText("");
        insertbutton = true;

    }//GEN-LAST:event_addActionPerformed

    private void escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escActionPerformed
        // TODO add your handling code here: 
        add.setEnabled(true);
        fix.setEnabled(false);
        save.setEnabled(false);
        esc.setEnabled(false);
        Text_ID.setEnabled(false);
        Text_IDCOURSE.setEnabled(false);
        Text_Question.setEnabled(false);
        Text_Score.setEnabled(false);
        Text_CorrectAnswer.setEnabled(false);
        Text_optionA.setEnabled(false);
        Text_optionB.setEnabled(false);
        Text_optionC.setEnabled(false);
        Text_optionD.setEnabled(false);
        Text_ID.setText("");
        Text_IDCOURSE.setText("");
        Text_Question.setText("");
        Text_Score.setText("");
        Text_CorrectAnswer.setText("");
        Text_optionA.setText("");
        Text_optionB.setText("");
        Text_optionC.setText("");
        Text_optionD.setText("");
        updatebutton=false;
        insertbutton = false;
    }//GEN-LAST:event_escActionPerformed

    private void tablecourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablecourseMouseClicked
        fix.setEnabled(true);
        delete.setEnabled(true);
        int row = tablecourse.getSelectedRow();
        String idmultiplechoice = String.valueOf(tablecourse.getValueAt(row, 0));
        String idcourse = String.valueOf(tablecourse.getValueAt(row, 1));
        String question = String.valueOf(tablecourse.getValueAt(row, 2));
        String optiona = String.valueOf(tablecourse.getValueAt(row, 3));
        String optionb = String.valueOf(tablecourse.getValueAt(row, 4));
        String optionc =String.valueOf(tablecourse.getValueAt(row, 5));
        String optiond =String.valueOf(tablecourse.getValueAt(row, 6));
        int score =Integer.valueOf(String.valueOf(tablecourse.getValueAt(row, 7)));
        String correctanswer =String.valueOf(tablecourse.getValueAt(row, 5));
       
        Text_ID.setText(idmultiplechoice);
        Text_IDCOURSE.setText(idcourse);
        Text_Question.setText(question);
        Text_Score.setText(String.valueOf(score));
        Text_CorrectAnswer.setText(correctanswer);
        Text_optionA.setText(optiona);
        Text_optionB.setText(optionb);
        Text_optionC.setText(optionc);
        Text_optionD.setText(optiond);
   
    }//GEN-LAST:event_tablecourseMouseClicked

    private void myTextFieldSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseClicked
             myTextFieldSearch.setText("");
    }//GEN-LAST:event_myTextFieldSearchMouseClicked

    private void myTextFieldSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTextFieldSearchMouseExited
         myTextFieldSearch.setText("Tìm khóa học");
        jPanel1.requestFocus();
    }//GEN-LAST:event_myTextFieldSearchMouseExited

    private void myTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_myTextFieldSearchKeyPressed
       if ( myTextFieldSearch.getText().length() >= 20){
          evt.consume();
        } 
        String input = myTextFieldSearch.getText();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
             if(!input.equalsIgnoreCase("")){
                 List<MultipleChoice> MultipleChoiceList = MultipleChoice_Modify.findmultiplechoicebyCourseID(input);
        tableModel.setRowCount(0);
        MultipleChoiceList.forEach((MultipleChoice) -> {
            tableModel.addRow(new Object[]{MultipleChoice.getID_MTPC(),MultipleChoice.getID_COURSE(),MultipleChoice.getQUESTION(),MultipleChoice.getOPTIONA(),MultipleChoice.getOPTIONB(),MultipleChoice.getOPTIONC(),MultipleChoice.getOPTIOND(),MultipleChoice.getSCORE(),MultipleChoice.getCorrectAnswer()});
        });
             } else{
                inittabledata(); 
             }
        }
    }//GEN-LAST:event_myTextFieldSearchKeyPressed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int row = tablecourse.getSelectedRow();
        String multiplechoiceid= String.valueOf(tablecourse.getValueAt(row, 0));
        int respone=JOptionPane.showConfirmDialog(this,"Bạn có chắc muốn xóa câu hỏi trắc nghiệm và đồng thời xóa các dữ liệu liên quan tới câu hỏi trắc nghiệm ?", "CONFIRM",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(respone==JOptionPane.YES_OPTION){
            MultipleChoice_Modify.delete(multiplechoiceid);
        } else if(respone==JOptionPane.NO_OPTION){

        }
           inittabledata();
    }//GEN-LAST:event_deleteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.TextField Text_CorrectAnswer;
    private com.raven.swing.TextField Text_ID;
    private com.raven.swing.TextField Text_IDCOURSE;
    private com.raven.swing.TextField Text_Question;
    private com.raven.swing.TextField Text_Score;
    private com.raven.swing.TextField Text_optionA;
    private com.raven.swing.TextField Text_optionB;
    private com.raven.swing.TextField Text_optionC;
    private com.raven.swing.TextField Text_optionD;
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
