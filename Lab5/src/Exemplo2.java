import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exemplo2 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .takeWhile(linha -> !linha.trim().equals("FIM"))
                .map(linha -> linha.split("\\|"))
                .map(v -> AccessLog.from(v[0], v[1], v[2], v[3], v[4], v[5]))
                .forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}