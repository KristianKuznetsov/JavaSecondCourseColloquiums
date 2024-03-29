# Коллоквиум 3

[Назад](https://github.com/KristianKuznetsov/JavaSecondCourseColloquiums)
___

# Абстрактная фабрика:
 
## Суть паттерна:

**Абстрактная фабрика** — это порождающий паттерн проектирования, который позволяет создавать семейства связанных объектов, не привязываясь к конкретным классам создаваемых объектов.

![](https://github.com/KristianKuznetsov/JavaPractice/blob/main/Additional%20materials/abstract-factory-ru.png)

## Реализация:

**1.** Создайте таблицу соотношений типов продуктов к вариациям семейств продуктов.

**2.** Сведите все вариации продуктов к общим интерфейсам.

**3.** Определите интерфейс абстрактной фабрики. Он должен иметь фабричные методы для создания каждого из типов продуктов.

**4.** Создайте классы конкретных фабрик, реализовав интерфейс абстрактной фабрики. Этих классов должно быть столько же, сколько и вариаций семейств продуктов.

**5.** Измените код инициализации программы так, чтобы она создавала определённую фабрику и передавала её в клиентский код.

**6.** Замените в клиентском коде участки создания продуктов через конструктор вызовами соответствующих методов фабрики.


## Применимость:

-  Когда бизнес-логика программы должна работать с разными видами связанных друг с другом продуктов, не завися от конкретных классов продуктов.
-  Абстрактная фабрика скрывает от клиентского кода подробности того, как и какие конкретно объекты будут созданы. Но при этом клиентский код может работать со всеми типами создаваемых продуктов, поскольку их общий интерфейс был заранее определён.
-  Когда в программе уже используется Фабричный метод, но очередные изменения предполагают введение новых типов продуктов.
-  В хорошей программе каждый класс отвечает только за одну вещь. Если класс имеет слишком много фабричных методов, они способны затуманить его основную функцию. Поэтому имеет смысл вынести всю логику создания продуктов в отдельную иерархию классов, применив абстрактную фабрику.

## Преимущества и недостатки:

### Преимущества:
-  Гарантирует сочетаемость создаваемых продуктов.
-  Избавляет клиентский код от привязки к конкретным классам продуктов.
-  Выделяет код производства продуктов в одно место, упрощая поддержку кода.
-  Упрощает добавление новых продуктов в программу.
-  Реализует принцип открытости/закрытости. 

### Недостатки:
- Усложняет код программы из-за введения множества дополнительных классов.
- Требует наличия всех типов продуктов в каждой вариации.

___

## Условие коллоквиума:

**Написать обстрактную фабрику, по созданию команд различных служб спасения:**
- Пожарные
- Полиция
- Скороя

**Фабрика покрыта Unit тестами с использаванием библиотеки Junit**
___
