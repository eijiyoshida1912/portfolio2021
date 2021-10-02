/* 作品マスタ */
CREATE TABLE IF NOT EXISTS m_work (
work_id VARCHAR(50) PRIMARY KEY
, image_url VARCHAR(100)
, work_date DATE
, title VARCHAR(50)
, comment VARCHAR(200)
);