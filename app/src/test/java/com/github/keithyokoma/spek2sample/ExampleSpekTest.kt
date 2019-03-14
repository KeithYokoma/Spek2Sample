package com.github.keithyokoma.spek2sample

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import kotlin.test.assertNotNull

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleSpekTest : Spek({
    class NestedClass {
        val name: String = "name"
    }

    Feature("nested class") {

        Scenario("create an object") {

            Then("instantiate nested class") {

                assertNotNull(NestedClass())
            }
        }
    }
})
