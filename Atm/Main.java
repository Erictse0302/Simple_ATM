
import java.util.Scanner;



public class Main{

    public static void main(String args[])
    {
       AtmInterface op = new AtmImpl();
    

        int atmNumber =12345;
        int atmPin = 123;
        Scanner in =new Scanner(System.in);
        System.out.println("Welcome to My Atm Machine\n");
        System.out.println("Enter Atm Number:");
        int userNumber = in.nextInt();
        System.out.println("Enter the Atm Pin");
        int userPin = in.nextInt();


        if ((atmNumber == userNumber) && (atmPin == userPin))
            {
                
                while(true)
                {
                    System.out.println(" 1. View the Available \n 2. Withdraw Amount \n 3. Deposit \n 4. View the Ministatement \n 5. Exit Application");
                    System.out.println("\nEnter Your Choice");
                    int choice = in.nextInt();
                    
                    switch(choice)
                    {
                        
                        case 1 -> op.viewBalance();
                        case 2 -> {
                                     System.out.println("Enter amount to Withdraw");
                                     double withdrawAmount = in.nextDouble(); 
                                     op.withdrawAmount(withdrawAmount);
                                     
                                    

                                  }
                        case 3 -> {
                                 System.out.println("Enter Your Deposite");
                                 double depositeAmount = in.nextDouble(); 
                                 op.depositAmount(depositeAmount);
                                
                                 

                        }
                        case 4 -> op.viewMiniStatement();
                        case 5 -> {System.out.println(" Please Collect Your Card \n" ); 
                                   System.exit(0);}
                    }

                }

            }
        else
            System.out.println(" Please Try again");
            
    }
}