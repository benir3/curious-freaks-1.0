import java.util.Scanner;
class PS2p2
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the x value:");

       int x=sc.nextInt();
       for(int i=1;x*i<=1000;i++)

       {
        System.out.println(x*i);


       } 
    }
}