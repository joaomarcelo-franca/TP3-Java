public class Natal extends CartãoWEB implements IShowMessage{
    public Natal(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Mensagem para " + getEmail() +  "\n" + "Parabens, " + getNome() + " pelo Natal";
    }
}
