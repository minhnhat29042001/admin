/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class Teacher {
    private String ID_TEACHER;
    private String NAME_TEACHER;
    private String ROLE_TEACHER;
    private String PHONE_NUMBER;
    private String EXPERIENCE;
    private ImageIcon AVATARURL;

    public Teacher() {
    }

    public Teacher(String ID_TEACHER, String NAME_TEACHER, String ROLE_TEACHER, String PHONE_NUMBER, String EXPERIENCE, ImageIcon AVATARURL) {
        this.ID_TEACHER = ID_TEACHER;
        this.NAME_TEACHER = NAME_TEACHER;
        this.ROLE_TEACHER = ROLE_TEACHER;
        this.PHONE_NUMBER = PHONE_NUMBER;
        this.EXPERIENCE = EXPERIENCE;
        this.AVATARURL = AVATARURL;
    }

    public String getID_TEACHER() {
        return ID_TEACHER;
    }

    public void setID_TEACHER(String ID_TEACHER) {
        this.ID_TEACHER = ID_TEACHER;
    }

    public String getNAME_TEACHER() {
        return NAME_TEACHER;
    }

    public void setNAME_TEACHER(String NAME_TEACHER) {
        this.NAME_TEACHER = NAME_TEACHER;
    }

    public String getROLE_TEACHER() {
        return ROLE_TEACHER;
    }

    public void setROLE_TEACHER(String ROLE_TEACHER) {
        this.ROLE_TEACHER = ROLE_TEACHER;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public String getEXPERIENCE() {
        return EXPERIENCE;
    }

    public void setEXPERIENCE(String EXPERIENCE) {
        this.EXPERIENCE = EXPERIENCE;
    }

    public ImageIcon getAVATARURL() {
        return AVATARURL;
    }

    public void setAVATARURL(ImageIcon AVATARURL) {
        this.AVATARURL = AVATARURL;
    }

    

   
    
}
