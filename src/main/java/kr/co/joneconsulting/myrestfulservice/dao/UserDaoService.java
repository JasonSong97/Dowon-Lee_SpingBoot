package kr.co.joneconsulting.myrestfulservice.dao;

import kr.co.joneconsulting.myrestfulservice.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component // 스프링 컨텍스트에 등록하는 것
public class UserDaoService {

    // 메모리에 db 등록 == 관계형 DB 사용 X
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(1, "Kenneth", new Date(), "test1", "111111-1111111"));
        users.add(new User(2, "Alice", new Date(), "test2", "222222-222222"));
        users.add(new User(3, "John", new Date(), "test3", "333333-333333"));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }

        if (user.getJoinDate() == null) {
            user.setJoinDate(new Date( ));
        }

        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user: users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                 iterator.remove();
                 return user;
            }
        }

        return null;
    }
}
