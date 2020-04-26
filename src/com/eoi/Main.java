package com.eoi;




import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public  void walk()
    {

    }
    public static Movie randomMovie()
    {
        int number = (int)(Math.random()*3)+1;
        System.out.println(number);
        switch (number)
        {
            case 1:
                Movie movie = new Movie1("Movie1");
                return movie;
            case 2:
                Movie movie2 = new Movie2("Movie2");
                return movie2;
            case 3:
                Movie movie3 = new Movie4("Movie3");
                return movie3;
            default:
                return null;
        }

    }

    @Hello("ROSE")
    public static void main(String[] args) throws Exception{
	// write your code here
      /*  Car po = new Car();
        po.setModel("porshe");
        System.out.println(po.getMode());*/
        /*Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());*/

        /*Account account = new Account();
        account.withdraw(4050);
        account.deposit(200);
        System.out.println(account.getBalance());*/
       /* VipPerson person = new VipPerson("rose",5000,"tianzijiaozi");
        VipPerson person1 = new VipPerson("jack",2000);
        VipPerson baby = new VipPerson();
        System.out.println(person.getName());
        System.out.println(person1.getName());
        System.out.println(baby.getName());*/

       /*Dog dog = new Dog("hello",1,2,1,20);
       Animal an = new Animal("animal",1,4,1);
       dog.eat();
       walk();*/

    /*   Cat cat1 = new Cat("hello");
        Cat cat2 = new Cat("kitty");
        cat1.printName();
        cat2.printName();

        Class cls = Main.class;
        Method method = cls.getMethod("main",String[].class);
        Hello hello = method.getAnnotation(Hello.class);
        System.out.println(hello.value());
        String a = "123456";
        System.out.println("a.split(\",\").length:"+a.split(",").length);
        String b = "2";
        Integer.valueOf(b);*/
//    Dimension thedime = new Dimension(1,3,3);
//    Case thecase = new Case("rose",thedime);
//    Resolution theres = new Resolution(2,3);
//    Monitor themoni = new Monitor("monitor",2,theres);
//    MotherBoad mot = new MotherBoad("bb");
//    PC thepc = new PC(thecase,themoni,mot);
//        System.out.println(thepc.getMotherBoad().getSize());
//        System.out.println(thepc.getThiscase().getModel());

//        EnhancedPlayer player = new EnhancedPlayer("rose",20,"sword");
//        System.out.println(player.getHealth());


//        Printer printer = new Printer(50,10,false);
//        System.out.println(printer.getPages());
//        System.out.println(printer.getToner_level());
//        System.out.println(printer.isDuplex());

//        System.out.println();
//        Movie movie = randomMovie();
//        System.out.println(movie.plot()+movie.getName());
     /*   Humburgers humburgers = new Humburgers("whiter bread",true,10,"basic");
        humburgers.setAdditional1("lettuce");
        humburgers.setAdditional2("tomator");
        humburgers.setAdditional3("carrot");
        System.out.println(humburgers.itermlizeHumburger());*/
      /*   int[] a = new int[5];
         Scanner scanner = new Scanner(System.in);
        System.out.println("please input 5 numbers:");
         for(int i=0;i<a.length;i++)
         {

             a[i] = scanner.nextInt();
         }
         for(int i=0;i<a.length;i++)
         {
             System.out.println(a[i]);

         }
        System.out.println(average(a));*/
      /*int[] a = {2,3,4};
      int[] b = a;
      b[1] = 1;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a));*/
       /* MobilePhone mobilePhone = new MobilePhone("123456789");
        Contacts rose = new Contacts("rose","123");
        mobilePhone.addContacts(rose);
      int i = scanner.nextInt();
      switch (i)
      {
          case 0:
              mobilePhone.addContacts(new Contacts("jack","456"));
              break;
          case 1:
              mobilePhone.removeContact(rose);
              break;
          case 2:
              mobilePhone.updateContact(rose,new Contacts("rose","456"));
              break;
          case 3:
              mobilePhone.findContacts(rose);
              break;
          case 4:
              mobilePhone.findContacts("rose1");
              break;


      }
        mobilePhone.printContacts();*/

       /*//autoboxing and unboxing
       Integer a = 2;
       int b = a.intValue();
       Integer c = Integer.valueOf(b);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        Double d = 2.0;
        double e = d.doubleValue();
        Double f = Double.valueOf(e);
        System.out.println("e:"+e);
        System.out.println("f:"+f);*/







    }

  /*  public static double average(int[] a)
    {
        int sum = 0;
        for(int i=0;i<a.length;i++)
        {
            sum += a[i];
        }
        return sum/a.length;

    }
*/



}

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot()
    {
        return "There isn't any plot";
    }

    public String getName() {
        return name;
    }
}

class Movie1 extends Movie{
    public Movie1(String name) {
        super("movie1");
    }

    @Override
    public String plot() {
        return "I'm movie1";
    }
}

class Movie2 extends Movie{
    public Movie2(String name) {
        super("movie2");
    }

    @Override
    public String plot() {
        return "I'm movie2";
    }
}

class Movie4 extends Movie{
    public Movie4(String name) {
        super("movie3");
    }

    @Override
    public String plot() {
        return "I'm movie3";
    }
}

