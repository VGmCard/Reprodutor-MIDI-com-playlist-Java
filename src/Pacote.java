import java.util.ArrayList;

public class Pacote {
    public ArrayList<Musica> pack(){
        ArrayList<Musica> pacote = new ArrayList<>();
        pacote.clear();
        pacote.add(new Musica("All Star", "Smash Mouth", MidiUtil.getDuracaoReproducao("All Star")));
        pacote.add(new Musica("Asgore", "Toby Fox", MidiUtil.getDuracaoReproducao("Asgore") ));
        pacote.add(new Musica("Bark At The Moon", "Ozzy Osbourne", MidiUtil.getDuracaoReproducao("Bark At The Moon") ));
        pacote.add(new Musica("Bokutachi Wa Tenshi Datta", "Hinorobu Kageyama", MidiUtil.getDuracaoReproducao("Bokutachi Wa Tenshi Datta") ));
        pacote.add(new Musica("Bonetrousle", "Toby Fox", MidiUtil.getDuracaoReproducao("Bonetrousle") ));
        pacote.add(new Musica("Boogie Wonderland", "Earth, Wind & Fire", MidiUtil.getDuracaoReproducao("Boogie Wonderland") ));
        pacote.add(new Musica("Careless Whisper", "Wham!", MidiUtil.getDuracaoReproducao("Careless Whisper") ));
        pacote.add(new Musica("Crazy Train", "Ozzy Osbourne", MidiUtil.getDuracaoReproducao("Crazy Train") ));
        pacote.add(new Musica("Dark World", "Koji Kondo", MidiUtil.getDuracaoReproducao("Dark World") ));
        pacote.add(new Musica("Easily", "Red Hot Chili Peppers", MidiUtil.getDuracaoReproducao("Easily") ));
        pacote.add(new Musica("Everything She Wants", "Wham!", MidiUtil.getDuracaoReproducao("Everything She") ));
        pacote.add(new Musica("Green Hill", "Masato Nakamura", MidiUtil.getDuracaoReproducao("Green Hill") ));
        pacote.add(new Musica("Green Hill Remix", "Desconhecido", MidiUtil.getDuracaoReproducao("Green Hill Remix") ));
        pacote.add(new Musica("Higher Ground", "Red Hot Chili Peppers", MidiUtil.getDuracaoReproducao("Higher Ground") ));
        pacote.add(new Musica("Hopes And Dreams", "Toby Fox", MidiUtil.getDuracaoReproducao("Hopes And Dreams") ));
        pacote.add(new Musica("Hungry Like the Wolf", "Duran Duran", MidiUtil.getDuracaoReproducao("Hungry Like the Wolf")));
        pacote.add(new Musica("Immigrant Song", "Led Zeppelin", MidiUtil.getDuracaoReproducao("Immigrant Song") ));
        pacote.add(new Musica("Kakariko Village", "Koji Kondo", MidiUtil.getDuracaoReproducao("Kakariko Village")));
        pacote.add(new Musica("Living On a Prayer", "Bon Jovi", MidiUtil.getDuracaoReproducao("Living On a Prayer") ));
        pacote.add(new Musica("Megalovania", "Toby Fox", MidiUtil.getDuracaoReproducao("Megalovania") ));
        pacote.add(new Musica("Never Gonna Give You Up", "Rick Astley", MidiUtil.getDuracaoReproducao("Never Gonna") ));
        pacote.add(new Musica("Sans", "Toby Fox", MidiUtil.getDuracaoReproducao("Sans") ));
        pacote.add(new Musica("Save a Prayer", "Duran Duran", MidiUtil.getDuracaoReproducao("Save a Prayer") ));
        pacote.add(new Musica("September", "Earth, Wind & Fire", MidiUtil.getDuracaoReproducao("September") ));
        pacote.add(new Musica("Shining Star", "Earth, Wind & Fire", MidiUtil.getDuracaoReproducao("Shining Star") ));
        pacote.add(new Musica("Stairway to Heaven", "Led Zeppelin", MidiUtil.getDuracaoReproducao("Stairway to Heaven") ));
        pacote.add(new Musica("Take a Look Around", "Limp Bizkt", MidiUtil.getDuracaoReproducao("Take a Look Around")));
        pacote.add(new Musica("Wake Me Up Before You Go Go", "Wham!", MidiUtil.getDuracaoReproducao("Wake Me Up Before You Go Go")));
        pacote.add(new Musica("Zeldas Lullaby", "Koji Kondo", MidiUtil.getDuracaoReproducao("Zeldas Lullaby") ));
        pacote.add(new Musica("Death Note", "Desconhecido", MidiUtil.getDuracaoReproducao("Death Note") ));
        for (int i = 0; i < pacote.size(); i++) {
            System.out.println(pacote.get(i).getTitulo());
            System.out.println(pacote.get(i).getArtista());
            System.out.println(pacote.get(i).getDuracao());
            System.out.println("--/--/--/--/--");
        }
        return pacote;
    }
}
