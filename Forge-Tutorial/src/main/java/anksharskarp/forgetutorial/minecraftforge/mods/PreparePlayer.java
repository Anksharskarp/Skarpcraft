package anksharskarp.forgetutorial.minecraftforge.mods;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PreparePlayer {
    @SubscribeEvent
    public void prepare(EntityJoinWorldEvent event) {
        if(!(event.entity instanceof EntityPlayer)) {
            return;
        }

        EntityPlayer player = (EntityPlayer) event.entity;

        player.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
        player.setCurrentItemOrArmor(1, new ItemStack(Items.diamond_chestplate));
        player.setCurrentItemOrArmor(2, new ItemStack(Items.diamond_leggings));
        player.setCurrentItemOrArmor(3, new ItemStack(Items.diamond_boots));
        player.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_helmet));
        player.addPotionEffect(new PotionEffect(5, 10000000, 2));
        player.addPotionEffect(new PotionEffect(1, 10000000, 2));
        player.addPotionEffect(new PotionEffect(16, 10000000));
        player.addPotionEffect(new PotionEffect(10, 10000000, 2));
        player.addPotionEffect(new PotionEffect(12, 10000000));
        player.addPotionEffect(new PotionEffect(11, 10000000, 4));
    }
}
