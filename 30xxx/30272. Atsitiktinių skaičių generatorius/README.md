# [Bronze II] Atsitiktinių skaičių generatorius - 30272 

[문제 링크](https://www.acmicpc.net/problem/30272) 

### 성능 요약

메모리: 59596 KB, 시간: 496 ms

### 분류

애드 혹, 많은 조건 분기, 구현, 문자열

### 제출 일자

2025년 5월 1일 06:52:40

### 문제 설명

<p>Justas nusipirko atsitiktinių skaičių generatorių, kuris gali sugeneruoti bet kokį teigiamą sveikąjį skaičių su lygiai N skaitmenų. Deja, generatoriaus ekranas yra labai mažas ir sugeneruotas skaičius į jį netelpa. Todėl šis skaičius yra išvedamas paeiliui parodant jo skaitmenis.</p>

<p>Kiekvieno skaitmens atvaizdas yra 9 × 8 matmenų paveikslėlis, sudarytas iš baltų ir juodų pikselių. Jei baltus pikselius vaizduotume taškais (<code>.</code>), o juodus – grotelėmis (<code>#</code>), tai skaitmenys atrodytų taip:</p>

<pre style="text-align: center;">..#####..  ....##...  .#######.  .#######.  ##.......
.##...##.  ..####...  ##.....##  ##.....##  ##....##.
##.....##  ....##...  .......##  .......##  ##....##.
##.....##  ....##...  .#######.  .#######.  ##....##.
##.....##  ....##...  ##.......  .......##  #########
.##...##.  ....##...  ##.......  ##.....##  ......##.
..#####..  ..######.  #########  .#######.  ......##.
.........  .........  .........  .........  .........
.########  .#######.  .########  .#######.  .#######.
.##......  ##.....##  .##....##  ##.....##  ##.....##
.##......  ##.......  .....##..  ##.....##  ##.....##
.#######.  ########.  ....##...  .#######.  .########
.......##  ##.....##  ...##....  ##.....##  .......##
.##....##  ##.....##  ...##....  ##.....##  ##.....##
..######.  .#######.  ...##....  .#######.  .#######.
.........  .........  .........  .........  .........
</pre>

<p>Gavę N skaitmenų, atvaizduotų aukščiau nurodytu būdu, apskaičiuokite, kokį skaičių tie skaitmenys sudaro. Skaitmenys bus pateikiami paeiliui nuo kairiausio iki dešiniausio.</p>

### 입력 

 <p>Pirmojoje eilutėje pateikiamas skaitmenų kiekis N. Toliau pateikiama 8N eilučių, aprašančių skaitmenis (vieną skaitmenį aprašo aštuonios eilutės). Kiekvieną eilutę sudaro devyni simboliai (<code>.</code> ir <code>#</code>).</p>

<p>Pirmasis skaitmuo nebus nulis.</p>

### 출력 

 <p>Išveskite skaičių, kuris susidaro iš pateiktų skaitmenų</p>

