package org.arrayset;


public class ArraySet {
    private Integer[] es;

    public ArraySet() {
        this.es = new Integer[0];
    }

    public Integer[] toArray() {
        return this.es;
    }

    public void addNewElemnt(Integer element) {
        int i = 0;
        int e = 0;
        if (this.es.length == 0) {
            if (element == null) {
                throw new NullPointerException();
            }
            this.es = new Integer[1];
            this.es[0] = element;
            return;
        }
        for (i = 0; i < this.es.length; i++) {
            if (this.es[i].equals(element)) {
                e = 1;
            } else {
                continue;
            }
        }
        if (e == 0) {
            Integer[] anotherElements = new Integer[this.es.length + 1];
            for (i = 0; i < this.es.length; i++) {
                anotherElements[i] = this.es[i];
            }
            if (element == null) {
                throw new NullPointerException();
            } else {
                anotherElements[this.es.length] = element;
                this.es = anotherElements;
            }

        } else {

        }
    }
}
