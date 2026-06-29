package com.qiushui1012.lib.registry.data.model.block;

import com.qiushui1012.lib.registry.QualiaLibRegistry;
import com.qiushui1012.lib.registry.meta.TargetType;
import net.minecraft.world.level.block.Block;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@TargetType(Block.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CubeAll {
    String value() default QualiaLibRegistry.UNDEFINED;
}
