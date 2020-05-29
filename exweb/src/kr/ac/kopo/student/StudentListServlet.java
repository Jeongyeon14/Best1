package kr.ac.kopo.student;
//1.브라우저 주소창에
//http://localhost:8000/exweb/studen/list.do 를 입력하여 접속(요청전송)하면,
//브라우저 화면에 학생목록(학번,이름)이 출력되도록 구현
//2.학생목록 화면에 "학생추가" 링크를 추가하고,
//그 링크를 클릭하면
//http://localhost:8000/exweb/studen/addform.do 로 이동하여,
//학생의 학번, 이름, 성적을 입력할 수 있는 입력 엘리먼트들을 출력
//(학번,이름,성적 파라미터 이름능 stuNo, stuName, stuScore로 설정)
//2-1 저장 버튼을 클릭하면
//http://localhost:8000/exweb/studen/add.do 로 이동하여,
//입력한 학생 정보를 데이터베이스에 저장하고
//학생목록 화면으로 이동
//3.학생목록화면에서 각 학생들의 학번을 클릭하면, 
//http://localhost:8000/exweb/studen/editform.do 로 이동하여,
//해당 학생의 학번, 이름, 성적을 입력할 수 있는 입력 엘리먼트들을 출력
//3-1.저장 버튼을 클릭하면
//http://localhost:8000/exweb/studen/edit.do 로 이동하여,
//데이터베이스에 해당 학생의 이름과 성적을 변경하고
//학생목록 화면으로 이동
//3-2. 삭제버튼을 클릭하면
//http://localhost:8000/exweb/studen/del.do 로 이동하여,
//데이터베이스에서 해당 학생을 삭제하고,
//브라우저 화면에 학생목록이 출력
public class StudentListServlet {

}
