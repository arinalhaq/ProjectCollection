/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmapfruits;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class HashMapFruits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, String> fruitBowl = new HashMap<>();
        addElements(fruitBowl);
        displayElements(fruitBowl);
        findElement(fruitBowl, "Banana");
        findElement(fruitBowl, "Cherry");
        findElement(fruitBowl, "Pear");

    }

    private static void addElements(HashMap<String, String> fruitBowl) {
        fruitBowl.put("Apple", "Green");
        fruitBowl.put("Cherry", "Red");
        fruitBowl.put("Orange", "Orange");
        fruitBowl.put("Banana", "Yellow");
        fruitBowl.put("Apple", "Red");
    }

    private static void displayElements(HashMap<String, String> fruitBowl) {
        for (HashMap.Entry<String, String> fruit : fruitBowl.entrySet()) {
            System.out.println("Fruit: " + fruit.getKey() + " - Color: " + fruit.getValue());
        }
    }

    private static void findElement(HashMap<String, String> fruitBowl, String fruit) {
        if (fruitBowl.containsKey(fruit)) {
            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
        } else {
            System.out.println("There is no " + fruit + " in the bowl");
        }
    }

}
