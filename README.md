# 객체 지향적으로 배달 어플을 만들어보자!!
## 프로젝트 기간: 2023-08-08 ~ 
<br/>

### stack
- java ver 11
- springboot ver 2.7.14

### Entity
1. Food   
```
  id pk int
  foodName String  
  foodPrice int  
  foodSize String  
  orderId (Food : Orders = n:1)
```  

2. Orders
```
  id pk int
  orderQty int
  orderPrice Long
  userId (Orders : User = n:1) 
```

3. User
```
  id pk int
  username String
  userHp String
  address String
```


### REST API
```
Method를 사용하여 행위를 전달하기 때문에 
조회, 등록, 수정, 삭제 모두 같은 API 명으로 통일했고,
단일 조회나 단일 삭제, 수정같은 경우는 id값에 따라 조회, 삭제, 수정을 해야되기 때문에 
파라미터로 id값을 넣어주었다.
```
- 음식 전체 조회 <br>
  @GetMapping("/foods")
- 음식 단일 조회     <br>
  @GetMapping("/foods/{id}")     
- 음식 등록  <br>
  @PostMapping("/foods")    
- 음식 수정  <br>
  @PutMapping("/foods/{id}")    
- 음식 단일 삭제  <br>
  @DeleteMapping("/foods/{id}")    

### Class Diagram
![classuml](https://github.com/fwangjuwon/spring-delivery/assets/97711663/8f341f28-bffd-4cda-bed7-71fd4e827188)

### ERD
![Screenshot_1](https://github.com/fwangjuwon/spring-delivery/assets/97711663/b16f0435-48f9-48aa-b713-7a923ceb18da)


### Exception 처리