import java.util.Arrays;
import java.util.Random;

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

class Assigments{
    public static void main (String [] args){
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(arr));
        ArrayStatistic(arr);
        Palindrom("121");
    }


    public static void ArrayStatistic(int[] arr){
        int min = arr[0];
        int second_min = arr[0];
        int max = 0;
        int second_max = 0;
        int summ = 0;


        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            summ += current;

            if (current < min) {
                second_min = min;
                min = current;
            } else if (current < second_min && current != min) {
                second_min = current;
            }

            if (current > max) {
                second_max = max;
                max = current;
            } else if (current > second_max && current != max) {
                second_max = current;
            }
        }

        double avg = (double) summ / arr.length;
        String result = "Result min:"+min+"\n"+"second min: "+second_min+"\n"+"max :"+max+"\n"+"second max:"+second_max+"\n"+"avg :"+avg+"\n"+"sum :"+summ;
        System.out.println(result);
    }

    public static void Palindrom (String a){
        String reversed_a = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reversed_a += a.charAt(i);
        }
        if (a.equals(reversed_a)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

