// Júlia Oliveira Longhi
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exemplo4 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .takeWhile(linha -> !linha.trim().equals("FIM"))
                .map(linha -> linha.split("\\|"))
                .map(v -> AccessLog.from(v[0].trim(), v[1].trim(), v[2].trim(), v[3].trim(), v[4].trim(), v[5].trim()))
                .filter(log -> log.status() >= 400)
                .forEach(System.out::println);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}