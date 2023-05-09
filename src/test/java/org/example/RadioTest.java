package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void rangeIsGreaterThan9() {  // диапазон больше 9
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void rangeLessThan0() {  // диапазон меньше 0
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equalTo9() {  // равен 9
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equalTo0() {  // равен 0
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingForwardFrom9() {  // переключение вперед с 9
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingForwardFromAny() { // переключение вперед с любой станции
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingBackFrom0() {  // переключение назад  с 0
        Radio radio = new Radio();
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingBackFromAny() {  // переключение назад  с любой станции
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolumeLevelRange() {  //  максимальный диапазон громкости радио
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolumeLevelRanges() { // минимальный диапазон громкости радио
        Radio radio = new Radio();
        radio.setSoundVolume(0);


        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void allVolumeLevelRanges1() {  // вне диапазона уровня громкости минус
        Radio radio = new Radio();
        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void allVolumeLevelRanges2() {  //  вне диапазона уровня громкости плюс
        Radio radio = new Radio();
        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseTheVolume1() {  // увеличение громкости в диапазоне вперед
        Radio radio = new Radio();
        radio.setSoundVolume(2);
        radio.setIncreaseVolumeLevel();

        int expected = 3;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseTheVolume2() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.setIncreaseVolumeLevel();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ReducingVolumeLevel1() {  // уменьшение громкости назад
        Radio radio = new Radio();
        radio.setSoundVolume(88);
        radio.setReducingVolumeLevel();

        int expected = 87;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test public void ReducingVolumeLevel2() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.setReducingVolumeLevel();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}

