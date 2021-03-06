package fr.toss.common.player.classes;

import net.minecraft.util.ResourceLocation;
import fr.toss.common.command.ChatColor;
import fr.toss.common.player.spells.champion.Arena_6;
import fr.toss.common.player.spells.champion.EarthShield_5;
import fr.toss.common.player.spells.soldier.*;

public class ClasseSoldier extends Classe {
	
	public ClasseSoldier()
	{
		super();
	}

	@Override
	public String getName() 
	{
		return "Soldier";
	}

	@Override
	public ChatColor getColor() 
	{
		return ChatColor.RED;
	}

	@Override
	/** defined all class spells */
	public void defineClasseSpells()
	{	
		this.CLASSE_SPELL.clear();

		this.CLASSE_SPELL.add(new Rendspeed_1());
		this.CLASSE_SPELL.add(new Rendpower_1());
		this.CLASSE_SPELL.add(new Provoke_1());
		this.CLASSE_SPELL.add(new Firstaid_1());
	
	}
	
	@Override
	public EnumType getType() 
	{
		return EnumType.TANK;
	}
	
	@Override
	public int getMaxEnergy()
	{
		return 1000;
	}
	
	@Override
	public int getBaseEnergyRegen()
	{
		return -1;
	}
	
	@Override
	public ResourceLocation getTexture()
	{
		return (Soldier);
	}
}
