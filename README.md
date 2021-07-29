# JAVA

> Learning Java(2021.07.16~)







## AccessModifier

### Public
 - 클래스 외부에서 접근이 가능하다.

### Private
 - 클래스 내부에서만 접근이 가능하다.

###  Default
 - 동일 패키지에 있는 다른 클래스에서 접근 가능하다.

### Protected
 - 동일 패키지의 다른 클래스와 다른 패키지의 하위클래스에서도 접근 가능하다.

#### private을 하는 이유?
>  데이터 캡슐화를 위해
>
> - 모든 데이터 멤버를 private으로 만드고 필요한 경우 public한 get/set 메서드를 제공한다.
> - 즉 객체에서 제공하는 메서드를 통하지 않고는 데이터에 접근 또는 조작 할 수 없다.
> - 이것을 data encapsulation or information hiding 이라고 한다.
