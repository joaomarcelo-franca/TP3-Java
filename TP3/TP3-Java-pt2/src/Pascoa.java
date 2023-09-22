public class Pascoa extends CartãoWEB implements IShowMessage {
    public Pascoa(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Mensagem para " + getEmail() +  "\n" + "Parabens, " + getNome() + " pelo Pascoa";
    }
}
