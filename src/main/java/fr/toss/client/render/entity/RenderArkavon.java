package fr.toss.client.render.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.toss.common.entity.EntityArkavon;
import fr.toss.common.entity.EntityBossOrc;

@SideOnly(Side.CLIENT)
public class RenderArkavon extends RenderLiving
{
    private static final ResourceLocation texture1 = new ResourceLocation("magiccrusade:textures/entity/arkavon.png");

    
    public RenderArkavon(ModelBase model, float size)
    {
        super(model, size);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity e)
    {
        return this.getEntityTexture((EntityArkavon)e);
    }
    
    
    protected ResourceLocation getEntityTexture(EntityArkavon entity)
    {
    	return texture1;
    }
    
    @Override
    public void doRender(EntityLiving e, double x, double y, double z, float rotationYaw, float rotationPitch)
    {
        BossStatus.setBossStatus((EntityArkavon) e, true);
    	super.doRender(e, x, y, z, rotationYaw, rotationPitch);
    }
}