import java.util.Scanner;

 class ATM{

    float Balance;
    int PIN=9415 ;

public void checkpin(){
    System.out.println("Enter your pin");
    Scanner sc = new Scanner(System.in);
    int enteredpin = sc.nextInt();

    if(enteredpin==PIN){  
        menu();
    
    }
else{
    System.out.println("Invalid pin");
    checkpin();
}
}
public void menu(){
    System.out.println("Enter your choice:");
    System.out.println("1. Check A/C Balance");
    System.out.println("2.Withdraw Money");
    System.out.println("3.Deposit Money");
    System.out.println("4.Exist");

    Scanner sc=new Scanner(System.in);
    int opt =sc.nextInt();

    if(opt==1){
        checkBalance();   
    }
    else if(opt==2){
        withdrawMoney();
    }
    else if(opt==3){
        depositMoney();
    }
    else if(opt==4){
         Exist();
    }
    else{
        System.out.println("Enter a valid choice ");
   }
   menu();
}
   public void checkBalance(){
    System.out.println("Your Balance is:" + Balance);
    menu();
   }
   public void withdrawMoney(){
    System.out.println("Enter Amount Withdrawn");
    Scanner sc = new Scanner(System.in);
    float Amount=sc.nextInt();
    if(Amount>Balance){
        System.out.println("Insufficient Balance");
    }else{
    Balance=Balance-Amount;
    System.out.println(Amount+"Withdrawn Successfully");
   }
   menu();
}
public void depositMoney(){
    System.out.println("Enter Amount to Deposite");
    Scanner sc= new Scanner(System.in);
    float Amount=sc.nextInt();
    Balance=Balance+Amount;
    System.out.println(Amount+ "Deposited Successfully");
    menu();
}
public void Exist(){
    System.out.println("Thank You");
    checkpin();

}
}

public class ATMMachine{
    public static void main(String[]args){

        ATM obj=new ATM();
        obj.checkpin();
    } 
}



