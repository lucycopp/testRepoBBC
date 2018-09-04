import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

public class TestTimeToTextConverter {

    private TimeToTextConverter converter;
    @Before
    public void setup() {
        // arrange
        converter = new TimeToTextConverter();
    }

    @Test
    public void midnight() {
         // act
        String timeAsText =
                converter.getTimeAsString(LocalTime.MIDNIGHT);
        // assert
        Assert.assertEquals("midnight", timeAsText);

    }

    @Test
    public void midday() {
       // act
        String timeAsText =
                converter.getTimeAsString(LocalTime.NOON);
        // assert
        Assert.assertEquals("midday", timeAsText);

    }

}
