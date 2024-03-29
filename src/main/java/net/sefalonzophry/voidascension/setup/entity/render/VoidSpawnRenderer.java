package net.sefalonzophry.voidascension.setup.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.sefalonzophry.voidascension.VoidAscension;
import net.sefalonzophry.voidascension.setup.entity.custom.VoidSpawnEntity;
import net.sefalonzophry.voidascension.setup.entity.model.VoidSpawnModel;

public class VoidSpawnRenderer extends MobRenderer<VoidSpawnEntity, VoidSpawnModel<VoidSpawnEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(VoidAscension.MOD_ID, "textures/entity/voidspawn.png");

    public VoidSpawnRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new VoidSpawnModel<>(), 0.6F);
    }

    @Override
    public ResourceLocation getTextureLocation(VoidSpawnEntity entity) {
        return TEXTURE;
    }

    public static void register() {}
}
