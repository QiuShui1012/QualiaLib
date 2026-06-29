package com.qiushui1012.lib.registry;

import net.minecraft.resources.Identifier;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/// 定义目标 `ID`
///
/// 配合 [`@Registry`][Registry] 使用时，用于标识目标元素注册时使用的 `ID`
///
/// @see Registry
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ID {
    /// `ID`，格式与 [Identifier] 相同
    ///
    /// 若其不包含命名空间，则默认使用 `minecraft` 作为命名空间
    ///
    /// @see Identifier#parse(String)
    String value();
}
