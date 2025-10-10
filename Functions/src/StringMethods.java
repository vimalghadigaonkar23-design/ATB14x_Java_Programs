public class StringMethods {
    public static void main(String[] args) {
        String tool=" Selenium ";
        System.out.println("Length="+tool.length());
        System.out.println("Trim ="+tool.trim());
        System.out.println("Upper ="+tool.toUpperCase());
        System.out.println("Lower="+tool.toLowerCase());
        System.out.println("Contains 'nium'?"+tool.contains("nium"));
        System.out.println("Char at 3:" +tool.charAt(3));
        System.out.println("Substring:"+tool.substring(2,6));
    }
}
