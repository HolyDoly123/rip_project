package com.rip.rip_project.models;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByName(String name);
    boolean existsByName(String name);
    // Здесь можно добавлять методы запросов к БД (наподобие того что выше)
    // https://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
}
