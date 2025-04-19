# ⏰ TimePaper
<p>
      디지털 타임캡슐을 통해 사용자가 소중한 메시지와 추억을 기록하고, 특정 시점에
      열람할 수 있도록 돕는 플랫폼입니다. 원하는 배경 이미지와 함께 짧은 편지를
      작성하거나, 이벤트 참여자들이 메시지를 남길 수 있는 공간을 제공하여 감정과
      기억을 간편하게 저장하고 공유할 수 있습니다
</p>

## 📖프로젝트 소개
> 서비스 데모 : https://15.164.217.110.sslip.io/

개발 기간 : 2025. 02. 19 - 2025. 03. 06 (팀 프로젝트, 5인) [PR 기록 바로가기🔗](https://github.com/lxodud/TimePaper/pulls?q=is%3Apr+is%3Aclosed+author%3Adevyejin)

## ⚒️기술 스택

- Frontend: React.js (Vite), Redux, Axios, Node.js v20.17
- Backend: Spring Boot (Gradle), Spring Data JPA, Spring Security, Java 21
- Database: MySQL8.0, Redis
- DevOps: Docker, GitHub Actions
- Infra: Docker, AWS EC2, AWS S3
- Tools: GitHub, Jira, Postman, Figma, Notion, Discord

## 🏛️ERD
![image](https://github.com/user-attachments/assets/328b18e3-dee1-45f1-992b-094538e46b10)

## 🏗️서비스 아키텍처
( CI/CD 아키텍처가 포함되어 있습니다 )

![image](https://github.com/user-attachments/assets/7d57431c-8000-47e6-8541-e36a59bc26bf)

## 주요 기능
<table>
    <thead>
        <tr>
            <th>기능</th>
            <th>설명</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>회원가입</td>
            <td>이메일(이메일 코드 인증)과 비밀번호 입력으로 사용자 정보를 등록합니다.</td>
        </tr>
        <tr>
            <td>로그인</td>
            <td>사용자 인증 정보를 통해 로그인합니다.</td>
        </tr>
        <tr>
            <td>타임페이퍼 생성</td>
            <td>타임페이퍼를 생성합니다.</td>
        </tr>
        <tr>
            <td>타임페이퍼 조회</td>
            <td>타임페이퍼를 조회합니다.</td>
        </tr>
        <tr>
            <td>타임페이퍼 삭제</td>
            <td>타임페이퍼를 삭제합니다.</td>
        </tr>
        <tr>
            <td>타임페이퍼 캡슐화</td>
            <td>일정 시간 이후 타임페이퍼를 조회할 수 있도록 잠금 상태로 변경합니다.</td>
        </tr>
        <tr>
            <td>포스트잇 생성</td>
            <td>포스트잇을 생성합니다.</td>
        </tr>
        <tr>
            <td>포스트잇 삭제</td>
            <td>포스트잇을 삭제합니다.</td>
        </tr>
    </tbody>
</table>

## API 명세

-  API 명세서 : [Notion 링크🔗](https://www.notion.so/dev-yejin/TimePaper-API-1da880988ec780d4bb2ee79a75d42d7c?pvs=4)
-  분류 : 인증/인가, 타임페이퍼(롤링페이퍼), 포스트잇
-  개수 : 13개

## 와이어프레임

- 와이어프레임 : [Figma 링크🔗](https://www.figma.com/design/YxjYl9vTATc6qdoAjgRO0z/%ED%83%80%EC%9E%84%ED%8E%98%EC%9D%B4%ED%8D%BC?node-id=0-1&p=f&t=tzgtsz0xiG6qtpzk-0)


## 👶팀원들

 <table border="1" style="border-collapse: collapse; width: 100%;">
      <thead>
        <tr>
          <td><a href="https://github.com/hnihoon">김동훈</a></td>
          <td><a href="http://github.com/devyejin">오예진</a></td>
          <td><a href="https://github.com/DaeJungYoon">윤대정</a></td>
          <td><a href="https://github.com/lxodud">이태영</a></td>
          <td><a href="https://github.com/Wonnho">최원호</a></td>
        </tr>
      </thead>
    </table>

