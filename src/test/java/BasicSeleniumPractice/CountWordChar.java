package BasicSeleniumPractice;

public class CountWordChar {
    public static void main(String[] args) {
        String str="Seattle";
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
