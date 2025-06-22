package br.com.alura.screenmatch.model;

public enum Categoria {

    COMEDIA("Comedy", "Comédia"),
    ACAO("Action", "Ação"),
    DRAMA("Drama", "Drama"),
    TERROR("Terror", "Terror"),
    ROMANCE("Romance", "Romance"),
    CRIME("Crime", "Crime"),
    ANIMACAO("Animation", "Animação"),
    MUSICA("Music", "Musical");

    private String categoriaOmdb;
    private String categoriaOmdbPortugues;

    Categoria(String categoriaOmdb, String categoriaOmdbPortugues){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaOmdbPortugues = categoriaOmdbPortugues;
    }

    public static Categoria fromString(String text) {
        for(Categoria categoria : Categoria.values()) {
            if(categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a série!");
    }

    public static Categoria fromStringPortugues(String text) {
        for(Categoria categoria : Categoria.values()) {
            if(categoria.categoriaOmdbPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a série!");
    }

}
