import java.security.SecureRandom;
import java.util.stream.Collectors;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        SecureRandom r = new SecureRandom();
        String senha = r.ints(12, 0, caracteres.length())  // Gera 12 números aleatórios dentro do intervalo dos índices de caracteres
                            .mapToObj(i -> String.valueOf(caracteres.charAt(i)))  // Converte os números para os caracteres
                            .collect(Collectors.joining());  // Junta os caracteres em uma string
        System.out.println("senha: " + senha);  // Imprime a senha com o prefixo "senha: "
    }
}
