import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter your name, password, balance to create account");


                //create user
                String name=sc.next();
                String password=sc.next();
                double balance=sc.nextDouble();
                SBIUser user= new SBIUser(name,password,balance);
                System.out.println("The account of new SBI account is: "+user.getAccountNo());

                // add money
                System.out.println("Enter amount to add");
                int money=sc.nextInt();
                user.addMoney(money);


                // check balance
                double bal= user.getBalance();
                System.out.println("New balance is "+ bal);

                //withdraw Money
                System.out.println("Enter amount to withdraw");
                int amt= sc.nextInt();
                System.out.println("Enter password");
                String enteredPassword=sc.next();
                System.out.println(user.withdrawMoney(amt,enteredPassword));


                //interest
                System.out.println("Interest on amount for 10 years of "+user.getBalance()+"Rs will be: "+user.calculateInterest(10));

            }
        }

