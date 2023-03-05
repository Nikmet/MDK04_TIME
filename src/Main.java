import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        System.out.print("Введите строку со временем: ");
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            answer = (text.substring(matcher.start(), matcher.end()));
        }
        if (Integer.parseInt(answer.substring(0, 2)) > 23 || Integer.parseInt(answer.substring(3, 4)) > 59) {
            System.out.println("Неправильное время");
        } else {
            System.out.println(answer);
        }
    }
}