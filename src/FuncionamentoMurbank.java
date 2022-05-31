public class FuncionamentoMurbank {
    public static void main(String[] args) {
        ClienteMurbank murilo = new ClienteMurbank();
        murilo.setNome("Murilo");


        Conta cc = new MurbankConta(murilo);
        Conta poupa = new MurbankPoupa(murilo);


        cc.depositar(1000);
        cc.transferir(100, poupa);
        cc.imprimirExtrato();
        poupa.imprimirExtrato();

    }
}
