package com.kotlin.mvvmpattern.ui.splash


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.kotlin.mvvmpattern.R
import com.kotlin.mvvmpattern.ui.authentication.SignInActivity
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class SignInActivityFailTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(SignInActivity::class.java)

    @Test
    fun signInActivityTest() {
        val textInputEditText = onView(
            allOf(
                withId(R.id.edtUserName),
                isDisplayed()
            )
        )
        textInputEditText.perform(click())

        val textInputEditText2 = onView(
            allOf(
                withId(R.id.edtUserName),
                isDisplayed()
            )
        )
        textInputEditText2.perform(click())

        val textInputEditText3 = onView(
            allOf(
                withId(R.id.edtUserName),
                isDisplayed()
            )
        )
        textInputEditText3.perform(replaceText("hard"), closeSoftKeyboard())

        val textInputEditText4 = onView(
            allOf(
                withId(R.id.edtUserName), withText("hard"),
                isDisplayed()
            )
        )
        textInputEditText4.perform(pressImeActionButton())

        val textInputEditText5 = onView(
            allOf(
                withId(R.id.edtPassword),
                isDisplayed()
            )
        )
        textInputEditText5.perform(replaceText("111"), closeSoftKeyboard())

        val textInputEditText6 = onView(
            allOf(
                withId(R.id.edtPassword), withText("111"),
                isDisplayed()
            )
        )
        textInputEditText6.perform(pressImeActionButton())

        val appCompatButton = onView(
            allOf(
                withId(R.id.btnSignIn), withText("Sign In"),
                isDisplayed()
            )
        )
        appCompatButton.perform(click())

        val button = onView(
            allOf(
                withId(R.id.btnSignIn),
                isDisplayed()
            )
        )
        button.check(matches(isDisplayed()))
    }
}
