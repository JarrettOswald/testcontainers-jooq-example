package ru.kor.testcontainersjooqexample.repositories;


import jooq.tables.pojos.Test;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static jooq.tables.Test.TEST;

@Repository
@RequiredArgsConstructor
public class TestRepositories {

    private final DSLContext dslContext;

    public List<Test> findAll() {
        return dslContext.selectFrom(TEST)
                .fetchInto(Test.class);
    }

}
