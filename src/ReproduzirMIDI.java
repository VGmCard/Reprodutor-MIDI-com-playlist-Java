import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Sequence;
import java.io.File;
import java.util.Scanner;

public class ReproduzirMIDI {
    public static void jukebox(String nome) throws Exception {
        nome = nome.replaceAll(" ", "").toLowerCase()+".mid";
        // Carregue o arquivo MIDI
        File arquivoMIDI = new File(nome);

        // Crie um sequenciador
        Sequencer sequenciador = MidiSystem.getSequencer();

        // Abra o sequenciador
        sequenciador.open();

        // Carregue o arquivo MIDI
        Sequence sequencia = MidiSystem.getSequence(arquivoMIDI);

        // Defina a sequência no sequenciador
        sequenciador.setSequence(sequencia);

        // Reproduza a sequência
        sequenciador.start();

        // Crie um Scanner para ler o input do usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pressione 'p' para parar a reprodução.");
        System.out.println("Duração da faixa: " + formatarTempo(sequencia.getMicrosecondLength()) + " segundos.");


        while (sequenciador.isRunning()) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("p")) {
                sequenciador.stop();
                break;
            }
        }

        // Feche o sequenciador
        sequenciador.close();
    }

    public static String formatarTempo(long microsegundos) {
        long segundos = microsegundos / 1000000;
        long minutos = segundos / 60;
        segundos = segundos % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }

}
