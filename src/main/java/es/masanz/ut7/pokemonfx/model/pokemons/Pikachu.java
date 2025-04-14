package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;

public class Pikachu extends Pokemon {

    public Pikachu(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 0;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        // Esto NO MOLA. Tener en cuenta que el apodo y los IV los perdemos si hacemos esto
        Pokemon pokemon = new Raichu(this.nivel);
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {
        Ataque impactrueno = new Ataque("impactrueno", 40, 100, Tipo.NORMAL, false, 30);
        asignarAtaque(impactrueno.getNombre(), impactrueno);

        Ataque ataqueRapido = new Ataque("ataque rápido", 40, 100, Tipo.NORMAL, false, 30);
        asignarAtaque(ataqueRapido.getNombre(), ataqueRapido);

        Ataque rayo = new Ataque("rayo", 90, 100, Tipo.NORMAL, false, 15);
        asignarAtaque(rayo.getNombre(), rayo);

        Ataque agilidad = new Ataque("agilidad", 0, 100, Tipo.NORMAL, false, 30); // Supone mejora de velocidad
        asignarAtaque(agilidad.getNombre(), agilidad);

        Ataque trueno = new Ataque("trueno", 110, 70, Tipo.NORMAL, false, 10);
        asignarAtaque(trueno.getNombre(), trueno);

    }

}
