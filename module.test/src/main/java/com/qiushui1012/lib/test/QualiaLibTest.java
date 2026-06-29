package com.qiushui1012.lib.test;

import net.minecraft.resources.Identifier;
import net.neoforged.fml.common.Mod;

@Mod(QualiaLibTest.MOD_ID)
public class QualiaLibTest {
    public static final String MAIN_ID = "qualialib";
    public static final String MOD_ID = "qualialib_test";

    public static Identifier of(String path) {
        return Identifier.fromNamespaceAndPath(QualiaLibTest.MAIN_ID, path);
    }
}