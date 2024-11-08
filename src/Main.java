import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
        Pacote listavip = new Pacote();
        listavip.pack();

        int duracao, opcao = 0;
        String titulo, artista;

        do {
            System.out.println("Menu");
            System.out.println("1 -  Adicionar música");
            System.out.println("2 -  Remover música");
            System.out.println("3 -  Alterar música");
            System.out.println("4 -  Exibir músicas na playlist");
            System.out.println("5 -  Exibir músicas especiais");
            System.out.println("6 -  ᕕ(⌐■_■)ᕗ ♪♬");
            System.out.println("7 -  Visualizar uma música");
            System.out.println("8 -  Adicionar todas as Músicas especiais na fila");
            System.out.println("9 -  Visualizar próxima música");
            System.out.println("10 - Visualizar música anterior");
            System.out.println("11 - Avançar");
            System.out.println("12 - Retornar");
            System.out.println("0 - sair");
            System.out.println();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Lendo informações da música
                    System.out.println("Digite as informações da música:");

                    System.out.println("Nome da música: ");
                    titulo = sc.nextLine();

                    System.out.println("Nome do artista: ");
                    artista = sc.nextLine();

                    System.out.println("Duração (em segundos): ");
                    duracao = sc.nextInt();

                    playlist.adicionar(titulo, artista, duracao);
                    break;
                case 2:
                    //Comparando os títulos, pode se remover uma música específica
                    System.out.println("Qual música deseja remover?");
                    titulo = sc.nextLine();
                    for (int i = 0; i < playlist.size(); i++) {
                        if (titulo == playlist.titulo(i)){
                            playlist.remover(i);
                            System.out.println("Música removida com sucesso!");
                        }
                    }
                    break;
                case 3:
                    //Comparando os títulos,
                    System.out.println("Qual música deseja alterar?");
                    String tituloaux = sc.nextLine();
                    System.out.println("Nome da música: ");
                    titulo = sc.nextLine();
                    System.out.println("Digite o nome do artista: ");
                    artista = sc.nextLine();
                    System.out.println("Digite a duração: ");
                    duracao = sc.nextInt();
                    for (int i = 0; i < playlist.size(); i++) {
                        if (tituloaux.equals(playlist.titulo(i))){
                            playlist.alterar(i, titulo, artista, duracao);
                        }
                    }
                case 4:
                    playlist.exibir();
                    break;
                case 5:
                    listavip.exibir();
                    break;
                case 6:
                    for (int i = 0; i < listavip.size(); i++) {
                        if (Objects.equals(playlist.titulo(i), listavip.titulo(i))){
                            ReproduzirMIDI.jukebox(playlist.peek().getTitulo());
                        }
                    }
                    playlist.pop();
                    break;
                case 7:
                    System.out.println("Qual música deseja visualizar?");
                    titulo = sc.next();
                    sc.nextLine();
                    for (int i = 0; i < playlist.size(); i++) {
                        if (titulo == playlist.titulo(i)){
                            System.out.println(titulo);
                            System.out.println(playlist.artista(i));
                            System.out.println(playlist.duracao(i));
                        }
                    }
                    break;
                case 8:
                    for (int i = 0; i < listavip.size(); i++) {
                        playlist.adicionar(
                                listavip.titulo(i),
                                listavip.artista(i),
                                listavip.duracao(i));
                    }
                    break;
            }
        } while(opcao != 0);

    }


}
