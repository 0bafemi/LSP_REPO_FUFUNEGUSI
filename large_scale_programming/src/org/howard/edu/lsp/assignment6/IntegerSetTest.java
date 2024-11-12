package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test class for IntegerSet.
 */
public class IntegerSetTest {

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertEquals(0, set.length(), "Set should be empty after clear");
        assertTrue(set.isEmpty(), "Set should be empty");
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length(), "Length should be 0 for empty set");
        set.add(1);
        set.add(2);
        assertEquals(2, set.length(), "Length should be 2 after adding two elements");
        set.add(2);
        assertEquals(2, set.length(), "Length should remain 2 after adding duplicate element");
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        assertTrue(set1.equals(set2), "Two empty sets should be equal");

        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with same elements in different order should be equal");

        set2.add(3);
        assertFalse(set1.equals(set2), "Sets with different elements should not be equal");
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1), "Set should contain 1");
        assertFalse(set.contains(3), "Set should not contain 3");
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, () -> {
            set.largest();
        });
        assertEquals("IntegerSet is empty", exception.getMessage());

        set.add(1);
        set.add(3);
        set.add(2);
        try {
            assertEquals(3, set.largest(), "Largest should be 3");
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown when set is not empty");
        }
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        IntegerSet set = new IntegerSet();
        Exception exception = assertThrows(IntegerSetException.class, () -> {
            set.smallest();
        });
        assertEquals("IntegerSet is empty", exception.getMessage());

        set.add(1);
        set.add(3);
        set.add(2);
        try {
            assertEquals(1, set.smallest(), "Smallest should be 1");
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown when set is not empty");
        }
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1), "Set should contain 1 after adding");
        int initialLength = set.length();
        set.add(1);
        assertEquals(initialLength, set.length(), "Length should not increase when adding duplicate");
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.remove(1);
        assertFalse(set.contains(1), "Set should not contain 1 after removal");
        int initialLength = set.length();
        set.remove(3); // Removing element not in set
        assertEquals(initialLength, set.length(), "Length should not change when removing non-existent element");
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.union(set2);
        assertEquals(3, set1.length(), "Set1 should contain three elements after union");
        assertTrue(set1.contains(1) && set1.contains(2) && set1.contains(3), "Set1 should contain 1, 2, 3 after union");
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);

        set1.intersect(set2);
        assertEquals(1, set1.length(), "Set1 should contain one element after intersection");
        assertTrue(set1.contains(2), "Set1 should contain 2 after intersection");
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        IntegerSet set2 = new IntegerSet();
        set2.add(2);

        set1.diff(set2);
        assertEquals(2, set1.length(), "Set1 should contain two elements after difference");
        assertTrue(set1.contains(1) && set1.contains(3), "Set1 should contain 1 and 3 after difference");
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);

        IntegerSet universalSet = new IntegerSet();
        universalSet.add(1);
        universalSet.add(2);
        universalSet.add(3);
        universalSet.add(4);

        set1.complement(universalSet);
        assertEquals(2, set1.length(), "Set1 should contain two elements after complement");
        assertTrue(set1.contains(3) && set1.contains(4), "Set1 should contain 3 and 4 after complement");
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "Newly created set should be empty");
        set.add(1);
        assertFalse(set.isEmpty(), "Set should not be empty after adding an element");
        set.remove(1);
        assertTrue(set.isEmpty(), "Set should be empty after removing all elements");
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        assertEquals("[]", set.toString(), "Empty set should be represented as []");
        set.add(1);
        set.add(2);
        String result = set.toString();
        assertTrue(result.equals("[1, 2]") || result.equals("[2, 1]"), "Set should contain 1 and 2");
    }
}
