package PBO;

import java.io.File;
import java.util.Scanner;
public class Try {
        public static String name;
        public static Double cost;
        private int currentCents;
        public static Double price;
        public static Scanner file;

        private Try(Double pr)
        {
            pr = price;
        }
        private void changeIn()
        {
            try
            {
                file = new Scanner(new File("snacks.txt"));
                double price = file.nextDouble();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            System.out.println("Please Enter Coins");
            for(double i = price ; i == 0; i = i -1)
            {

                Scanner userinput = new Scanner(System.in);
                name = userinput.nextLine();
                if(name.equals("penies"))
                {

                    cost = price;
                    price = cost - 1;
                }

                if(name.equals("dime"))
                {

                    cost = price;
                    price = cost - 10;
                }
                System.out.println("You've entered : /t" + currentCents + "Coins");
            }

            System.out.println("You've paid in full");
            System.out.println("Dispensing Treat Now");
        }
    }