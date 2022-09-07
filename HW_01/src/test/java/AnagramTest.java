import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

    @Test
    public void ArrayChallengeTest() {
        String str1 = "aa aa odg dog gdo";
        String str2 = "a c b c run urn urn";
        String str3 = "i must must stop poos";
        String str4 = "cow woc ocw cow cow owc calsas sadfg";
        Anagram anagram = new Anagram();
        Assert.assertEquals(2, anagram.ArrayChallenge(str1));
        Assert.assertEquals(1, anagram.ArrayChallenge(str2));
        Assert.assertEquals(0, anagram.ArrayChallenge(str3));
        Assert.assertEquals(4, anagram.ArrayChallenge(str4));
    }

}
