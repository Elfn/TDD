# TDD

Les tests pilotés par le développement, c’est une technique de développement qui permet d’écrire des tests qui échouent avant d’écrire l’implémentation, et cela se fait selon un processus en 3 étapes:

1. **Ecrire des cas de test défaillants**
2. **Reécrire les cas de test pour les faire réussir**
3. **Refactoriser le code et le rendre simple**

![TDD.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ced32ea5-d6f4-4109-8c88-7bf4de4bbd39/TDD.png)

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

![testfail.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7eb97d7e-4c5a-4acc-a2f8-6bc1741b047f/testfail.png)

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

![testokok.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/404fde51-309c-45ba-ab98-05a04e035f5b/testokok.png)

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
