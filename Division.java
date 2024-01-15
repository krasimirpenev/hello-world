import java.util.List;

public class Division {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double result = calculateAverage(numbers);
        System.out.println("Average: " + result);
    }

    public static double calculateAverage(List<Integer> numbers) {
        int total = 0;
        int count = 0;

        for (int num : numbers) {
            total += num;
            count += 1;
        }

        double average = total / count; 

        return average;
    }
}