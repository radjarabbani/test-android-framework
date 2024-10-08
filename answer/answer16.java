
public class FirstUniqueNumber {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(5, 1, 5, 2, 1, 3, 4);

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : data) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : data) {
            if (frequencyMap.get(num) == 1) {
                System.out.println("First unique number is: " + num);
                break;
            }
        }
    }
}

Result --> First unique number is: 2
