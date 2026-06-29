package com.qiushui1012.lib.registry.data.lang;

import com.qiushui1012.lib.registry.QualiaLibRegistry;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(LangContainer.class)
public @interface Lang {
    String lang() default "en_us";

    String key() default QualiaLibRegistry.UNDEFINED;

    String value() default QualiaLibRegistry.UNDEFINED;
}
