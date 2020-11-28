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
public class Delagon_array_activity {

    public boolean last(String str) {
        int l = str.length();
        String ng = "IC";
        if (l < 2) {
            return false;
        } else if (ng.equals(str.substring(l - 2, l))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        assNo1 no1;
        assNo2 no2;
        assNo3 no3;
        assNo5 no5;
        assNo6 no6;
        assNo7 no7;
        elaborateNo1 dis_no1;
        elaborateNo2 dis_no2;
        no1 = new assNo1();
        no2 = new assNo2();
        no3 = new assNo3();
        no5 = new assNo5();
        no6 = new assNo6();
        no7 = new assNo7();
        dis_no1 = new elaborateNo1();
        dis_no2 = new elaborateNo2();
        System.out.println("^^^^^^^^^^ELABORATE: Coding^^^^^^^^^^");
        dis_no1.eno1c();
        dis_no1.eno1i();
        dis_no2.eno2();
        System.out.println("^^^^^^^^^^ASSESSMENT^^^^^^^^^^");
        no1.no1();
        no2.no2();
        no3.no3();
        System.out.println("");
        System.out.println("Answer 4");
        Delagon_array_activity m = new Delagon_array_activity();
        String str1 = "ANGELIC";
        System.out.println("The given strings is: " + str1);
        System.out.println("The string containing IC at last: " + m.last(str1));
        no5.no5();
        no6.no6();
        no7.no7();

    }

}
