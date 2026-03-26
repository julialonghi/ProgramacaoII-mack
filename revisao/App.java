import java.nio.file.*;
import java.util.*;

class LeitorSeries {
    public List<String> ler(String nomeArq) {
        List<String> series;
        Path arquivo;
        arquivo = Paths.get(nomeArq);
        series = Files.readAllLines(arquivo);
        return series;
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println(LeitorSeries.ler("series.txt"));
    }
}
