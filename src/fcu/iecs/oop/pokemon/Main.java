package fcu.iecs.oop.pokemon;

public class Main {
	public static void main(String[] args) {
	    Pokemon pkm1 = new Bulbasaur("I am Bulbasaur", 123, PokemonType.GRASS);
	    Pokemon pkm2 = new Charmander("I am Charmander", 456, PokemonType.FIRE);
	    Pokemon pkm3 = new Psyduck("I am Psyduck", 89, PokemonType.WATER);
	    
	    GYM gym = new GYM();
	    gym.fight(pkm1);
	    gym.fight(pkm2);
	    gym.fight(pkm3);
	  }

}
