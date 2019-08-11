package pl.sdacademy.javapoz19programowanie1.user;


import org.junit.Assert;
import org.junit.Test;
import pl.sdacademy.javapoz19programowanie1.books.User.Gender;
import pl.sdacademy.javapoz19programowanie1.books.User.User;
import pl.sdacademy.javapoz19programowanie1.books.User.UserService;

import java.util.Arrays;
import java.util.List;

import static pl.sdacademy.javapoz19programowanie1.books.User.Gender.female;

public class UserServiceTest {

    @Test
    public void findByGenderShouldReturnFilteredList() {
        UserService userService = new UserService();

        List<User> list = userService.findByGender(female);
        Assert.assertEquals("Lista powinna zawierać 3 elementy", 3, list.size());

        Assert.assertTrue("Wszystkie elementy powinny miec wartosc female", list.stream()
                .map(user -> user.getGender())
                .allMatch(gender -> gender.equals(Gender.female)));
    }

    @Test
    public void mapToNamesShouldReturnListWithNames() {
        UserService userService = new UserService();
        List<String> names = userService.mapToNames();

        Assert.assertEquals(Arrays.asList("Bird Ramsey"
                , "Kristie Cole"
                , "Leonor Cross"
                , "Marsh Mccall"
                , "Marsh Mccall"), names);
    }

    @Test
    public void sortByAgeShouldReturnSortedByAgeListOfUsers() {
        UserService userService = new UserService();

        List<User> users = userService.sortByAge();

        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void sortByBalanceShouldReturnSortedByBalanceListOfUsers() {
        UserService userService = new UserService();

        List<User> users = userService.sortByBalance();

        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void avgBalanceShouldReturAvgValue() {
        UserService userService = new UserService();
        double avgBalance = userService.avgBalance();
        System.out.println(avgBalance);
        Assert.assertEquals(290318.2, avgBalance, 0.1);
    }

    @Test
    public void findWithHighestBalanceShouldReturnUserWithHighestBalance() {
        UserService userService = new UserService();
        User withHighestBalance = userService.findWithHighestBalance();
        Assert.assertEquals(Long.valueOf(394645), withHighestBalance.getBalance());
    }
}