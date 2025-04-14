package es.masanz.ut7.pokemonfx.model.type;

public interface Electrico {
    default void rayo(){
        System.out.println("Lanzas un rayo contra el enemigo, no llevaba guantes de plástico, es muy efectivo");
    }
}
