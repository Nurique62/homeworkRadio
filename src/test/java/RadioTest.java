import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        radio.prev();

        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void testPrevIfZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        assertEquals(6, radio.getCurrentVolume());

    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.decreaseVolume();

        assertEquals(7, radio.getCurrentVolume());

    }

    @Test
    public void testDecreaseVolumeIf11() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());

    }
}



