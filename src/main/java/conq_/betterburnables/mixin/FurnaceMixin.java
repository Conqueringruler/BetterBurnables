package conq_.betterburnables.mixin;

import net.minecraft.core.block.Block;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;


@Mixin(value = {LookupFuelFurnace.class}, remap = false)

public class FurnaceMixin {

@Shadow @Final
protected Map<Integer, Integer> fuelList;
	@Shadow public void addFuelEntry(int id, int fuelYield) {
		this.fuelList.put(id, fuelYield);
	}
	@Inject(method = "register", at = @At(value = "TAIL"))
	public void register(CallbackInfo ci)
	{
		this.addFuelEntry(Block.layerLeavesOak.id, 10);
		this.addFuelEntry(Block.cobweb.id, 10);
		this.addFuelEntry(Item.seedsWheat.id, 10);
		this.addFuelEntry(Item.seedsPumpkin.id, 10);
		this.addFuelEntry(Block.saplingCacao.id, 10);
		this.addFuelEntry(Item.paper.id, 10);
		this.addFuelEntry(Item.wheat.id, 10);
		this.addFuelEntry(Item.string.id, 10);
		this.addFuelEntry(Block.tallgrass.id, 10);
		this.addFuelEntry(Block.tallgrassFern.id, 10);

		this.addFuelEntry(Block.leavesBirch.id, 10);
		this.addFuelEntry(Block.leavesCacao.id, 10);
		this.addFuelEntry(Block.leavesCherry.id, 10);
		this.addFuelEntry(Block.leavesOak.id, 10);
		this.addFuelEntry(Block.leavesCherryFlowering.id, 20);
		this.addFuelEntry(Block.leavesPine.id, 10);
		this.addFuelEntry(Block.leavesOakRetro.id, 10);
		this.addFuelEntry(Block.leavesShrub.id, 10);
		this.addFuelEntry(Block.leavesEucalyptus.id, 10);

		this.addFuelEntry(Item.ammoArrow.id, 20);
		this.addFuelEntry(Block.torchCoal.id, 20);
		this.addFuelEntry(Item.cloth.id, 20);

		this.addFuelEntry(Block.wool.id, 50);
		this.addFuelEntry(Block.pressureplatePlanksOak.id, 50);
		this.addFuelEntry(Item.label.id, 50);
		this.addFuelEntry(Block.blockSugarcaneBaked.id, 50);
		this.addFuelEntry(Item.book.id, 50);

		this.addFuelEntry(Item.flag.id, 150);
		this.addFuelEntry(Item.painting.id, 150);
		this.addFuelEntry(Block.ladderOak.id, 150);
		this.addFuelEntry(Item.map.id, 150);


		this.addFuelEntry(Block.bookshelfPlanksOak.id, 300);
		this.addFuelEntry(Block.seat.id, 300);
		this.addFuelEntry(Block.basket.id, 300);
		this.addFuelEntry(Item.seat.id, 300);
		this.addFuelEntry(Block.trapdoorPlanksOak.id, 300);
		this.addFuelEntry(Block.pumpkinCarvedIdle.id, 300);
		this.addFuelEntry(Block.fencePaperWall.id, 300);

		this.addFuelEntry(Block.pumpkinCarvedActive.id, 500);
		this.addFuelEntry(Block.paperWall.id, 500);

		this.addFuelEntry(Block.noteblock.id, 800);
		this.addFuelEntry(Block.jukebox.id, 800);

		this.addFuelEntry(Block.chestLegacy.id, 800);
		this.addFuelEntry(Block.chestLegacyPainted.id, 800);
		this.addFuelEntry(Block.chestPlanksOak.id, 800);
		this.addFuelEntry(Block.chestPlanksOakPainted.id, 800);
	}
	//@Shadow private Block modelBlock;
	/*
	@Inject(method = "getBreakResult", at = @At("TAIL"),remap = false, cancellable = true)
	private void stairs(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity, CallbackInfoReturnable<ItemStack[]> cir) {
		if(world.rand.nextFloat()<0.005){ // 0.001 Should be 0.1% chance aka 1/1000. 0.005 = 1/200 chance.
			cir.setReturnValue(new ItemStack[]{new ItemStack(StairsDisc.stairsDisc, 1)});

		}
	} */

}
