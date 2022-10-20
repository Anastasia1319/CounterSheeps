public class CounterTest {
    Boolean [] array1 = { true, true, false, false, //9
        true, false, true,false,
        false, true, true, false,
        false, false, false, true,
        true, false, true, false};

    static Boolean[] array2 = new Boolean [125]; //100
    static Boolean[] array3 = new Boolean[250]; //0

    static {
        int index = 0;
        for (; index < 100; index++)
            array2[index] = true;
        for (; index< 5; index++)
            array2[index] = null;
        for (; index < 20; index++)
            array2[index] = false;

        index = 0;
        for (; index < 125; index++)
            array3[index] = null;
        for (; index < 125; index++)
            array3[index] = false;
    }
}
