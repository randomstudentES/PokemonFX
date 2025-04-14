package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Fuego;

public class Charmaleon extends Pokemon implements Fuego {

    public Charmaleon(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 36;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        // Esto NO MOLA. Tener en cuenta que el apodo y los IV los perdemos si hacemos esto
        Pokemon pokemon = new Charizard(this.nivel);
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {
        Ataque araniazo = new Ataque("arañazo", 40, 100, Tipo.NORMAL, false, 35);
        asignarAtaque(araniazo.getNombre(), araniazo);

        Ataque ascuas = new Ataque("ascuas", 40, 100, Tipo.FUEGO, false, 25);
        asignarAtaque(ascuas.getNombre(), ascuas);

        Ataque dragoaliento = new Ataque("dragoaliento", 60, 100, Tipo.DRAGON, false, 20);
        asignarAtaque(dragoaliento.getNombre(), dragoaliento);


        Ataque lanzallamas = new Ataque("lanzallamas", 90, 100, Tipo.FUEGO, false, 15);
        asignarAtaque(lanzallamas.getNombre(), lanzallamas);

        Ataque giroFuego = new Ataque("giro fuego", 35, 85, Tipo.FUEGO, false, 15);
        asignarAtaque(giroFuego.getNombre(), giroFuego);


    }

}
