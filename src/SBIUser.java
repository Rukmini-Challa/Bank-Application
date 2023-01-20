import java.util.Objects;
import java.util.UUID;
    public class SBIUser implements bank {
        //attributes by making private we can access these out of the class by using getters and setters
        private String name;
        private String accountNo;
        private double balance;
        private String password;
        private static double rateOfInterest;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAccountNo() {
            return accountNo;
        }

        public void setAccountNo(String accountNo) {
            this.accountNo = accountNo;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public static double getRateOfInterest() {
            return rateOfInterest;
        }

        public static void setRateOfInterest(double rateOfInterest) {
            SBIUser.rateOfInterest = rateOfInterest;
        }

        //constructor;
        public SBIUser(String name, String password, double balance) {
            this.name = name;
            this.password = password;
            this.balance = balance;
            // initialized  by bank
            this. rateOfInterest=6.5f;
            //uuid is a random identity never repeated universal unique identity
            this.accountNo=String.valueOf(UUID.randomUUID());

        }

        @Override
        public double checkBalance() {

            return balance;
        }

        @Override
        public String addMoney(int amount) {
            balance=balance+amount;
            return "Your new Balance is: "+balance;
        }

        @Override
        public String withdrawMoney(int amount, String enteredPassword) {
            if(Objects.equals(password,enteredPassword)){
                if(amount>balance){
                    return "Sorry! Insufficient Money";
                }
                else{
                    this.balance=this.balance-amount;
                    return "Money has been withdrawn "+amount;
                }
            }
            else
                return "Wrong Password";
        }

        @Override
        public double calculateInterest(int years) {

            return (balance*years*rateOfInterest)/100;
        }
    }


