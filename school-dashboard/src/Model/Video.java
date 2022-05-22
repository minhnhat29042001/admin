/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Video {
    private String ID_VIDEO;
    private String ID_CHAPTER;
    private String NAME_VIDEO;
    private String URL_VIDEO;
    

    public Video() {
    }

    public Video(String ID_VIDEO, String ID_CHAPTER, String NAME_VIDEO, String URL_VIDEO) {
        this.ID_VIDEO = ID_VIDEO;
        this.ID_CHAPTER = ID_CHAPTER;
        this.NAME_VIDEO = NAME_VIDEO;
        this.URL_VIDEO = URL_VIDEO;
    }

    public String getID_VIDEO() {
        return ID_VIDEO;
    }

    public void setID_VIDEO(String ID_VIDEO) {
        this.ID_VIDEO = ID_VIDEO;
    }

    public String getID_CHAPTER() {
        return ID_CHAPTER;
    }

    public void setID_CHAPTER(String ID_CHAPTER) {
        this.ID_CHAPTER = ID_CHAPTER;
    }

    public String getNAME_VIDEO() {
        return NAME_VIDEO;
    }

    public void setNAME_VIDEO(String NAME_VIDEO) {
        this.NAME_VIDEO = NAME_VIDEO;
    }

    public String getURL_VIDEO() {
        return URL_VIDEO;
    }

    public void setURL_VIDEO(String URL_VIDEO) {
        this.URL_VIDEO = URL_VIDEO;
    }

           
}
