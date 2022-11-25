package io.rokuko.test

import cn.chenlichao.wmi4j.SWbemLocator
import org.junit.jupiter.api.Test

const val ADDRESS = "localhost"
const val USERNAME = "administrator"
const val PASSWORD = "rokuko1124"

class WMI4J_Test1 {

    @Test
    fun getAllVMs() {
        val sWbemLocator = SWbemLocator(ADDRESS, USERNAME, PASSWORD, "ROOT\\virtualization\\v2")
        val comServer = sWbemLocator.connectServer()
        val vmList = comServer?.execQuery("select * from Msvm_ComputerSystem")
        for(vm in vmList!!){
            println(vm.getPropertyByName("Caption").stringValue)
        }
        sWbemLocator.disconnect()
    }

    @Test
    fun test2(){
        val a = setOf(1, 2, 3)
        a.forEach {

        }
    }

}