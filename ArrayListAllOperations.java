import java.util.*;

public class ArrayListAllOperations{

    public static void demonstrateArrayListOperations() {
        // 1. Creation and Initialization
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
        System.out.println("Initial list: " + list);

        // 2. Adding Elements
        list.add("Fig"); // Adds "Fig" at the end of the list
        list.add(2, "Grape"); // Inserts "Grape" at index 2
        System.out.println("After adding elements: " + list);

        // 3. Removing Elements
        list.remove("Banana"); // Removes the first occurrence of "Banana"
        list.remove(3); // Removes the element at index 3
        System.out.println("After removing elements: " + list);

        // 4. Accessing Elements
        String elementAtIndex1 = list.get(1); // Retrieves the element at index 1
        System.out.println("Element at index 1: " + elementAtIndex1);

        // 5. Updating Elements
        list.set(1, "Blueberry"); // Replaces the element at index 1 with "Blueberry"
        System.out.println("After updating elements: " + list);

        // 6. Size and Capacity
        int size = list.size(); // Gets the number of elements in the list
        boolean isEmpty = list.isEmpty(); // Checks if the list is empty
        System.out.println("Size of list: " + size);
        System.out.println("Is the list empty? " + isEmpty);

        // 7. Checking for Presence
        boolean containsCherry = list.contains("Cherry"); // Checks if "Cherry" is in the list
        System.out.println("List contains 'Cherry': " + containsCherry);

        // 8. Clearing the List
        list.clear(); // Removes all elements from the list
        System.out.println("List after clearing: " + list);

        // 9. Iteration
        list.addAll(Arrays.asList("Java", "Python", "C++", "JavaScript"));
        System.out.println("List before iteration: " + list);

        System.out.println("Iterating using enhanced for loop:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating using ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 10. Sublist
        List<String> subList = list.subList(1, 3); // Gets a view of the portion between index 1 and 3
        System.out.println("Sublist (from index 1 to 3): " + subList);

        // 11. Sorting
        Collections.sort(list); // Sorts the list in natural order
        System.out.println("Sorted list: " + list);

        // 12. Shuffling
        Collections.shuffle(list); // Randomly permutes the elements of the list
        System.out.println("Shuffled list: " + list);

        // 13. Searching
        int index = Collections.binarySearch(list, "Python"); // Searches for "Python" in the sorted list
        System.out.println("Index of 'Python': " + index);

        // 14. Converting to Array
        String[] array = list.toArray(new String[0]); // Converts the list to an array
        System.out.println("Array: " + Arrays.toString(array));

        // 15. Retaining and Removing All
        ArrayList<String> listToRetain = new ArrayList<>(Arrays.asList("Java", "C++"));
        list.retainAll(listToRetain); // Retains only the elements that are contained in listToRetain
        System.out.println("List after retainAll: " + list);

        ArrayList<String> listToRemove = new ArrayList<>(Arrays.asList("Java"));
        list.removeAll(listToRemove); // Removes all elements contained in listToRemove
        System.out.println("List after removeAll: " + list);
    }

    public static void main(String[] args) {
        demonstrateArrayListOperations();
    }
}
