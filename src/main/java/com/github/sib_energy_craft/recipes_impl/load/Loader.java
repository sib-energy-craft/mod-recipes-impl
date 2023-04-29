package com.github.sib_energy_craft.recipes_impl.load;

import net.fabricmc.api.ModInitializer;

import static com.github.sib_energy_craft.sec_utils.load.LoadUtils.load;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public class Loader implements ModInitializer {
    @Override
    public void onInitialize() {
        load(Loader.class, "mod-recipes-impl");
    }
}
