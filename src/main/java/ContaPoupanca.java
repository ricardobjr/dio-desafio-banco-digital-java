public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println(" === Imprimir extrato conta poupanca === ");
        super.imprimirInfoComuns();
    }

}
