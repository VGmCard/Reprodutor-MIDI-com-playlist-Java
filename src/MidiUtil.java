import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import java.io.File;

public class MidiUtil {

    public static int getDuracaoReproducao(String arquivoMIDI) {
        arquivoMIDI = arquivoMIDI.trim().toLowerCase()+".mid";
        try {
            Sequence sequencia = MidiSystem.getSequence(new File(arquivoMIDI));
            long microsegundos = sequencia.getMicrosecondLength();
            long segundos = microsegundos / 1000000;

            return Math.toIntExact(segundos);
        } catch (Exception e) {
            System.out.print("Erro ao carregar arquivo MIDI");
        }
        return 0;
    }
}