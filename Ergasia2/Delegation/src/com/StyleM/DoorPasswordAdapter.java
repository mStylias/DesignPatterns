package com.StyleM;

public class DoorPasswordAdapter implements PasswordClient {

    private ProtectedDoor protectedDoor;
    private PasswordProtector passwordProtector;

    public DoorPasswordAdapter(ProtectedDoor protectedDoor) {
        this.protectedDoor = protectedDoor;
    }

    @Override
    public void alarm() {
        protectedDoor.alarm();
    }

    public boolean check(String code) {
        return passwordProtector.check(code);
    }

    @Override
    public void setPasswordProtector(PasswordProtector protector) {
        this.passwordProtector = protector;
    }

    public ProtectedDoor getProtectedDoor() {
        return protectedDoor;
    }
}
