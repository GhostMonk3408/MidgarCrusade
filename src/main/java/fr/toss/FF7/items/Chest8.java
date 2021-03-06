package fr.toss.FF7.items;

import java.util.List;

import net.minecraft.block.BlockChest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import fr.toss.FF7.Tileentities.TileEntityChest8;



public class Chest8 extends BlockChest {

    public Chest8(int par1)  {
        super(par1);
        setCreativeTab(CreativeTabs.tabDecorations);
        this.setBlockName("Chest8");
       
        
    }
    @Override
    public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
    {
    	this.setBlockBounds(0, 0, 0, 2, 2, 1);
    super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }
 
    
    @Override
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 0F, 0F, 0F);
    }
    
    @Override
    public boolean renderAsNormalBlock(){
        return true;
    }

    @Override
    public int getRenderType(){
        return -1;
    }

    @Override
    public boolean isOpaqueCube(){

    	return false;
    }
   
			 @Override
			    public TileEntity createNewTileEntity(World world, int par2) {
			        return new TileEntityChest8();
			    }
			}

    
        
   
    
   