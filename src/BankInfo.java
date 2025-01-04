import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

public class BankInfo {
    public static void main(String[] args) {
        System.out.print("Enter the first three digits of your account number: ");
        String bankCode = System.console().readLine();

        System.out.println("Reads data from a file");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                URI.create("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt").toURL().openStream()))) {
            String result = reader.lines()
                    .filter(line -> line.startsWith(bankCode + " "))
                    .map(line -> "Bank number : " + bankCode + " Your bank name is: " + line.substring(4).trim())
                    .findFirst()
                    .orElse("Bank number : " + bankCode + " Your bank name is: Not found");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}