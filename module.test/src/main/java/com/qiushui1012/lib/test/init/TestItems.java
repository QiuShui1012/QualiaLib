package com.qiushui1012.lib.test.init;

import com.qiushui1012.lib.registry.ID;
import com.qiushui1012.lib.registry.data.lang.Lang;
import com.qiushui1012.lib.registry.Registry;
import com.qiushui1012.lib.registry.data.model.item.FlatItem;
import com.qiushui1012.lib.registry.holder.LazyHolder;
import com.qiushui1012.lib.test.QualiaLibTest;
import com.qiushui1012.lib.test.item.TestItem;
import net.minecraft.world.item.Item;

@ID(QualiaLibTest.MOD_ID)
public class TestItems {
    @Lang
    @Lang(lang = "zh_cn", value = "测试物品")
    @FlatItem("carrot")
    @Registry("item")
    public static final LazyHolder<Item> TEST_ITEM = LazyHolder.item(TestItem::new);
}
