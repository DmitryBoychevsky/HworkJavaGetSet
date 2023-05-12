package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void totalStation() {
        Radio radio1 = new Radio(10);
        Assertions.assertEquals(10, radio1.getMaxQuantityRadioStation());
    }

    @Test
    public void maxEndMinStation() {
        Radio radio1 = new Radio();
        radio1.getMaxNumberStation();
        radio1.getMinNumberStation();

        Assertions.assertEquals(9, radio1.getMaxNumberStation());
        Assertions.assertEquals(0, radio1.getMinNumberStation());
    }


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
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equalTo9() {  // равен 9
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equalTo0() {  // равен 0
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingForwardFrom9() {  // переключение вперед с 9
        radio.setCurrentRadioStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingForwardFromAny() { // переключение вперед с любой станции
        radio.setCurrentRadioStation(0);
        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingBackFrom0() {  // переключение назад  с 0
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingBackFromAny() {  // переключение назад  с любой станции
        radio.setCurrentRadioStation(5);
        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolumeLevelRange() {  //  максимальный диапазон громкости радио
        radio.setSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolumeLevelRanges() { // минимальный диапазон громкости радио
        radio.setSoundVolume(0);


        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void allVolumeLevelRanges1() {  // вне диапазона уровня громкости минус
        radio.setSoundVolume(-1);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void allVolumeLevelRanges2() {  //  вне диапазона уровня громкости плюс
        radio.setSoundVolume(101);

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume1() {  // увеличение громкости в диапазоне вперед
        radio.setSoundVolume(2);
        radio.setIncreaseVolumeLevel();

        int expected = 3;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume2() {
        radio.setSoundVolume(100);
        radio.setIncreaseVolumeLevel();

        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReducingVolumeLevel1() {  // уменьшение громкости назад
        radio.setSoundVolume(88);
        radio.setReducingVolumeLevel();

        int expected = 87;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReducingVolumeLevel2() {
        radio.setSoundVolume(0);
        radio.setReducingVolumeLevel();

        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}

