package com.ylallencheng.allendroid

import android.util.Log
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.pow

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

        var base = 50000f
        val rate = 0.016f / 365f

        var a = base * rate
        var b = a * 31
        var c = base * 0.016f / 365f

        Log.d("AllenTesting", "base is: $base")
    }
}
