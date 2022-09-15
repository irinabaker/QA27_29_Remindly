package com.telran.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateReminderTests extends TestBase {

    @Test
    public void addReminderWithDefaultDataTest() {
        int quantityBeforeAdd;
        int quantityAfterAdd;
        quantityBeforeAdd = app.getMainScreen().getTotalReminders();
        //tap on add reminder
        app.getReminders().tapOnAddReminder();
        //fill reminder title
        app.getReminders().fillReminderTitle("Test");
        //save reminder
        app.getReminders().saveReminder();
        //assert to add new reminder
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantityBeforeAdd + 1);
    }

    @Test
    public void addReminderWithDefaultDataAndTitleTextAssertTest() {
        //tap on add reminder
        app.getReminders().tapOnAddReminder();
        //fill reminder title
        app.getReminders().fillReminderTitle("Test");
        //save reminder
        app.getReminders().saveReminder();
        //assert to add new reminder for title text

    }

    @Test
    public void addReminderWithRandomSwipeTest() {
        int quantityBeforeAdd;
        int quantityAfterAdd;
        quantityBeforeAdd = app.getMainScreen().getTotalReminders();
        //tap on add reminder
        app.getReminders().tapOnAddReminder();
        //fill reminder title
        app.getReminders().fillReminderTitle("Test");
        //tap on data field
        app.getReminders().tapOnDataField();
        //choose random month
        app.getReminders().selectMonth("future");
        //select day
        app.getReminders().selectDay(19);
        //tap on OK
        app.getReminders().tapOnOK();
        //save reminder
        app.getReminders().saveReminder();
        //assert to add new reminder
        quantityAfterAdd = app.getMainScreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantityBeforeAdd + 1);
    }

    @Test
    public void addReminderWithAllDataTest() {
        //tap on add reminder
        app.getReminders().tapOnAddReminder();
        //fill reminder title
        app.getReminders().fillReminderTitle("Christmas");
        //tap on data field
        app.getReminders().tapOnDataField();
        //choose certain month
        app.getReminders().selectCertainMonth("future",4,"Dec");
        //select day
        app.getReminders().selectDay(23);
        //tap on year
        app.getReminders().tapOnYear();
        //select year
        app.getReminders().selectYear("past", "2018");
        //tap on OK
        app.getReminders().tapOnOK();
        //tap on time
        app.getReminders().tapOnTime();
        //select time of day
        app.getReminders().selectTimeOfDay("am");
        //select hours and minutes
        app.getReminders().tapWithCoordinates(269,924);
        app.getReminders().tapWithCoordinates(539,1205);
        //tap on ok
        app.getReminders().tapOnOK();
//        //switch off repeat
//        app.getReminders().tapOnRepeatSwitch();
//        //enter repeat number
//        app.getReminders().enterRepeatNumber("3");
//        //swipe up
//        app.getReminders().swipeUp();
//        //select repeat time
//        app.getReminders().selectRepeatTime("Month");
//        //save reminder
//        app.getReminders().saveReminder();

    }
}
