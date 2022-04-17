package com.StyleM;

public class Main {

    public static void main(String[] args) {
        Modem modem = new Modem();
        modem.dial();
        modem.hangup();
        modem.send();
        modem.receive();
    }
}
