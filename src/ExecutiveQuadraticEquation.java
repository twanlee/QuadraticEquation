import java.util.Scanner;

public class ExecutiveQuadraticEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        QuadraticEquation testQuadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("The Delta is: " + testQuadraticEquation.getDiscriminant());
        System.out.println("The root 1 is: " + testQuadraticEquation.root1());
        System.out.println("The root 1 is: " + testQuadraticEquation.root2());

    }
}
