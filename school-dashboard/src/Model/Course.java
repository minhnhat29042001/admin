/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.Date;

import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class Course {
    private String  ID_COURSE;
    private String  ID_CATE;
    private String  ID_TEACHER;
    private ImageIcon  AVATAR_URL;
    private String  COURSE_NAME;
    private boolean isBLOCKED;
    private String  BRIEF_DESCRIPTION;
    private String  FULL_DESCRIPTION;
    private int  SCORE;
    private int     NUM_REVIEW;
    private int     NUM_STUDENT;
    private int     PRICE;
    private Date    CREATE_DATE;
    private Date    UPDate_DATE;

    public Course() {
    }

    public Course(String ID_COURSE, String ID_CATE, String ID_TEACHER, ImageIcon AVATAR_URL, String COURSE_NAME, boolean isBLOCKED, String BRIEF_DESCRIPTION, String FULL_DESCRIPTION, int SCORE, int NUM_REVIEW, int NUM_STUDENT, int PRICE, Date CREATE_DATE, Date UPDate_DATE) {
        this.ID_COURSE = ID_COURSE;
        this.ID_CATE = ID_CATE;
        this.ID_TEACHER = ID_TEACHER;
        this.AVATAR_URL = AVATAR_URL;
        this.COURSE_NAME = COURSE_NAME;
        this.isBLOCKED = isBLOCKED;
        this.BRIEF_DESCRIPTION = BRIEF_DESCRIPTION;
        this.FULL_DESCRIPTION = FULL_DESCRIPTION;
        this.SCORE = SCORE;
        this.NUM_REVIEW = NUM_REVIEW;
        this.NUM_STUDENT = NUM_STUDENT;
        this.PRICE = PRICE;
        this.CREATE_DATE = CREATE_DATE;
        this.UPDate_DATE = UPDate_DATE;
    }

    public String getID_COURSE() {
        return ID_COURSE;
    }

    public void setID_COURSE(String ID_COURSE) {
        this.ID_COURSE = ID_COURSE;
    }

    public String getID_CATE() {
        return ID_CATE;
    }

    public void setID_CATE(String ID_CATE) {
        this.ID_CATE = ID_CATE;
    }

    public String getID_TEACHER() {
        return ID_TEACHER;
    }

    public void setID_TEACHER(String ID_TEACHER) {
        this.ID_TEACHER = ID_TEACHER;
    }

    public ImageIcon getAVATAR_URL() {
        return AVATAR_URL;
    }

    public void setAVATAR_URL(ImageIcon AVATAR_URL) {
        this.AVATAR_URL = AVATAR_URL;
    }

    public String getCOURSE_NAME() {
        return COURSE_NAME;
    }

    public void setCOURSE_NAME(String COURSE_NAME) {
        this.COURSE_NAME = COURSE_NAME;
    }

    public boolean isIsBLOCKED() {
        return isBLOCKED;
    }

    public void setIsBLOCKED(boolean isBLOCKED) {
        this.isBLOCKED = isBLOCKED;
    }

    public String getBRIEF_DESCRIPTION() {
        return BRIEF_DESCRIPTION;
    }

    public void setBRIEF_DESCRIPTION(String BRIEF_DESCRIPTION) {
        this.BRIEF_DESCRIPTION = BRIEF_DESCRIPTION;
    }

    public String getFULL_DESCRIPTION() {
        return FULL_DESCRIPTION;
    }

    public void setFULL_DESCRIPTION(String FULL_DESCRIPTION) {
        this.FULL_DESCRIPTION = FULL_DESCRIPTION;
    }

    public int getSCORE() {
        return SCORE;
    }

    public void setSCORE(int SCORE) {
        this.SCORE = SCORE;
    }

    public int getNUM_REVIEW() {
        return NUM_REVIEW;
    }

    public void setNUM_REVIEW(int NUM_REVIEW) {
        this.NUM_REVIEW = NUM_REVIEW;
    }

    public int getNUM_STUDENT() {
        return NUM_STUDENT;
    }

    public void setNUM_STUDENT(int NUM_STUDENT) {
        this.NUM_STUDENT = NUM_STUDENT;
    }

    public int getPRICE() {
        return PRICE;
    }

    public void setPRICE(int PRICE) {
        this.PRICE = PRICE;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public Date getUPDate_DATE() {
        return UPDate_DATE;
    }

    public void setUPDate_DATE(Date UPDate_DATE) {
        this.UPDate_DATE = UPDate_DATE;
    }

  

   
}
