import java.util.Scanner;

class prob4 {
  

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size=sc.nextInt();
      switch(size){
        case 29:
        System.out.println(" small");
        break;
        case 30:
        System.out.println("Medium");
        break;
        case 38:
        System.out.println("Large");
        break;
        case 42:
        System.out.println("Xlarge");
        break;
        default:
        System.out.println("If size is not any of the above then Invalid");
        break;
        
      }

   }
}