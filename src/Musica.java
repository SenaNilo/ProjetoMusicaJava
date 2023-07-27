public class Musica {
    private String titulo;
    private String artista;
    private String album;
    // private String genero;
    // private int anoLancamento;

    // Construtor
    public Musica(String titulo, String artista, String album) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getArtista() {
        return artista;
    }
    public String getAlbum() {
        return album;
    }
}
