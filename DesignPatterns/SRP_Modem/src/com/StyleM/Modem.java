package com.StyleM;

public class Modem implements IConnection, IDataChannel {

    String phoneNum;

    public Modem() {
        phoneNum = "2104253942";
    }

    @Override
    public void dial() {
        System.out.println("Dialing " + phoneNum);
    }

    @Override
    public void hangup() {
        System.out.println("Hanging up...");
    }

    @Override
    public void send() {
        System.out.println("Sending data...");
    }

    @Override
    public char receive() {
        System.out.println("Receiving data...");
        return 0;
    }
}
