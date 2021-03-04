# introduction

* Korea It Academy final Project (코리아IT아카데미 최종 프로젝트)
* 주제 : Let'sPort - 사용자를 위한 운동 모임 커뮤니티
* 개발기간 : 2021.01.25 ~ 2021.02.19(약 4주)
* 개발인원 : 5명
* 담당파트 : 어드민 전체 / DB설계 및 보수 / 텍스트 에디터 개발
* 프로젝트 종료 후 개인작업 : aws 서버등록 / 도메인 등록 / ssl 등록
* 개인 작업내역 : https://docs.google.com/spreadsheets/d/1EVGFp4s2K3ueodlOMp1ajbEGo9tdm4vB0g1p_Ol1Ml0/edit#gid=0
* 사이트 주소 : https://woo-ki.com/project/
   - 체험아이디 : user11@letsports.com
   - 체험비밀번호 : 1111
* 어드민 주소 : https://woo-ki.com/project/adminPage.wooki
   - 체험아이디 : admin@letsports.com
   - 체험비밀번호 : 1111
* DB구조 : https://aquerytool.com/aquerymain/index/?rurl=ce20f34a-2d30-421c-9b01-d9ecca2b7729
   - 비밀번호 : 1111

# Technologies

* Java
* HTML/CSS
* Oracle
* Apache Tomcat
* Spring
* MyBatis

# Features
* adminPage (로그인 페이지 제외 전체 ajax통신)
   - 회원 가입 통계
   - 회원 관리
   - 어드민 권한 관리
   - 트레이너 관리
   - 게시글 관리
   - 댓글 관리
   - 리뷰 관리
   - 트레이너 문의 관리
   - 사진 관리


* mainPage (전체 ajax통신을 이용)
   - 모임 마감시간이 임박한 list
     - 모집 마감 시간이 현재시간기준 12시간 전인 모임 중 짧게 남은 순서
   - 최근에 작성된 질의응답 게시글 list
   - 평가 점수가 높은 순서 trainer list
     - 최소 작성된 리뷰 개수가 5개 이상인 트레이너 중 평균 score가 높은 순서

* trainer
   - 트레이너 List 페이지 구현
     - hover시 트레이너 정보 표기
   - 트레이너 상세정보 페이지 구현 (전체 ajax통신을 이용)
     - 모임, 리뷰, 질문 탭으로 구성(페이지 이동X)
     - 해당 트레이너로 로그인 시 '새 모임 개설' 가능
     - 모집 마감일 기준 모집중/모집마감 분기

     - 함께한 모임이 있을 경우에만 리뷰 작성 가능(modal)
     - 1개의 모임에 1개의 리뷰만 작성하도록 제한
     - 리뷰내용은 특정 길이 초과시 기준으로... 표시
     - 리뷰 내용 클릭시 전체 리뷰 내용 표기
     - 리뷰 내용 다시 클릭시 다시 ...표시
     
     - 질문 list table형식 (ajax paging)
     - 질문작성시 동적 게시글 생성
     - 질문작성시 비밀글 처리 가능(modal)
     - 질문작성자, 해당트레이너 이외에 비밀글 view 불가
     - 해당트레이너 로그인시 질문에 답변 작성 가능(modal)

* meeting(모임)
   - 모임 개설 페이지 구현
     - 지도 마커 기능 (kakao map api)
   - 모임 상세정보 페이지 구현
     - 마커가 표시된 지도 image (kakao map api)
     - 동일 운동 다른 유져의 모임 list
     - 동일 유져의 다른 운동 모임 list
     - 모임 작성자에게 질문하기(modal)
     - 댓글 기능 (작성, 수정, 삭제 - ajax)

* Q&A
   - 질의응답 table형식 list 구현
     - 질문 해결완료/미해결에 따른 필터링 기능
     - 검색 기능('제목+내용', '제목만', '작성자')
   - 질문 작성 페이지 구현
   - 질의응답 상세정보 페이지 구현
     - 질문작성자가 로그인시 해결완료/수정/삭제 기능
     - 질문 해결완료시 수정/삭제/댓글 작성 불가능(ajax)
     - 댓글 기능 (작성, 수정, 삭제 - ajax)
   - 질문 수정 페이지 구현

# API Documentation
