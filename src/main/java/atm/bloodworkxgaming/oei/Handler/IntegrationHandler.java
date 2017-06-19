package atm.bloodworkxgaming.oei.Handler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Loader;
import org.lwjgl.Sys;
import slimeknights.tconstruct.library.tinkering.TinkersItem;
import slimeknights.tconstruct.library.traits.ITrait;
import slimeknights.tconstruct.library.utils.TinkerUtil;
import slimeknights.tconstruct.library.utils.ToolHelper;

import java.util.List;

/**
 * Created by jonas on 18.06.2017.
 */
public class IntegrationHandler {

    public static boolean checkCanMine(World world, EntityPlayerMP player, BlockPos pos, IBlockState state){

        ItemStack held = player.getHeldItemMainhand();
        if (held.isItemEnchanted()) {
            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.getEnchantmentByLocation("oreexcavate"), held) > 0){
                return true;
            }
        }



        if (Loader.isModLoaded("tconstruct") && held.hasTagCompound() && TinkerUtil.hasModifier(held.getTagCompound(), "oreexcavate")){
            System.out.println("has modifier");
            return true;
        }



        /*if (player.getHeldItemMainhand().getItem() == Items.APPLE || player.getHeldItemMainhand().getItem() == Items.DIAMOND_PICKAXE){
            return true;
        }*/

        return false;
    }


}
