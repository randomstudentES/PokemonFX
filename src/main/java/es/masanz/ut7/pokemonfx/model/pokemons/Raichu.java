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
        Ataque ataqueRapido = new Ataque("ataque rápido", 40, 100, Tipo.NORMAL, false, 30);
        asignarAtaque(ataqueRapido.getNombre(), ataqueRapido);

        Ataque rayo = new Ataque("rayo", 90, 100, Tipo.NORMAL, false, 15);
        asignarAtaque(rayo.getNombre(), rayo);

        Ataque punoTrueno = new Ataque("puño trueno", 75, 100, Tipo.NORMAL, false, 15);
        asignarAtaque(punoTrueno.getNombre(), punoTrueno);

        Ataque trueno = new Ataque("trueno", 110, 70, Tipo.NORMAL, false, 10);
        asignarAtaque(trueno.getNombre(), trueno);


        Ataque voltiocambio = new Ataque("voltiocambio", 70, 100, Tipo.NORMAL, false, 20);
        asignarAtaque(voltiocambio.getNombre(), voltiocambio);


    }

}
