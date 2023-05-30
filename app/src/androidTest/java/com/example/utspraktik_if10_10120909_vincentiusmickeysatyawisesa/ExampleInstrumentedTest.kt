package com.example.utspraktik_if10_10120909_vincentiusmickeysatyawisesa

/** Tanggal : 30 Mei 2023
NIM : 10120909
Nama : Vincentius Mickey Satya Wisesa
Kelas : IF - 10
 */

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(
            "com.example.utspraktik_if10_10120909_vincentiusmickeysatyawisesa",
            appContext.packageName
        )
    }
}