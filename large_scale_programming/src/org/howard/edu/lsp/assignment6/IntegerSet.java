package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * IntegerSet class that implements a set of integers using an ArrayList.
 * Provides various methods to manipulate the set.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    public IntegerSet() {
    }

    // Constructor if you want to pass in an already initialized set
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     * @return the number of elements in the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     * Overrides the equals method from the Object class.
     * @param o another IntegerSet to compare with
     * @return true if the sets are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegerSet otherSet = (IntegerSet) o;
        if (set.size() != otherSet.set.size()) {
            return false;
        }
        List<Integer> list1 = new ArrayList<>(set);
        List<Integer> list2 = new ArrayList<>(otherSet.set);
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }

    /**
     * Returns true if the set contains the value, otherwise false.
     * @param value the value to check
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     * @return the largest item in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("IntegerSet is empty");
        }
        return Collections.max(set);
    }

    /**
     * Returns the smallest item in the set.
     * @return the smallest item in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() {
        if (set.isEmpty()) {
            throw new IntegerSetException("IntegerSet is empty");
        }
        return Collections.min(set);
    }

    /**
     * Adds an item to the set or does nothing if already there.
     * @param item the item to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set or does nothing if not there.
     * @param item the item to remove
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs the union of this set with another set.
     * Modifies the current set to be the union of both sets.
     * @param intSetb the other set to union with
     */
    public void union(IntegerSet intSetb) {
        for (int num : intSetb.set) {
            if (!set.contains(num)) {
                set.add(num);
            }
        }
    }

    /**
     * Performs the intersection of this set with another set.
     * Modifies the current set to be the intersection of both sets.
     * @param intSetb the other set to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs the difference of this set with another set.
     * Modifies the current set to be the difference of both sets.
     * @param intSetb the other set to perform difference with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs the complement of this set with another set.
     * Modifies the current set to be the complement relative to intSetb.
     * @param intSetb the other set to perform complement with
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>(intSetb.set);
        complementSet.removeAll(this.set);
        this.set = complementSet;
    }

    /**
     * Returns true if the set is empty, false otherwise.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a String representation of the set.
     * Overrides the toString method from the Object class.
     * @return String representation of the set
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
