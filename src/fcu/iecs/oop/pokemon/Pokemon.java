package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {
	private String nickname;
	private int cp;
	private  PokemonType type;
	public Pokemon(String n,int c,PokemonType t)
	{
		nickname = n;
		cp = c;
		type = t;
	}
	public PokemonType get_type()
	{
		return type;
	}
	public void set_name(String n)
	{
		nickname = n;
	}
	public void set_cp(int c)
	{
		cp = c;
	}
	public int get_cp()
	{
		return cp;
	}
	public String get_name()
	{
		return nickname;
	}
	public void attack()
	{
		
	}
}
