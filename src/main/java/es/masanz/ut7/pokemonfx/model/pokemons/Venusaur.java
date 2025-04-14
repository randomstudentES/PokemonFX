package es.masanz.ut7.pokemonfx.model.pokemons;

import es.masanz.ut7.pokemonfx.model.base.Ataque;
import es.masanz.ut7.pokemonfx.model.base.Pokemon;
import es.masanz.ut7.pokemonfx.model.enums.Tipo;
import es.masanz.ut7.pokemonfx.model.type.Planta;

public class Venusaur extends Pokemon implements Planta {

    public Venusaur(int nivel){
        super(nivel);
    }

    @Override
    public int nivelEvolucion() {
        return -1; //no evoluciona más
    }

    @Override
    public Pokemon pokemonAEvolucionar() {
        // Esto NO MOLA. Tener en cuenta que el apodo y los IV los perdemos si hacemos esto
        return null;
    }

    @Override
    protected void asignarAtaques() {

        Ataque latigoCepa = new Ataque("látigo cepa", 35, 90, Tipo.PLANTA, false, 15);
        asignarAtaque(latigoCepa.getNombre(), latigoCepa);

        Ataque hojaAfilada = new Ataque("hoja afilada", 55, 95, Tipo.PLANTA, false, 25);
        asignarAtaque(hojaAfilada.getNombre(), hojaAfilada);

        Ataque bombaGermen = new Ataque("bomba germen", 80, 100, Tipo.PLANTA, false, 15);
        asignarAtaque(bombaGermen.getNombre(), bombaGermen);

        Ataque rayoSolar = new Ataque("rayo solar", 120, 80, Tipo.PLANTA, true, 10);
        asignarAtaque(rayoSolar.getNombre(), rayoSolar);

        Ataque energibola = new Ataque("energibola", 90, 100, Tipo.PLANTA, false, 10);
        asignarAtaque(energibola.getNombre(), energibola);

    }

}
