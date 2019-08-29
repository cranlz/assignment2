public class Finder {
    public static Integer findMax(int[] intArray) {
        try
        {
            if (intArray.length == 0) {
                return null;
            }
            int max = 0;
            for (int value : intArray) {
                if (value > max) {
                    max = value;
                }
            }
            return max;
        }
        catch(NullPointerException e)
        {
            return null;
        }
    }

    public static Integer findMin(int[] intArray) {
        try
        {
            if (intArray.length == 0) {
                return null;
            }
            int min = Integer.MAX_VALUE;
            for (int value : intArray) {
                if (value < min) {
                    min = value;
                }
            }
            return min;
        }
        catch(NullPointerException e)
        {
            return null;
        }
    }
}
