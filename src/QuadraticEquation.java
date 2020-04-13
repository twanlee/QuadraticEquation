public class QuadraticEquation {
    public QuadraticEquation(){};
    double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2) - (4*a*c);
    }
    public double root1(){
        if(this.getDiscriminant()<0) return 0;
        else {
            return (-b + Math.sqrt((Math.pow(this.b,2)-4*a*c))/(2*a));
        }
    }
    public double root2(){
        if(this.getDiscriminant()<0) return 0;
        else {
            return (-b - Math.sqrt((Math.pow(this.b,2)-4*a*c))/(2*a));
        }
    }
}
