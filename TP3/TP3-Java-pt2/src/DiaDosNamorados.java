public class DiaDosNamorados extends CartãoWEB implements IShowMessage{
    public DiaDosNamorados(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Mensagem para " + getEmail() +  "\n" + "Parabens, " + getNome() + " pelo Dia dos Namorados";
    }
}
