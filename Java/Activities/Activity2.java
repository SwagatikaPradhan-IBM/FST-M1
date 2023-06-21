public class Activity2 {
    public static void main(String[] args) {
        int[] a = {10,77,10,54,-11,10};
        int sum=0;
        for(int i : a)
        {
            if(i==10)
            {
                sum=sum+i;
            }
        }
        if(sum==30)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
