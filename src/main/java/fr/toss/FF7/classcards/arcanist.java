package fr.toss.FF7.classcards;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.FF7.ItemRegistry1;
import fr.toss.client.gui.GuiSelectClassalchemist;
import fr.toss.client.gui.GuiSelectClassarcanist;
import fr.toss.client.gui.GuiSelectClassarcher;
import fr.toss.client.gui.GuiSelectHumeClass;

public class arcanist extends Item
	{
	public arcanist(int id)
	
	{
		
	  super();
	  
	  setCreativeTab(ItemRegistry1.FF7cards);
	  setUnlocalizedName("arcanist");
	  
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.addPotionEffect(new PotionEffect(ItemRegistry1.customPotion.id, 20, 0));
		Minecraft.getMinecraft().displayGuiScreen(new GuiSelectClassarcanist());
		
		return par1ItemStack;
		
		
		}
	

		     
		
		
		
	
	
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister)
	{
		  this.itemIcon = iconRegister.registerIcon("FF7:" + getUnlocalizedName().substring(5));
	}
	 
	}
