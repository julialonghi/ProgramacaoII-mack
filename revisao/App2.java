import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class LeitorSeries {
    public List<String> ler (String nomeArq) throws IOException {
        List<String> series;
        Path arquivo;
        arquivo = Paths.get(nomeArq);
        series = Files.readAllLines(arquivo);
        System.out.println("Erro ao acessar o arquivo!");
        return series;
    }
}

public class App2 {
    public static void main(String[] args) {
        try {
            System.out.println(LeitorSeries.ler("series.txt"));
        } catch (IOException ex) {
            System.out.println("Erro ao ");
        }
        
    }
}