package com.qiushui1012.lib.registry;

import net.minecraft.resources.Identifier;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/// 定义目标注册表
///
/// 在类上使用时，将目标类视作基本元素并注册一个新的注册表；
///
/// 在字段上使用时，尝试读取 [`@ID`][ID] 注解中的值并注册到对应注册表；
/// 若 [`@ID`][ID] 不存在，则会尝试使用字段名作为 `ID`；
///
/// @see ID
@Documented
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Registry {
    /// 注册表的 `ID`，格式与 [Identifier] 相同
    ///
    /// 若其不包含命名空间，则默认使用 `minecraft` 作为命名空间
    ///
    /// @see Identifier#parse(String)
    String value();
}
