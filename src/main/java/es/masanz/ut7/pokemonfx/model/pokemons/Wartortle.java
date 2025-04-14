package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Agua;

public class Wartortle extends Pokemon implements Agua {

    public Wartortle(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 36;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        // Esto NO MOLA. Tener en cuenta que el apodo y los IV los perdemos si hacemos esto
        Pokemon pokemon = new Blastoise(this.nivel);
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {

        Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
        asignarAtaque(placaje.getNombre(), placaje);

        Ataque pistolaAgua = new Ataque("pistola agua", 40, 100, Tipo.AGUA, false, 25);
        asignarAtaque(pistolaAgua.getNombre(), pistolaAgua);

        Ataque hidropulso = new Ataque("hidropulso", 60, 100, Tipo.AGUA, false, 20);
        asignarAtaque(hidropulso.getNombre(), hidropulso);

        Ataque acuaCola = new Ataque("acua cola", 90, 90, Tipo.AGUA, false, 10);
        asignarAtaque(acuaCola.getNombre(), acuaCola);

        Ataque cascada = new Ataque("cascada", 80, 100, Tipo.AGUA, false, 15);
        asignarAtaque(cascada.getNombre(), cascada);


    }

}
