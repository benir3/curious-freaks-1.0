import java.util.Scanner;
class PS2p3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Name:");
        String firstName=sc.nextLine();
        System.out.println("Enter last Name:");
        String lastName=sc.nextLine();
        System.out.println("say how many time to print:");
        int n =sc.nextInt();
        String name=firstName+lastName;
        System.out.println(name);
        for(int i=1;i<=n;i++)
        {
            System.out.println(name);

        }




    }
}