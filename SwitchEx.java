/**
 * Switch Expressions Example
 * @author ashish
 */
public class SwitchEx {

    public static String switchExample(String input){
        String temp="";
        switch (input){
            case "Mon","Tue","Wed"-> temp="First 3 days of the week";
            case "Thu","Fri","Sat","Sun"-> temp="Last 4 days of the week";
            default -> System.out.println("Invalid Choice");
        }
        return temp;
    };
    public static void main(String[] args) {

        System.out.println(switchExample("Mon"));
    }
}
