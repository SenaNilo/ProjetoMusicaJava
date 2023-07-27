import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Musica> musicas;
    private String name;

    public PlayList() {
        this.musicas = new ArrayList<>();
    }

    public void setNamePlaylist(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    public List<String> buscarPorArtista(String artista) {
        List<String> resultado = new ArrayList<>();
        for (Musica musica : musicas) {
            if (musica.getArtista().equals(artista)) {
                resultado.add(musica.getTitulo());
            }
        }
        return resultado;
    }

    public List<String> todasAsMusicas() {
        List<String> resultado = new ArrayList<>();
        for (Musica musica : musicas) {
            
            resultado.add(musica.getTitulo());
            
        }
        return resultado;
    }
}
