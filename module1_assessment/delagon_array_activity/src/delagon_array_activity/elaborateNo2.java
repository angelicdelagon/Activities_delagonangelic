/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delagon_array_activity;

/**
 *
 * @author jkswfoa
 */
public class elaborateNo2 {

    public void eno2() {
        System.out.println();
        System.out.println("ANSWER 2");
        java.util.ArrayList<String> BREAD = new java.util.ArrayList<>();
        BREAD.add("pandesal");
        BREAD.add("spanish bread");
        BREAD.add("hupia");
        BREAD.add("loaf bread");
        BREAD.add("cap cake");
        System.out.println("Array");
        System.out.println("Breads are: " + BREAD);
        String[] arrayGame = new String[BREAD.size()];
        BREAD.toArray(arrayGame);
        System.out.print("Color Array are: ");
        for (String items : arrayGame) {
            System.out.print(items + ", ");
        }
        System.out.println();
        System.out.println();
    }
}
