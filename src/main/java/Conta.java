import lombok.Data;

@Data
public abstract class Conta implements IConta{


    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;


    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    protected void imprimirInfoComuns(){

        System.out.println(String.format("Agência: %d ",this.agencia));
        System.out.println(String.format("Conta: %d ",this.numero));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));

    }

//    public int getAgencia() {
//        return agencia;
//    }
//
//    public int getNumero() {
//        return numero;
//    }
//
//    public double getSaldo() {
//        return saldo;
//    }

    @java.lang.Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @java.lang.Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @java.lang.Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}