public class Activity12 {
    public static void main(String[] args) {
        Activity12_Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10,20));
        Activity12_Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(10,20));

    }
}
