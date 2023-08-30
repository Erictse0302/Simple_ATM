public class ATM {
        private double balance;
        private double depositBalance;
        private double withdrawBalance;
    
        // deflaut constructor 
        public ATM()
        {
    
        }
    
        // define getter and setter
    
        public double getBalance() {
            return balance;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }
        public double getDepositBalance() {
            return depositBalance;
        }
        public void setDepositBalance(double depositBalance) {
            this.depositBalance = depositBalance;
        }
        public double getWithdrawBalance() {
            return withdrawBalance;
        }
        public void setWithdrawBalance(double withdrawBalance) {
            this.withdrawBalance = withdrawBalance;
        }
        
        
    }

