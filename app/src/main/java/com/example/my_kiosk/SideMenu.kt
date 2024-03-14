package com.example.my_kiosk

import java.util.Scanner

class SideMenu(scanner: Scanner) : Menu(scanner) {
    override fun displayMenu() {
        println("--------------사이드메뉴-------------")
        println("1. 감자튀김    | w 5.0 | 감자튀김 입니다")
        println("2. 고구마튀김  | w 6.0 | 고구마 튀김 입니다")
        println("3. 만두튀김    | w 5.0 | 만두튀김 입니다")
        println("0. 되돌아가기")
        val side1 = readLine()!!.toInt()
        if (side1 == 0) {
            return
        }
        else{
            println("사이드가 선택됬습니다")
        }
    }
}
