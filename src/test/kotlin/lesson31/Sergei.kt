package lesson31

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Sergei {
    lateinit var list: MutableList<String>

@BeforeEach
fun setUp(){
    list= mutableListOf("1","2")
}

    @Test
    fun forTest(){
        list.add("3")
        Assertions.assertEquals("3",list[2])
    }
}