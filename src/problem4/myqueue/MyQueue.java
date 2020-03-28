/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

import static problem1.mybst.MyBinarySearchTree.preOrder;
import static problem1.mybst.MyBinarySearchTree.preOrderString;
public class MyQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    //Custom Enqueue method that takes root of the tree as parameter.
    public void enqueue(TreeNode root) {
        preOrder(root);
        String[] data = preOrderString.toString().split(" ");
        for (String datum : data) {
            Node node = new Node(Integer.parseInt(datum));
            if (front == null) {
                rear = node;
                front = node;
                size++;
            } else {
                rear.setNext(node);
                rear = node;
                size++;
            }
        }
    }

    public void printQueue() {
        Node temp = this.front.getNext();
        for (int i = 0; i < this.size - 1; i++) {
            if (i != this.size - 2) {
                System.out.print(temp.getInfo() + "--->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getInfo());
            }
        }
    }

}
