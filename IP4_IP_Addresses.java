import java.util.regex.Pattern;
public class IP4_IP_Addresses {
    public static void main(String[] args) {

        // String pat = "^((2(5[0-5]|[0-4]\\d){0,2})|[0-1]?\\d{1,2}.){3}(2(5[0-5]|[0-4]\\d){0,2})|[0-1]?\\d{1,2}$";

        String pat = "((0|0{0,1}\\d{0,1}\\d|1\\d\\d|2[0-4]\\d|25[0-5]).){3}(0|0{0,1}\\d{0,1}\\d|1\\d\\d|2[0-4]\\d|25[0-5])";
        for ( int i = 0; i <= 255; i ++ ) {
            for ( int j = 0; j <= 255; j ++ ) {
                for ( int k = 0; k <= 255; k ++ ) {
                    for ( int l = 0; l <= 255; l ++ ) {
                        System.out.println(String.format("%03d.%03d.%03d.%03d", i, j, k, l) + ": " + String.format("%03d.%03d.%03d.%03d", i, j, k, l).matches(pat));
                    }
                }
            }
        }


    }
}
