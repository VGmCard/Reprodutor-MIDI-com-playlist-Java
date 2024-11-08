import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();

        int opcao = 0, duracao;
        String titulo, artista;

        do {
            System.out.println("Menu");
            System.out.println("1 - Adicionar música");
            System.out.println("2 - Remover música");
            System.out.println("3 - Alterar música");
            System.out.println("4 - Exibir músicas na playlist");
            System.out.println("5 - Exibir músicas especiais");
            System.out.println("6 - ᕕ(⌐■_■)ᕗ ♪♬");
            System.out.println("7 - Visualizar uma música");
            System.out.println("8 - Adicionar Músicas especiais na fila");
            System.out.println("0 - sair");
            System.out.println();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da música: ");
                    titulo = sc.next();
                    System.out.println("Digite o nome do artista: ");
                    artista = sc.next();
                    System.out.println("Digite a duração: ");
                    duracao = sc.nextInt();
                    playlist.adicionar(titulo, artista, duracao);
                    break;
                case 2:
                    System.out.println("Qual música deseja remover?");
                    titulo = sc.next();
                    for (int i = 0; i < playlist.size(); i++) {
                        if (titulo == playlist.titulo(i)){
                            playlist.remover(i);
                            System.out.println("Música removida com sucesso!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Qual música deseja alterar?");
                    titulo = sc.next();
                    System.out.println("Digite o nome do artista: ");
                    artista = sc.next();
                    System.out.println("Digite a duração: ");
                    duracao = sc.nextInt();
                    for (int i = 0; i < playlist.size(); i++) {
                        if (titulo == playlist.titulo(i)){
                            playlist.alterar(i, titulo, artista, duracao);
                        }
                    }
                case 4:
                    playlist.exibir();
                    break;
                case 5:
                    Pacote listavip = new Pacote();
                    listavip.pack();
                    break;
                case 6:
                    ReproduzirMIDI.jukebox(playlist.peek().getTitulo());
                    break;
                case 7:
            }
        } while(opcao != 0);

    }


}
