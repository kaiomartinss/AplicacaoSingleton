class ModuloRelatorio {
    private SistemaGerenciamento sistema = SistemaGerenciamento.getInstance();

    public void gerarRelatorio() {
        System.out.println("Módulos ativos: " + sistema.getModulosAtivos());
    }
}