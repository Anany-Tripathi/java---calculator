import java.util.*;
class Minicalculator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double a = sc.nextDouble();
        System.out.println("enter the desired operation");
      char OPERATOR = sc.next().charAt(0);
       System.out.println("enter second number");
        double b = sc.nextDouble();

        switch (OPERATOR){
          case '+' : System.out.println(a+b);
                break;
        case'-' :System.out.println(a-b);
                break;
         case'*' : System.out.println(a*b);
                break;
         
         case'/' :
          
          if(b==0) {
            System.out.println("not defined");
          } else{
            System.out.println(a/b);
          }
          break;

         
                default:System.out.println("invalid operator");
        }
    }
}