public class Conta {
    private double saldo;
    private int agencia;
    private String cc;
    private Cliente titular = new Cliente();

    public Conta(int agencia, String cc) {
        if (agencia > 0 && agencia < 101) {
            this.agencia = agencia;
        } else {
            System.out.println("A agência precisa ter numeração entre 1 a 100");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        System.out.println("Saldo insuficiente");
        return false;
    }

    public boolean trasnfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            saque(valor);
            destino.deposita(valor);
            return true;
        }
        System.out.println("Transferência não autorizada");
        return false;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

