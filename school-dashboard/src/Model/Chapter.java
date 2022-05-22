/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Chapter {
    private String ID_CHAPTER;
    private String ID_COURSE;
    private String NAME_CHAPTER;


    public Chapter() {
    }

    public Chapter(String ID_CHAPTER, String ID_COURSE, String NAME_CHAPTER) {
        this.ID_CHAPTER = ID_CHAPTER;
        this.ID_COURSE = ID_COURSE;
        this.NAME_CHAPTER = NAME_CHAPTER;
       
    }

    public String getID_CHAPTER() {
        return ID_CHAPTER;
    }

    public void setID_CHAPTER(String ID_CHAPTER) {
        this.ID_CHAPTER = ID_CHAPTER;
    }

    public String getID_COURSE() {
        return ID_COURSE;
    }

    public void setID_COURSE(String ID_COURSE) {
        this.ID_COURSE = ID_COURSE;
    }

    public String getNAME_CHAPTER() {
        return NAME_CHAPTER;
    }

    public void setNAME_CHAPTER(String NAME_CHAPTER) {
        this.NAME_CHAPTER = NAME_CHAPTER;
    }

   

    @Override
    public String toString() {
        return NAME_CHAPTER ;
    }
    
}
