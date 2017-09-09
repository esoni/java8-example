import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        String separator = "****************************";


        ArrayList<String> mylist = new ArrayList<String>() {{
            add("A1");
            add("B");
            add("C");
            add("C");
            add("C");
            add("A2");
        }};

        mylist.forEach((element)->{
            System.out.println("loop"+element);
        });

        System.out.println(separator);
        System.out.println();
        System.out.println();

        mylist.stream()
                .filter(s->s.contains("A"))
                .map(element->element+"*")
                .forEach((element)->{
                            System.out.println("loop"+element);
                        });

        System.out.println(separator);
        System.out.println();
        System.out.println();



        ArrayList<String> myElements = new ArrayList<String>() {{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
            add("f");
        }};

        IntStream.range(0,myElements.size())
            .forEach(idx ->
                    myElements.set(idx,myElements.get(idx)+idx)
            );


        myElements.forEach((element)->{
            System.out.println("loop"+element);
        });


        ArrayList<String> names = new ArrayList<String>() {{
            add("Marco");
            add("Francesco");
            add("Claudio");
            add("Roberto");
            add("Cristina");
            add("Franco");
        }};

        List<Student> students=new ArrayList<Student>();

        final String classe="5a";

        names.forEach(name-> {
            Student s=new Student();
            s.setName(name);
            students.add(s);
        });

        System.out.println(separator);
        System.out.println();
        System.out.println();

        IntStream.range(0,students.size())
                .forEach(idx-> {
                    students.get(idx)
                            .setClas(classe);
                    students.get(idx)
                            .setId(idx);
                });

        students.forEach((element)->{
            System.out.println("student:"+element);
        });
    }
}
