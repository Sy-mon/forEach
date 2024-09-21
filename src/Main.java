import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        for(int number : numbers ){
            System.out.println(number);
        }

        System.out.println("=======================");


        //Same as the code below

//    for(int i = 0; i < numbers.size(); i++){
//    System.out.println(numbers.get(i));
//}
    }
}