package com.kurume_nct.twihighmod_server

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = TwiHighMod.MOD_ID, version = TwiHighMod.VERSION)
class TwiHighMod {
    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        MinecraftForge.EVENT_BUS.register(TickEventHandler())
        System.out.println("Hey Yo") //TODO: なんか表示されなくてやばそう
    }
    companion object {
        const val MOD_ID = "TwiHigh"
        const val VERSION = "1.0"
    }
}