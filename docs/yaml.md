- yaml : 리스트나 연관배열을 사용해서 데이터를 써가는 포맷
- online yaml parser : https://yaml-online-parser.appspot.com/
- 작성 예1
~~~yml
number:
  odd: 
    - 1
    - 3
  even:
    - 2
    - 4
~~~

- 작성 예2
~~~yml
member:
  - name: Tom
    age: 20
  - name : Bob
    age : 30
~~~

- open api 스키마
https://spec.openapis.org/oas/v3.0.0

- open api 플러그인 설치
openAPI (Swagger) Editor Plugin
- open api 플로그인으로 swagger화면 미리보기
1. F1을 누른다.
2. swagger를 검색
3. OpenAPI: show preview using Swagger UI를 실행

- OpenAPI Generator Gradle Plugin
1. build.gradle파일에 플러그인 추가
~~~
plugins {
	...
	id 'org.openapi.generator' version "5.3.0"
}
~~~
2. task실행하기
~~~
$ ./gradlew openApiGenerators
~~~
3. 아래 로그가 출력 된 것을 확인하기
~~~
CLIENT generators:
    - ada
    - android
    - apex
    - bash
    - c
    - clojure
    - cpp-qt-client

    (...)
    
BUILD SUCCESSFUL in 1s
1 actionable task: 1 executed
~~~

- Html2 Generator
1. 참고
> https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin#generate-multiple-sources

2. build.gradle 태스크 추가
~~~
task buildApiClient(type: org.openapitools.generator.gradle.plugin.tasks.GenerateTask) {
    generatorName.set("html2")
    inputSpec.set("$rootDir/src/main/resources/api-schema.yaml")
    outputDir.set("$buildDir/apidoc")
}
~~~


3. task실행하기
~~~
$ ./gradlew buildApiClient
~~~

4. task 실행결과 `..\todo-api\build/apidoc에` 파일생성을 확인