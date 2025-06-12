package br.com.alura.screenmatch.model;

public enum Categoria {

    COMEDIA("Comedy"),
    ACAO("Action"),
    DRAMA("Drama"),
    TERROR("Terror"),
    ROMANCE("Romance"),
    CRIME("Crime"),
    ANIMACAO("Animation"),
    MUSICA("Music");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for(Categoria categoria : Categoria.values()) {
            if(categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a série!");
    }

}
