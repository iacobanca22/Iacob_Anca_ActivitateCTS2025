package program;
import  varA1_builder.PacientExtraoptiuni;
import  varA1_builder.PacientExtraoptiuniBuilder;
public class Program {
    public static void main(String[] args) {
        // Creăm un obiect PacientExtraoptiuni folosind Builder-ul
        PacientExtraoptiuni pacientExtraoptiuni = new PacientExtraoptiuniBuilder()
                .setMicDejun(true)
                .setPatRabatabil(false)
                .setHalataInterior(false)
                .build();

        // Afișăm obiectul folosind metoda toString()
        System.out.println(pacientExtraoptiuni.toString());
    }
}