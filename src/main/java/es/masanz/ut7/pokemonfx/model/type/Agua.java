package es.masanz.ut7.pokemonfx.model.type;

public interface Agua {
    default void mojar(){
        System.out.println("Has mojado al pokemon enemigo y ha cogido un resfriado");
    }
}