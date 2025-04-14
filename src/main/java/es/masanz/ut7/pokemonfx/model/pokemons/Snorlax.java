package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;

public class Snorlax extends Pokemon{

    public Snorlax(int nivel) {
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        return null; //no tiene evolución
    }

    @Override
    protected void asignarAtaques() {

        Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
        asignarAtaque(placaje.getNombre(), placaje);

        Ataque grunido = new Ataque("gruñido", 0, 100, Tipo.NORMAL, false, 40); // Baja la defensa del oponente
        asignarAtaque(grunido.getNombre(), grunido);

        Ataque hipnosis = new Ataque("hipnosis", 0, 60, Tipo.NORMAL, true, 20); // Duerme al oponente
        asignarAtaque(hipnosis.getNombre(), hipnosis);

        Ataque cuerpoPesado = new Ataque("cuerpo pesado", 85, 90, Tipo.NORMAL, false, 10); // Daño físico
        asignarAtaque(cuerpoPesado.getNombre(), cuerpoPesado);

        Ataque descanso = new Ataque("descanso", 0, 0, Tipo.NORMAL, true, 5); // Restablece vida, pero se duerme
        asignarAtaque(descanso.getNombre(), descanso);

        Ataque terremoto = new Ataque("terremoto", 100, 100, Tipo.NORMAL, false, 10); // Gran daño
        asignarAtaque(terremoto.getNombre(), terremoto);
    }
}
