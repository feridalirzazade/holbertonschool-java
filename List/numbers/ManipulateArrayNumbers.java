import java.util.List;

public class ManipulateArrayNumbers {

    public static void removeNumber(List<Integer> numbers, int number) throws Exception {
        if(findNumberPosition(numbers, number) == -1) throw new Exception("Number not found in the list");
        else numbers.remove(findNumberPosition(numbers, number));
    }

    public static int findNumberPosition(List<Integer> numbers, int number){
        for(int i = 0;i<numbers.size();i++){
            if(numbers.get(i) == number){
                return i;
            }
        }
        return -1;
    }
    public static void addNumber(List<Integer> numbers, int number) throws Exception {

        boolean isExist = false;
        for(int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i) == number) isExist = true;
        }
        if(isExist) throw new Exception("Number already in the list");
        else numbers.add(number);
    }

    public static void replaceNumber(List<Integer> numbers, int numberToReplace, int replacementNumber) {
        int pos = findNumberPosition(numbers, numberToReplace);
       if(pos == -1) numbers.add(replacementNumber);
       else{
           numbers.remove(pos);
           numbers.add(pos,replacementNumber);
       }
    }
}
