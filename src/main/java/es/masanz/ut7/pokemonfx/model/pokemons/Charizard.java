package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Charizard extends Pokemon implements Fuego {

    public Charizard(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1; //ultima evolucion
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        // Esto NO MOLA. Tener en cuenta que el apodo y los IV los perdemos si hacemos esto
        return null;
    }

    @Override
    protected void asignarAtaques() {
        Ataque ascuas = new Ataque("ascuas", 40, 100, Tipo.FUEGO, false, 25);
        asignarAtaque(ascuas.getNombre(), ascuas);

        Ataque dragoaliento = new Ataque("dragoaliento", 60, 100, Tipo.DRAGON, false, 20);
        asignarAtaque(dragoaliento.getNombre(), dragoaliento);

        Ataque lanzallamas = new Ataque("lanzallamas", 90, 100, Tipo.FUEGO, false, 15);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);

        Ataque giroFuego = new Ataque("giro fuego", 35, 85, Tipo.FUEGO, false, 15);
        asignarAtaque(giroFuego.getNombre(), giroFuego);

        Ataque enviteIgneo = new Ataque("envite ígneo", 120, 100, Tipo.FUEGO, false, 5);
        asignarAtaque(enviteIgneo.getNombre(), enviteIgneo);


    }

}
