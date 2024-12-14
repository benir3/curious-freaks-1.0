import java.util.Scanner;

class prob2 {
  

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int val1 = sc.nextInt();
      int val2 = sc.nextInt();
      int val3 = sc.nextInt();
      int res=val1+val2+val3;
      if(res==180)
      {
        System.out.println("triangle can be formed");
      }
      else
      {
        System.out.println(" it can't be formed");


      }
   }
}
