public class Ativacao {
    public static void main(String[] args) {
        Conta contaAquiles = new Conta(12,"19653-6");
        Conta contaTatiane = new Conta(13,"6547987465");

        contaTatiane.deposita(5000);
        contaTatiane.trasnfere(1000,contaAquiles);
        System.out.println("Novo saldo é: R$ " + contaTatiane.getSaldo());
        System.out.println("Novo saldo é: R$ "  + contaAquiles.getSaldo());


    }
}
