import java.time.LocalDate;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Country country = new Country();
        country.setName("KJ");
        country.setNamepeple("Kyrguz");
        country.setPopulation("Kyrguzu");
        country.setOrigin("Из тюркского народ");


        City city = new City();
        city.setCountry("Кыргызстан");
        city.setName("Бишкек");
        city.setNationality("Кыргыз");


        Adress adress = new Adress();
        adress.setCity("Бишкек");
        adress.setStreet("Арашан");
        adress.setStreet(" дом 6 квартира 77");

        Parson parson = new Parson();
        parson.setFirstName("Айкежан");
        parson.setLastName("Ахматова");
        parson.setYear(LocalDate.of(1977, 2,7));
        parson.setProfessional("Программист");

        System.out.println(country.getName() + " " + country.getNamepeple() + " " + country.getPopulation() + " " + country.getOrigin());
        System.out.println(adress.getCity() + " " + adress.getStreet() + " " + adress.getHouse());
        System.out.println(parson.getFirstName() + " " + parson.getLastName() + " " + parson.getYear() + " " + parson.getProfessional());
    }
}


//            Company company = new Company();
//            company.name = "Peaksoft";
//            company.country = "KG";
//            company.year = LocalDate.of(2020,4,7);
//            company.founder = "Эсен Ниязов";
//
//            Groubs groubs2 = new Groubs();
//            groubs2.firstname = "Ulan";
//            groubs2.lastName = "Kubanuchbekov";
//            groubs2.startdate = LocalDate.of(2022,4,5);
//            groubs2.work = "Учитель";
//
//            Groubs groubs1 = new Groubs();
//            groubs1.firstname = "Datka";
//            groubs1.lastName = "Mamatzhanova";
//            groubs1.startdate = LocalDate.of(2022,3,5);
//            groubs1.groubname1 = "Mentor";
//            Groubs[] groubs = {groubs2, groubs1};
//
//            Person person = new Person();
//            person.name = "Datka";
//            person.lastName = "Mamatzhanova";
//            person.groub = "Java-9";
//            person.year = LocalDate.of(2004,4,7);
//
//
//
//        System.out.println(company.name+" "+company.country+" "+
//                company.year+" "+company.founder);
//        for (Groubs g:groubs){
//            System.out.println(g.firstname+" "+g.lastName+" "+g.startdate+" "
//            + " " +g.work+" "+g.groubname1);
//            System.out.println(person.name+" "+person.lastName+" "+
//                    person.groub+" "+
//            person.year);
//
//        }
////
////        Sqare sqare = new Sqare();
////        sqare.setDlina(20);
////        sqare.setShirina(20);
////        sqare.kvadrat(sqare.getDlina(),sqare.getShira() );
//
//
////        Person person = new Person();
////        person.setFirstName("Aikezhan");
////        person.setLastName("Akhmatoba");
////        person.setAge(45);
////        person.setGender('j');
////        person.setProssionai("Programmist");
////        System.out.println( "Atu:"+person.getFirstName()+ "\n"+"Familitam:"+ person.getLastName()
////                + "\n" +"Jashum:"+person.getAge()+"\n"+"pol:"+person.getGender()+
////                "\n"+"professiasu:"+ person.getProssionai() );
//

//         Company tesla = new Company();
//            tesla.setYear (2023);
//            System.out.println("Жылы:"+tesla.getYear9());







