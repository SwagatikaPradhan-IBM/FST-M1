import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Random indexGen = new Random();

        System.out.println("Enter numbers:");
        System.out.println("Enter nonnumeric to stop");
        while(scan.hasNextInt())
        {
            list.add(scan.nextInt());
        }
        Integer[] nums = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated " + index);
        System.out.println("Value in array at generated index " + nums[index]);
        scan.close();

    }
}
