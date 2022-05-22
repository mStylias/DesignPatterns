package com.StyleM;

public class ProtectedDoor implements Door {

    private boolean isLocked = false;
    private final DoorPasswordAdapter doorPasswordAdapter;

    public ProtectedDoor() {
        this.doorPasswordAdapter = new DoorPasswordAdapter(this);
    }

    public DoorPasswordAdapter getDoorPasswordAdapter() {
        return doorPasswordAdapter;
    }

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
        if (doorPasswordAdapter.check(code)) {
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