#Symulator LOTTO
####Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49. Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest trafienie 3, 4, 5 lub 6 poprawnych liczb.

###Napisz program, który:

1. zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
    - Czy wprowadzony ciąg znaków jest poprawną liczbą.
    - czy użytkownik nie wpisał tej liczby już poprzednio, 
    - czy liczba należy do zakresu 1-49, 
2. po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
3. wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
4. poinformuje gracza, czy trafił przynajmniej "trójkę".

###Aby wylosować 6 liczb z zakresu 1-49 bez powtórzeń możemy utworzyć tablicę z wartościami z tego zakresu, wymieszać jej zawartość i pobrać pierwsze 6 elementów.

####Poniższy kod powinien Ci pomóc:
```
Integer[] arr = new Integer[49];
for (int i = 0; i < arr.length; i++) {
    arr[i] = i + 1;
}

System.out.println(Arrays.toString(arr));
Collections.shuffle(Arrays.asList(arr));
System.out.println(Arrays.toString(arr));
```



Możesz również losować liczby z określonego zakresu przy użyciu klasy Random (sprawdź w snippetach jak to wykonać) – jeżeli wybierzesz takie rozwiązanie, pamiętaj o sprawdzaniu czy dana wartość nie została wcześniej wylosowana.