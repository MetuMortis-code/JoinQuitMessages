/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package me.metumortis.deneme

import me.metumortis.deneme.HWID.Companion.getHWID
import me.metumortis.deneme.eventhandlers.damage
import org.bukkit.Material
import org.bukkit.plugin.java.JavaPlugin


class App : JavaPlugin() {
    override fun onEnable(){

        //var taş = Material.DEEPSLATE_DIAMOND_ORE.name.also(::println)
        server.pluginManager.registerEvents(damage(), this)
        main()
    }
}

fun main() {
    println("Selam")
    println(getHWID())
}
