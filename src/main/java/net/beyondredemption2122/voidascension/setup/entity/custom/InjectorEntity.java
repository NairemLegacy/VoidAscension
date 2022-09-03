package net.beyondredemption2122.voidascension.setup.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class InjectorEntity extends MonsterEntity{
    public InjectorEntity(EntityType<? extends MonsterEntity> p_i48553_1_, World p_i48553_2_) {
        super(p_i48553_1_, p_i48553_2_);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttribute() {
        return MobEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 25.00)
                .add(Attributes.MOVEMENT_SPEED,1.0F)
                .add(Attributes.ATTACK_DAMAGE, 10)
                .add(Attributes.ATTACK_SPEED, 0.25F)
                .add(Attributes.FOLLOW_RANGE, 25.00);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(7, new RandomWalkingGoal(this, 1.0F));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(1, new MoveTowardsTargetGoal(this, 1.0F, 15.00F));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0F, false));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));

    }

    @Override
    protected int getExperienceReward(PlayerEntity p_70693_1_) {
        return 2 + this.level.random.nextInt(5);
    }

    public static void register() {}
}
