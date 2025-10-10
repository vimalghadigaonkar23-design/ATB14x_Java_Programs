public class CountNumberOfWords {
    public static void main(String[] args) {
        String str=" I love java ";
        str=str.trim();
        String[] words=str.split("\\s+");
        int count = words.length;
        System.out.println(count
        );
    }
}
