import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {

    private LinkedList<Musica> lista = new LinkedList<Musica>();
    private ListIterator<Musica> listIterator = lista.listIterator();

    public void adicionar(String titulo, String artista, int duracao){
        Musica musica = new Musica(titulo, artista, duracao);
        lista.add(musica);
    }

    public void remover(int indice){
        lista.remove(indice);
    }

    public void alterar(int indice, String titulo, String artista, int duracao){
        Musica musica = new Musica(titulo, artista, duracao);
        lista.set(indice, musica);
    }

    public void pop(){
        lista.pop();
    }

    public Musica peek(){
        return lista.peek();
    }

    public void push(Musica musica){
        lista.push(musica);
    }

    public int size(){
        return lista.size();
    }

    public void exibir(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(titulo(i));
            System.out.println(artista(i));
            System.out.println(duracao(i));
            System.out.println("--/--/--/--/--");
        }
    }

    public String titulo(int indice){
        return lista.get(indice).getTitulo();
    }
    public String artista(int indice){
        return lista.get(indice).getArtista();
    }
    public int duracao(int indice){
        return lista.get(indice).getDuracao();
    }

}
