/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.raven.swing.table.EventAction;
import com.raven.swing.table.EventActionRegister;
import com.raven.swing.table.ModelAction;
import com.raven.swing.table.ModelActionRegister;
import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class Register {
    private String ID_REGISTER;
    private String ID_COURSE;
    private String ID_STUDENT;
    private Boolean AdminAcceptedBoolean;

    public Register() {
    }

    public String getID_REGISTER() {
        return ID_REGISTER;
    }

    public void setID_REGISTER(String ID_REGISTER) {
        this.ID_REGISTER = ID_REGISTER;
    }

    public String getID_COURSE() {
        return ID_COURSE;
    }

    public void setID_COURSE(String ID_COURSE) {
        this.ID_COURSE = ID_COURSE;
    }

    public String getID_STUDENT() {
        return ID_STUDENT;
    }

    public void setID_STUDENT(String ID_STUDENT) {
        this.ID_STUDENT = ID_STUDENT;
    }

    public Boolean getAdminAcceptedBoolean() {
        return AdminAcceptedBoolean;
    }

    public void setAdminAcceptedBoolean(Boolean AdminAcceptedBoolean) {
        this.AdminAcceptedBoolean = AdminAcceptedBoolean;
    }

    @Override
    public String toString() {
        return "Register{" + "ID_REGISTER=" + ID_REGISTER + '}';
    }

    public Register(String ID_REGISTER, String ID_COURSE, String ID_STUDENT, Boolean AdminAcceptedBoolean) {
        this.ID_REGISTER = ID_REGISTER;
        this.ID_COURSE = ID_COURSE;
        this.ID_STUDENT = ID_STUDENT;
        this.AdminAcceptedBoolean = AdminAcceptedBoolean;
    }

     public Register(String ID_REGISTER) {
        this.ID_REGISTER = ID_REGISTER;
    }
    
    public Object[] toRowTable(EventActionRegister event) {
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        return new Object[]{ID_REGISTER, ID_COURSE, ID_STUDENT, AdminAcceptedBoolean,new ModelActionRegister(this, event)};
    }  
}
