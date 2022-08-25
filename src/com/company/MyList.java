package com.company;



public class MyList {
    // head содержит ссылку на первый элимент, если head==0 => нету элиментов
    private Node head;

    public void add(int v) {
        //если список пустой
        if (this.head == null) {
            this.head = new Node(v);
            return;
        }


        // список не пустой
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new Node(v);


    }
    public void print (){
        Node last = this.head;
        while (last != null) {
            System.out.println(last.value);
            last = last.next;
        }
    }
}
