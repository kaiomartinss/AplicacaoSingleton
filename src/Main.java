public class Main {
    public static void main(String[] args) {
        SistemaGerenciamento sistema = SistemaGerenciamento.getInstance();

        sistema.adicionarModulo("Financeiro");
        sistema.adicionarModulo("Recursos Humanos");

        ModuloRelatorio relatorio = new ModuloRelatorio();

        relatorio.gerarRelatorio();

        SistemaGerenciamento config1 = SistemaGerenciamento.getInstance();
        SistemaGerenciamento config2 = SistemaGerenciamento.getInstance();

        System.out.println("Mesma instância? " + (config1 == config2));

        System.out.println("Endereço config1: " + config1);
        System.out.println("Endereço config2: " + config2);
    }
}