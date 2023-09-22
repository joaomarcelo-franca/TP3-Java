import java.util.List;

public abstract class Cliente implements ISacarBits {
    private String nome;
    private List<String> email;
    private String segurosocial;
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String zipCode;
    private double saldo;

    @Override
    public void sacarBits(int valor){
        if (validarSaque(valor)){
            double valorSaquado = valor;
            setSaldo(getSaldo() - valor);

            int bits50;
            bits50 = valor / 50;
            System.out.println(bits50 + " de B$50");
            valor %= 50;

            int bits10;
            bits10 = valor / 10;
            System.out.println(bits10 + " de B$10");
            valor %= 10;
            
            int bits5;
            bits5 = valor / 5;
            System.out.println(bits5 + " de B$5");
            valor %= 5;

            int bits1;
            bits1 = valor;
            System.out.println(bits1 + " de B$1");
            valor %= 1;

            System.out.println("Valor Sacado com sucesso : B$"  + valorSaquado);
            System.out.println("Saldo atual e de B$" + getSaldo());
        } else {
            System.out.println("Saque invalido");
            System.out.println("Voce tentou sacar ZERO ou um valor maior do que o seu saldo");
        }
    }

    public void depositarBits(double valor){
        if (valor < 1){
            System.out.println("Valor negado!, Permido apenas numeros naturais maior que 0");
        } else {
            saldo += valor;
            System.out.println("Valor depositado com sucesso : B$" + valor);
        }

        System.out.println("Saldo : B$" + getSaldo());
    }
    public boolean validarSaque(double valor){
        if (valor == 0 || valor > getSaldo()){
            return false;
        } else {
            return true;
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public String getSegurosocial() {
        return segurosocial;
    }

    public void setSegurosocial(String segurosocial) {
        this.segurosocial = segurosocial;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
