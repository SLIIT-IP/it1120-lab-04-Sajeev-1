import java.util.Scanner;
  public class IT24101836Lab4Q1 {
  public static void main(String[] args){

 Scanner scan = new Scanner(System.in);
 System.out.print("Enter  a number: ");
 int num = scan.nextInt();
  if(num>0){
   System.out.println("The number is: Positive");
  }
  else if (num<0){
   System.out.println("The number is: Negative");
  }
  else if(num==0) {
    System.out.println("The number is zero");
  }
 }
}