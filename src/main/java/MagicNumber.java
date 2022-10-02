import java.util.HashMap;

/**
 * @Project TDD
 * @Author elfof on 01/09/2022 at 11:16
 */
public class MagicNumber {



    public HashMap check(Integer[] list, Integer magicNumber){
        HashMap<String, Object> result = new HashMap<String, Object>();
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if((list[i] + list[j]) == magicNumber) {
                    magicNumber = list[i] + list[j];
                    result.put("magicNumber", magicNumber);
                    result.put("bool", true);
                    return result;
                }
            }
        }
        result.put("magicNumber", 0);
        result.put("bool",false);
        return result;
    }

}
