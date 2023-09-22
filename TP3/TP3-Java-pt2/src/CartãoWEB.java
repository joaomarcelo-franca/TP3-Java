import java.util.Scanner;

public class CartãoWEB {
    private String email;
    private String nome;

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public CartãoWEB(String email, String nome) {
        this.nome = nome;
            try{
                if (email.indexOf("@") == 0 || (email.indexOf("@")+1) == email.indexOf(".") || email.indexOf("@") == -1 || !email.endsWith(".com")){
                    throw new EmailInvalidoException("Email Invalido de " + nome);
                } else {
                    this.email = email;
                }
            }catch (EmailInvalidoException ex){
                System.out.println(ex.getMessage());
                System.out.println();
                this.email = "email invalido";
            }
        }
    }

