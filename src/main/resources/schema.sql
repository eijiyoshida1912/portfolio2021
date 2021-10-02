/* 作品マスタ */
CREATE TABLE IF NOT EXISTS m_user (
user_id VARCHAR(50) PRIMARY KEY
, password VARCHAR(100)
, user_name VARCHAR(50)
, birthday DATE
, age INT
, gender INT
, department_id INT
, role VARCHAR(50)
);