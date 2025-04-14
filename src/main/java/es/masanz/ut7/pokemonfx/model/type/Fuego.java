package es.masanz.ut7.pokemonfx.model.type;

public interface Fuego {
    default void quemar(){
        System.out.println("Has quemado al pokemon enemigo");
    }
}
