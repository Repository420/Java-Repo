package org.example;


public class Main {
    static void main() {

        System.out.println("\nMit Head usw.: \n");

        Node head = new Node(10);

        head.next = new Node(12);
        head.next.next = new Node(10000);

        while (head != null){
            System.out.println(head.Data + "");
            head = head.next;
        }

        }
    }
