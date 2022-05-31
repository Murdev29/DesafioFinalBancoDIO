public class MurbankPoupa extends Conta{

    public MurbankPoupa(ClienteMurbank cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("## # ## Extrato Murbank Conta Poupança ## # ##");
        super.imprimirInfosComuns();
    }
}
