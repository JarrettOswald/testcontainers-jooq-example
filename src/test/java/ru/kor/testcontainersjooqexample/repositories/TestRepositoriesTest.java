package ru.kor.testcontainersjooqexample.repositories;

import jooq.tables.records.TestRecord;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class TestRepositoriesTest {

    @Autowired
    private TestRepositories testRepositories;

    @Test
    void findAll() {
        List<jooq.tables.pojos.Test> tests = testRepositories.findAll();
        log.info(tests.toString());
        Assertions.assertNotNull(tests);
    }
}