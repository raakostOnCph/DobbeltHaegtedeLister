package com.company;

public class Main {

    public static void main(String[] args) {



        Liste liste = new Liste();

        liste.insertFromHead(new Node("1"));
        liste.insertFromHead(new Node("2"));
        liste.insertFromHead(new Node("3"));
        liste.insertFromHead(new Node("4"));
        liste.insertFromHead(new Node("5"));
        liste.insertFromHead(new Node("6"));
        liste.insertFromHead(new Node("7"));

        liste.printFromHead();


    }
}
