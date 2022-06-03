IDE -> 개발자 툴 
	1. 이클립스  [ 무료 ] 	- 외부평가 [ JSP ]
		1. 워크스페이스 폴더( 여러개 프로젝트 )
	2. 인텔리제이 [ 무료 / 유료 ]
		1. Community : 무료 [ 사용할 라이브러리 직접 설치 ]
		2. 프로젝트 단위 폴더 사용 
		3. Build system : 라이브러리 빌드[설치] 프로그램
			1. 메이븐  :  XML언어를 이용한 자동 빌드 도구 
			2. 그레이들 : 그루비언어를 이용한 자동 빌드 도구

	3. 스프링 [ https://spring.io/ ] 
		1. 자바 개발에 필요한 API 만들어둔 자바 프레임워크 
		2. 웹 프로젝트할때 꼭 필요한 모아둔 프로젝트 -> 스프링 부트 
			1. 내장 톰캣 : 별도로 PC에 톰캣 설치할 필요가 없다. 

	4. 타임리프[ 템플릿 엔진 / JSP vs 타임리프 vs 머스테치(spring공식지원) ]
		* thymeleaf 
		1. 문서[html] 에 데이터를 표시할수 있도록 도와주는 프로그램
		2. JSP( spring권장X )
		3. 타임리프 : 백엔드 작업시 프론트 임시 작성할때 많이 사용   
		4. React , vue.js , html , 바닐라js : 프론트엔드 작업시 
	
	* 타임리프 주요 코드
		1. th:fragment = "플러그명정의"
		2. th:replace = "파일명.html :: 플러그명"
		3. th:href = "@{URL}"
		4. th:text = "${ 모델명 }"
		4. JAVA ------------ 타임리프[템플릿엔진] --------> HTML 
		MODEL			
	 		1. (JAVA) model.addAttribute( "모델명" , 데이터 ) ;
			2. (HTML) <태그명 th:text="${ 모델명 }"> </태그명>

	js / css 포함
		* 스프링부트는 static 폴더에서부터 경로 시작 
	
	1. 프로젝트 생성 
		1. gradle 프로젝트 생성 [ 이유 : 인텔리제이 무료 버전에서는 직접 spring 라이브러리 설치 ] 
		2. start.spring.io 
		3. 

	1. 주의할점 
		1. 대소문자
			1. 코드 작성시 자동완성 
			2. 클래스명 첫글자를 대문자 작성 
		2. 의미없는 줄바꿈처리 제거 [ 특히 @ ] 
		3. 사용하지 않는 import 제거 
		4. 패키지 구성 [ MVC 기준 ] 
