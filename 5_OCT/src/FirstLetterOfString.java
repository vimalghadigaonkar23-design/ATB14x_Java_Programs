public class FirstLetterOfString {
    public static void main(String[] args) {
        String str="Vimal is learning java";
        String[] words=str.split(" ");

        System.out.println("First letter of each word");
        for (int i =0;i< words.length;i++){
            System.out.println(words[i].charAt(0));
        }

    }
}
