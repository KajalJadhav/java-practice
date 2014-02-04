package com.kajaljad.jewellery;

public class Jewel implements Artifact {
    private String jewelName;

    public Jewel(String jewelName) {
        this.jewelName = jewelName;
    }

    @Override
    public String getName() {
        return this.jewelName;
    }

    @Override
    public void print() {
        System.out.println("Jewel Name : " + this.getName());
    }
}
