package com.kurume_nct.twihighmod_server

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent
import net.minecraftforge.fml.common.FMLCommonHandler
import net.minecraft.server.MinecraftServer
import net.minecraft.util.text.ITextComponent
import net.minecraft.util.text.TextComponentString

class TickEventHandler {
    private var cnt: Int = 0
    private var era: Int = 0
    @SubscribeEvent
    fun onServerTickEvent(event: TickEvent.ServerTickEvent) {
        if (++cnt < 60) return
        cnt = 0
        era++;
        val text: ITextComponent = TextComponentString("$era")
        FMLCommonHandler.instance().minecraftServerInstance.sendMessage(text)
    }
}