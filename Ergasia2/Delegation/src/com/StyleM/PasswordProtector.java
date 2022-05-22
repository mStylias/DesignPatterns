package com.StyleM;

public class PasswordProtector {
    private String safeNum;
    private PasswordClient passwordClient;

    public void register(String code, PasswordClient passwordClient) {
        safeNum = code;
        this.passwordClient = passwordClient;
    }

    public boolean check(String code) {
        if (code.equals(safeNum) == false) {
            passwordClient.alarm();
            return false;
        }

        return true;
    }
}
