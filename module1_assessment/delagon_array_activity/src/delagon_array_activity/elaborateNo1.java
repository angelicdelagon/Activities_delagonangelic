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
public class elaborateNo1 {

    public void eno1c() {
        System.out.println();
        System.out.println("ANSWER 1");
        System.out.println("charAt()");
        String name = "DELAGON";
        char cT = name.charAt(2);
        System.out.println(cT);
        System.out.println(name.contains("DELAGON"));
        System.out.println(name.contains("delagon"));
        System.out.println();
    }

    public void eno1i() {
        System.out.println();
        System.out.println("indexOf()");
        String sT = "DELAGON";
        System.out.println("String Content is " + sT);
        int a = sT.indexOf("E");
        System.out.println("index E is " + a);
        int b = sT.indexOf("A");
        System.out.println("index A is " + b);
        System.out.println();
    }

}
