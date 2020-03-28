/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree1 = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        // taking only 7 inputs for simple demonstration with value 1,2,3,4,5,6,7
        int i = 7;
        while (i > 0) {
            tree1.add(scanner.nextInt());
            i--;
        }
    }
}
