package com.kajaljad.jewellery;

public class Main {
    public static void main(String[] args) {
        JewelleryBox jewelleryBox = new JewelleryBox("Outer Box");
        JewelleryBox jewelleryBox1 = new JewelleryBox("Inner Box");
        JewelleryBox jewelleryBox2 = new JewelleryBox("Inner Most Box");

        Jewel jewel = new Jewel("Necklace");
        Jewel jewel1 = new Jewel("Bracelet");
        Jewel jewel2 = new Jewel("Earings");
        Jewel jewel3 = new Jewel("abc");

        jewelleryBox.addArtifacts(jewel);
        jewelleryBox.addArtifacts(jewel1);

        jewelleryBox.addArtifacts(jewelleryBox1);
        jewelleryBox1.addArtifacts(jewel2);

        jewelleryBox1.addArtifacts(jewelleryBox2);
        jewelleryBox2.addArtifacts(jewel3);

        jewelleryBox.print();
    }
}
