package lesson31

import org.junit.jupiter.api.Assertions
import  org.junit.jupiter.api.Test
class calculator31Test{
    @Test
    fun plus31 (){
        val cal=Calculator31()
        val result=cal.plus31(2,3)
        Assertions.assertEquals(result,5)
    }
}