package com.example.my_kiosk

import kotlin.system.exitProcess

fun main() {
    while (true) {

        val bubBab = DubBab()
        val sideMenu = SideMenu()
        val beverage = Beverage()
        val food = Food()
        val order = Order()




        println("[맛나 덮밥]")
        println("1.덮밥류      | 매장에서 직접만드는 맛있는 덮밥")
        println("2.사이드 메뉴  | 자신있게 선보이는 사이드 메뉴들")
        println("3.음료수      | 각종 탄산음료와 시원한 음료수")
        println("0.종료        | 프로그램 종료")
        val side1 = readLine()!!.toInt()



        if (side1 == 1) {
            bubBab.boB1()
        }
        if (side1 == 2) {
            sideMenu.ssl1()
        }
        if (side1 == 3) {
            beverage.bbe()
        }
        if (side1 == 0) {
            return
        }


    }


}


