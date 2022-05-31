public class MurbankConta extends Conta  {

    public MurbankConta(ClienteMurbank cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("## # ## Extrato Murbank Conta Corrente ## # ##");
        super.imprimirInfosComuns();
    }

}
