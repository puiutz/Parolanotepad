import java.io.IOException;

/**
 * Created by puiutz on 21.02.2015.
 */
      import java.util.*;
        import java.io.*;
public class Parola {
    public static void main(String[] args) {

        String user = "ancuta";
        String password = "tata";

        if (password == "mama") {
            System.out.println("Intra in notepad");
            Runtime rs = Runtime.getRuntime();
            try {
                rs.exec("notepad");
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Nu intra in notepad");

        }

    }

}