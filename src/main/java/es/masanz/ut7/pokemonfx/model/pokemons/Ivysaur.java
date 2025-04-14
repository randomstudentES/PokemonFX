package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;

public class Ivysaur extends Pokemon implements Planta {

    public Ivysaur(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return 32;
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        // Esto NO MOLA. Tener en cuenta que el apodo y los IV los perdemos si hacemos esto
        Pokemon pokemon = new Venusaur(this.nivel);
        return pokemon;
    }

    @Override
    protected void asignarAtaques() {

        Ataque placaje = new Ataque("placaje", 35, 95, Tipo.NORMAL, false, 35);
        asignarAtaque(placaje.getNombre(), placaje);

        Ataque latigoCepa = new Ataque("látigo cepa", 35, 90, Tipo.PLANTA, false, 15);
        asignarAtaque(latigoCepa.getNombre(), latigoCepa);

        Ataque hojaAfilada = new Ataque("hoja afilada", 55, 95, Tipo.PLANTA, false, 25);
        asignarAtaque(hojaAfilada.getNombre(), hojaAfilada);

        Ataque rayoSolar = new Ataque("rayo solar", 120, 80, Tipo.PLANTA, true, 10);
        asignarAtaque(rayoSolar.getNombre(), rayoSolar);

        Ataque bombaGermen = new Ataque("bomba germen", 80, 100, Tipo.PLANTA, false, 15);
        asignarAtaque(bombaGermen.getNombre(), bombaGermen);

    }

}
