package com.company.houseComponents;

import com.company.types.ConstructionElementType;

public class ConstructionElement {

    private ConstructionElementType type;
    private Double surface;

    public ConstructionElementType getType() {
        return type;
    }

    public void displayInfo() {
        System.out.println("\n\nConstruction element type: " + type
                + "\nConstruction element surface: " + surface);
    }

    public void setType(ConstructionElementType type) {
        this.type = type;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public ConstructionElement(ConstructionElementType type, Double surface) {
        this.type = type;
        this.surface = surface;
    }
}
