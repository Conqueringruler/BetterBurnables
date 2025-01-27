package conq_.betterburnables.mixin;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.crafting.LookupFuelFurnace;
import net.minecraft.core.item.Items;
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
		this.addFuelEntry(Blocks.LAYER_LEAVES_OAK.id(), 10);



		this.addFuelEntry(Blocks.COBWEB.id(), 10);
		this.addFuelEntry(Items.SEEDS_WHEAT.id, 10);
		this.addFuelEntry(Items.SEEDS_PUMPKIN.id, 10);
		this.addFuelEntry(Items.PAPER.id, 10);
		this.addFuelEntry(Items.WHEAT.id, 10);
		this.addFuelEntry(Items.STRING.id, 10);
		this.addFuelEntry(Blocks.TALLGRASS.id(), 10);
		this.addFuelEntry(Blocks.TALLGRASS_FERN.id(), 10);

		this.addFuelEntry(Blocks.LEAVES_BIRCH.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_CACAO.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_CHERRY.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_OAK.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_CHERRY_FLOWERING.id(), 20);
		this.addFuelEntry(Blocks.LEAVES_PINE.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_OAK_RETRO.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_SHRUB.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_EUCALYPTUS.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_THORN.id(), 10);
		this.addFuelEntry(Blocks.LEAVES_PALM.id(), 10);

		this.addFuelEntry(Items.AMMO_ARROW.id, 20);
		this.addFuelEntry(Blocks.TORCH_COAL.id(), 20);
		this.addFuelEntry(Items.CLOTH.id, 20);
		this.addFuelEntry(Items.ROPE.id, 20);

		this.addFuelEntry(Blocks.WOOL.id(), 50);
		this.addFuelEntry(Items.LABEL.id, 50);
		this.addFuelEntry(Items.BOOK.id, 50);


		this.addFuelEntry(Blocks.BLOCK_SUGARCANE_BAKED.id(), 100);
		this.addFuelEntry(Items.PAINTBRUSH.id, 100);

		this.addFuelEntry(Items.FLAG.id, 150);
		this.addFuelEntry(Items.PAINTING.id, 150);
		this.addFuelEntry(Items.MAP.id, 150);


		this.addFuelEntry(Blocks.SEAT.id(), 300);
		this.addFuelEntry(Blocks.BASKET.id(), 300);
		this.addFuelEntry(Items.SEAT.id, 300);
		this.addFuelEntry(Items.DOOR_OAK_PAINTED.id, 300);
		this.addFuelEntry(Blocks.PUMPKIN_CARVED_IDLE.id(), 300);
		this.addFuelEntry(Blocks.FENCE_PAPER_WALL.id(), 300);


		this.addFuelEntry(Blocks.PUMPKIN_CARVED_ACTIVE.id(), 500);
		this.addFuelEntry(Blocks.PAPER_WALL.id(), 500);

		this.addFuelEntry(Blocks.NOTEBLOCK.id(), 800);
		this.addFuelEntry(Blocks.JUKEBOX.id(), 800);

		this.addFuelEntry(Blocks.CHEST_LEGACY.id(), 300); // fuel needed for 1 Items is 200
		this.addFuelEntry(Blocks.CHEST_LEGACY_PAINTED.id(), 300);

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
