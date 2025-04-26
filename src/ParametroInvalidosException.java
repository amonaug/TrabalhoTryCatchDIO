public class ParametroInvalidosException extends Exception {
    public ParametroInvalidosException(int parametroUm, int parametroDois) {
        super("Parâmetros inválidos: " + parametroUm + " é menor que " + parametroDois);
    }

    public static void validar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
        if (parametroUm < parametroDois) {
            throw new ParametroInvalidosException(parametroUm, parametroDois);
        }
    }
}