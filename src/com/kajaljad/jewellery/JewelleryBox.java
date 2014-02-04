package com.kajaljad.jewellery;

import java.util.ArrayList;
import java.util.List;

public class JewelleryBox implements Artifact {
    List<Artifact> artifacts;
    private String jewelleryName;

    public JewelleryBox(String jewelleryName) {
        this.jewelleryName = jewelleryName;
        this.artifacts = new ArrayList<Artifact>();
    }

    @Override
    public String getName() {
        return this.jewelleryName;
    }

    public void addArtifacts(Artifact artifact) {
        this.artifacts.add(artifact);
    }

    @Override
    public void print() {
        System.out.println("------------");
        System.out.println("Box : " + this.getName());
        for (Artifact artifact : artifacts) {
            artifact.print();
        }
    }

}
