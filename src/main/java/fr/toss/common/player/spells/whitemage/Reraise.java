package fr.toss.common.player.spells.whitemage;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import fr.toss.client.render.particles.EntityFX_Colored;
import fr.toss.common.packet.PacketParticleEffectToServer;
import fr.toss.common.packet.PacketSpellToServer;
import fr.toss.common.packet.Packets;
import fr.toss.common.player.spells.Spell;

public class Reraise extends Spell {

	public static int getUniqueID()
	{
		return 114;
	}
	
	@Override
	public int getLevel() 
	{
		return 1;
	}

	@Override
	public int getCost()
	{
		return 160;
	}
	
	@Override
	public String getName()
	{
		return I18n.format("spell.defender.aura");
	}

	@Override
	public String[] getDescription() 
	{
		String str[];
		
		str = new String[3];
		str[0] = "The Player's skin became";
		str[1] = "as hard as iron, and buff";
		str[2] = "him with resistance 3";

		return (str);
	}
	
	
	@Override
	public boolean onUse()
	{
		PacketSpellToServer packet;
		
		packet = new PacketSpellToServer(getUniqueID());
		Packets.network.sendToServer(packet);
			
		this.sendEffectToServer();
		return (true);
	}
	
	@Override
	public void sendEffectToServer(Object ... obj)
	{
		PacketParticleEffectToServer packet;
		
		packet = new PacketParticleEffectToServer(getUniqueID(), player.getPlayer().posX, player.getPlayer().posY - 2, player.getPlayer().posZ, player.getPlayer().dimension);
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
		for (int i = 0; i < 40; i++)
        {
			a = world.rand.nextFloat() / 2;
			b = world.rand.nextFloat();
			c = world.rand.nextFloat() / 2;
			
			if (world.rand.nextInt(2) == 0)
				a = -a;
			if (world.rand.nextInt(2) == 0)
				c = -c;
			
			world.spawnParticle("fireworksSpark", x, y, z, -a, b, -c);
    		particles = new EntityFX_Colored(world, x, y, z, a, b, c, 2.0f, 0.5f, 0.5f, 5.0f);
    		Minecraft.getMinecraft().effectRenderer.addEffect(particles);
        }
	}
}
