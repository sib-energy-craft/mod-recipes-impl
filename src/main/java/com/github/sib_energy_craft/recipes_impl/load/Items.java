package com.github.sib_energy_craft.recipes_impl.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

import static com.github.sib_energy_craft.sec_utils.utils.ItemUtils.register;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public final class Items implements DefaultModInitializer {

    public static final Item COAL_BALL;
    public static final Item COMPRESSED_COAL_BALL;
    public static final Item COAL_CHUNK;

    static {
        var simpleMisc = new Item.Settings();

        COAL_BALL = register(ItemGroups.INGREDIENTS, Identifiers.of("coal_ball"), simpleMisc);
        COMPRESSED_COAL_BALL = register(ItemGroups.INGREDIENTS, Identifiers.of("compressed_coal_ball"), simpleMisc);
        COAL_CHUNK = register(ItemGroups.INGREDIENTS, Identifiers.of("coal_chunk"), simpleMisc);
    }
}
