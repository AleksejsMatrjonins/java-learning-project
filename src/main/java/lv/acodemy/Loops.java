package lv.acodemy;

public class Loops {
    public static void main(String[] args) {

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Current producy is" + shoppingList[i]);
        }
        System.out.println("Goes next!");

        for (String s : shoppingList) {
            System.out.println("Current producy is" + s);
        }
        System.out.println("Goes next!");

        int i = 0;
        while( i < shoppingList.length) {
            System.out.println("Current producy is" + shoppingList[i]);
        }

        do {
            System.out.println("Current producy is" + shoppingList[i]);
            i++;
        } while (i < shoppingList.length);



    }



}
