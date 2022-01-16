package anksharskarp.forgetutorial.minecraftforge.mods;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.List;

public class SpawnFlamingMobs implements ICommand {

    private final List aliases = new ArrayList();

    public SpawnFlamingMobs() {
        aliases.add("spawnFlamingMobs");
        aliases.add("sfm");
    }

    @Override
    public String getCommandName() {
        return null;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/spawnFlamingMobs <type of mob> <number of mobs to spawn>";
    }

    @Override
    public List getCommandAliases() {
        return aliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        if (args.length != 2) {
            sendErrorMessage(sender, "Invalid number of arguments!");
        }

        int numberOfMobs;
        String typeOfMob;
        try {
            typeOfMob = args[0].toLowerCase();
            numberOfMobs = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            sendErrorMessage(sender, "The argument \"" + args[1] +
                    "\" is not a valid number!");
            return;
        }

        EntityPlayer player = (EntityPlayer) sender;

        if (typeOfMob.equals("pig")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityPig entity = new EntityPig(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("cow")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityCow entity = new EntityCow(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("chicken")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityChicken entity = new EntityChicken(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("sheep")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntitySheep entity = new EntitySheep(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("horse")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityHorse entity = new EntityHorse(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("wolf") || typeOfMob.equals("dog")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityWolf entity = new EntityWolf(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("ocelot") || typeOfMob.equals("cat")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityOcelot entity = new EntityOcelot(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("villager")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityVillager entity = new EntityVillager(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("bat")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityBat entity = new EntityBat(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("squid")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntitySquid entity = new EntitySquid(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("mooshroom")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityMooshroom entity = new EntityMooshroom(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("rabbit")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityRabbit entity = new EntityRabbit(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("iron_golem")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityIronGolem entity = new EntityIronGolem(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("snow_golem")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntitySnowman entity = new EntitySnowman(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("zombie")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityZombie entity = new EntityZombie(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("skeleton")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntitySkeleton entity = new EntitySkeleton(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("creeper")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityCreeper entity = new EntityCreeper(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("zombie_pigman")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityPigZombie entity = new EntityPigZombie(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("spider")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntitySpider entity = new EntitySpider(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("cave_spider")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityCaveSpider entity = new EntityCaveSpider(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("ghast")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityGhast entity = new EntityGhast(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("blaze")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityBlaze entity = new EntityBlaze(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("giant")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityGiantZombie entity = new EntityGiantZombie(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("enderman")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityEnderman entity = new EntityEnderman(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("endermite")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityEndermite entity = new EntityEndermite(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("guardian")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityGuardian entity = new EntityGuardian(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if (typeOfMob.equals("slime")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntitySlime entity = new EntitySlime(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if(typeOfMob.equals("bat")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityBat entity = new EntityBat(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if(typeOfMob.equals("magma_cube")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityMagmaCube entity = new EntityMagmaCube(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if(typeOfMob.equals("witch")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityWitch entity = new EntityWitch(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if(typeOfMob.equals("silverfish")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntitySilverfish entity = new EntitySilverfish(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if(typeOfMob.equals("ender_dragon")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityDragon entity = new EntityDragon(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        } else if(typeOfMob.equals("wither")) {
            for (int i = 0; i < numberOfMobs; i++) {
                EntityWither entity = new EntityWither(player.worldObj);
                entity.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
                entity.setFire(10000);
                player.worldObj.spawnEntityInWorld(entity);
            }
        }
    }

    private void sendErrorMessage(ICommandSender sender, String message) {
        sender.addChatMessage(new ChatComponentText(
                EnumChatFormatting.DARK_RED + message));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return sender instanceof EntityPlayer;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
