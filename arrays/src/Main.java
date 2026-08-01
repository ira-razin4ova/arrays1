import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) { // task 1
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        double[] num2 = {1.57, 7.654, 9.986};

        String[] names = new String[5];
        names[0] = "Анна";
        names[1] = "Екатерина";
        names[2] = "Иван";
        names[3] = "Степан";
        names[4] = "Яков";


        // task 2

        for (int number = 0; number < num.length; number++) {
            if (number == num.length - 1) {
                System.out.print(num[number]);
                break;
            }
            System.out.print(num[number] + ",");
        }
        System.out.println();

        for (int index = 0; index < num2.length; index++) {
            if (index == num2.length - 1) {
                System.out.print(num2[index]);
                break;
            }
            System.out.print(num2[index] + ", ");
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                System.out.print(names[i]);
                break;
            }
            System.out.print(names[i] + ", ");
        }
        System.out.println();

        // task 3

        for (int index1 = num.length - 1; index1 >= 0; index1--) {
            if (index1 == 0) {
                System.out.print(num[index1]);
                break;
            }
            System.out.print(num[index1] + ", ");
        }
        System.out.println();
        for (int index2 = num2.length - 1; index2 >= 0; index2--) {
            if (index2 == 0) {
                System.out.print(num2[index2]);
                break;
            }
            System.out.print(num2[index2] + ", ");
        }
        System.out.println();

        for (int f = names.length - 1; f >= 0; f--) {
            if (f == 0) {
                System.out.print(names[f]);
                break;
            }
            System.out.print(names[f] + ", ");
        }


        // task 4
        System.out.println();

        for (int index3 = 0; index3 < num.length; index3++) {
            if (num[index3] % 2 != 0) {
                num[index3] += 1;
            }
        }
        System.out.println(Arrays.toString(num));

    }
}

