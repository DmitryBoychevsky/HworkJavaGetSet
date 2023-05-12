package org.example;

public class Radio {
    private int maxQuantityRadioStation = 10;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int currentRadioStation;
    private int maxSound = 100;
    private int minSound = 0;
    private int soundVolume;

    public Radio(int maxQuantityRadioStation) {
        this.maxQuantityRadioStation = maxQuantityRadioStation;
        this.maxNumberStation = 9;
    }

    public Radio() {
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getMaxQuantityRadioStation() {
        return maxQuantityRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > maxNumberStation) {
            return;
        }
        if (newCurrentRadioStation < minNumberStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextStation() {
        if (currentRadioStation >= maxNumberStation) {
            currentRadioStation = minNumberStation;
        } else
            currentRadioStation++;
    }

    public void setPrevStation() {
        if (currentRadioStation <= minNumberStation) {
            currentRadioStation = maxNumberStation;
            return;
        } else
            currentRadioStation--;
    }
//    public void setSoundVolume(int soundVolume) {     // пытался но не получилось почему то.
//        if (soundVolume > 0 || soundVolume < 100) {
//            this.soundVolume = soundVolume;
//        } else {
//            return;
//        }
//
//    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSound) { //  было 0
            return;
        }
        if (newSoundVolume > maxSound) {  // было 100
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setIncreaseVolumeLevel() {
        if (soundVolume < maxSound) {
            soundVolume = soundVolume + 1;
        }
    }

    public void setReducingVolumeLevel() {
        if (soundVolume > minSound) {
            soundVolume = soundVolume - 1;
        }
    }

}