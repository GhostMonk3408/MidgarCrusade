package fr.toss.FF7.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import fr.toss.common.Main;

public class subwaylampon extends Block
{
    private final boolean field_150171_a;
    private static final String __OBFID = "CL_00000297";

    public subwaylampon(boolean p_i45421_1_)
    {
        super(Material.redstoneLight);
        this.field_150171_a = p_i45421_1_;
        setBlockTextureName(Main.MODID + ":" + "subway lamp on");	
       
    }
}