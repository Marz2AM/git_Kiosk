package com.example.my_kiosk

class SideMenu {
    fun ssl1() {
        println("--사이드메뉴--")
        println("1   감자튀김")
        println("2   고구마튀김")
        println("3   나쵸")
        println("0   돌아가기")
        val side3 = readLine()!!.toInt()

        if(side3 == 0)
            return

    }

}