1. Чим змінна відрізняється від масиву?
Змінна зберігає одне значення конкретного типу даних (наприклад, int, double тощо).
Масив зберігає кілька значень одного типу даних під одним ім'ям, де кожне значення має свій індекс для доступу.

2. Що таке стек? Що таке купа? Яка між ними різниця?
Стек (stack) — це область пам'яті, де зберігаються локальні змінні та параметри функцій. Пам'ять у стеку виділяється і звільняється автоматично.
Купа (heap) — це область пам'яті, де зберігаються об'єкти, що створюються динамічно за допомогою, наприклад, оператора new. Пам'ять у купі потрібно виділяти вручну, і вона звільняється через механізми збору сміття.
Різниця: Стек використовує LIFO (останній зайшов — перший вийшов) і має обмежений обсяг. Купа більш гнучка, але виділення/звільнення пам'яті повільніше.

3. Чи може змінна бути розташована у стеку? Безпосередньо у купі? В об’єкті у купі? Чи може масив бути розташований у стеку? Безпосередньо у купі? В об’єкті у купі?
Змінна може бути розташована:
У стеку, якщо це локальна змінна або параметр функції.
У купі, якщо це частина об'єкта, що створений динамічно.
Масив:
Може бути розташований безпосередньо в купі, коли він створюється через new.
Може бути в об'єкті в купі, якщо цей об'єкт містить масив як поле.
Не може бути безпосередньо розташований у стеку, але посилання на масив може зберігатися у стеку.

4. Чим посилання на масив відрізняється від масиву? Чи може посилання на масив бути розташовано у стеку? Безпосередньо у купі? В об’єкті у купі?
Посилання на масив — це вказівник на місце у пам'яті, де знаходиться сам масив.
Посилання може бути розташоване:
У стеку, якщо воно є локальною змінною.
У купі, якщо це поле об'єкта, що знаходиться в купі.

5. Якщо масив складається з 10 комірок, які індекси мають перша та остання комірки?
Перша комірка має індекс 0.
Остання комірка має індекс 9.

6. Що буде, якщо звернутися до неіснуючої комірки у масиві?
Зазвичай буде помилка виконання (викидається виняток, наприклад, ArrayIndexOutOfBoundsException в Java).

7. При створенні нового масиву без явної ініціалізації усі його комірки будуть проініціалізовані:
У мовах з автоматичним керуванням пам'яттю (наприклад, Java):
Спеціальними значеннями за замовчуванням: наприклад, 0 для чисел, false для булевих типів, null для об'єктів.
У мовах низького рівня (наприклад, C/C++):
Можуть бути довільні значення, що залишились у виділеній пам'яті, якщо не було явної ініціалізації.

8. Як дізнатися номер першої та останньої комірки масиву, якщо відомо лише посилання на нього?
Перша комірка завжди має індекс 0.
Остання комірка — це length - 1, де length — це довжина масиву.

9. Як змінити розмір масиву?
Розмір масиву не можна змінити після його створення. Однак можна створити новий масив більшого або меншого розміру і скопіювати в нього елементи з початкового масиву.

10. Що відбувається з масивом при копіюванні посилання на нього?
При копіюванні посилання на масив створюється нове посилання, але воно вказує на той самий масив у пам'яті. Зміни через будь-яке посилання впливатимуть на один і той самий масив.

11. Що відбувається з масивом при втрачанні посилання на нього?
Якщо всі посилання на масив втрачені, він стає недосяжним і згодом його пам'ять буде звільнена збирачем сміття (у мовах із автоматичним керуванням пам'яттю).

12. Чим відрізняються конструкції «for» та «for-each» при роботі з масивами? Які переваги та недоліки кожного з варіантів?
for дозволяє доступ до індексів масиву, тому можна змінювати елементи та мати контроль над ітерацією.
for-each спрощує доступ до елементів без використання індексів, але не дозволяє змінювати елементи масиву (лише читати).
Переваги for: більше контролю.
Переваги for-each: зручніший синтаксис для читання даних.

13. Чи можна у масив «double[]» записати значення «int»? Чи можна у масив «int[]» записати значення «double»?
У масив double[] можна записати значення типу int, оскільки автоматично виконується приведення типів з int до double.
У масив int[] не можна записати значення типу double, тому що зниження точності не допускається без явного приведення, і буде помилка.