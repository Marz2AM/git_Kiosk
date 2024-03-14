package com.example.my_kiosk

import java.util.Scanner


class DubBab(scanner: Scanner) : Menu(scanner) {
    override fun displayMenu() {
        println("------------덮밥메뉴-----------")
        println("1. 맨밥       | w 2.0 | 갓지은 쌀밥입니다")
        println("2. 제육덮밥    | w 6.0 | 누구나 좋아하는 제육입니다")
        println("3. 오징어덮밥  | w 7.0 | 신선한 오징어가 들어간 덮밥입니다")
        println("0. 되돌아가기")
        val side1 = readLine()!!.toInt()
        if (side1 == 0) {
            return
        }else {
        println("음식이 선택됬습니다")
        }
        }
    }














