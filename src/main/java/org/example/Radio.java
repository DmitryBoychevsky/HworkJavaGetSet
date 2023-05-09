package org.example;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setNextStation() {
        if (currentRadioStation >= 9) {
            currentRadioStation = 0;
        } else
            currentRadioStation++;
    }

    public void setPrevStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
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
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setIncreaseVolumeLevel() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void setReducingVolumeLevel() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

}