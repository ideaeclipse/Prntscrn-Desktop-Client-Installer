package com.installer;

import com.minghao.ErrorFrame;

public class Main {

    private final static ErrorFrame errorFrame = new ErrorFrame();

    public static void main(String args[]) {
        new InstallFrame(errorFrame);
    }
}
