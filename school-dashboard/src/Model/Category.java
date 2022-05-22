/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Category {
    private String ID_CATE;
    private String NAME_CATE;

    public Category() {
    }

    public Category(String ID_CATE, String NAME_CATE) {
        this.ID_CATE = ID_CATE;
        this.NAME_CATE = NAME_CATE;
    }

    public String getID_CATE() {
        return ID_CATE;
    }

    public void setID_CATE(String ID_CATE) {
        this.ID_CATE = ID_CATE;
    }

    public String getNAME_CATE() {
        return NAME_CATE;
    }

    public void setNAME_CATE(String NAME_CATE) {
        this.NAME_CATE = NAME_CATE;
    }

    @Override
    public String toString() {
        return NAME_CATE ;
    }
    
}
