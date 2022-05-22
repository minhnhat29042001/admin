package com.raven.model;

import com.raven.swing.table.EventAction;
import com.raven.swing.table.ModelAction;
import com.raven.swing.table.ModelProfile;
import java.text.DecimalFormat;
import javax.swing.Icon;

public class ModelStudent {

     public ModelStudent() {
    }

    public ModelStudent(String ID_STUDENT, boolean isBlock, String PHONENUMBER_STUDENT, String NAME_STUDENT, String GENDER_STUDENT, String USERNAME_STUDENT, String PASSWORD_STUDENT, String BIRTHDAY_STUDENT, String CITY_STUDENT, String ADDRESS_STUDENT) {
        this.ID_STUDENT = ID_STUDENT;
        this.isBlock = isBlock;
        this.PHONENUMBER_STUDENT = PHONENUMBER_STUDENT;
        this.NAME_STUDENT = NAME_STUDENT;
        this.GENDER_STUDENT = GENDER_STUDENT;
        this.USERNAME_STUDENT = USERNAME_STUDENT;
        this.PASSWORD_STUDENT = PASSWORD_STUDENT;
        this.BIRTHDAY_STUDENT = BIRTHDAY_STUDENT;
        this.CITY_STUDENT = CITY_STUDENT;
        this.ADDRESS_STUDENT = ADDRESS_STUDENT;
    }

    public ModelStudent(String ID_STUDENT, boolean isBlock, String PHONENUMBER_STUDENT, String NAME_STUDENT, String GENDER_STUDENT, String BIRTHDAY_STUDENT, String CITY_STUDENT, String ADDRESS_STUDENT) {
        this.ID_STUDENT = ID_STUDENT;
        this.isBlock = isBlock;
        this.PHONENUMBER_STUDENT = PHONENUMBER_STUDENT;
        this.NAME_STUDENT = NAME_STUDENT;
        this.GENDER_STUDENT = GENDER_STUDENT;
        this.BIRTHDAY_STUDENT = BIRTHDAY_STUDENT;
        this.CITY_STUDENT = CITY_STUDENT;
        this.ADDRESS_STUDENT = ADDRESS_STUDENT;
    }
    
    

    public String getID_STUDENT() {
        return ID_STUDENT;
    }

    public void setID_STUDENT(String ID_STUDENT) {
        this.ID_STUDENT = ID_STUDENT;
    }

    public boolean isIsBlock() {
        return isBlock;
    }

    public void setIsBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }

    public String getPHONENUMBER_STUDENT() {
        return PHONENUMBER_STUDENT;
    }

    public void setPHONENUMBER_STUDENT(String PHONENUMBER_STUDENT) {
        this.PHONENUMBER_STUDENT = PHONENUMBER_STUDENT;
    }

    public String getNAME_STUDENT() {
        return NAME_STUDENT;
    }

    public void setNAME_STUDENT(String NAME_STUDENT) {
        this.NAME_STUDENT = NAME_STUDENT;
    }

    public String getGENDER_STUDENT() {
        return GENDER_STUDENT;
    }

    public void setGENDER_STUDENT(String GENDER_STUDENT) {
        this.GENDER_STUDENT = GENDER_STUDENT;
    }

    public String getUSERNAME_STUDENT() {
        return USERNAME_STUDENT;
    }

    public void setUSERNAME_STUDENT(String USERNAME_STUDENT) {
        this.USERNAME_STUDENT = USERNAME_STUDENT;
    }

    public String getPASSWORD_STUDENT() {
        return PASSWORD_STUDENT;
    }

    public void setPASSWORD_STUDENT(String PASSWORD_STUDENT) {
        this.PASSWORD_STUDENT = PASSWORD_STUDENT;
    }

    public String getBIRTHDAY_STUDENT() {
        return BIRTHDAY_STUDENT;
    }

    public void setBIRTHDAY_STUDENT(String BIRTHDAY_STUDENT) {
        this.BIRTHDAY_STUDENT = BIRTHDAY_STUDENT;
    }

    public String getCITY_STUDENT() {
        return CITY_STUDENT;
    }

    public void setCITY_STUDENT(String CITY_STUDENT) {
        this.CITY_STUDENT = CITY_STUDENT;
    }

    public String getADDRESS_STUDENT() {
        return ADDRESS_STUDENT;
    }

    public void setADDRESS_STUDENT(String ADDRESS_STUDENT) {
        this.ADDRESS_STUDENT = ADDRESS_STUDENT;
    }

    private String ID_STUDENT;
    private boolean isBlock;
    private String PHONENUMBER_STUDENT;
    private String NAME_STUDENT;
    private String GENDER_STUDENT;
    private String USERNAME_STUDENT;
    private String PASSWORD_STUDENT;
    private String BIRTHDAY_STUDENT;
    private String CITY_STUDENT;
    private String ADDRESS_STUDENT;

    public Object[] toRowTable(EventAction event) {
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        return new Object[]{ID_STUDENT, isBlock, PHONENUMBER_STUDENT, NAME_STUDENT,GENDER_STUDENT,BIRTHDAY_STUDENT,CITY_STUDENT,ADDRESS_STUDENT,new ModelAction(this, event)};
    }
}
