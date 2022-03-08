public class Ativacao {
    public static void main(String[] args) {
        Conta contaAquiles = new Conta(12,"78903-6");
        Conta contaTatiane = new Conta(13,"65479-8");
        Conta contaBernardo = new Conta(14, "45689-7");

        contaTatiane.deposita(5000);
        contaTatiane.trasnfere(1000,contaAquiles);
        System.out.println("Novo saldo é: R$ " + contaTatiane.getSaldo());
        System.out.println("Novo saldo é: R$ "  + contaAquiles.getSaldo());

        contaTatiane.getTitular().setNome("Tatiane Batochi");
        System.out.println(contaTatiane.getTitular().getNome());



    }
}
