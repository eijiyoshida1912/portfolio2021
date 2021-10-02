/* 作品マスタ */
INSERT INTO m_user (
user_id
, password
, user_name
, birthday
, age
, gender
, department_id
, role
) VALUES
('system@co.jp', 'password', 'システム管理者', '2000-01-01', 21, 1, 1, 'ROLE_ADMIN'),
('user@co.jp', 'password', 'ユーザー1', '2000-01-01', 21, 2, 2, 'ROLE_GENERAL'),
('1', '1.jpg', '髑髏習作01', '2020-04-01', 21, 1, 1, 'ROLE_ADMIN');
