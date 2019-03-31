package com.android.inclassassignment09_xiaomengz;

import java.io.Serializable;

public class IceCream implements Serializable {
    private String name;
    private boolean withExtraChocolate;
    private int size;

    public IceCream(String name, boolean withExtraChocolate, int size) {
        this.name = name;
        this.withExtraChocolate = withExtraChocolate;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWithExtraChocolate() {
        return withExtraChocolate;
    }

    public void setWithExtraChocolate(boolean withExtraChocolate) {
        this.withExtraChocolate = withExtraChocolate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "name='" + name + '\'' +
                ", withExtraChocolate=" + withExtraChocolate +
                ", size=" + size +
                '}';
    }
}
