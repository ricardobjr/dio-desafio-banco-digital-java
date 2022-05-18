import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Cliente {

    @NonNull
    private final String nome;
    private final  double saldo;

//    public Cliente(String nome, Double saldo){
//        this.nome = nome;
//        this.saldo = saldo;
//    }



}
