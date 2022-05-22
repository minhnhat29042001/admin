package com.raven.swing.table;

import Model.Register;
import com.raven.model.ModelStudent;

public class ModelActionRegister {

    public Register getRegister() {
        return register;
    }

    public void getRegister(Register register) {
        this.register = register;
    }

    public EventActionRegister getEvent() {
        return event;
    }

    public void setEvent(EventActionRegister event) {
        this.event = event;
    }

    public ModelActionRegister(Register register, EventActionRegister event) {
        this.register = register;
        this.event = event;
    }

    public ModelActionRegister() {
    }

    private Register register;
    private EventActionRegister event;
}
