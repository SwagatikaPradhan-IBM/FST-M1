import org.w3c.dom.ls.LSOutput;

public class Activity4 {
    public static void main(String[] args) {
        int[] a = {4,3,2,10,12,1,5,6};
        System.out.println("Before Sorting");
        for(int num:a) {
            System.out.print(num + " ");
        }
        for(int i=1;i<a.length;i++)
        {
            int sorted = a[i];
            int j=i-1;
            while(j>=0 && sorted<a[j])
            {
                a[j+1]=a[j];
                --j;
            }
            a[j+1]=sorted;
        }
        System.out.println("After Sorting");
        for(int num:a)
        {
            System.out.print(num+" ");
        }

    }



}
