/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delagon_array_activity;

/**
 *
 * @author hp
 */
public class assNo3 {

    public void no3() {
        System.out.println();
        System.out.println("Answer 3");
        int[] grades = new int[]{85, 94, 93, 83, 91, 92, 89};
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        double average = sum / grades.length;
        System.out.println("Average is : " + average);

    }
}
