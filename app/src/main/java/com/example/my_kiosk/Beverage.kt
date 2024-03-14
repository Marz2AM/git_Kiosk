package com.example.my_kiosk

import java.util.Scanner

class Beverage(scanner: Scanner) : Menu(scanner) {
    override fun displayMenu() {
        println("--------------음료-------------")
        println("1. 사이다   | w 2.0 | 시원한 사이다 입니다")
        println("2. 콜라     | w 2.0 | 제로콜라 입니다")
        println("3. 애플주스  | w 3.0 | 상큼한 사과주스입니다")
        println("0. 되돌아가기")
        val side1 = readLine()!!.toInt()
        if (side1 == 0) {
            return
        }
        else{
            println("음료가 선택됬습니다")
        }
    }
}



