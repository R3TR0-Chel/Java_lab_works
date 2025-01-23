import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10 - 1 + 1) + 1;
        }
        System.out.println(Arrays.toString(arr));
        Func(arr);
        Palindrom("Lol");
    }
    public static void Func(int[] arr){
        int min = arr[0];
        int second_min = arr[0];
        int max = 0;
        int second_max = 0;
        int summ = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]< second_min && arr[i] != min) {
                second_min = arr[i];
            }
            summ += arr[i];
        }
        double avg = (double)summ / arr.length;
        StringBuilder sb = new StringBuilder();
        sb.append("Min: ").append(min).append("\n");
        sb.append("Second min: ").append(second_min).append("\n");
        sb.append("Max: ").append(max).append("\n");
        sb.append("Second max: ").append(second_max).append("\n");
        sb.append("Sum: ").append(summ).append("\n");
        sb.append("Average: ").append(avg);
        System.out.println(sb.toString());
    }
    public static void Palindrom(String arg){
        String reverse_arg = new StringBuilder(arg).reverse().toString();
        int a = arg.length();
        int index = 0;
        while (a>0) if (reverse_arg.charAt(index) == arg.charAt(index)) {
            index+=1;
            a -= 1;
        } else {
            System.out.println(false);
            break;
        }

        if (a == 0){
            System.out.println(true);
        }

    }
}

