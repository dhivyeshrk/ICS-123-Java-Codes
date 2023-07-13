import java.io.*;
public class LinkedList{  
    Node head;
    static class Node{ // constructor to create a node.
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void insert(LinkedList list, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.head==null)
        {
            list.head=new_node;
        }
        else{
            Node last = list.head;
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
    }
    public void display(LinkedList list)
    {
        Node last = list.head;
        while(last != null)
        {
            System.out.print(last.data + " ");
            last=last.next;
        }
    }
    public void delete(LinkedList l, int data){
        Node p = l.head;
        if(p.data == data){
            l.head=p.next;
            p.next=null;
        }
        Node r = null;
        while(p.data != data)
        {
            r=p;
            p=p.next;
        }
        if(p.next==null)
        {
            r.next=null;
        }
        r.next=p.next;
        p.next=null;
    }
    public void deletePos(LinkedList l, int pos){
        Node p = l.head;
        Node r = null;
        int count = 0;
        while(count!=pos)
        {
            r=p;
            p=p.next;
            count++;
        }
        r.next=p.next;
        p.next=null;
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        // st.get(0);
        l.insert(l,2);
        l.insert(l,4);
        l.insert(l,7);
        l.insert(l,5);
        l.insert(l,3);
        l.delete(l, 3);
        l.display(l);        
    }
    
}