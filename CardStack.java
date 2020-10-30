package Cards;

import java.util.*;

import java.util.Scanner;

public class CardStack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Stack<Integer> st1 = new Stack();

        Stack<Integer> st2 = new Stack();

        for (int i = 0; i < 5; i++) {
            st1.push(scanner.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            st2.push(scanner.nextInt());
        }

        play(st1, st2);

    }
    public static void play(Stack<Integer> st1,Stack<Integer> st2)
    {
        int k=0;
        while(!st1.isEmpty() && !st2.isEmpty() && k < 107)
        {
            int first = st1.pop();
            int second = st2.pop();
            if(first == 0 && second == 9)
            {
                st1.add(0,first);
                st1.add(0,second);
            }else if(first == 9 && second == 0)
            {
                st2.add(0,first);
                st2.add(0,second);
            } else if(first < second)
            {
                st2.add(0,first);
                st2.add(0,second);
            } else
            {
                st1.add(0,first);
                st1.add(0,second);
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
