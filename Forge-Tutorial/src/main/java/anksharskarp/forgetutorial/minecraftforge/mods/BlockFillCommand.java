package anksharskarp.forgetutorial.minecraftforge.mods;

import net.minecraft.block.Block;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

import java.util.ArrayList;
import java.util.List;

public class BlockFillCommand implements ICommand {

    private final List aliases = new ArrayList();
    private Block block;

    public BlockFillCommand() {
        aliases.add("fillBlocks");
        aliases.add("fb");
    }

    @Override
    public String getCommandName() {
        return null;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/fillBlocks <block ID>";
    }

    @Override
    public List<String> getCommandAliases() {
        return aliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {
        if (args.length != 1) {
            sendErrorMessage(sender, "Invalid number of arguments!");
            return;
        }
        try {
            block = Block.getBlockById(Integer.parseInt(args[0]));
            if (block == Blocks.air && Integer.parseInt(args[0]) != 0) {
                sendErrorMessage(sender, "The argument \"" + args[0]
                        + "\" is not a valid block ID!");
                return;
            }
        } catch (NumberFormatException e) {
            if (Block.getBlockFromName(args[0]) == null) {
                sendErrorMessage(sender, "The argument \"" + args[0]
                        + "\" is not a valid block name!");
                return;
            } else {
                block = Block.getBlockFromName(args[0]);
            }
        }

        if (BlockFillerPositionSelector.pos1.isEmpty()
                || BlockFillerPositionSelector.pos2.isEmpty()) {
            sendErrorMessage(sender, "Make a region selection first!");
            return;
        }

        if (BlockFillerPositionSelector.pos1.get(0) >
                BlockFillerPositionSelector.pos2.get(0)) {
            swapPositions(0);
        }

        if (BlockFillerPositionSelector.pos1.get(1) >
                BlockFillerPositionSelector.pos2.get(1)) {
            swapPositions(1);
        }

        if (BlockFillerPositionSelector.pos1.get(2) >
                BlockFillerPositionSelector.pos2.get(2)) {
            swapPositions(2);
        }

        for (int x = BlockFillerPositionSelector.pos1.get(0);
             x <= BlockFillerPositionSelector.pos2.get(0);
             x++) {
            for (int y = BlockFillerPositionSelector.pos1.get(1);
                 y <= BlockFillerPositionSelector.pos2.get(1);
                 y++) {
                for (int z = BlockFillerPositionSelector.pos1.get(2);
                     z <= BlockFillerPositionSelector.pos2.get(2);
                     z++) {
                    ((EntityPlayer) sender)
                            .worldObj
                            .setBlockState(
                                    new BlockPos(x, y, z),
                                    block.getBlockState().getBaseState());
                }
            }
        }
    }

    private void swapPositions(int index) {
        int temp = BlockFillerPositionSelector.pos1.get(index);
        BlockFillerPositionSelector.pos1.set(index,
                BlockFillerPositionSelector.pos2.get(index));
        BlockFillerPositionSelector.pos2.set(index, temp);
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
