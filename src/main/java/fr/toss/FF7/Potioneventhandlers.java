package fr.toss.FF7;

import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class Potioneventhandlers {



@SubscribeEvent
public void onEntityUpdate(LivingUpdateEvent event) {
if (event.entityLiving.isPotionActive(ItemRegistry1.customPotion)) {
if (event.entityLiving.worldObj.rand.nextInt(20) == 0) {

}

if (event.entityLiving.isPotionActive(ItemRegistry1.customPotion2)) {
if (event.entityLiving.worldObj.rand.nextInt(20) == 0) {

}
}
if (event.entityLiving.isPotionActive(ItemRegistry1.customPotion3)) {
if (event.entityLiving.worldObj.rand.nextInt(20) == 0) {

}
}
if (event.entityLiving.isPotionActive(ItemRegistry1.customPotion4)) {
if (event.entityLiving.worldObj.rand.nextInt(20) == 0) {

}
}
}
}
}