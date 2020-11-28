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
public class assNo7 {

    public void no7() {
        System.out.println();
        System.out.println("Answer 7");
        File file = new File("C:\\Users\\jkswfoa\\Desktop");
        String[] fileList = file.list();
        for (String file_name : fileList) {
            System.out.println(file_name);
        }

    }
}
