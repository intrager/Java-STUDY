바이트코드 조작 라이브러리
- ASM : https://asm.ow2.io
  - visitor 패턴과 adapter 패턴을 잘 알아야 함
- javassist : https://www.javassist.org
- ByteBuddy : https://bytebuddy.net

ByteBuddy 코드와 
```java
System.out.println(new Hat().pullOut());
```

이 코드를 동시에 쓸 수 없다는 게
- `Magician`을 실행하면 Magician.class, Hat.class로 컴파일되고, 그 클래스 파일들이 로딩되고 실행된다.
- 실행 이후에 ByteBuddy를 통해서 class 파일을 조작해도 메서드 영역에 있는 이미 로딩된 클래스 정보를 보고 있으므로 적용이 안 된다.

문서에 따르면, ByteBuddy는 Reloading 시 별도의 클래스로더가 아니라 javaagent를 사용한 JVM의 HotSwap 기능을 사용한다.

그리고 ByteBuddy에서 말하는 Unloaded는 클래스로더가 로딩하지 않은 클래스를 말한다.