package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;

public class Raichu extends Pokemon {

    public Raichu(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 1;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        // Esto NO MOLA. Tener en cuenta que el apodo y los IV los perdemos si hacemos esto
        return null;
    }

    @Override
    protected void asignarAtaques() {
        // Nivel 1: Placaje
        Ataque impactrueno = new Ataque("impactrueno", 40, 100, Tipo.NORMAL, false, 30);
        asignarAtaque(impactrueno.getNombre(), impactrueno);

        // Nivel 10: Látigo Cepa
        Ataque ataqueRapido = new Ataque("ataque rápido", 40, 100, Tipo.NORMAL, false, 30);
        asignarAtaque(ataqueRapido.getNombre(), ataqueRapido);

        // Nivel 20: Hoja Afilada
        Ataque rayo = new Ataque("rayo", 90, 100, Tipo.NORMAL, false, 15);
        asignarAtaque(rayo.getNombre(), rayo);

        // Nivel 25: Doble Filo
        Ataque agilidad = new Ataque("agilidad", 0, 100, Tipo.NORMAL, false, 30); // Supone mejora de velocidad
        asignarAtaque(agilidad.getNombre(), agilidad);

        // Nivel 32: Rayo Solar
        Ataque trueno = new Ataque("trueno", 110, 70, Tipo.NORMAL, false, 10);
        asignarAtaque(trueno.getNombre(), trueno);

    }

}
