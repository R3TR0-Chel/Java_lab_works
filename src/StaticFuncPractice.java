import java.awt.print.Book;

public class StaticFuncPractice {
    public static void main(String[] args) {
//        staticBook.setOwner("Alim");
//        System.out.println(staticBook.Owner);
//        staticBook b1 = new staticBook("Lord of the rings",1450,"Tolkien");
//        staticBook b2 = new staticBook("Lord of the rings",1450,"Tolkien");
//        b2.changeOwner("Emil");
//        System.out.println(b1.getOwner());
//        System.out.println(b2.getOwner());
//
        Complex a = new Complex(1.33,4.64);
        Complex b = new Complex(3.18,2.74);
        Complex c = a.add(b);
        System.out.println(c.getReal()+" "+" "+c.getImaginary());

        Complex d = c.sub(a);
        System.out.println(d.getReal()+" "+" "+d.getImaginary());

    }
}

class staticBook{
    String title;
    String author;
    int NumOfPAge;
    static String Owner;

    public staticBook(String title, int numOfPAge, String author) {
        this.title = title;
        NumOfPAge = numOfPAge;
        this.author = author;
    }

    public String getOwner() {
        return Owner;
    }

    public static void setOwner(String owner) {
        Owner = owner;
    }

    public void changeOwner(String owner){
        Owner = owner;
    }
}

class Complex{
    private double n1;
    private double n2;

    public Complex(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getReal(){
        return this.n1;
    }
    public  double getImaginary(){
        return this.n2;
    }

    public Complex add(Complex n){
        double result1 = this.n1 + n.getReal();
        double result2 = this.n2 + n.getImaginary();
        Complex c = new Complex(result1,result2);
        return  c;
    }
    public Complex sub(Complex n){
        double result1 = this.n1 - n.getReal();
        double result2 = this.n2 - n.getImaginary();
        Complex d = new Complex(result1,result2);
        return  d;
    }
}
