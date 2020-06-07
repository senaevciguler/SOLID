package com.java.principles.solid.dependency.inversion.correct;

public class BackEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }

    private void writeJava() {
    }
}

