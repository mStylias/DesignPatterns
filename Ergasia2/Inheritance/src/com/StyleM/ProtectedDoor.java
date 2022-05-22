package com.StyleM;

public class ProtectedDoor implements Door, PasswordClient {

    private PasswordProtector passwordProtector;
    private boolean isLocked = false;

    public ProtectedDoor(PasswordProtector passwordProtector) {
        setPasswordProtector(passwordProtector);
    }

    @Override
    public void setPasswordProtector(PasswordProtector protector) {
        this.passwordProtector = protector;
    }

    /**
     * Opens the door if it is unlocked
     * @return true if the door opened and false otherwise
     */
    @Override
    public boolean open() {
        if (isLocked) {
            System.out.println("Can't open the door because it's locked");
            return false;
        }

        System.out.println("Successfully opened the door");
        return true;
    }

    /**
     * Sets the door state to locked
     */
    @Override
    public void lock() {
        isLocked = true;
    }

    /**
     * Unlocks the door if the given code is correct
     * @param code The password
     */
    @Override
    public boolean unlock(String code) {
        if (passwordProtector.check(code)) {
            isLocked = false;
            return true;
        }

        return false;
    }

    /**
     * Activates the door alarm
     */
    public void alarm() {
        System.out.println("ALARM: IOUIOUIOUIOU");
    }


}