package Cards;

import java.util.ArrayDeque;

import java.util.Deque;

//import java.util.Queue;

import java.util.Scanner;

public class Dequeue {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        Deque<Integer> st1=new ArrayDeque<Integer>();
        Deque<Integer> st2=new ArrayDeque<Integer>();

        for(int i = 0; i < 5; i++) {
            st1.add(scanner.nextInt());
        }

        for(int i=0;i<5;i++) {
            st2.add(scanner.nextInt());
        }

        play(st1,st2);
    }

    public static void play(Deque<Integer> st1,Deque<Integer> st2)
    {
        int k = 0;

        while(!st1.isEmpty() && !st2.isEmpty() && k < 107)
        {
            int first = st1.pop();
            int second = st2.pop();
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
            } else
            {
                st1.add(first);
                st1.add(second);
            }
            k++;
        }
        if(k==107){
            System.out.println("How?");
        }else if(st2.isEmpty())
        {
            System.out.println("First "+k);
        } else
        {
            System.out.println("Second "+k);
        }
    }
}
