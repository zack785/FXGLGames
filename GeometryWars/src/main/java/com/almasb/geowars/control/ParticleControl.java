package com.almasb.geowars.control;

import com.almasb.fxgl.ecs.AbstractControl;
import com.almasb.fxgl.ecs.Entity;
import com.almasb.fxgl.entity.control.ProjectileControl;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class ParticleControl extends AbstractControl {
    @Override
    public void onUpdate(Entity entity, double tpf) {
        ProjectileControl control = entity.getControlUnsafe(ProjectileControl.class);
        control.setSpeed(control.getSpeed() * (1 - 3*tpf));
    }
}
