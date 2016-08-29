package org.arrayset;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraySetTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnEmptyArrayIfNothingIsInserted() throws Exception {
        ArraySet set = new ArraySet();
        Integer[] actualArray = set.toArray();
        assertEquals(0, actualArray.length);
    }

    @Test
    public void shouldThrowErrorIfInvalidElementIsInserted() throws Exception {
        ArraySet set = new ArraySet();
        thrown.expect(NullPointerException.class);
        set.addNewElemnt(null);
    }

    @Test
    public void shouldReturnArrayOfSize1IfOneElementIsInserted() throws Exception {
        ArraySet set = new ArraySet();
        set.addNewElemnt(403);
        Integer[] actualArray = set.toArray();
        assertEquals(1, actualArray.length);
    }

    @Test
    public void shouldReturnArrayWithElementInserted() throws Exception {
        ArraySet set = new ArraySet();
        set.addNewElemnt(432);
        Integer[] intArray = set.toArray();
        assertArrayEquals(new Integer[]{432}, intArray);
    }

    @Test
    public void shouldReturnArrayWithMultipleElementsInserted() throws Exception {
        ArraySet set = new ArraySet();
        set.addNewElemnt(432);
        set.addNewElemnt(934);
        set.addNewElemnt(394);
        Integer[] intArray = set.toArray();
        assertArrayEquals(new Integer[]{432, 934, 394}, intArray);
    }

    @Test
    public void shouldNotStoreDuplicateElementsInTheArray() throws Exception {
        ArraySet set = new ArraySet();
        set.addNewElemnt(432);
        set.addNewElemnt(432);
        set.addNewElemnt(432);
        set.addNewElemnt(934);
        set.addNewElemnt(934);
        set.addNewElemnt(934);
        set.addNewElemnt(394);
        set.addNewElemnt(394);
        set.addNewElemnt(394);
        Integer[] intArray = set.toArray();
        assertArrayEquals(new Integer[]{432, 934, 394}, intArray);
    }
}
