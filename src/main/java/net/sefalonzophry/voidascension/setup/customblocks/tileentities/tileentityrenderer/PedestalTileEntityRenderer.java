package net.sefalonzophry.voidascension.setup.customblocks.tileentities.tileentityrenderer;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.sefalonzophry.voidascension.setup.customblocks.tileentities.PedestalTileEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class PedestalTileEntityRenderer extends TileEntityRenderer<PedestalTileEntity> {

    private Minecraft mc = Minecraft.getInstance();

    public PedestalTileEntityRenderer(TileEntityRendererDispatcher p_i226006_1_) {
        super(p_i226006_1_);
    }

    @Override
    public void render(PedestalTileEntity te, float pPartialTicks, MatrixStack pMatrixStack,
                       IRenderTypeBuffer pBuffer, int pCombinedLight, int pCombinedOverlay) {
        if (te.getItem().equals(ItemStack.EMPTY) || te.getItem().getItem().equals(Items.AIR))
            return;

        ClientPlayerEntity player = mc.player;
        int lightLevel = getLightLevel(te.getLevel(), te.getBlockPos().above());
        renderItem(te.getItem(), new double[] { 0.5d, 0.5d, 0.5d},
                Vector3f.YP.rotationDegrees(180f - player.rotA), pMatrixStack, pBuffer, pPartialTicks,
                pCombinedOverlay, lightLevel, 0.8f);
    }

    private void renderItem(ItemStack stack, double[] translation, Quaternion rotation, MatrixStack matrixStack, IRenderTypeBuffer buffer, float partialTicks, int combinedOverlay, int lightLevel, float scale) {
        matrixStack.pushPose();
        matrixStack.translate(translation[0], translation[1], translation[2]);
        matrixStack.mulPose(rotation);
        matrixStack.scale(scale, scale, scale);

        IBakedModel model = mc.getItemRenderer().getModel(stack, null, null);
        mc.getItemRenderer().render(stack, ItemCameraTransforms.TransformType.GROUND, true, matrixStack, buffer,
                lightLevel, combinedOverlay, model);
        matrixStack.popPose();
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getBrightness(LightType.BLOCK, pos);
        int sLight = world.getBrightness(LightType.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }
}
