package Cards;

//import java.util.Deque;

import java.util.Scanner;

//import java.util.Stack;

import java.util.LinkedList;

public class List {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        LinkedList<Integer> st1=new LinkedList<Integer>();
        LinkedList<Integer> st2=new LinkedList<Integer>();

        for(int i = 0; i < 5; i++) {
            st1.push(scanner.nextInt());
        }

        for(int i = 0; i < 5; i++) {
            st2.push(scanner.nextInt());
        }

        play(st1,st2);
    }

    public static void play(LinkedList<Integer> st1, LinkedList<Integer> st2){
        int k = 0;
        while(!st1.isEmpty() && !st2.isEmpty() && k < 107)
        {
            int first = st1.remove();
            int second = st2.remove();
            if(first == 0 && second == 9)
            {
                st1.add(first);
                st1.add(second);
            }else if(first == 9 && second == 0)
            {
                st2.add(first);
                st2.add(second);
            } else if(first < second)
            {
                st2.add(first);
                st2.add(second);
            } else {
                st1.add(first);
                st1.add(second);
            }
            k++;
        }
        if(k==107)
        {
            System.out.println("How?");
        }else if(st2.isEmpty())
        {
            System.out.println("First " + k);
        } else
        {
            System.out.println("Second " + k);
        }
    }
}
