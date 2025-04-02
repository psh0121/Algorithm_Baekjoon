# [Bronze II] Egg Drop - 11606 

[문제 링크](https://www.acmicpc.net/problem/11606) 

### 성능 요약

메모리: 18584 KB, 시간: 200 ms

### 분류

구현, 시뮬레이션

### 제출 일자

2025년 3월 20일 00:57:56

### 문제 설명

<p>There is a classic riddle where you are given two eggs and a k-floor building and you want to know the highest floor from which you can drop the egg and not have it break.</p>

<p>It turns out that you have stumbled upon some logs detailing someone trying this experiment! The logs contain a series of floor numbers as well as the results of dropping the egg on those floors. You need to compute two quantities—the lowest floor that you can drop the egg from where the egg could break, and the highest floor that you can drop the egg from where the egg might not break.</p>

<p>You know that the egg will not break if dropped from floor 1, and will break if dropped from floor k. You also know that the results of the experiment are consistent, so if an egg did not break from floor x, it will not break on any lower floors, and if an egg did break from floor y, it will break on all higher floors.</p>

### 입력 

 <p>The first line of input contains two space-separated integers n and k (1 ≤ n ≤ 100, 3 ≤ k ≤ 100), the number of egg drops and the number of floors of the building, respectively. Each of the following n lines contains a floor number and the result of the egg drop, separated by a single space. The floor number will be between 1 and k, and the result will be either <code>SAFE</code> or <code>BROKEN</code>.</p>

### 출력 

 <p>Print, on a single line, two integers separated by a single space. The first integer should be the number of the lowest floor from which you can drop the egg and it could break and still be consistent with the results. The second integer should be the number of the highest floor from which you can drop the egg and it might not break.</p>

