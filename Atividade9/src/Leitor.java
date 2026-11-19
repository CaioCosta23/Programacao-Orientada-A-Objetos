import java.util.Scanner;

public class Leitor {
    private static Scanner leitorDados;

    public Leitor() {
    }

    public String leNome() {
        return Leitor.leitorDados.next();
    }

    public String leDocumento() {
        return Leitor.leitorDados.next();
    }

    public String leEstado() {
        return Leitor.leitorDados.next();
    }

    public String lePartido() {
        return Leitor.leitorDados.next();
    }

    public int leNumeroCandidato() {
        return Leitor.leitorDados.nextInt();
    }
}
