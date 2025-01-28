
public class Main {
    public static void main(String[] args) {
        Calculator a1 = new Calculator();
        a1.Add(1,0.5);
        a1.Add(2.2,2.4);
        a1.Add(5,5);
    }

}

class Calculator{
    private int n1;
    private int n2;


    public void Add(int n1, int n2){
        System.out.println(n1+n2);
    }
    public void Add(double n1,double n2){
        System.out.println(n1+n2);
    }
    public void Add(double n1, int n2){
        System.out.println(n1 + n2);
    }
}

