# Automatyzacja testowania z Selenium Web Driver
Automatyzacja procesu testowania w metodykach zwinnych, 18/19L

### Podstawowe informacje
- Projekt na przedmiot Automatyzacja procesu testowania w metodykach zwinnych. 
- Zadanie polegało na implementacji testów formularza korzystając z dowolonego języka programowania (w tym przypadku Java).
- W ścieżce `main/java/com/mycompany/selenium` znajduje się przykładowe uzupełnianie formularza wg danych z tabelki którą wstawiono poniżej.
- W ścieżce `test/java` zgodnie z treścią zadania **zaprojektowano testy jednostkowe**.

### Przypadki testowe

Zaprojektowano sześć przypadków, wg specyfikacji z tej tabelki:

| L.p | Cel | Dane testowe | Oczekiwany wynik |
| ------ | ------ | ------ | ------ |
| 01. | Weryfikacja czy osoba ma prawo uczestniczyć w zawodach. | Dokument legitymujący daną osobę, np. dowód osobisty, paszport (czyli sprawdzenie wieku osoby). | Osoba posiada minimum dziesięć lat i jej wiek pozwala na uczestniczenie w zawodach. |
| 02. | Zweryfikowanie, czy osoba chcąca uczestniczyć w zawodach w przypadku niepełnoletności posiada zgodę na uczestnictwo. | Dokument upoważniający osobę niepełnoletnią do uczestnictwa w zawodach (wraz z dokumentem potwierdzającym niepełnoletność). | Osoba jest niepełnoletnia lecz posiada zgodę rodzica. |
| 03. | Zweryfikowanie, czy osoba w wieku seniora lub niepełnosprawna posiada zaświadczenie od lekarza. | Dokument legitymujący daną osobę lub weryfikujący stopień niepełnosprawności wraz z zaświadczeniem wystawionym przez lekarza. | Osoba jest osobą w wieku powyżej sześćdziesiątego piątego roku życia aczkolwiek posiada zaświadczenie od lekarza świadczące o braku przeciwwskazań do uczestnictwa w zawodach.  |
| 04. | Zweryfikowanie grupy „Młodzik”. | Dokument legitymujący daną osobę. | Osoba jest w wieku dziesięciu do trzynastu lat, została automatycznie przydzielona do grupy „Młodzik”. |
| 05. | Zweryfikowanie grupy „Junior”. | Dokument legitymujący daną osobę. | Osoba jest w wieku trzynastu lat do osiemnastu, została automatycznie przydzielona do grupy „Junior”. |
| 06. | Zweryfikowanie grupy „Dorośli”. | Dokument legitymujący daną osobę. | Osoba pełnoletnia została automatycznie przydzielona do grupy „Dorośli”. |

### Dane testowe użyte w kodzie java

| L.p | Imię i Nazwisko | Data ur. | Rodzice | Lekarz |
| ------ | ------ | ------ | ------ |  ------ |
| 01. | Andrzej Tobor | 03-03-1999 (20 lat) | ✖ | ✖
| 02. | Dawid Szczepański | 17-08-2007 (13 lat) | ✔ | ✖
| 03. | Milena Kukiz | 02-07-1950 (69 lat) | ✖ | ✔
| 04. | Zbigniew Cien | 10-09-2008 (11 lat) | ✔ | ✖
| 05. | Marzena Tudrej | 20-02-2003 (16 lat) | ✔ | ✖
| 06. | Kamil Rafalski | 28-06-1995 (23 lat) | ✖ | ✖

### NetBeans screen (dowód, że testy przeszły)

![Selenium](https://i.imgur.com/nqZP7Zw.png)

### Użyte technologie
 - Java
 - Selenium Java
 
 ### Jak odpalić?
 - Dowolne środowisko programistyczne
 - Zbuduj z zależnościami z plika pom.xml (Maven zaciągnie je automatycznie)
 - Zmień w kodzie lokalizację twojej geckodriver, domyślnie w kodzie jest to  `D:/Drivers/geckodriver.exe`
