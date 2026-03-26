import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class LeitorSeries {
    public List<String> ler(String nomeArq) {
        List<String> series;
        Path arquivo;
        arquivo = Paths.get(nomeArq);
        try {
            series = Files.readAllLines(arquivo);
        } catch (IOException ex) {
            series = new ArrayList<>();
            System.out.println("Erro ao acessar o arquivo!");
        }
        
        return series;
    }
}

public class App1 {
    public static void main(String[] args) {
        System.out.println(LeitorSeries.ler("series.txt"));
    }
}