package org.howard.edu.lsp.assignment6;

import org.howard.edu.lsp.assignment6.IntegerSet;

public class Driver {
    public static void main(String[] args) {
        // Create first IntegerSet
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

       
        // Create second IntegerSet
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set2 is: " + set2.toString());

        // Test union
        System.out.println("\nUnion of Set1 and Set2");
        System.out.println("Set1 before union: " + set1.toString());
        System.out.println("Set2: " + set2.toString());
        set1.union(set2);
        System.out.println("Set1 after union: " + set1.toString());

        // Test intersection
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("\nIntersection of Set1 and Set2");
        System.out.println("Set1 before intersection: " + set1.toString());
        System.out.println("Set2: " + set2.toString());
        set1.intersect(set2);
        System.out.println("Set1 after intersection: " + set1.toString());

        // Test difference
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("\nDifference of Set1 and Set2 (Set1 - Set2)");
        System.out.println("Set1 before difference: " + set1.toString());
        System.out.println("Set2: " + set2.toString());
        set1.diff(set2);
        System.out.println("Set1 after difference: " + set1.toString());

        // Test complement
        set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        IntegerSet universalSet = new IntegerSet();
        universalSet.add(1);
        universalSet.add(2);
        universalSet.add(3);
        universalSet.add(4);
        universalSet.add(5);
        universalSet.add(6);
        System.out.println("\nComplement of Set1 in Universal Set");
        System.out.println("Set1: " + set1.toString());
        System.out.println("Universal Set: " + universalSet.toString());
        set1.complement(universalSet);
        System.out.println("Complement of Set1: " + set1.toString());

        // Test isEmpty and clear
        System.out.println("\nTesting isEmpty and clear methods");
        System.out.println("Set1 is empty: " + set1.isEmpty());
        set1.clear();
        System.out.println("Set1 after clear: " + set1.toString());
        System.out.println("Set1 is empty: " + set1.isEmpty());

        // Test equals
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("\nTesting equals method");
        System.out.println("Set1: " + set1.toString());
        System.out.println("Set2: " + set2.toString());
        System.out.println("Set1 equals Set2: " + set1.equals(set2));

        // Test contains
        System.out.println("\nTesting contains method");
        System.out.println("Set1 contains 3: " + set1.contains(3));
        System.out.println("Set1 contains 6: " + set1.contains(6));

        // Test remove
        System.out.println("\nTesting remove method");
        System.out.println("Set1 before remove: " + set1.toString());
        set1.remove(4);
        System.out.println("Set1 after removing 4: " + set1.toString());

        // Test adding duplicate
        System.out.println("\nTesting add method with duplicate");
        System.out.println("Set1 before adding 5: " + set1.toString());
        set1.add(5); // Should not add duplicate
        System.out.println("Set1 after adding 5: " + set1.toString());
    }
}
