import java.util.Arrays;

public class Drill {
    public long[] drill1(String scores){
       long numbers = Long.parseLong(scores);
       long[] scoreArray = {numbers};
        System.out.println(Arrays.toString(scoreArray));
       return scoreArray;
    }

    public long[] drill2(String scores){
            long numbers = Long.parseLong(scores);
            long[] scoreArray = {numbers};
            System.out.println(Arrays.toString(scoreArray));
            return scoreArray;
    }

    public long[] drill3(String scores){
        long numbers = Long.parseLong(scores);
        long[] scoreArray = {numbers};
        for (int number = 0; number < scoreArray.length; number++) {
            if (scoreArray[number] % 2 == 0) {
                long[] newArray = {number};
                System.out.println(Arrays.toString(newArray));
            }
        }
        return scoreArray;
    }

       public void drill4(int scores){
        int[] newArray = {scores};
        int[] scoreArray = {};
        for(int number = 0; number < newArray.length; number++){
            for(int number2 = 0; number2 < scoreArray.length; number2++){
                if(newArray[number] % 2 == 0){
                    scoreArray[number] = newArray[number2];
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public void drill5(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        Drill task1 = new Drill();
        task1.drill1("1323456");

        Drill task2 = new Drill();
        task2.drill2("1323456");

        Drill task3 = new Drill();
        task3.drill3("123456789");

        Drill task4 = new Drill();
        task4.drill4(101233444);

        Drill task5 = new Drill();
        task5.drill5("David");

    }




}