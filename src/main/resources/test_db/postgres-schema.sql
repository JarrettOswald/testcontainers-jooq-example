CREATE TABLE test
(
    id      int generated always as identity PRIMARY KEY,
    date    DATE,
    description varchar
);

INSERT INTO test ("date", description)
VALUES ('10/10/1995','HELLO WORLD');
