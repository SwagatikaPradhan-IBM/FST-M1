public class Activity5 {
    public static void main(String[] args) {

        Activity5_Book newNovel = new Activity5_MyBook();
        String title = "Activity Book";
        newNovel.setTitle(title);
        System.out.println("The title is: " + newNovel.getTitle());
    }
}
