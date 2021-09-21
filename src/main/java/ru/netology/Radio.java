package ru.netology;

public class Radio {

    private int currentVolume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentRadioStation = 5;
    private int minRadioStation = 0;
    private int amountRadioStation = 10;
    private int maxRadioStation =  amountRadioStation - 1;


    public Radio() {
    }

    public Radio(int amountRadioStation) {
        this.amountRadioStation = amountRadioStation;
        this.maxRadioStation = amountRadioStation -1;
    }


    public void setcurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getcurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume <  maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }



    public void setcurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getcurrentRadioStation() {
        return currentRadioStation;
    }

    public int getmaxRadioStation() {
        return maxRadioStation;
    }

    public int getminRadioStation() {
        return minRadioStation;
    }

    public void setchangeTheStationByNext() {
        if (currentRadioStation < maxRadioStation) {
            this.currentRadioStation = currentRadioStation += 1;

        } else {
            this.currentRadioStation = minRadioStation;

        }
    }

    public void setchangeTheStationByPrey() {
        if (currentRadioStation > minRadioStation) {
            this.currentRadioStation = currentRadioStation -= 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
}

