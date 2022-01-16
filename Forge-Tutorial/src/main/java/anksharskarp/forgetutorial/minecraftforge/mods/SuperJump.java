package anksharskarp.forgetutorial.minecraftforge.mods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SuperJump {
    @SubscribeEvent
    public void jumpHigher(LivingEvent.LivingJumpEvent event) {
        if(!(event.entity instanceof EntityPlayer)) {
            return;
        }

        event.entity.motionY *= 5;
    }
}
