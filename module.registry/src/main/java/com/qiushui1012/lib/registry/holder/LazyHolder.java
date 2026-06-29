package com.qiushui1012.lib.registry.holder;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderOwner;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.ApiStatus;

import java.util.function.Function;
import java.util.function.Supplier;

public class LazyHolder<T> extends Holder.Reference<T> {
    private final Supplier<T> factory;

    @SuppressWarnings("DataFlowIssue")
    protected LazyHolder(Supplier<T> factory) {
        super(Type.INTRUSIVE, null, null, null);
        this.factory = factory;
    }

    public static <T> LazyHolder<T> of(Supplier<T> factory) {
        return new LazyHolder<>(factory);
    }

    public static <T> LazyHolder<T> item(Function<Item.Properties, T> factory) {
        return new LazyHolder<>(() -> factory.apply(new Item.Properties()));
    }

    public static <T> LazyHolder<T> block(Function<BlockBehaviour.Properties, T> factory) {
        return new LazyHolder<>(() -> factory.apply(BlockBehaviour.Properties.of()));
    }

    @ApiStatus.Internal
    public void bindOwner(HolderOwner<T> owner) {
        // noinspection ConstantValue - 构造函数内已把 this.owner 设为 null
        if (this.owner != null && owner != this.owner) {
            throw new IllegalStateException("Can't change holder owner: existing=" + this.owner + ", new=" + owner);
        } else {
            // noinspection DataFlowIssue
            this.owner = owner;
        }
    }
}
