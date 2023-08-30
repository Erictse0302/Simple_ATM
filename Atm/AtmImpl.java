
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AtmImpl implements AtmInterface{
    
    ATM atm = new ATM();
    ArrayList<Map.Entry<Double, String>> miniState = new ArrayList<>();

    
    


    @Override
    public void viewBalance() {
        
        System.out.println("THE BALANCE IS :" + atm.getBalance() +"\n");
        
        
    }
    @Override
    public void depositAmount (double depositAmount) {
        miniState.add(new  HashMap.SimpleEntry <>(depositAmount,"Amount Deposited"));
        System.out.println(depositAmount + " Deposit Sucessfully \n");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

   

    @Override
    public void viewMiniStatement() {
       
        System.out.println("The Statement of Balance\n");
        for(Map.Entry<Double,String> m:miniState)
        {
            System.out.println("Transcation:   " +  m.getKey()+"  " + m.getValue());
        }
        System.out.println("\n");
        viewBalance();
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(atm.getBalance() >= withdrawAmount)
        {
         miniState.add(new  HashMap.SimpleEntry <>(withdrawAmount," Amount Withdraw"));
        System.out.println(withdrawAmount + " Withdraw Sucessfully\n");
        atm.setBalance(atm.getBalance() - withdrawAmount);
        viewBalance();
        }
        else
        System.out.println("Not Enough to withdraw");


    }

}