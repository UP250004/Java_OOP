class ReturnFunctions{
    static int GetNo2(){
        System.out.print("Regresando 2\n");
        return 2;
    }
    static int GetNo5(){
        System.out.print("Regresando 5\n");
        return 5;
    }
    public static void main(String[] args){
        //GetNo2(); //Hay un 2 pero no se esta utilizando
        int num_1 = GetNo2();
        int num_2 = GetNo5();
        int suma = num_1 + num_2;
        int resta = num_1 - num_2;
        int multi = num_1 * num_2;
        float division = num_1 / num_2;
        try {
                Thread.sleep(3000); // Pause for 3 seconds (3000 milliseconds)
                System.out.print(num_1);
                System.out.print("\n");
                System.out.print(num_2);
                System.out.print("\n");
                System.out.print(suma);
                System.out.print("\n");
                System.out.print(resta);
                System.out.print("\n");
                System.out.print(multi);
                System.out.print("\n");
                System.out.print(division);
            } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}//