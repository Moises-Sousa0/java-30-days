public class ChakraJutsu {
    public void usarJutsu(int chakraDisponivel, int chakraNecessario){
        if (chakraNecessario > chakraDisponivel){
            throw new ChakraInsuficienteException("Chakra abaixo do necessário");
        }
        System.out.println("Jutsu usado");
    }
}
