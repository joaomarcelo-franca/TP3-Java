public class Aniversário extends CartãoWEB implements IShowMessage {
    public Aniversário(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return  "Mensagem para " + getEmail() +  "\n" + "Parabens, " + getNome() + " pelo Aniversario";
    }
}
