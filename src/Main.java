import  java.util.Scanner;
class Calculation{
    public int calculation(int a,int b){
        System.out.println("a = "+a+" b= "+b);
        return 0;
    }
}
class Addition extends Calculation{
    public int calculation(int a, int b){
        int sum ;
        sum = a+b;
        return sum;
    }
}
class Substraction extends Calculation{
    public int calculation(int a, int b){
        int sub ;
        sub = a-b;
        return sub;
    }
}
class Multiplication extends Calculation{
    public int calculation(int a, int b){
        int mul ;
        mul= a*b;
        return mul;
    }
}

class Division extends Calculation{
    public int calculation(int a, int b){
        if(b!=0){
            int div;
            div = a/b;
            return div;
        }else{
            System.out.println("Division Error");
        }
        return -1;
    }
}
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Calculation cl = new Calculation();
        Calculation add = new Addition();
        Calculation sub = new Substraction();
        Calculation mul = new Multiplication();
        Calculation div = new Division();
        int a,b;
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
        int sum = add.calculation(a,b);
        int subs = sub.calculation(a,b);
        int multi = mul.calculation(a,b);
        int divi = div.calculation(a,b);
        cl.calculation(a,b);
        System.out.println("The Summation is: "+sum);
        System.out.println("The Subtraction is: "+subs);
        System.out.println("The multiplication is: "+multi);
        if(divi != -1){
            System.out.println("The division is: "+ divi);
        }
    }
}
