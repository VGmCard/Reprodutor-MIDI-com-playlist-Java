public class Pacote {

    public Playlist pacote = new Playlist();

    public Playlist pack(){
        pacote.clear();
        pacote.adicionar("All Star", "Smash Mouth", MidiUtil.getDuracaoReproducao("All Star"));
        pacote.adicionar("Asgore", "Toby Fox", MidiUtil.getDuracaoReproducao("Asgore"));
        pacote.adicionar("Bark At The Moon", "Ozzy Osbourne", MidiUtil.getDuracaoReproducao("Bark At The Moon"));
        pacote.adicionar("Bokutachi Wa Tenshi Datta", "Hinorobu Kageyama", MidiUtil.getDuracaoReproducao("Bokutachi Wa Tenshi Datta"));
        pacote.adicionar("Bonetrousle", "Toby Fox", MidiUtil.getDuracaoReproducao("Bonetrousle"));
        pacote.adicionar("Boogie Wonderland", "Earth, Wind & Fire", MidiUtil.getDuracaoReproducao("Boogie Wonderland"));
        pacote.adicionar("Careless Whisper", "Wham!", MidiUtil.getDuracaoReproducao("Careless Whisper"));
        pacote.adicionar("Crazy Train", "Ozzy Osbourne", MidiUtil.getDuracaoReproducao("Crazy Train"));
        pacote.adicionar("Dark World", "Koji Kondo", MidiUtil.getDuracaoReproducao("Dark World"));
        pacote.adicionar("Easily", "Red Hot Chili Peppers", MidiUtil.getDuracaoReproducao("Easily"));
        pacote.adicionar("Everything She Wants", "Wham!", MidiUtil.getDuracaoReproducao("Everything She"));
        pacote.adicionar("Green Hill", "Masato Nakamura", MidiUtil.getDuracaoReproducao("Green Hill"));
        pacote.adicionar("Green Hill Remix", "Desconhecido", MidiUtil.getDuracaoReproducao("Green Hill Remix"));
        pacote.adicionar("Higher Ground", "Red Hot Chili Peppers", MidiUtil.getDuracaoReproducao("Higher Ground"));
        pacote.adicionar("Hopes And Dreams", "Toby Fox", MidiUtil.getDuracaoReproducao("Hopes And Dreams"));
        pacote.adicionar("Hungry Like the Wolf", "Duran Duran", MidiUtil.getDuracaoReproducao("Hungry Like the Wolf"));
        pacote.adicionar("Immigrant Song", "Led Zeppelin", MidiUtil.getDuracaoReproducao("Immigrant Song"));
        pacote.adicionar("Kakariko Village", "Koji Kondo", MidiUtil.getDuracaoReproducao("Kakariko Village"));
        pacote.adicionar("Living On a Prayer", "Bon Jovi", MidiUtil.getDuracaoReproducao("Living On a Prayer"));
        pacote.adicionar("Megalovania", "Toby Fox", MidiUtil.getDuracaoReproducao("Megalovania"));
        pacote.adicionar("Never Gonna Give You Up", "Rick Astley", MidiUtil.getDuracaoReproducao("Never Gonna"));
        pacote.adicionar("Sans", "Toby Fox", MidiUtil.getDuracaoReproducao("Sans"));
        pacote.adicionar("Save a Prayer", "Duran Duran", MidiUtil.getDuracaoReproducao("Save a Prayer"));
        pacote.adicionar("September", "Earth, Wind & Fire", MidiUtil.getDuracaoReproducao("September"));
        pacote.adicionar("Shining Star", "Earth, Wind & Fire", MidiUtil.getDuracaoReproducao("Shining Star"));
        pacote.adicionar("Stairway to Heaven", "Led Zeppelin", MidiUtil.getDuracaoReproducao("Stairway to Heaven"));
        pacote.adicionar("Take a Look Around", "Limp Bizkt", MidiUtil.getDuracaoReproducao("Take a Look Around"));
        pacote.adicionar("Wake Me Up Before You Go Go", "Wham!", MidiUtil.getDuracaoReproducao("Wake Me Up Before You Go Go"));
        pacote.adicionar("Zeldas Lullaby", "Koji Kondo", MidiUtil.getDuracaoReproducao("Zeldas Lullaby"));
        pacote.adicionar("Death Note", "Desconhecido", MidiUtil.getDuracaoReproducao("Death Note"));

        return pacote;
    }

    public String titulo(int indice){
        return pacote.titulo(indice);
    }
    public String artista(int indice){
        return pacote.artista(indice);
    }
    public int duracao(int indice){
        return pacote.duracao(indice);
    }

    public void exibir(){
        for (int i = 0; i < this.pack().size(); i++) {
                System.out.println(pacote.titulo(i));
                System.out.println(pacote.artista(i));
                System.out.println(pacote.duracao(i));
                System.out.println("--/--/--/--/--");
        }
    }

    public int size() {
        return pacote.size();
    }
}
