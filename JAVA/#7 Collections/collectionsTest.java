// Collections List, Set and Map

import java.util.*;

class collectionsTest
{
    
    public static void main(String args[])
    {
        //
        // LISTS
        //
        // Creating an ArrayList
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Ahmed");
        namesArrayList.add("Nishka");
        namesArrayList.add("Vaishnavi");
        
        // Inserting element at 0th location
        namesArrayList.add(0, "Tejanshu");
    
        // Printing Elements of ArrayList
        Iterator<String> itrArrayList = namesArrayList.iterator();
        System.out.println("ArrayList Elements:");
        while(itrArrayList.hasNext())
        {
            System.out.println(itrArrayList.next());
        }

        // Creating a LinkedList
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Ahmed");
        namesLinkedList.add("Nishka");
        namesLinkedList.add("Vaishnavi");

        // Inserting element at 0th location
        namesLinkedList.add(0, "Tejanshu");

        //Printing size of List
        System.out.println("Size of LinkedList: " + namesLinkedList.size());
        
        // Printing Elements of LinkedList
        Iterator<String> itrLinkedList = namesLinkedList.iterator();
        System.out.println("LinkedList Elements:");
        while(itrLinkedList.hasNext())
        {
            System.out.println(itrLinkedList.next());
        }

        // Creating a Vector  
        Vector<String> namesVector = new Vector<>();
        namesVector.add("Ahmed");
        namesVector.add("Nishka");
        namesVector.add("Vaishnavi");
        namesVector.add("Tejanshu");

        // Removes element Ahmed
        namesVector.remove("Ahmed");
        // Printing Elements of Vector
        Iterator<String> itrVector = namesVector.iterator();
        System.out.println("Vector Elements:");
        while(itrVector.hasNext())
        {
            System.out.println(itrVector.next());
        }

        // Creating a Stack  
        Stack<String> namesStack = new Stack<>();
        namesStack.push("Ahmed");
        namesStack.push("Nishka");
        namesStack.push("Vaishnavi");
        namesStack.push("Tejanshu");

        // Removes the latest Element
        namesStack.pop();
        
        // Printing Elements of Stack
        Iterator<String> itrStack = namesStack.iterator();
        System.out.println("Stack Elements:");
        while(itrStack.hasNext())
        {
            System.out.println(itrStack.next());
        }

        //
        //  SET
        //
        // Creating a HashSet
        HashSet<String> departments = new HashSet<>();
        departments.add("Development");
        departments.add("Marketing");
        departments.add("Finance");
        departments.add("HR");

        
        // Printing Elements of HashSet
        System.out.println("Elements of HashSet:");
        Iterator<String> itrHashSet = departments.iterator();
        while(itrHashSet.hasNext())
        {
            System.out.println(itrHashSet.next());
        }

        //Creating a LinkedHashSet
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Ahmed");
        names.add("Nishka");
        names.add("Tejanshu");
        names.add("Vaishnavi");
        
        // Printing Elements of LinkedHashSet
        System.out.println("Elements of LinkedHashSet:");
        Iterator<String> itrLinkedHashSet = names.iterator();
        while(itrLinkedHashSet.hasNext())
        {
            System.out.println(itrLinkedHashSet.next());
        }

        //Creating a TreeSet
        TreeSet<String> names2 = new TreeSet<>();
        names2.add("Ahmed"); 
        names2.add("Nishka");
        names2.add("Tejanshu");
        names2.add("Vaishnavi");

        // Printing Elements of TreeSet
        System.out.println("Elements of TreeSet:");
        Iterator<String> itrTreeSet = names2.iterator();
        while(itrTreeSet.hasNext())
        {
            System.out.println(itrTreeSet.next());
        }

        //
        //  MAP
        //
        //Creating a HashMap
        HashMap<Integer , String> departmentsHashMap = new HashMap<>();

        //Inserting key-value pairs
        departmentsHashMap.put(1 , "Development");
        departmentsHashMap.put(2 , "Marketing");
        departmentsHashMap.put(3 , "Finance");
        departmentsHashMap.put(4 , "HR");

        // Removing an Element
        departmentsHashMap.remove(2);

        //Printing HashMAp Elements
        System.out.println("Elements of HashMap:");
        Set set = departmentsHashMap.entrySet();
        Iterator itrHashMap = set.iterator();
        while ( itrHashMap.hasNext())
        {
            Map.Entry m = (Map.Entry)itrHashMap.next();
            System.out.println("Key : " + m.getKey() + " & Value: " + m.getValue());
        }


        //Creating a TreeMap
        TreeMap<Integer , String> departmentsTreeMap = new TreeMap<>();

        //Inserting key-value pairs
        departmentsTreeMap.put(1 , "Development");
        departmentsTreeMap.put(2 , "Marketing");
        departmentsTreeMap.put(3 , "Finance");
        departmentsTreeMap.put(4 , "HR");

        //Printing TreeMAp Elements
        System.out.println("Elements of TreeMap:");
        Set setTreeMap = departmentsTreeMap.entrySet();
        Iterator itrTreeMap = setTreeMap.iterator();
        while ( itrTreeMap.hasNext())
        {
            Map.Entry m = (Map.Entry)itrTreeMap.next();
            System.out.println("Key : " + m.getKey() + " & Value: " + m.getValue());
        }

        //Creating a LinkedHashMap
        LinkedHashMap<Integer , String> departmentsLinkedHashMap = new LinkedHashMap<>();

        //Inserting key-value pairs
        departmentsLinkedHashMap.put(1 , "Development");
        departmentsLinkedHashMap.put(2 , "Marketing");
        departmentsLinkedHashMap.put(3 , "Finance");
        departmentsLinkedHashMap.put(4 , "HR");

        //Printing LinkedHashMAp Elements
        System.out.println("Elements of LinkedHashMap:");
        Set setLinkedHashMap = departmentsLinkedHashMap.entrySet();
        Iterator itrLinkedHashMap = setLinkedHashMap.iterator();
        while ( itrLinkedHashMap.hasNext())
        {
            Map.Entry m = (Map.Entry)itrLinkedHashMap.next();
            System.out.println("Key : " + m.getKey() + " & Value: " + m.getValue());
        }
        


    }
}