package com.StyleM;

public class Main {

    public static void main(String[] args) {
        PasswordProtector protector = new PasswordProtector();
        ProtectedDoor door = new ProtectedDoor();

        door.getDoorPasswordAdapter().setPasswordProtector(protector);

        protector.register("404", door.getDoorPasswordAdapter());

        // Try to open the door while locked
        System.out.println("Locking the door...");
        door.lock();
        System.out.println("Trying to enter...");
        door.open();

        // Try to unlock with wrong password
        System.out.println("\nTrying to unlock the door with pass 1350...");
        door.unlock("1350");
        System.out.println("Trying to enter...");
        door.open();

        // Unlock the door with correct password
        System.out.println("\nTrying to unlock the door with pass 404...");
        door.unlock("404");
        System.out.println("Trying to enter...");
        door.open();
    }
}
