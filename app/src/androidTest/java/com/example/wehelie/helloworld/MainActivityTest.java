package com.example.wehelie.helloworld;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void getAuthor() {
        // viewmatcher narrows down the view search
        ViewInteraction appButton = onView(
                // matches(isDisplayed()) is a ViewAssertion
                Matchers.allOf(withId(R.id.showButton), isDisplayed()));
        // a click action is performed on button
        appButton.perform(click());

        ViewInteraction textView = onView(
                Matchers.allOf(withId(R.id.authorTextView), isDisplayed()));
        // check to see if view matches the given string
        textView.check(matches(withText(R.string.text_info)));
    }
}