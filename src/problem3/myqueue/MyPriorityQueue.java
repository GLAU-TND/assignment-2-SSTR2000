/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node rear;
    private Node front;
    private int length;

    public MyPriorityQueue() {
        front = null;
        rear = null;
        length = 0;
    }

    public void enqueue(Node addData) {
        if (front == null) {
            rear = addData;
            front = addData;
            length++;
        } else {
            if (addData.getData().getRollNumber() >= this.rear.getData().getRollNumber()) {
                rear.setNext(addData);
                rear = addData;
                length++;
            } else if (addData.getData().getRollNumber() <= this.front.getData().getRollNumber()) {
                addData.setNext(this.front);
                this.front = addData;
                length++;
            } else {
                Node temp = this.front;
                Node tempPrevious = this.front;
                while (temp.getNext() != null) {
                    if (temp.getData().getRollNumber() > addData.getData().getRollNumber()) {
                        break;
                    }
                    tempPrevious = temp;
                    temp = temp.getNext();
                }
                tempPrevious.setNext(addData);
                addData.setNext(temp);
                length++;

            }
        }
    }

    public int getSize() {
        return length;
    }

    public void printQueue() {
        Node temp = this.front;
        for (int i = 0; i < this.length; i++) {
            if (i != this.length - 1) {
                System.out.print(temp.getData().toString() + "--->");
                temp = temp.getNext();
            } else {
                System.out.println(temp.getData().toString());
            }
        }
    }
}

