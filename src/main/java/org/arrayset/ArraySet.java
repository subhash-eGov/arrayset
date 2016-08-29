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

    private Boolean exists(Integer element) {
        for (Integer el : elements) {
            if (el.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void add(Integer element) {
        if (exists(element)) {
            return;
        }
        int newSize = this.elements.length + 1;
        this.elements = Arrays.copyOf(this.elements, newSize);
        this.elements[newSize - 1] = Integer.parseInt(element.toString());
    }
}
