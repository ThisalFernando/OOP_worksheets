public class LW2Q1 {

    public static void main(String[] args) {

        //Variable declaration
        int num = 10;
        int count = 10;

        //For loop for print numbers
        for(int i = num; i <= 49; i++){
            //Line break for each row
            if(i == num + count){
                System.out.println();
                count = count + 10;
            }
            //Print number
            System.out.print(i + " ");
        }
    }
}
