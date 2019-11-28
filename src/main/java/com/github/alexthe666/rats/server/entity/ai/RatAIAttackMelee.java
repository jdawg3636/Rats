package com.github.alexthe666.rats.server.entity.ai;

import com.github.alexthe666.rats.server.entity.EntityRat;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.EntityAIAttackMelee;

public class RatAIAttackMelee extends EntityAIAttackMelee {
    private EntityRat rat;

    public RatAIAttackMelee(EntityRat rat, double speed, boolean memory) {
        super(rat, speed, memory);
        this.rat = rat;
    }

    public void updateTask() {
        super.updateTask();
        //this.attackTick = 0;
    }

    public boolean shouldExecute() {
        return !rat.isInCage() && super.shouldExecute();
    }

    protected double getAttackReachSqr(LivingEntity attackTarget) {
        return 1.5F;
    }
}