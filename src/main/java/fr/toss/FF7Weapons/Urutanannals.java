package fr.toss.FF7Weapons;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;

public class Urutanannals extends Item
	{
	public Urutanannals(int id)
	
	{
		
	  super();
	  this.setFull3D();
	  setCreativeTab(ItemRegistry1.Weapons);
	  setUnlocalizedName("Urutan_annals");
	  
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}

	
	}

