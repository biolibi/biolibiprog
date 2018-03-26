public class Arraytest {public static void main(String[] args)
{
    Arraylist<String> asd = new Arraylist<>();




    System.out.println(asd.get(0));



    for (int i =1 ; i <= 10;i++){
       asd.add(i,"i" + i);
    }
    asd.remove(7);
    asd.set(1, "pqwpewqpewqpeqwpewqpweqpewqp");
    System.out.println(asd.get(1));
    for (int i = 1; i < 10;i++){
       System.out.println(asd.get(i));
    }

    asd.size();
    System.out.println(asd.size());
    asd.clear();
    System.out.println("clear");
    System.out.println(asd.get(1));
    System.out.println(asd.get(2));
    System.out.println(asd.size());




}




}

