import java.util.*;
public class ATM {
  static  Scanner sc= new Scanner(System.in);
int balance=1500,pin=1234;
void bal(){
    System.out.println("check your balance");
    System.out.println("Enter Pin");
    int p=sc.nextInt();
    if(pin==p){
        System.out.println("Your current balance is:"+balance);   System.out.println();
    }
}
void withdrawal(){
    System.out.println("Do you want withdraw any amount");
    System.out.println("1.for Yes");
    System.out.println("2.for No");
    int i;
    i=sc.nextInt();
    if(i==1){
    System.out.println("Enter your pin");
     int p=sc.nextInt();
    if(pin==p){
        System.out.println("Your Current balance is:"+balance);
        System.out.println("Enter your withdrawal amount");
        int j=sc.nextInt();
        System.out.println("Your current balance is:"+(balance-j));
    }
    }
    else{
        System.out.println("Thank you");
    }
}
void deposite(){
     System.out.println("Do you want add any amount");
    System.out.println("1.for Yes");
    System.out.println("2.for No");
    int i;
    i=sc.nextInt();
   if(i==1){
    System.out.println("Enter your pin");
     int p=sc.nextInt();
    if(pin==p){
        System.out.println("Your Current balance is:"+balance);
        System.out.println("Enter your amount");
        int j=sc.nextInt();
        System.out.println("Your current balance is:"+(balance+j));
    }
    }
    else{
        System.out.println("Thank you");
    }
    }
    void transfer(){
          System.out.println("Do you want transfer any amount to other user");
    System.out.println("1.for Yes");
    System.out.println("2.for No");
    int i;
    i=sc.nextInt();
   if(i==1){
    System.out.println("Enter your pin");
     int p=sc.nextInt();
    if(pin==p){
        System.out.println("Enter reciver user id:");
        int r=sc.nextInt();
        System.out.println("Your Current balance is:"+balance);
        System.out.println("Enter Transfer amount");
        int j=sc.nextInt();
        System.out.println("The amount is successfully transfered ");
        System.out.println("Your current balance is:"+(balance-j));
        System.out.println("Thank you");
    }
}
    }
    void ministatement(){
        System.out.println("Transection Histroy:");
    }

    public static void main(String[] args){
        int i=0;
        int user=211001;
         System.out.println("Welcome to our bank");
         System.out.println("Enter user id");
         int u=sc.nextInt();
         if(u==user)
         
    {
             while(i==0){
        System.out.println("Enter your choice");
        System.out.println("Enter 1.For check your balance");
        System.out.println("Enter 2.for Withdrawal");
        System.out.println("Enter 3.for Deposite");
        System.out.println("Enter 4.for Transfer the amount");
        System.out.println("Enter 5.for Transection history");
        int k;
        ATM obj=new ATM();
        k=sc.nextInt();
        switch(k){
            case 1 :
            {
                obj.bal();
                break;
            }
            case 2 :
            {
                obj.withdrawal();
                break;
          }
          case 3 :
          {
            obj.deposite();
            break;
          }
          case 4:
          {
            obj.transfer();
            break;
          }
          case 5 : {
            obj.ministatement();
            break;
          }
          default:{
            System.out.println("Invalid service");
          }
    }
            System.out.println("Do you want to use again service");
            System.out.println("Enter 0 for again use");
            System.out.println("Enter 1 for Exit");
            i=sc.nextInt();
    }
    }
    else
    {
        System.out.println("Invalid user id");
    }
}
}
