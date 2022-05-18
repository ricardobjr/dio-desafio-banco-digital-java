public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Imprimir extrato conta corrente === ");
        super.imprimirInfoComuns();

    }
}