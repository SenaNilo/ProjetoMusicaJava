import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        Date dataHoraAtual = new Date();
        String horaTxt = new SimpleDateFormat("HH").format(dataHoraAtual);
        int hora = Integer.parseInt(horaTxt);
        String saudacao;
        if(hora>=5 && hora<=12){
            saudacao = "Tenha um bom dia";
        }else if(hora>=13 && hora<=17){
            saudacao = "Tenha uma boa tarde";
        }else{
            saudacao = "Tenha uma boa noite";
        }

        
        // Músicas
        Musica musica1 = new Musica("Trust Issues", "Drake", "Care Package");
        Musica musica2 = new Musica("Star Shopping", "Lil Peep", "single");
        Musica musica3 = new Musica("Trance", "Travis Scott", "HEROES $ VILLAINS");
        Musica musica4 = new Musica("Over", "Lucky Daye", "Candydrip");


        Scanner r = new Scanner(System.in);
        PlayList playlist = new PlayList(); //fazer a playlist
        char simNao;
        boolean makePlaylist;
        int escolhaMusica;
        String namePlaylist;

        do{
            System.out.println("Deseja fazer uma playlist? (S) ou (N)");
            simNao = (r.next().toUpperCase().charAt(0));
            makePlaylist = (simNao == 'S') ? true : false;
            if(!makePlaylist && simNao!='N'){
                System.out.println("Não entendi!");
            }
        }while(!makePlaylist && simNao!='N');

        if(makePlaylist){
            System.out.println("Musicas disponíveis para sua nova playlist ");
            System.out.println("1. " + musica1.getTitulo() + " - " + musica1.getArtista());
            System.out.println("2. " + musica2.getTitulo() + " - " + musica2.getArtista());
            System.out.println("3. " + musica3.getTitulo() + " - " + musica3.getArtista());
            System.out.println("4. " + musica4.getTitulo() + " - " + musica4.getArtista());
            System.out.println("Qual deseja adicionar? (de 1 a 4)");
            System.out.println("Para finalizar digite 0 e prossiga");  
            do{
                escolhaMusica = r.nextInt();
                switch (escolhaMusica) {
                    case 1:
                        playlist.adicionarMusica(musica1);
                    break;
                    
                    case 2:
                        playlist.adicionarMusica(musica2);
                    break;
                    
                    case 3:
                        playlist.adicionarMusica(musica3);
                    break;

                    case 4:
                        playlist.adicionarMusica(musica4);
                    break;

                    case 0:
                        System.out.println("");
                    break;
                    
                    default:
                        System.out.println("Por favor digite um valor válido");
                }
            }while(escolhaMusica!=0);
            System.out.print("Digite um nome para sua playlist: ");
            namePlaylist = r.next();
            playlist.setNamePlaylist(namePlaylist);

            System.out.println("");

            System.out.println(playlist.getName());
            
            List<String> allSongs = playlist.todasAsMusicas();
            int i=0;
            for (String musica : allSongs) {
                i++;
                System.out.println(i + ": " + musica);
            }
        }else if(!makePlaylist && simNao == 'N'){
            System.out.println("Muito obrigado pela sua atenção, " + saudacao);
        }
    }
}

