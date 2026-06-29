package com.qiushui1012.lib.registry.data.model.item;

import com.qiushui1012.lib.registry.QualiaLibRegistry;
import com.qiushui1012.lib.registry.meta.TargetType;
import net.minecraft.world.item.Item;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@TargetType(Item.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FlatItem {
    String value() default QualiaLibRegistry.UNDEFINED;
}
