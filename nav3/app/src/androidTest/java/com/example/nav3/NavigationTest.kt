package com.example.myapplication

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isRoot
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.myapplication.OrientationChangeAction.Companion.orientationLandscape
import com.example.myapplication.OrientationChangeAction.Companion.orientationPortrait
import com.example.nav3.MainActivity
import com.example.nav3.R
import com.example.nav3.openAbout
import junit.framework.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


@RunWith(AndroidJUnit4::class)
class NavigationTest {
    @get:Rule
    val mActivityTestRule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java)

    @Test
    fun testAbout() {
        launchActivity<MainActivity>()
        openAbout()
        Espresso.onView(ViewMatchers.withId(R.id.activity_about))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    fun testAboutSec() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        openAbout()
        Espresso.onView(ViewMatchers.withId(R.id.activity_about))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    fun testAboutThird() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        openAbout()
        Espresso.onView(ViewMatchers.withId(R.id.activity_about))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun startFirst() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun fromFirstToSec() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun fromSecToThird() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.fragment3))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun fromSecToFirst() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToFirst)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun fromThirdToSec() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun fromThirdToThirst() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToFirst)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.pressBack()
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun rotateFirst() {
        launchActivity<MainActivity>()
        Espresso.onView(isRoot()).perform(orientationLandscape());
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun rotateSec() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(isRoot()).perform(orientationLandscape());
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun rotateThird() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(isRoot()).perform(orientationLandscape());
        Espresso.onView(ViewMatchers.withId(R.id.fragment3))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun rotateAbout() {
        launchActivity<MainActivity>()
        openAbout()
        Espresso.onView(isRoot()).perform(orientationLandscape());
        Espresso.onView(ViewMatchers.withId(R.id.activity_about))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }


    @Test
    fun backCloseStackCheck() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToFirst)).perform(ViewActions.click())
        Espresso.pressBackUnconditionally()
        assertTrue(mActivityTestRule.activity.isDestroyed)
    }

    @Test
    fun upStackCheck() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToFirst)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withContentDescription(R.string.nav_app_bar_navigate_up_description))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withContentDescription(R.string.nav_app_bar_navigate_up_description))
            .check(doesNotExist())
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        openAbout()
        Espresso.onView(ViewMatchers.withContentDescription(R.string.nav_app_bar_navigate_up_description))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withContentDescription(R.string.nav_app_bar_navigate_up_description))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withContentDescription(R.string.nav_app_bar_navigate_up_description))
            .perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }


    @Test
    fun backCloseStackRotationCheck() {
        launchActivity<MainActivity>()
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        Espresso.onView(isRoot()).perform(orientationLandscape());
        Espresso.onView(ViewMatchers.withId(R.id.fragment3))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(isRoot()).perform(orientationPortrait())
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun fewAbout() {
        launchActivity<MainActivity>()
        openAbout()
        Espresso.onView(ViewMatchers.withId(R.id.bnToFirst)).check(doesNotExist())
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment1))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.bnToSecond)).perform(ViewActions.click())
        openAbout()
        Espresso.onView(ViewMatchers.withId(R.id.bnToFirst)).check(doesNotExist())
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.bnToThird)).perform(ViewActions.click())
        openAbout()
        Espresso.onView(ViewMatchers.withId(R.id.bnToFirst)).check(doesNotExist())
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment3))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.pressBack()
        Espresso.onView(ViewMatchers.withId(R.id.fragment2))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }


}