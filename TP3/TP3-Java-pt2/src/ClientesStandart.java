public class ClientesStandart extends Cliente implements ISacarBits {
    @Override
    public void sacarBits(int valor){
        System.out.println("Saque Cliente Standart");
        super.sacarBits(valor);
    }
}
