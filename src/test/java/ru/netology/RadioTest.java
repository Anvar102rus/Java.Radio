package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio Radio = new Radio();

    //среднее значение звука
    @Test
    void shouldcurrentVolume() {
        Radio cond = new Radio();
        cond.setcurrentVolume(50);
        int expected = 50;
        int actual = cond.getcurrentVolume();
        assertEquals(expected, actual);
    }



    @Test
    void shouldOverVolumeMax() {
        Radio cond = new Radio();
        cond.setcurrentVolume(102);
        cond.increaseVolume();
        int expected =51;
        int actual = cond.getcurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldBelowVolumeMin() {
        Radio cond = new Radio();
        cond.setcurrentVolume(-10);
        cond.decreaseVolume();
        int expected = 49;
        int actual = cond.getcurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldincreaseVolume() {
        Radio cond = new Radio();
        cond.increaseVolume();
        int expected = 51;
        int actual = cond.getcurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shoulddecreaseVolume() {
        Radio cond = new Radio();
        cond.decreaseVolume();
        int expected = 49;
        int actual = cond.getcurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shoildincreaseVolumeMax() {
        Radio cond = new Radio();
        cond.setcurrentVolume(100);
        cond.increaseVolume();
        int expected = 100;
        int actual = cond.getcurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    void shoulddecreaseVolumeMin() {
        Radio cond = new Radio();
        cond.setcurrentVolume(0);
        cond.decreaseVolume();
        int expected = 0;
        int actual = cond.getcurrentVolume();
        assertEquals(expected, actual);
    }



    //    текущий станция
    @Test
    void shoulcurrentRadioStation () {
        Radio cond = new Radio();
        cond.setcurrentRadioStation(5);
        int expected = 5;
        int actual = cond.getcurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void maximumRadioStation () {
        Radio cond = new Radio();
        cond.setcurrentRadioStation(cond.getmaxRadioStation());
        assertEquals(9, cond.getcurrentRadioStation());

    }

    @Test
    void minimumRadioStation () {
        Radio cond = new Radio();
        cond.setcurrentRadioStation(cond.getminRadioStation());
        assertEquals(0, cond.getcurrentRadioStation());


    }

    @Test
    void shouldOverRadioStation () {
        Radio cond = new Radio();
        cond.setcurrentRadioStation(11);
        assertEquals(9, cond.getcurrentRadioStation());
    }


    @Test
    void shouldBelowRadioStation () {
        Radio cond = new Radio();
        cond.setcurrentRadioStation(-10);
        int expected = 0;
        int actual = cond.getcurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    void shoulchangeTheStationByNext () {
        Radio cond = new Radio();
        cond.setchangeTheStationByNext();
        int expected = 6;
        int actual = cond.getcurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    void shoulchangeTheStationByPrev () {
        Radio cond = new Radio();
        cond.setchangeTheStationByPrey();
        int expected = 4;
        int actual = cond.getcurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shoulchangeTheStationByNextMax () {
        Radio cond = new Radio();
        cond.setcurrentRadioStation(9);
        cond.setchangeTheStationByNext();
        int expected = 0;
        int actual = cond.getcurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    void shoulchangeTheStationByPrevMin () {
        Radio cond = new Radio();
        cond.setcurrentRadioStation(0);
        cond.setchangeTheStationByPrey();
        int expected = 9;
        int actual = cond.getcurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldAmountRadioStation() {
        Radio cond = new Radio(8);
        int amountRadioStation = 10;
        int expected = 10;
        int actual = amountRadioStation; 
        assertEquals(expected, actual);
    }

}