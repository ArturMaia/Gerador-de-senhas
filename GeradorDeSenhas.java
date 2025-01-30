import java.security.SecureRandom;
import java.util.stream.Collectors;

public class GeradorDeSenhas {
   public GeradorDeSenhas() {
   }

   public static void main(String[] var0) {
      String var1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
      SecureRandom var2 = new SecureRandom();
      String var3 = var2.ints(12, 0, var1.length())  // Gera 12 números aleatórios
                            .mapToObj(i -> String.valueOf(var1.charAt(i)))  // Converte os números para caracteres
                            .collect(Collectors.joining());  // Junta os caracteres em uma string
      System.out.println("senha: " + var3);  // Exibe a senha com o prefixo "senha: "
   }
}
