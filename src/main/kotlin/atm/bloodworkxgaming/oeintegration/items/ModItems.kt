package atm.bloodworkxgaming.oeintegration.items

import atm.bloodworkxgaming.oeintegration.OreExcavationIntegration
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraftforge.registries.ForgeRegistries
import thedarkcolour.kotlinforforge.forge.KDeferredRegister

/**
 * Created by Jonas on 09.03.2017.
 */
object ModItems {
    val REGISTRY = KDeferredRegister(ForgeRegistries.ITEMS, OreExcavationIntegration.MOD_ID)

    val ITEM_EXCAVATE_MODIFIER by REGISTRY.registerObject("item_excavate_modifier") {
        Item(Item.Properties().tab(ItemGroup.TAB_TOOLS))
    }

    /*@SideOnly(Side.CLIENT)
    fun initModels() {
        itemExcavateModifier.initModel()
    }

    init {
        itemExcavateModifier = ItemExcavateModifier()
    }*/

}
