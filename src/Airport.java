import java.util.*;

public class Airport 
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int x , i , j;
        char ch;
        int a[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0 , 0};

        for (j = 1 ; j <= a.length+1 ; j++)
        {
            System.out.print("Please type 1 for  <<First Class>>  or type 2 for  <<Economy Class>> : ");
                x = input.nextInt();

            if (x==1)
            {
                for(i = 1 ; i < 6 ; i++)
                {
                    if (a[i] != 1)
                    {
                        a[i] = 1;
                        System.out.println("First Class and Your Chair is " + i +"\n");
                            break;
                    }
                    if (i == 5)
                    {
                        System.out.print("First Class is Full. Would you like to reserve Economy Class [Y/N] :  ");
                            ch = input.next().toLowerCase().charAt(0);
                            
                        if (ch == 'y')
                        {
                            x = 2;
                        }
                        else if (ch == 'n')
                        {
                            System.out.println("Wait for next flight in 3 hours.");
                        }
                        else
                        {
                            break;
                        }
                    }
                }
            }
            if(x == 2)
            {
                for(i = 6 ; i < 11 ; i++)
                {
                    if (a[i] != 1)
                    {
                        a[i] = 1;
                        System.out.println("Economy and Your Chair is " + i + "\n");
                            break;
                    }
                    if (i == 10)
                    {
                        System.out.print("Economy is Full. Wait for next flight in 3 hours.\n ");   
                    }
                }
            }
        }
    }
}