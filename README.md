# TDD

Les tests pilotés par le développement, c’est une technique de développement qui permet d’écrire des tests qui échouent avant d’écrire l’implémentation, et cela se fait selon un processus en 3 étapes:

1. **Ecrire des cas de test défaillants**
2. **Reécrire les cas de test pour les faire réussir**
3. **Refactoriser le code et le rendre simple**

![Screenshot 2022-10-01 at 02 01 48](https://user-images.githubusercontent.com/29838473/193370732-7f34ee49-374f-43eb-85b6-88fa7c0b2cda.png)


### Règles de l’Uncle Bob

- **On est pas autorisé à écrire du code en production, sauf si il s’agit de faire fonctionner un test unitaire défaillant**
- **On est pas autorisé à écrire plus d'un test unitaire que ce qui est suffisant pour échouer ; et les échecs de compilation sont des échecs.**
- **On est pas autorisé à écrire plus de code en production que celui nécessaire à faire fonctionner un test unitaire défaillant**

### Exemple Cas de test TDD

Creer un projet maven via IntelliJ, et créer une classe **Calculator**

```java
public class Calculator {

    public static Integer add(Integer n1, Integer n2){
        return 0;
    }

}
```

Ajouter les dépendances suivantes dans le pom.xml

```xml
       <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.9.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.9.0</version>
            <scope>test</scope>
        </dependency>
```

Ensuite générer des tests unitaires de la classe Calculator

```java
class CalculatorTest {

    @Test
    void add() {
        Integer sum = Calculator.add(1,4);
    }
}
```

### 1- Appliquer la première étape du processus TDD

Il faut créer un cas de test défaillant

```java
class CalculatorTest {

    @Test
    void add() {
        Integer sum = Calculator.add(1,4);
        Assertions.assertEquals(1, sum);
    }
}
```

Ce cas de test est défaillant parce qu’il retourne une erreur au lancement

![testfail](https://user-images.githubusercontent.com/29838473/193371273-36fa9817-95b1-4186-a230-1042b0737bda.png)


### 2- Appliquer la deuxième étape du processus TDD

Ré-écrire le cas de test pour le faire fonctionner

```java
class CalculatorTest {

    @Test
    void add() {
        Integer sum = Calculator.add(1,4);
        Assertions.assertEquals(0, sum);
    }
}
```

Il fonctionne conformément à la logique de la classe

![testokok](https://user-images.githubusercontent.com/29838473/193371521-51c6e0b6-c252-4b38-9f5a-fe3e81d050bb.png)


### 3- Appliquer la dernière étape du processus TDD

Refactoriser le code de la classe pour le rendre plus dynamique et simple

```java
public class Calculator {

    public static Integer add(Integer n1, Integer n2){
        return n1 + n2;
    }

}
```

Faire un cas de test qui doit fonctionner

```java
class CalculatorTest {

    @Test
    void add() {
        Integer sum = Calculator.add(1,4);
        Assertions.assertEquals(5, sum);
    }
}
```

Résultat

![testokokok.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7e12d7f5-2ad6-4aa3-9c12-a878bce507bb/testokokok.png)
# TDD
