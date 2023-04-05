public class Main {

    public static void main(String[] args) {
        System.out.println("Завдання 1 Завдання 1 Завдання 1 Завдання 1 Завдання 1 Завдання 1 Завдання 1");
        ///Завдання 1
        for (int i=500; i>650; i=i+10 ){
            System.out.println("Цикл for " + i);
        }
        int x=500;
        while (x<650){
            System.out.println("Цикл while " + x);
            x=x+10;
        }
        int f =500;
        do{
            System.out.println("Цикл do-while " + f);
            f=f+10;
        }while(f<650);
        ///Завдання 1

        System.out.println("Завдання 2 Завдання 2 Завдання 2 Завдання 2 Завдання 2 Завдання 2 Завдання 2");

        ///Завдання 2
        for(int a=2;a<5000;a=2*a-1){
            System.out.println(a);
        }
        ///Завдання 2

        System.out.println("Завдання 3 Завдання 3 Завдання 3 Завдання 3 Завдання 3 Завдання 3 Завдання 3");

        ///Завдання 3
        for(int des=10, shag=1; shag<11; shag++){
            if (des%shag==0){
                System.out.println(shag);
            }
            else{
                continue;
            }
        }
        ///Задвання3

        System.out.println("Завдання 4 Завдання 4 Завдання 4 Завдання 4 Завдання 4 Завдання 4 Завдання 4");

        ///Завдання 4
        int factor1=1;
        int factor2=1;
        int chislo2=1;
        for(int chislo1=1; chislo1<11;chislo1++){
            factor1=factor1*chislo1;
        }
        System.out.println("Факторіал через цикл FOR " + factor1);
        while (chislo2<11){
            factor2=factor2*chislo2;
            chislo2++;
        }
        System.out.println("Факторіал через цикл WHILE " + factor2);
        ///Завдання 4

        System.out.println("Завдання 5 Завдання 5 Завдання 5 Завдання 5 Завдання 5 Завдання 5 Завдання 5");

        ///Завдання 5
        int k=0;
        for (int chas=0; chas<24; chas++){
            for(int min=0;min<60; min++){
                if (chas==min){
                    k++;
                }
            }
        }
        System.out.println("Кількость співпадінь " + k);

    }
}