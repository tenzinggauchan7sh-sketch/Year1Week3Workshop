
/**
 * Write a description of class MathOperation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperation
{
    public static void main(String [] args){
        int a=4;
        int b=2;
        boolean x=true;
        boolean y=false;
        
        //1.Arithmetic operator
        System.out.println("a+b= "+ (a+b));
        System.out.println("a-b= "+ (a-b));
        System.out.println("a*b= "+ (a*b));
        System.out.println("a%b= "+ (a%b));
        System.out.println("a/b= "+ (a/b));
        System.out.println("");
        
        //2.Assignment operator
        System.out.println("a = "+ a);
        System.out.println("a += 9 :"+ (a+9));
        System.out.println("a -= 3 :" + (a-3));
        System.out.println("a *= 2 :" + (a*2));
        System.out.println("a /= 2 :" + (a/2));
        System.out.println("a %= 2 :" + (a*2));
        System.out.println("");
        
        //3.Relational operator
        System.out.println("a > b: " + (a>b));
        System.out.println("a < b: " + (a<b));
        System.out.println("a == b: " + (a==b));
        System.out.println("a != b: " + (a!=b));
        System.out.println("a >= b: " + (a>=b));
        System.out.println("a <= b: " + (a<=b));
        System.out.println("");
        
        //4.Logical operator
        System.out.println("x && y: " + (x&&y));
        System.out.println("x || y: " + (x&&y));
        System.out.println("!x: " + (!x));
        System.out.println("");
        
        //5. Ternary operato
        int max=(a>b)?a:b;
        System.out.println("Max of a and b is : " + max);
    }
}