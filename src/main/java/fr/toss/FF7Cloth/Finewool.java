package fr.toss.FF7Cloth;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Finewool extends Item
	{
	public Finewool(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.Cloth);
	  setUnlocalizedName("Fine_wool");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	
	}

