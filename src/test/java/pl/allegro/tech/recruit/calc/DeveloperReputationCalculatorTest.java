package pl.allegro.tech.recruit.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class DeveloperReputationCalculatorTest {

    private final DeveloperReputationCalculator calculator = new DeveloperReputationCalculator();

    @Test
    public void shouldCalculateOnlyBasedOnFollowersMulitplier() {

        //given
        Developer follower1 = new Developer(
                "fol1",
                List.of()
        );
        Developer follower2 = new Developer(
                "fol2",
                List.of()
        );
        List<Developer> followers = new ArrayList<>();
        followers.add(follower1);
        followers.add(follower2);
        Developer mainDeveloper = new Developer(
                "dev1",
                followers
        );
        int actual = 4;
        //when
        int expected = calculator.calculate(mainDeveloper);
        //Missing check based on time, if its october and when its other time a year
        //had to mock time somehow, but couldn't find a way to do it
        //then
        Assertions.assertEquals(expected, actual);
    }

}
