import java.util.Scanner;
class calculator{
    public static void main(String[] args){
        System.out.println("Welcome To Satvik's CALCULATOR");
     float n1,n2,add,sub,mul,n;
        float div,rem;
        Scanner sc=new Scanner(System.in);
        System.out.print("Num-1=");
        n1=sc.nextInt();
        System.out.print("Num-2=");
        n2=sc.nextInt();
        System.out.println("Operation");
        System.out.println("For Addition-Press 1");
        System.out.println("For Subtraction-Press 2");
        System.out.println("For Multiplication-Press 3");
        System.out.println("For Division-Press 4");
        n=sc.nextFloat();
        if (n==1) {
            add=n1+n2;
            System.out.println("Addition=" + add);

            }
            else if (n==2) {
                sub=n1-n2;
                System.out.println("Substraction="+ sub);
                }
                else if (n==3) {
                    mul=n1*n2;
                    System.out.println("Multiplication=" +mul);
                    }
                    else if (n==4) {
                        div=n1/n2;
                        System.out.println("Division=" +div);
                    }
                        else
                        {
                        rem=n1%n2;
                        System.out.println("Remainder=" + rem);                        
                    }
    
}
}