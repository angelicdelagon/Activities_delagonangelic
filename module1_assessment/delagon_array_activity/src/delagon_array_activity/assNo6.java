/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delagon_array_activity;

import java.io.File;

/**
 *
 * @author jkswfoa
 */
public class assNo6 {

    public void no6() {
        System.out.println();
        System.out.println("Answer 6");
        File file = new File("C:\\Users\\jkswfoa\\Desktop\\ARRAY\\DELAGON\\module1_assessment\\array.txt");
        if (file.exists()) {
            System.out.println("The directory or file exists");
        } else {
            System.out.println("The directory or file does not exist");
        }

    }

}
