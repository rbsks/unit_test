# 좋은 단위 테스트를 작성하기 위한 연습장

### 좋은 단위 테스트의 속성
- 개발 주기에 테스트가 통합돼 있다.
- 코드 베이스 중 가장 중요한 부분만을 대상으로 한다. (커버리지에 집착 하지 않아야 한다.)
- 최소한의 유지비로 최대의 가치를 끌어낸다. 이를 달성하기 위해 가치 있는 테스트, 별로 가치 없는 테스트를 식별해야 하며, 가치 있는 테스트를 작성해야 한다.

### 좋은 단위 테스트의 4대 요소
- 회귀 방지가 높아야 한다.
- 리팩토링 내성 좋아야 한다.
- 빠른 피드백을 받을 수 있어야 한다.
- 테스트 코드를 유지하기 위한 유지 비용이 적어야 한다.

### 리팩토링 내성 좋은 테스트 만들기
- 리팩토링 내성이 좋은 테스트를 만드려면 식별할 수 있는 동작을 테스트하여 동작 내의 세부 구현 사항을 검증하는 것이 아니라 결과를 검증하여 리팩토링 시 기존 테스트가 실패하지 않도록 해야한다.
- 이러한 테스트를 작성하기 위해서는 비즈니스 로직에 프로세스 외부 의존성을 제거하여 순수하게 동작에 대한 결과만 검증할 수 있게 해야 한다.  
- 즉, 비즈니스 로직을 작성하는 도메인 계층과 프로세스 외부 의존성을 가지는 애플리케이션 서비스 계층을 분리하여 도메인 계층을 단위 테스트를 작성하여 검증하고 그 외에는 통합 테스트를 작성하여 검증해야 한다. 