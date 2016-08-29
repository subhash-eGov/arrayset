package org.arrayset;


public class ArraySet {
    private Integer[] elements;

    public ArraySet() {
        this.elements = new Integer[0];
    }

    public Integer[] toArray() {
        return this.elements;
    }

    public void add(Integer element) {
        int i = 0;
        int e = 0;
        if (this.elements.length == 0) {
            if (element == null) {
                throw new NullPointerException();
            }
            this.elements = new Integer[1];
            this.elements[0] = element;
            return;
        }
        for (i = 0; i < this.elements.length; i++) {
            if (this.elements[i].equals(element)) {
                e = 1;
            } else {
                continue;
            }
        }
        if (e == 0) {
            Integer[] anotherElements = new Integer[this.elements.length + 1];
            for (i = 0; i < this.elements.length; i++) {
                anotherElements[i] = this.elements[i];
            }
            if (element == null) {
                throw new NullPointerException();
            } else {
                anotherElements[this.elements.length] = element;
                this.elements = anotherElements;
            }

        } else {

        }
    }
}
