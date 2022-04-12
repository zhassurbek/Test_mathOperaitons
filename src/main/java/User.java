//import java.util.Map;
//import java.util.Objects;
//
//public class User {
//    // id, name, age, пол(male/female)
//    private int id;
//    private String name;
//    private int age;
//    private Sex sex;
//
//
//    // Хранить всех пользователей. Сделаем static поле allUsers.
//    private static Map<Integer, User> allUsers;
//
//    // присваивать порядковый номер пользователям. Создадим статик поле счетчик.
//    private static int countId = 0;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        User user = (User) o;
//        return !(age != user.age ||
//                !Objects.equals(name, user.name) ||
//                !sex) = user.sex;
//    }
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, sex);
//    }
//
//    public User(int id, String name, int age, Sex sex) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//}
