import java.io.IOException;

public class UpdateDateTime {
public static void main(String[] args) {
try {
Process process = Runtime.getRuntime().exec("cmd /c start \"\" https://time.is/");
process.waitFor();
} catch (IOException | InterruptedException e) {
e.printStackTrace();
}
}
}
