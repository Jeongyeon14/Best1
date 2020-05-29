--회원정보 저장을 위한 테이블 생성
--회원 아이디 mem_id 문자열(최대 50바이트)
--회원 비밀번호 mem_pass 문자열(최대 50바이트)
--회원 이름 mem_name 문자열(최대 50바이트)
--회원 포인트 mem_point 숫자(최대 10자리 정수)

CREATE TABLE member (
mem_id VARCHAR2(50),
mem_pass VARCHAR2(50),
mem_name VARCHAR2(50),
mem_point NUMBER(10,0),
PRIMARY KEY (mem_id)
);

INSERT into MEMBER 
(mem_id, mem_pass, mem_name, mem_point)
VALUEs
('a001', '1234', '이름', 13);
 
SELECT mem_id, mem_pass, mem_name, mem_point FROM member;

--a001회원의 포인트를 777로 변경하는 프로그램을 작성하세요
UPDATE  member SET mem_point = 577 where mem_id = 'a001';

DELETE FROM MEMBER where mem_id = 'a001';

commit;

select * from member;

--학생 테이블
CREATE TABLE student (
stu_no VARCHAR2(50),  --학번
stu_name VARCHAR2(50),  --이름
stu_score NUMBER(10,0), --성적
PRIMARY KEY (stu_no)  --기본값 설정
);
select * FROM  student;


