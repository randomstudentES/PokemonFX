package es.masanz.ut7.pokemonfx.model.enums;

public enum Stats {

    // TODO 08: Incluir nuevos pokemon. Cuidado, el nombre correcto es muy IMPORTANTE
    BULBASAUR("001", 45, 49, 49, 45, 65, 65, 64),
    IVYSAUR("002", 60, 62, 63, 60, 80, 80, 141),
    VENUSAUR("003", 80, 82, 83, 80, 100, 100, 236),
    CHARMANDER("004", 39, 52, 43, 65, 60, 50, 65),
    CHARMELEON("005", 58, 64, 58, 80, 80, 65, 142),
    CHARIZARD("006", 78, 84, 78, 100, 109, 85, 240),
    SQUIRTLE("007", 44, 48, 65, 43, 50, 64, 66),
    WARTORTLE("008", 59, 63, 80, 58, 65, 80, 142),
    BLASTOISE("009", 79, 83, 100, 78, 85, 105, 265),
    PIKACHU("025", 35, 55, 40, 90, 50, 50, 112),
    RAICHU("026", 60, 90, 55, 110, 90, 80, 218),
    SNORLAX("143", 160, 110, 65, 30, 65, 110, 189);

    public final String numPokedex;
    public final int hp, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial, expBase;

    Stats(String numPokedex, int hp, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial, int expBase) {
        this.numPokedex = numPokedex;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.expBase = expBase;
    }
}
