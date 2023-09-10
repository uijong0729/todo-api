## 1. URI를 정하는 룰

- 영어로 복수형의 명사를 사용
~~~
https://example.com/tasks
~~~
- 대문자는 사용하지 않는다
- 소문자와 숫자와 하이픈으로 구성
~~~
https://example.com/task-lists
~~~

## 2. HTTP 메소드를 정하는 룰
- GET : 습득
- POST : 삭제
- PUT : 갱신(치환)
- DELETE : 삭제
- PATCH : 갱신(부분)

## 3. HTTP와 URI를 조합해서 엔드포인트를 설계
|메소드|Path|내용|
|--|--|--|
|GET|/tasks|task일람|
|POST|/tasks|task작성|
|GET|/tasks/:id|task상세|
|PUT|/tasks/:id|task갱신|
|DELETE|/tasks/:id|task삭제|

## 4. HTTP 메소드의 특징
1. 멱등성(冪等性：べきとうせい)
    - 같은 요청에 대해서 항상 같은 결과를 보장하는 성질
    - 메소드 예 : GET, PUT, DELETE
2. 안전성
    - 데이터를 갱신하지 않기에 리소스 상태에 영향을 주지 않음
    - 메소드 예 : GET
3. NG예시
    - GET메소드에서 갱신이 발생
    - 항상 최신의 레코드를 삭제하는 요청에 DELETE 메소드를 사용한 경우 멱등성이 성립하지 않기에 부적절한 설계

## 5. Request 설계
~~~
POST /tasks HTTP/1.1
Host: example.com
Content-Type: application/json

{"title":"this is title"}
~~~
- Path Parameter
    - 예: /tasks/999
- Query Parameter
    - 예: /tasks/999?fields=title
- Request Body
    - 예: { title: "hoge" }

## 6. Response 설계
~~~
HTTP/1.1 200
Host: example.com
Date: ...

{"title":"my task"}
~~~
- 2xx계
    - Success
    - 200 : OK
    - 201 : Created
    - 204 : No Content(리소스 삭제성공)
- 3xx계
    - Redirection
- 4xx계
    - Client Error
    - 400 : Bad Request(리퀘스트 형식에 잘못이 있음)
    - 404 : Not Found(요구한 리소스가 없음)
- 5xx계
    - Server Error
    - 500 : Internal Server Error

## 7. 3층 아키텍쳐
- 코드를 3개의 관심사로 분류하는 것
    - 프레젠테이션 층 : @Controller
    - 비즈니스 로직 층 : @Service
    - 데이터 액세스 층 : @Repository
- Entity : 각 값이 불변하는 변수
- DTO, Form : 각 항목들이 바뀔 수 있는 변수

