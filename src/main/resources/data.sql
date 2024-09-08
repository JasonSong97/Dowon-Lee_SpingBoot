INSERT INTO users(id, join_date, name, password, ssn) VALUES(90001, now(), 'USER1', 'test111', '701010-111111');
INSERT INTO users(id, join_date, name, password, ssn) VALUES(90002, now(), 'USER2', 'test222', '801010-111111');
INSERT INTO users(id, join_date, name, password, ssn) VALUES(90003, now(), 'USER3', 'test333', '901010-111111');

INSERT INTO posts(description, user_id) VALUES('1 post', 90001);
INSERT INTO posts(description, user_id) VALUES('2 post', 90001);