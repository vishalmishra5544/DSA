package org.practice.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AllBasicsPractice {
    public static void practiceBasics()
    {
        //printing
        String s="java";
        System.out.println("=".repeat(32));
        System.out.printf("%-15s%+5.2f\n",s,55.345);
        System.out.printf("%-15s%+05d%n",s,55);
        System.out.printf("%% %,d",10000000);

        //input
        try
        {
            //using bf
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bf.readLine());

            System.out.print("Enter three integers (e.g., 1 3 2): ");
            String input = bf.readLine();

            // Use bf +StringTokenizer to break the input into tokens
            StringTokenizer st = new StringTokenizer(input);

            // Parse the tokens into integers
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            //using sc
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();  // Reads the integer

            sc.nextLine();  // Consume the newline

            System.out.print("Enter a single character: ");
            char ch = sc.nextLine().charAt(0);  // Read the first character of the next line

            System.out.println("You entered: " + num + " and '" + ch + "'");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }

    }
}
