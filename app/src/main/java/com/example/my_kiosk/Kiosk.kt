package com.example.my_kiosk
import  java.util.Scanner
import  java.util.ArrayList
fun main() {
    val kiosk = Kiosk()
    kiosk.go()
}

class Kiosk {
    val scanner = Scanner(System.`in`)
    val umsik = listOf(DubBab(scanner), SideMenu(scanner), Beverage(scanner))

    init {
        println("")
    }

    fun go () {
        while (true) {
            displaymain()
            val num = readln()!!
            when(num) {
                "1" -> umsik[0].displayMenu()
                "2" -> umsik[1].displayMenu()
                "3" -> umsik[2].displayMenu()
                "0" -> {
                    println("프로그램을 종료합니다")
                    break

                }

            }

        }
    }
    fun displaymain() {
        println("[맛나 덮밥]")
        println("1.덮밥류      | 매장에서 직접만드는 맛있는 덮밥")
        println("2.사이드 메뉴  | 자신있게 선보이는 사이드 메뉴들")
        println("3.음료수      | 각종 탄산음료와 시원한 음료수")
        println("0.종료        | 프로그램 종료")
    }
}


