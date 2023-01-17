import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string - ");
        String s = in.nextLine();
        int countCh = 0;
        int countWords = 1;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)!=' '){
                countCh++;
            }else if (s.charAt(i)==' ' && s.charAt(i+1) != ' '){
                countWords++;
            }
        }
        System.out.println("Total number of characters in the string :"+countCh);
        System.out.println("Total number of words in the string :"+countWords);
        in.close();
    }
}


