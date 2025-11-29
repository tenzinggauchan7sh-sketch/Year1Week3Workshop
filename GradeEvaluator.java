import java.util.Scanner;
public class GradeEvaluator
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the mark: ");
        int marks=sc.nextInt();
        sc.close();
        String result=(marks>=40)?"Pass":"Fail";
        if (marks<=100){
             System.out.println("result : "+ result);
        }
        else{
             System.out.println("invalid input! ");
        }
    }
}