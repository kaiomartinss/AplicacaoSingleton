import java.util.ArrayList;
import java.util.List;

public class SistemaGerenciamento {
    private static SistemaGerenciamento instance;

    private List<String> modulosAtivos;

    private SistemaGerenciamento() {
        modulosAtivos = new ArrayList<>();
    }

    public static SistemaGerenciamento getInstance() {
        if (instance == null) {
            instance = new SistemaGerenciamento();
        }
        return instance;
    }

    public void adicionarModulo(String modulo) {
        modulosAtivos.add(modulo);
    }

    public List<String> getModulosAtivos() {
        return new ArrayList<>(modulosAtivos);
    }
}