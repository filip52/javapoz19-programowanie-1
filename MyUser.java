package pl.sdacademy.javapoz19programowanie1.lists;


import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Stream;

public class MyUser implements Comparable<MyUser> {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
            Map<MyUser, Integer> map = new LinkedHashMap<>();

            map.put(new MyUser("Marta"), 20);
            map.put(new MyUser("Martyna"), 125);
            map.put(new MyUser("Marcelina"), 30);
            map.put(new MyUser("Anna"), 35);

            System.out.println("actual: " + map.get(new MyUser("Marta")) + " expected: 20" );
            System.out.println("actual: " + map.get(new MyUser("Martyna")) + " expected: 25" );
            System.out.println("actual: " + map.get(new MyUser("Marcelina")) + " expected: 30" );
            System.out.println("actual: " + map.get(new MyUser("Anna")) + " expected: 35" );

            map.forEach((key, value) -> {
                MyUser key1 = key;
                Integer value1 = value;
            });

            map.entrySet()
                    .stream()
                    .forEach(e -> System.out.println(e));
        }


        private String name;


        public MyUser(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyUser myUser = (MyUser) o;
            return Objects.equals(name, myUser.name);
        }

        @Override
        public int hashCode() {


            return Objects.hash(name);
        }

    @Override
    public int compareTo(MyUser o) {
        this.name.compareTo(o.name);

    }
}

