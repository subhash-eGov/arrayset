package org.arrayset;

import java.util.Arrays;

public class ArraySet {
    private Integer[] elements;

    public ArraySet() {
        this.elements = new Integer[0];
    }

    public Integer[] toArray() {
        return this.elements;
    }

    public void addNewElemnt(Integer element) {
        if (!exists(element)) {
            elements = Arrays.copyOf(elements, elements.length + 1);
            if (element == null) {
                throw new NullPointerException();
            } else {
                elements[this.elements.length - 1] = element;
            }
        }
    }

    private boolean exists(Integer element) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}
