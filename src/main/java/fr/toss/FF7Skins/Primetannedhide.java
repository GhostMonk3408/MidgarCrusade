package fr.toss.FF7Skins;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Primetannedhide extends Item
	{
	public Primetannedhide(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.Skins);
	  setUnlocalizedName("Prime_tanned_hide");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	
	}

