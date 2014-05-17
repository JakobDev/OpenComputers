package li.cil.oc

import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.relauncher.SideOnly
import net.minecraft.creativetab.CreativeTabs

object CreativeTab extends CreativeTabs(CreativeTabs.getNextID, "OpenComputers") {
  @SideOnly(Side.CLIENT)
  override def getTabIconItemIndex = Settings.get.blockId2

  override def getTranslatedTabLabel = getTabLabel
}