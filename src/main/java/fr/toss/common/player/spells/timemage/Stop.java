package fr.toss.common.player.spells.timemage;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import fr.toss.client.render.particles.EntityFX_Colored;
import fr.toss.common.packet.PacketParticleEffectToServer;
import fr.toss.common.packet.PacketSpellToServer;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.spells.Spell;

public class Stop extends Spell {

	public static int getUniqueID()
	{
		return 121;
	}
	
	@Override
	public int getLevel() 
	{
		return 4;
	}

	@Override
	public int getCost()
	{
		return 500;
	}
	
	@Override
	public String getName()
	{
		return I18n.format("spell.priest.buff");
	}

	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[4];
		str[0] = "Buff your target. It gaves";
		str[1] = "movespeed, damageboost,";
		str[2] = "resistance, jumpboost";
		str[3] = "for 6 seconds.";

		return (str);
	}

	@Override
	public boolean onUse()
	{
		System.out.println("Buff");
		PacketSpellToServer packet;
		Entity e;
		
		e = this.getLookingEntity(30.0d);
		if (e == null)
			e = player.getPlayer();
		this.sendEffectToServer(e);
		packet = new PacketSpellToServer(getUniqueID(), e.getEntityId());
		Packets.network.sendToServer(packet);
		return (true);
	}
	
	@Override
	public void sendEffectToServer(Object ... obj)
	{
		PacketParticleEffectToServer packet;
		Entity e;
		
		e = (Entity) obj[0];
		packet = new PacketParticleEffectToServer(getUniqueID(), e.posX, e.posY, e.posZ, player.getPlayer().dimension);
		Packets.network.sendToServer(packet);		
	}
	
	public static void playEffect(double x, double y, double z)
	{
		World world;
		EntityPlayer player;
		EntityFX particles;
		float a;
		float b;
		float c;
		
		world = Minecraft.getMinecraft().theWorld;
    	player = Minecraft.getMinecraft().thePlayer;
		for (int i = 0; i < 250; i++)
        {
    		a = (float) (Math.random() - 0.5);
    		if(Math.random() * 2 + 1 == 0)
    			a = -a;
    		b = (float) (Math.random() * 2 - 0.5);
    		if(Math.random() * 2 + 1 == 0)
    			b=-b;
    		c = (float) (Math.random() - 0.5);
    		if(Math.random() * 2 + 1 == 0)
    			c=-c;
    		
    		world.spawnParticle("fireworksSpark", x, y, z, a, b, c);
    		particles = new EntityFX_Colored(world, x, y, z, a, -b, c, 2.0f, 5.0f, 0.0f, 1.5f);
    		Minecraft.getMinecraft().effectRenderer.addEffect(particles);
        }
	}
}
