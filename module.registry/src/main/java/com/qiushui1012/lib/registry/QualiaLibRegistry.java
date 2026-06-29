package com.qiushui1012.lib.registry;

import net.minecraft.resources.Identifier;
import net.neoforged.fml.common.Mod;

@Mod(QualiaLibRegistry.MOD_ID)
public class QualiaLibRegistry {
    public static final String MAIN_ID = "qualialib";
    public static final String MOD_ID = "qualialib_registry";

    public static Identifier of(String path) {
        return Identifier.fromNamespaceAndPath(QualiaLibRegistry.MAIN_ID, path);
    }
}