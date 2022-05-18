import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(100);

        cc.transferir(100,poupanca);
//
//        cc.imprimirExtrato();
//        poupanca.imprimirExtrato();

        List<Cliente> listaClientes = new ArrayList<>();

//        Cliente c1 = new Cliente();
//        c1.setNome("Ricardo");
//        Cliente c2 = new Cliente();
//        c2.setNome("Carol");
//        Cliente c3 = new Cliente();
//        c3.setNome("Silvia");

        Cliente c1 = new Cliente("Ricardo",1000.00);
        Cliente c2 = new Cliente("Silvia",2000.00);
        Cliente c3 = new Cliente("Carol",3000.00);

        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);

        for (Cliente item:
                listaClientes) {
            System.out.println("\tTiular\t" +  item.getNome() + "\tSaldo: R$ " + String.format("%.2f",item.getSaldo()));

        }


    }

}