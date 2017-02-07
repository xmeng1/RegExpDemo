import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User:    mengxin
 * Date:    07/02/17
 * Project: RegExpDemo
 */
public class Demo1 {
    /**
     * Match find
     *
     * @param args
     */
    public static void main(String[] args) {
        final String regex = "\\{\\{.*?\\}\\}";
        final String string = "Hello {{LOGIN_NAME}} you one timPe password is {{OTP}}";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
